package com.kwai.video.krtc.Arya$InitParam;
import java.lang.Object;

public class Arya$InitParam	// class@000669
{
    public EglBase$Context eglContext;
    public boolean enableWebSocket;
    public boolean needCreateEglContext;

    public void Arya$InitParam(){
       super();
       this.needCreateEglContext = true;
       this.eglContext = null;
       this.enableWebSocket = false;
    }
}
