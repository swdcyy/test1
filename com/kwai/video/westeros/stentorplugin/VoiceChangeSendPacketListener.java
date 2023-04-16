package com.kwai.video.westeros.stentorplugin.VoiceChangeSendPacketListener;
import java.lang.String;

public interface abstract VoiceChangeSendPacketListener	// class@0010c1
{

    void onFailed(int p0,String p1,String p2);
    void onResponse(byte[] p0,String p1);
}
