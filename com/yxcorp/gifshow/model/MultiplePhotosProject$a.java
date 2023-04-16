package com.yxcorp.gifshow.model.MultiplePhotosProject$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public class MultiplePhotosProject$a	// class@001e5b
{
    public String a;
    public int b;
    public int mCropHeight;
    public int mCropWidth;
    public int mHeight;
    public String mImageName;
    public int mIndex;
    public int mWidth;

    public void MultiplePhotosProject$a(String p0,String p1,int p2,int p3,int p4,int p5,int p6){
       super();
       this.b = 1;
       this.mImageName = p0;
       this.a = p1;
       this.mIndex = p2;
       this.mWidth = p3;
       this.mHeight = p4;
       this.mCropWidth = p5;
       this.mCropHeight = p6;
    }
    public String a(){
       return this.a;
    }
    public int b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiplePhotosProject$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 instanceof MultiplePhotosProject$a && (p0.mWidth == this.mWidth && (p0.mHeight == this.mHeight && (p0.mIndex == this.mIndex && TextUtils.equals(this.mImageName, p0.mImageName))))) {
          b = true;
       }
    label_0037 :
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, MultiplePhotosProject$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mImageName+"_"+this.mIndex+"_"+this.mWidth+"_"+this.mHeight).hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MultiplePhotosProject$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ImagePieceInfo{mImageName=\'"+this.mImageName+'''+", mIndex="+this.mIndex+", mWidth="+this.mWidth+", mHeight="+this.mHeight+", mCropWidth="+this.mCropWidth+", mCropHeight="+this.mCropHeight+", mOriginFileName=\'"+this.a+'''+", mOriginFileTotalSegmentSize="+this.b+'}';
    }
}
