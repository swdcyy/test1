package com.kuaishou.webkit.internal.FileUtils$1;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class FileUtils$1 implements FilenameFilter	// class@001314
{

    public void FileUtils$1(){
       super();
    }
    public boolean accept(File p0,String p1){
       boolean b = (!TextUtils.isEmpty(p1) && p1.length() > 2)? true: false;
       return b;
    }
}
