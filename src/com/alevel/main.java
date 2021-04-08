package com.alevel;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) throws Exception {
        extracted(null);
    }
    @Nullable
    private static int extracted(@NotNull String string) throws Exception{
        try{
            //код
        }catch (Exception ex){
            //код
        }
        finally {
            //всегда выполняется
        }
        FileReader filereader = null;
        try {
            filereader = new FileReader("path to file");
        } catch (FileNotFoundException e) {
            //logger(e.getMessage());
            e.getCause();
            e.printStackTrace();
        }finally {
            try {
                filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //в try с ресурсами можем указывать только те классы, что реализуют интерфейс closable
        try(BufferedReader filereader1 = Files.newBufferedReader(Paths.get("path to file"))) {
            //String string = null;
            //String string = "null";
            return string.length();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("File not found");
            throw new AlevelException();
        } catch (NullPointerException e){
            e.printStackTrace();
            //throw null;
            return 0;
        }finally {
            return 1;//возвращает тупо это
        }
        //ssh-keygen -o
        //4.3 Git на сервере - Генерация открытого SSH ключа
        //https://git-scm.com/book/ru/v2/Git-%D0%BD%D0%B0-%D1%81%D0%B5%D1%80%D0%B2%D0%B5%D1%80%D0%B5-%D0%93%D0%B5%D0%BD%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D0%BE%D1%82%D0%BA%D1%80%D1%8B%D1%82%D0%BE%D0%B3%D0%BE-SSH-%D0%BA%D0%BB%D1%8E%D1%87%D0%B0
        //https://git-scm.com/book/uk/v2/Git-%D0%BD%D0%B0-%D1%81%D0%B5%D1%80%D0%B2%D0%B5%D1%80%D1%96-%D0%93%D0%B5%D0%BD%D0%B5%D1%80%D0%B0%D1%86%D1%96%D1%8F-%D0%B2%D0%B0%D1%88%D0%BE%D0%B3%D0%BE-%D0%BF%D1%83%D0%B1%D0%BB%D1%96%D1%87%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BA%D0%BB%D1%8E%D1%87%D0%B0-SSH
    }
}
