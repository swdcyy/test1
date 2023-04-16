package com.kuaishou.protobuf.mmusound.soundrecognize.MmuSoundCallback;
import com.kuaishou.protobuf.mmusound.soundrecognize.SoundOutputData;
import java.lang.String;

public interface abstract MmuSoundCallback	// class@000df8
{

    void dataProcessCallback(SoundOutputData p0);
    void errorCallback(int p0,int p1);
    void logCallback(String p0);
    void wakeupCallback(int p0,int p1,String p2);
}
