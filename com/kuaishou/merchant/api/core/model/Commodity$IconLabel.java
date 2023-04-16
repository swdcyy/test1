package com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.CharSequence;
import android.graphics.Paint;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import lnc.a1;

public class Commodity$IconLabel implements Serializable	// class@001519
{
    public String mContent;
    public String mContentTextColor;
    public int mContentTextSize;
    public int mHeight;
    public String mIconUrl;
    public String mPrefix;
    public CharSequence mSpannableText;
    public Commodity$IconLabel$Style mStyle;
    public String mSuffix;
    public long mTime;
    public String mTimeSuffix;
    public int mType;
    public int mWidth;
    public static final long serialVersionUID = 0xfb89e8870b8c68a9;

    public void Commodity$IconLabel(){
       super();
    }
    public final float a(CharSequence p0,Paint p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Commodity$IconLabel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       if (TextUtils.x(p0)) {
          return f;
       }
       if (p1 != null) {
          f = p1.measureText(p0.toString());
       }
       return f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Commodity$IconLabel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mType != p0.mType || (!TextUtils.n(this.mContent, p0.mContent) || (!TextUtils.n(this.mPrefix, p0.mPrefix) || (!TextUtils.n(this.mIconUrl, p0.mIconUrl) || (this.mWidth != p0.mWidth || this.mHeight != p0.mHeight))))) {
          b = false;
       }
       return b;
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, Commodity$IconLabel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e((float)this.mHeight);
    }
    public int getRealWidth(Paint p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Commodity$IconLabel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(this.mIconUrl)) {
          return (int)((this.a(this.mPrefix, p0) + this.a(this.mContent, p0)) + this.a(this.mSuffix, p0));
       }
       return this.getWidth();
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, Commodity$IconLabel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e((float)this.mWidth);
    }
}
