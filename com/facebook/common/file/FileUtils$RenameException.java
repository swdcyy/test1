package com.facebook.common.file.FileUtils$RenameException;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;

public class FileUtils$RenameException extends IOException	// class@001053
{

    public void FileUtils$RenameException(String p0){
       super(p0);
    }
    public void FileUtils$RenameException(String p0,Throwable p1){
       super(p0);
       this.initCause(p1);
    }
}
