package com.yxcorp.gifshow.magic.data.repo.response.MagicFaceClickResponseData;
import java.io.Serializable;
import java.lang.Object;

public class MagicFaceClickResponseData implements Serializable	// class@001b96
{
    public int mMagicUseType;
    public JsonObject mViews;

    public void MagicFaceClickResponseData(){
       super();
       this.mMagicUseType = -1;
    }
}
