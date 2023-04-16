package com.kwai.stentor.AsrProduct.Asr$PB;
import java.lang.String;
import com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import com.kwai.stentor.AsrProduct.Asr$PB$StentorASRState;
import com.kwai.stentor.AsrProduct.Asr$PB$StentorASRStatus;
import com.google.protobuf.MessageLite;
import java.lang.Class;
import com.google.protobuf.nano.MessageNano;

public interface abstract Asr$PB	// class@0018fb
{

    void StentorLog(String p0,AudioCallback$DebugLevel p1);
    void onResult(String p0,String p1,Asr$PB$StentorASRState p2,Asr$PB$StentorASRStatus p3,long p4,String p5);
    void sendMessage(MessageLite p0,Class p1);
    void sendMessage(MessageNano p0,Class p1,String p2);
}
