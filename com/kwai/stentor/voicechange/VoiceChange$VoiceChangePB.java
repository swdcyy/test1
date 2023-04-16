package com.kwai.stentor.voicechange.VoiceChange$VoiceChangePB;
import java.lang.String;
import com.kwai.stentor.voicechange.VoiceChange$VoiceChangePB$StentorVCState;
import com.google.protobuf.MessageLite;
import java.lang.Class;
import com.google.protobuf.nano.MessageNano;

public interface abstract VoiceChange$VoiceChangePB	// class@001910
{

    void a(byte[] p0,String p1,VoiceChange$VoiceChangePB$StentorVCState p2);
    void b(MessageLite p0,Class p1,String p2);
    void c(byte[] p0,String p1,VoiceChange$VoiceChangePB$StentorVCState p2);
    void d(String p0);
    void sendMessage(MessageNano p0,Class p1,String p2);
}
