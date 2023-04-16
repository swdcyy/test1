package com.kwai.video.krtc.observers.AryaWebsocketObserver;
import java.lang.Object;
import java.lang.String;

public abstract class AryaWebsocketObserver	// class@0007c0
{

    public void AryaWebsocketObserver(){
       super();
    }
    public abstract void onWebsocketClose(String p0,int p1);
    public abstract void onWebsocketFail(String p0,int p1);
    public abstract void onWebsocketOpen();
    public abstract void onWebsocketReconnecting();
    public abstract void onWebsocketRecvData(byte[] p0,int p1);
    public abstract void onWebsocketRecvMessage(String p0,int p1);
}
