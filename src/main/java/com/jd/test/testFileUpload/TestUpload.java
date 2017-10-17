package com.jd.test.testFileUpload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by sunboyu on 2017/10/16.
 */
public class TestUpload {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            String basePath = TestUpload.class.getResource("").getPath();
            String path = basePath + "testFile.txt";

            System.out.println(path);
            File file = new File(path);

            fis = new FileInputStream(file);

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