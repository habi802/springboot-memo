package com.green.firstserver;

import com.green.firstserver.model.MemoGetOneRes;
import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import com.green.firstserver.model.MemoPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // 빈(Bean) 등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다. 요청/응답 담당자
@RequiredArgsConstructor
public class MemoController {
    private final MemoService memoService;

    // DI 받는 방법 3가지
    // 1. 필드 주입
    // 2. setter 주입(메소드 주입)
    // 3. 생성자 주입

//    public MemoController(MemoService memoService) {
//        this.memoService = memoService;
//    }

    // select
    @GetMapping("/memo")
    public List<MemoGetRes> memo() {
        return memoService.selMemoList();
    }

    // select(detail)
    @GetMapping("/memo/{id}")
    public MemoGetOneRes getMemo(@PathVariable("id") int id) {
        System.out.println("getMemo: " + id);
        return memoService.selMemo(id);
    }

    // insert
    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req) { // @RequestBody: JSON 데이터를 받을고양.
        System.out.println("postMemo: " + req);
        int result = memoService.insMemo(req);
        return result == 1 ? "성공!" : "실패!";
    }

    // update
    @PutMapping("/memo")
    public String putMemo(@RequestBody MemoPutReq req) {
        System.out.println("putMemo: " + req);
        int result = memoService.updMemo(req);
        return result == 1 ? "성공!" : "실패!";
    }

    // delete
    @DeleteMapping("/memo")
    public String deleteMemo(@RequestParam int id) {
        System.out.println("deleteMemo: " + id);
        int result = memoService.delMemo(id);
        return result == 1 ? "성공!" : "실패!";
    }
}
