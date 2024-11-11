package com.companyname.bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Test the main method of the App class
     */
    @Test
    public void testApp() {
        // 保存原始的 System.out，以便之后恢复
        PrintStream originalSystemOut = System.out;

        // 将 System.out 重定向到 ByteArrayOutputStream
        System.setOut(new PrintStream(outputStreamCaptor));

        // 调用 main 方法
        App.main(new String[] {}); // 调用 App 类的 main 方法

        // 恢复原始的 System.out
        System.setOut(originalSystemOut);

        // 检查输出是否包含 "Hello World!"
        assertEquals("Hello World!", outputStreamCaptor.toString().trim());
    }
}
