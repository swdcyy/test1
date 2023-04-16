package com.frog.engine.internal.CommandExpandFuncListener;
import java.lang.String;
import com.frog.engine.jsobject.FrogJSObject;
import com.frog.engine.FrogCallGameListener;

public interface abstract CommandExpandFuncListener	// class@00152f
{

    boolean canRead(String p0);
    boolean canWrite(String p0);
    byte[] fileDataWithPath(String p0);
    String findAbsPath(String p0);
    String getTempDir();
    String ksPath(int p0);
    long lastSpace(String p0);
    void sendCommandToNativeGame(String p0,FrogJSObject p1,FrogCallGameListener p2);
}
