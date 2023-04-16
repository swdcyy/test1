package com.google.archivepatcher.applier.PatchFormatException;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;

public class PatchFormatException extends IOException	// class@0016f7
{

    public void PatchFormatException(String p0){
       super(p0);
    }
    public void PatchFormatException(String p0,Throwable p1){
       super(p0);
       this.initCause(p1);
    }
}
