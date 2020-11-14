package org.zrd.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zrd.vhr.bean.Politicsstatus;
import org.zrd.vhr.mapper.PoliticsstatusMapper;

import java.util.List;

/**
 * @Author zrd
 * @Date 2020/11/13
 */
@Service
public class PoliticsstatusService {

    @Autowired
    PoliticsstatusMapper politicsstatusMapper;

    public List<Politicsstatus> getAllPoliticsstatus() {
        return politicsstatusMapper.getAllPoliticsstatus();
    }
}
