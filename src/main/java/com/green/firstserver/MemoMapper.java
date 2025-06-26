package com.green.firstserver;

import com.green.firstserver.model.MemoGetOneRes;
import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import com.green.firstserver.model.MemoPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 인터페이스가 implements한 클래스가 만들어지고 그 클래스를 객체화하고,
// 그 객체의 주소값을 스프링 컨테이너가 들고 있는다.
// 스프링 컨테이너가 객체 주소값을 들고 있을 수 있는건 빈 등록이 되었기 때문
@Mapper
public interface MemoMapper {
    // insert, update, delete 메소드를 만들 때 리턴타입은 int
    int insMemo(MemoPostReq req);
    List<MemoGetRes> selMemoList();
    MemoGetOneRes selMemo(int id);
    int updMemo(MemoPutReq req);
    int delMemo(int id);
}
