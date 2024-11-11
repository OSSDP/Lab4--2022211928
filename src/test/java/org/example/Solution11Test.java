package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    @Test
    void test_single(){
        /*
        测试一般情况
         */
        int [] input1={0,0,0};
        List<List<Integer>> output1=new ArrayList<List<Integer>>();
        output1.add(Arrays.asList(0,0,0));
        assertEquals(output1,Solution11.threeSum(input1));
    }

    @Test
    void test_null(){
        /*
        测试输出值为空的情况
         */
        int [] input2={0,1,1};
        List<List<Integer>> output2=new ArrayList<List<Integer>>();
        assertEquals(output2,Solution11.threeSum(input2));
    }

    @Test
    void test_repeat(){
        /*
        测试输出重复值的情况
         */
        int [] input3={-1,0,1,2,-1,-4};
        List<List<Integer>> output3=new ArrayList<List<Integer>>();
        output3.add(Arrays.asList(-1,-1,2));
        output3.add(Arrays.asList(-1,0,1));
        assertEquals(output3,Solution11.threeSum(input3));
    }
}