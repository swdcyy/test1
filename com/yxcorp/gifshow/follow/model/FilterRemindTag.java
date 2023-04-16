package com.yxcorp.gifshow.follow.model.FilterRemindTag;
import java.io.Serializable;
import com.yxcorp.gifshow.follow.model.FilterRemindTag$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.follow.model.DarkLightModel;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ra6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public final class FilterRemindTag implements Serializable	// class@0010fe
{
    public final DarkLightModel mBorderColor;
    public final DarkLightModel mContentColor;
    public final DarkLightModel mSolidColor;
    public final String mText;
    public final String mTextEng;
    public final String mTextTc;
    public static final FilterRemindTag$a Companion;
    public static final long serialVersionUID;

    static {
       FilterRemindTag.Companion = new FilterRemindTag$a(null);
    }
    public void FilterRemindTag(String p0,String p1,String p2,DarkLightModel p3,DarkLightModel p4,DarkLightModel p5){
       a.p(p0, "mText");
       a.p(p1, "mTextEng");
       a.p(p2, "mTextTc");
       super();
       this.mText = p0;
       this.mTextEng = p1;
       this.mTextTc = p2;
       this.mSolidColor = p3;
       this.mContentColor = p4;
       this.mBorderColor = p5;
    }
    public static FilterRemindTag copy$default(FilterRemindTag p0,String p1,String p2,String p3,DarkLightModel p4,DarkLightModel p5,DarkLightModel p6,int p7,Object p8){
       FilterRemindTag mText;
       FilterRemindTag mTextEng;
       FilterRemindTag mTextTc;
       FilterRemindTag mSolidColor;
       FilterRemindTag mContentColo;
       FilterRemindTag mBorderColor;
       if (p7 & 0x01) {
          mText = p0.mText;
       }
       if (p7 & 0x02) {
          mTextEng = p0.mTextEng;
       }
       p8 = mTextEng;
       if (p7 & 0x04) {
          mTextTc = p0.mTextTc;
       }
       FilterRemindTag uFilterRemin = mTextTc;
       if (p7 & 0x08) {
          mSolidColor = p0.mSolidColor;
       }
       FilterRemindTag uFilterRemin1 = mSolidColor;
       if (p7 & 0x10) {
          mContentColo = p0.mContentColor;
       }
       FilterRemindTag uFilterRemin2 = mContentColo;
       if (p7 & 0x20) {
          mBorderColor = p0.mBorderColor;
       }
       return p0.copy(mText, p8, uFilterRemin, uFilterRemin1, uFilterRemin2, mBorderColor);
    }
    public final FilterRemindTag copy(String p0,String p1,String p2,DarkLightModel p3,DarkLightModel p4,DarkLightModel p5){
       Object obj;
       if (PatchProxy.isSupport(FilterRemindTag.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, FilterRemindTag.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "mText");
       a.p(p1, "mTextEng");
       a.p(p2, "mTextTc");
       FilterRemindTag uFilterRemin = new FilterRemindTag(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterRemindTag.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FilterRemindTag && (a.g(this.mText, p0.mText) && (a.g(this.mTextEng, p0.mTextEng) && (a.g(this.mTextTc, p0.mTextTc) && (a.g(this.mSolidColor, p0.mSolidColor) && (a.g(this.mContentColor, p0.mContentColor) && a.g(this.mBorderColor, p0.mBorderColor)))))))) {
          return true;
       }
       return false;
    }
    public final String getBorderColor(){
       Object[] objArray = null;
       FilterRemindTag obj = PatchProxy.apply(objArray, this, FilterRemindTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBorderColor;
       if (obj != null) {
          objArray = obj.getMUrl();
       }
       return objArray;
    }
    public final String getContentColor(){
       Object[] objArray = null;
       FilterRemindTag obj = PatchProxy.apply(objArray, this, FilterRemindTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mContentColor;
       if (obj != null) {
          objArray = obj.getMUrl();
       }
       return objArray;
    }
    public final String getShowText(){
       int b;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, FilterRemindTag.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, FilterRemindTag.class, "5");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(a.f()){
          b = TextUtils.isDigitsOnly(this.mText);
       }else if(a.e()){
          b = TextUtils.isDigitsOnly(this.mTextEng);
       }else {
          b = TextUtils.isDigitsOnly(this.mTextTc);
       }
       if (b) {
          if (a.f()) {
             b = Integer.parseInt(this.mText);
          }else if(a.e()){
             b = Integer.parseInt(this.mTextEng);
          }else {
             b = Integer.parseInt(this.mTextTc);
          }
          if (b > 99) {
             str = "99+";
          }else {
             str = String.valueOf(b);
          }
       }else if(a.f()){
          str = this.mText;
       }else if(a.e()){
          str = this.mTextEng;
       }else {
          str = this.mTextTc;
       }
       return str;
    }
    public final String getSolidColor(){
       Object[] objArray = null;
       FilterRemindTag obj = PatchProxy.apply(objArray, this, FilterRemindTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSolidColor;
       if (obj != null) {
          objArray = obj.getMUrl();
       }
       return objArray;
    }
    public int hashCode(){
       FilterRemindTag obj = PatchProxy.apply(null, this, FilterRemindTag.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FilterRemindTag tmTextEng = this.mTextEng;
       int i2 = (tmTextEng != null)? tmTextEng.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmTextEng = this.mTextTc;
       i2 = (tmTextEng != null)? tmTextEng.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmTextEng = this.mSolidColor;
       i2 = (tmTextEng != null)? tmTextEng.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmTextEng = this.mContentColor;
       i2 = (tmTextEng != null)? tmTextEng.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmTextEng = this.mBorderColor;
       if (tmTextEng != null) {
          i = tmTextEng.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isInvalid(){
       FilterRemindTag tmText;
       CharSequence[] obj = PatchProxy.apply(null, this, FilterRemindTag.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new CharSequence[4];
       int i = 0;
       if (a.f()) {
          tmText = this.mText;
       }else if(a.e()){
          tmText = this.mTextEng;
       }else {
          tmText = this.mTextTc;
       }
       obj[i] = tmText;
       obj[1] = this.getSolidColor();
       obj[2] = this.getContentColor();
       obj[3] = this.getBorderColor();
       return TextUtils.y(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterRemindTag.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterRemindTag\(mText="+this.mText+", mTextEng="+this.mTextEng+", mTextTc="+this.mTextTc+", mSolidColor="+this.mSolidColor+", mContentColor="+this.mContentColor+", mBorderColor="+this.mBorderColor+"\)";
    }
}
