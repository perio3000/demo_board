package com.example.demo.service;

import com.example.demo.mapper.ForumMapper;
import com.example.demo.vo.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class ForumServiceImpl implements ForumService {
    @Autowired
    private ForumMapper forumMapper;
    @Override
    public List<ArticleVO> getList() {
        log.info("SERVICE : getList()...");

        return forumMapper.getList();
    }

    @Override
    public ArticleVO read_content(int id) {
        log.info("SERVICE : read()...");

        return forumMapper.read_content(id);
    }

    @Override
    public ArticleVO edit_content(int id) {
        log.info("SERVICE : edit()...");

        return forumMapper.edit_content(id);
    }
}
