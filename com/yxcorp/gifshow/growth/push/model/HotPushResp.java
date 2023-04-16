package com.yxcorp.gifshow.growth.push.model.HotPushResp;
import java.io.Serializable;
import java.lang.Object;

public class HotPushResp implements Serializable	// class@00149c
{
    public int hotPush;
    public HotPushSwitch hotSwitch;
    public List mPushType;
    public JsonObject mRelation;
    public static final long serialVersionUID = 0x1e4d07a6cad640b;

    public void HotPushResp(){
       super();
       this.hotPush = 0;
    }
}
