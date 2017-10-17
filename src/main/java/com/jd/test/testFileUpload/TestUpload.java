package com.jd.test.testFileUpload;

import java.io.File;

/**
 * Created by sunboyu on 2017/10/16.
 */
public class TestUpload {

    public static void main(String[] args) {

        try {
            String basePath = TestUpload.class.getClassLoader().getResource("").getPath();
            String path = basePath + "com/jd/test/testFileUpload/testFile.txt";
            ;
            File file = new File(path);
            System.out.println(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}