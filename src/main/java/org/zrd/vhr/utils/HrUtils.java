package org.zrd.vhr.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.zrd.vhr.bean.Hr;

/**
 * @Author zrd
 * @Date 2020/11/6
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
