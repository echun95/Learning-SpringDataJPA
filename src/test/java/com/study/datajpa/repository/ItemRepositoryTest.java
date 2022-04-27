package com.study.datajpa.repository;

import com.study.datajpa.entity.Item;
import com.study.datajpa.entity.Member;
import com.study.datajpa.entity.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {


    @Autowired
    ItemRepository itemRepository;

    @Autowired
    EntityManager em;

    @Test
    public void save() throws Exception  {
        //given
        Item item = new Item("A");
        itemRepository.save(item);
        //when

        //then
    }



}