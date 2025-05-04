package com.seon.common.util;

import java.util.UUID;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-04
 */
public class IdGenerater {

    private IdGenerater(){}

    public static String generate(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
