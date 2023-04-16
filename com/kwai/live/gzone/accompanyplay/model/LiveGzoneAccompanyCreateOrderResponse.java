package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCreateOrderResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveGzoneAccompanyCreateOrderResponse implements Serializable	// class@000c2b
{
    public long mDelayMs;
    public LiveGzoneAccompanyUserOrderInfo mUserOrderInfo;
    public static final long serialVersionUID = 0xd6a24cfb40a82b61;

    public void LiveGzoneAccompanyCreateOrderResponse(){
       super();
       this.mDelayMs = 2000;
    }
}
