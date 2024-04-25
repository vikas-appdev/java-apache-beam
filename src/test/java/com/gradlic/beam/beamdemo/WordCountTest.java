package com.gradlic.beam.beamdemo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class WordCountTest {

    @Test
    void test(){
        // fail("Not yet implemented");
        System.out.println("This test ran");
    }

    @Test
    public void wordCountTest(){
        boolean jobDone = WordCount.wordCount("src/test/resources/wordcount.txt", "target/output");
    }

}
