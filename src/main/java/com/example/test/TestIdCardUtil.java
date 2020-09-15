package com.example.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.TokenizerEngine;
import cn.hutool.extra.tokenizer.TokenizerUtil;
import cn.hutool.extra.tokenizer.Word;
import com.example.util.IdCardUtil;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangH
 * @date 2020/8/18 17:53
 */
public class TestIdCardUtil {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        Map map=new HashMap();
        map.put("a","b");
        Stream<String> stream = strings.stream();
        strings.forEach(System.out::println);



    }
}
