package com.yxcorp.gifshow.detail.slideplay.PreloadInfo;
import java.io.Serializable;
import java.lang.Object;

public class PreloadInfo implements Serializable	// class@00170d
{
    public final boolean mFully;
    public final int mPosition;
    public final int mRemovePosition;
    public static final long serialVersionUID = 0x8b9ef5f634f7a06;

    public void PreloadInfo(int p0,boolean p1){
       super();
       this.mPosition = p0;
       this.mFully = p1;
       this.mRemovePosition = -1;
    }
    public void PreloadInfo(int p0,boolean p1,int p2){
       super();
       this.mPosition = p0;
       this.mFully = p1;
       this.mRemovePosition = p2;
    }
}
