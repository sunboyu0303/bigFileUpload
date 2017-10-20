package com.jd.test.testFileUpload;

import java.io.*;

/**
 * Created by sunboyu on 2017/10/16.
 */
public class TestUpload {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            String basePath = TestUpload.class.getClassLoader().getResource("").getPath();
            String path = basePath + "testFile.txt";

            File file = new File(path);
            fis = new FileInputStream(new File(path));

            System.out.println(fis);
            InputStreamReader isr = new InputStreamReader(fis);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}