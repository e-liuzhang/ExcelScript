package com.fpi.script;

import com.fpi.script.entity.ExcelDataVO;
import com.fpi.script.entity.ExcelReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Main {
    // 绝对路径，IN_FILE（需处理文件）为输入文件，OUT_FILE（result.txt）为输出文件，。
    private static final String IN_FILE = "C:\\Users\\admin\\Desktop\\2.xlsx";
    private static final String OUT_FILE = "C:\\Users\\admin\\Desktop\\result.txt";


    public static void main(String[] args) {
        try{
            /* 写入Txt文件 */
            File writename = new File(OUT_FILE);
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));

//          excel文件
            String excelFileName =IN_FILE;

            // 读取Excel文件内容
            List<ExcelDataVO> readResult = ExcelReader.readExcel(excelFileName);
            for ( ExcelDataVO excelDataVO:readResult) {
                /**
                 * 填写excelDataVO的属性
                 * 比如：String =excelDataVO.getXXX();
                 */
                String name=excelDataVO.getName();
                String code=excelDataVO.getCode();
                out.write( name+","+code+"\r\n");
//                String str="获取到的内容";
//                out.write( str+"\r\n"); // \r\n即为换行
            }

            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件
            System.out.println("已将数据导入result.txt，请查看~");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
