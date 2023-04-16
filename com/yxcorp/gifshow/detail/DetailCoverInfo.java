package com.yxcorp.gifshow.detail.DetailCoverInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import com.yxcorp.gifshow.detail.DetailCoverInfo$b;
import java.lang.Object;
import com.yxcorp.gifshow.detail.DetailCoverInfo$a;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import android.content.res.Resources;
import java.lang.Boolean;

public class DetailCoverInfo implements Serializable, Cloneable	// class@001334
{
    public float mCoverAspectRatio;
    public String mCoverBase64String;
    public int mCoverPhotoType;
    public String mCoverPlaceholdColor;
    public String mCoverUrl;
    public static final long serialVersionUID = 0x9b07373daaf76939;

    public void DetailCoverInfo(DetailCoverInfo$b p0){
       super();
       this.mCoverAspectRatio = p0.a;
       this.mCoverUrl = p0.b;
       this.mCoverBase64String = p0.c;
       this.mCoverPlaceholdColor = p0.d;
       this.mCoverPhotoType = p0.e;
    }
    public void DetailCoverInfo(DetailCoverInfo$b p0,DetailCoverInfo$a p1){
       super(p0);
    }
    public float getCoverAspectRatio(){
       return this.mCoverAspectRatio;
    }
    public String getCoverBase64String(){
       return this.mCoverBase64String;
    }
    public String getCoverUrl(){
       return this.mCoverUrl;
    }
    public int getFinalCoverPlaceHoldColorInt(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCoverInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!TextUtils.x(this.mCoverPlaceholdColor)) {
          return Color.parseColor(this.mCoverPlaceholdColor);
       }
       return p0.getResources().getColor(0x7f060bd3);
    }
    public boolean isLongPhoto(){
       boolean b = true;
       if (this.mCoverPhotoType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, DetailCoverInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mCoverAspectRatio && (this.mCoverBase64String != null || (!TextUtils.x(this.mCoverUrl) && (this.mCoverUrl).length() < 0x2710))) {
          return true;
       }
       return false;
    }
    public boolean isVideoPhoto(){
       boolean b = (this.mCoverPhotoType == null)? true: false;
       return b;
    }
    public void setBuilder(DetailCoverInfo$b p0){
       this.mCoverAspectRatio = p0.a;
       this.mCoverUrl = p0.b;
       this.mCoverBase64String = p0.c;
       this.mCoverPlaceholdColor = p0.d;
       this.mCoverPhotoType = p0.e;
    }
    public void setCoverUrl(String p0){
       this.mCoverUrl = p0;
    }
}
