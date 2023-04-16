package com.yxcorp.gifshow.nearby.common.model.CommonBtnModel;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.common.model.CommonBtnModel$a;
import nsd.u;
import java.lang.String;
import com.kwai.social.startup.local.model.DarkLightModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CommonBtnModel implements Serializable	// class@00211f
{
    public final String mAction;
    public final DarkLightModel mBorderColor;
    public boolean mIsShow;
    public final DarkLightModel mLeftIconUrl;
    public final String mLogName;
    public final String mText;
    public final DarkLightModel mTextColor;
    public static final CommonBtnModel$a Companion;
    public static final long serialVersionUID;

    static {
       CommonBtnModel.Companion = new CommonBtnModel$a(null);
    }
    public void CommonBtnModel(){
       super(null, null, null, null, null, null, 63, null);
    }
    public void CommonBtnModel(String p0,String p1,DarkLightModel p2,DarkLightModel p3,DarkLightModel p4,String p5){
       super();
       this.mLogName = p0;
       this.mText = p1;
       this.mLeftIconUrl = p2;
       this.mTextColor = p3;
       this.mBorderColor = p4;
       this.mAction = p5;
    }
    public void CommonBtnModel(String p0,String p1,DarkLightModel p2,DarkLightModel p3,DarkLightModel p4,String p5,int p6,u p7){
       int i = (p6 & 0x01)? 0: p0;
       int i1 = (p6 & 0x02)? 0: p1;
       int i2 = (p6 & 0x04)? 0: p2;
       int i3 = (p6 & 0x08)? 0: p3;
       int i4 = (p6 & 0x10)? 0: p4;
       String str = (p6 & 0x20)? null: p5;
       super(i, i1, i2, i3, i4, str);
       return;
    }
    public static CommonBtnModel copy$default(CommonBtnModel p0,String p1,String p2,DarkLightModel p3,DarkLightModel p4,DarkLightModel p5,String p6,int p7,Object p8){
       CommonBtnModel mLogName;
       CommonBtnModel mText;
       CommonBtnModel mLeftIconUrl;
       CommonBtnModel mTextColor;
       CommonBtnModel mBorderColor;
       CommonBtnModel mAction;
       if (p7 & 0x01) {
          mLogName = p0.mLogName;
       }
       if (p7 & 0x02) {
          mText = p0.mText;
       }
       p8 = mText;
       if (p7 & 0x04) {
          mLeftIconUrl = p0.mLeftIconUrl;
       }
       CommonBtnModel uCommonBtnMo = mLeftIconUrl;
       if (p7 & 0x08) {
          mTextColor = p0.mTextColor;
       }
       CommonBtnModel uCommonBtnMo1 = mTextColor;
       if (p7 & 0x10) {
          mBorderColor = p0.mBorderColor;
       }
       CommonBtnModel uCommonBtnMo2 = mBorderColor;
       if (p7 & 0x20) {
          mAction = p0.mAction;
       }
       return p0.copy(mLogName, p8, uCommonBtnMo, uCommonBtnMo1, uCommonBtnMo2, mAction);
    }
    public final String component1(){
       return this.mLogName;
    }
    public final String component2(){
       return this.mText;
    }
    public final DarkLightModel component3(){
       return this.mLeftIconUrl;
    }
    public final DarkLightModel component4(){
       return this.mTextColor;
    }
    public final DarkLightModel component5(){
       return this.mBorderColor;
    }
    public final String component6(){
       return this.mAction;
    }
    public final CommonBtnModel copy(String p0,String p1,DarkLightModel p2,DarkLightModel p3,DarkLightModel p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(CommonBtnModel.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, CommonBtnModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CommonBtnModel uCommonBtnMo = new CommonBtnModel(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonBtnModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CommonBtnModel && (a.g(this.mLogName, p0.mLogName) && (a.g(this.mText, p0.mText) && (a.g(this.mLeftIconUrl, p0.mLeftIconUrl) && (a.g(this.mTextColor, p0.mTextColor) && (a.g(this.mBorderColor, p0.mBorderColor) && a.g(this.mAction, p0.mAction)))))))) {
          return true;
       }
       return false;
    }
    public final boolean getMIsShow(){
       return this.mIsShow;
    }
    public int hashCode(){
       CommonBtnModel obj = PatchProxy.apply(null, this, CommonBtnModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLogName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CommonBtnModel tmText = this.mText;
       int i2 = (tmText != null)? tmText.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmText = this.mLeftIconUrl;
       i2 = (tmText != null)? tmText.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmText = this.mTextColor;
       i2 = (tmText != null)? tmText.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmText = this.mBorderColor;
       i2 = (tmText != null)? tmText.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmText = this.mAction;
       if (tmText != null) {
          i = tmText.hashCode();
       }
       return (i1 + i);
    }
    public final void setMIsShow(boolean p0){
       this.mIsShow = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CommonBtnModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommonBtnModel\(mLogName="+this.mLogName+", mText="+this.mText+", mLeftIconUrl="+this.mLeftIconUrl+", mTextColor="+this.mTextColor+", mBorderColor="+this.mBorderColor+", mAction="+this.mAction+"\)";
    }
}
