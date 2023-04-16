package com.kuaishou.audio.recorder.IAudioRecordEngine;
import com.kuaishou.audio.recorder.IAudioRecordEngine$RecordAudioFormat;
import com.kuaishou.audio.recorder.IAudioRecordEngine$AudioScene;
import ot.c;
import ot.a;

public interface abstract IAudioRecordEngine	// class@000faa
{

    void a(byte[] p0,int p1,int p2,int p3,long p4);
    void b(boolean p0);
    void c(boolean p0);
    void d(boolean p0,int p1,int p2);
    boolean e(IAudioRecordEngine$RecordAudioFormat p0,IAudioRecordEngine$AudioScene p1,c p2);
    a getBiz();
    boolean isRecording();
    void release();
    boolean stopRecording();
}
