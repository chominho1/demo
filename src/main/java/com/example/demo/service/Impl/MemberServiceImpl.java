package com.example.demo.service.Impl;

import com.example.demo.Dao.MemberDao;
import com.example.demo.model.MemberModel;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao dao;

    @Override
    public List<MemberModel> printMember(){
        List<MemberModel> member = dao.getMember();
        return member;
    }
}
