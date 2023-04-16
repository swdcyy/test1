package com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;

public class FileUtils$CreateDirectoryException extends IOException	// class@00043c
{

    public void FileUtils$CreateDirectoryException(String p0){
       super(p0);
    }
    public void FileUtils$CreateDirectoryException(String p0,Throwable p1){
       super(p0);
       this.initCause(p1);
    }
}
