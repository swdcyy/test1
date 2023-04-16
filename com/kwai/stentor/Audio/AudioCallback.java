package com.kwai.stentor.Audio.AudioCallback;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;

public interface abstract AudioCallback	// class@001903
{

    void logCallback(String p0,AudioCallback$DebugLevel p1);
    void modelOutput(int p0,int p1);
    void setDataOutPut(byte[] p0,int p1,int p2,int p3,int p4,int p5,int p6,boolean p7);
}
