package com.yxcorp.gifshow.magic.data.swap.models.SwapQMedia;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class SwapQMedia extends QMedia	// class@001ba0
{
    public int mErrorTextType;
    public boolean mIsLocalMedia;
    public String mMediaPath;
    public boolean mNeedShowDivider;

    public void SwapQMedia(int p0){
       super(-1, "", -1, -1, -1);
       this.mErrorTextType = p0;
    }
    public void SwapQMedia(long p0,String p1,long p2,long p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public void SwapQMedia(long p0,String p1,long p2,long p3,long p4,int p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void SwapQMedia(long p0,String p1,long p2,long p3,long p4,long p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6);
    }
    public QMedia toQMedia(){
       Object obj = PatchProxy.apply(null, this, SwapQMedia.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QMedia qMedia = new QMedia(this.id, this.mMediaPath, this.duration, this.size, this.created, this.mModified, this.type);
       return obj;
    }
}
