package org.zrd.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zrd.vhr.bean.Nation;
import org.zrd.vhr.mapper.NationMapper;

import java.util.List;

/**
 * @Author zrd
 * @Date 2020/11/13
 */
@Service
public class NationService {

    @Autowired
    NationMapper nationMapper;

    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
