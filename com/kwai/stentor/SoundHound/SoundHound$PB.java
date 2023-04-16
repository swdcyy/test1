package com.kwai.stentor.SoundHound.SoundHound$PB;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import com.kwai.stentor.SoundHound.SoundHound$PB$StentorSoundhoundState;
import com.kwai.stentor.SoundHound.SoundHound$PB$StentorSoundhoundStatus;
import com.google.protobuf.MessageLite;
import java.lang.Class;
import com.google.protobuf.nano.MessageNano;

public interface abstract SoundHound$PB	// class@001907
{

    void StentorLog(String p0,AudioCallback$DebugLevel p1);
    void a(SoundHound$PB$StentorSoundhoundState p0,SoundHound$PB$StentorSoundhoundStatus p1,long p2,String p3);
    void sendMessage(MessageLite p0,Class p1);
    void sendMessage(MessageNano p0,Class p1,String p2);
}
