package com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import java.io.Serializable;
import java.lang.Object;

public class SharePosInfo implements Serializable	// class@00116a
{
    public int mListFirstVisiblePosition;
    public int mPosition;
    public static final long serialVersionUID = 0x1d9ec427961dfe4f;

    public void SharePosInfo(){
       super();
    }
    public void SharePosInfo(int p0,int p1){
       super();
       this.mPosition = p0;
       this.mListFirstVisiblePosition = p1;
    }
    public void copyFrom(SharePosInfo p0){
       this.mPosition = p0.mPosition;
       this.mListFirstVisiblePosition = p0.mListFirstVisiblePosition;
    }
}
