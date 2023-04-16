package com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.yxcorp.gifshow.models.QMedia;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.System;
import ekd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class MixVideoTrack implements Serializable	// class@001554
{
    public double mBaseOffsetIgnoreSpeed;
    public double mBaseOffsetWithSpeed;
    public double mClipEnd;
    public double mClipStart;
    public double mFullDuration;
    public int mIndex;
    public QMedia mMedia;
    public int mOriginHeight;
    public int mOriginWidth;
    public String mPath;
    public int mRotate;
    public double mSpeed;
    public TransitionEffect mTranslation;
    public int mType;
    public static double b = 0.000000;
    public static final long serialVersionUID = 0xd1116e7f19a2bdf0;

    public void MixVideoTrack(){
       super();
       this.mTranslation = TransitionEffect.Companion.b();
    }
    public void MixVideoTrack(QMedia p0,int p1,double p2,int p3,int p4){
       super();
       this.mTranslation = TransitionEffect.Companion.b();
       Object[] objArray = new Object[0];
       a.D().w("MixVideoTrack", "MixVideoTrack\(\) called with:  index = ["+p1+"], fullDuration = ["+p2+"], originW = ["+p3+"], originH = ["+p4+"],  path = ["+p0.path+"]", objArray);
       this.mFullDuration = p2;
       this.mOriginWidth = p3;
       this.mOriginHeight = p4;
       this.mMedia = p0;
       this.mIndex = p1;
       this.mPath = p0.path;
       this.mType = p0.type;
       this.mClipStart = 0;
       this.mClipEnd = p2;
       this.mSpeed = 0x3ff0000000000000;
       this.mRotate = 0;
       Object[] objArray1 = new Object[0];
       a.D().w("AlbumMediaTrackAsset", "新建导入片段："+p1+"，mType "+this.mType+"，path "+this.mPath+", cost "+k1.t(System.currentTimeMillis()), objArray1);
    }
    public static void updateMinDuration(TransitionEffect p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MixVideoTrack.class, "4")) {
          return;
       }
       double d = (p0 == TransitionEffect.Companion.b())? 0x3fe0000000000000: 0x3ff0000000000000;
       MixVideoTrack.b = d;
       return;
    }
    public final double a(){
       Object obj = PatchProxy.apply(null, this, MixVideoTrack.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Math.min(MixVideoTrack.b, this.mFullDuration);
    }
    public MixVideoTrack copy(){
       MixVideoTrack obj = PatchProxy.apply(null, this, MixVideoTrack.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MixVideoTrack();
       obj.mIndex = this.mIndex;
       obj.mMedia = this.mMedia;
       obj.mPath = this.mPath;
       obj.mType = this.mType;
       obj.mSpeed = this.mSpeed;
       obj.mRotate = this.mRotate;
       obj.mClipStart = this.mClipStart;
       obj.mClipEnd = this.mClipEnd;
       obj.mFullDuration = this.mFullDuration;
       obj.mOriginWidth = this.mOriginWidth;
       obj.mOriginHeight = this.mOriginHeight;
       obj.mTranslation = this.mTranslation;
       return obj;
    }
    public double getDurationIgnoreSpeed(){
       return (this.mClipEnd - this.mClipStart);
    }
    public double getDurationWithSpeed(){
       return ((this.mClipEnd - this.mClipStart) / this.mSpeed);
    }
    public double getMaxClipStart(){
       Object obj = PatchProxy.apply(null, this, MixVideoTrack.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (this.mClipEnd - this.a());
    }
    public double getMinClipEnd(){
       Object obj = PatchProxy.apply(null, this, MixVideoTrack.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (this.mClipStart + this.a());
    }
    public boolean isClipped(){
       boolean b = (this.mClipStart - null || this.mClipEnd - this.mFullDuration)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MixVideoTrack.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "[index = "+this.mIndex+", start = "+this.mClipStart+", end = "+this.mClipEnd+",mFullDuration = "+this.mFullDuration+", mBaseOffsetIgnoreSpeed "+this.mBaseOffsetIgnoreSpeed+", getDurationIgnoreSpeed = "+this.getDurationIgnoreSpeed()+"]";
    }
}
