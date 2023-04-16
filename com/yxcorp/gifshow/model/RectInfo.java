package com.yxcorp.gifshow.model.RectInfo;
import java.io.Serializable;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.Boolean;

public class RectInfo implements Serializable	// class@001e84
{
    public float mRadiusInner;
    public float mRadiusOuter;
    public float[] mTargetRect;
    public static final long serialVersionUID = 0x39401fbc2039eac6;

    public void RectInfo(RectF p0,float p1,float p2){
       super();
       float[] uofloatArray = new float[4];
       this.mTargetRect = uofloatArray;
       this.mRadiusOuter = 0;
       this.mRadiusInner = 0;
       this.setTargetRect(p0);
       this.mRadiusOuter = p1;
       this.mRadiusInner = p2;
    }
    public RectInfo clone(){
       Object obj = PatchProxy.apply(null, this, RectInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectInfo(this.getTargetRect(), this.getRadiusOuter(), this.getRadiusInner());
    }
    public Object clone(){
       return this.clone();
    }
    public float getRadiusInner(){
       return this.mRadiusInner;
    }
    public float getRadiusOuter(){
       return this.mRadiusOuter;
    }
    public RectF getTargetRect(){
       Object obj = PatchProxy.apply(null, this, RectInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RectInfo tmTargetRect = this.mTargetRect;
       return new RectF(tmTargetRect[0], tmTargetRect[1], tmTargetRect[2], tmTargetRect[3]);
    }
    public void setTargetRect(RectF p0){
       float[] uofloatArray = new float[]{p0.left,p0.top,p0.right,p0.bottom};
       this.mTargetRect = uofloatArray;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RectInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RectInfo{mTargetRect="+Arrays.toString(this.mTargetRect)+", mRadiusOuter="+this.mRadiusOuter+", mRadiusInner="+this.mRadiusInner+'}';
    }
    public boolean valid(){
       RectF obj = PatchProxy.apply(null, this, RectInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getTargetRect();
       boolean b = (obj.width() > 0 && obj.height() > 0)? true: false;
       return b;
    }
}
