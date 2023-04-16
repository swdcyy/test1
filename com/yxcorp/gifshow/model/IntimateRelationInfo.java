package com.yxcorp.gifshow.model.IntimateRelationInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kwai.framework.model.user.IntimateTag;
import java.lang.Integer;
import ekd.j;
import java.lang.Boolean;
import zf6.k;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;

public class IntimateRelationInfo implements Serializable	// class@001e36
{
    public boolean isSelected;
    public String[] mAvatarBorderColorList;
    public String[] mColorList;
    public String[] mDialogBgEndColorList;
    public String[] mDialogBgImageList;
    public String[] mDialogBgStartColorList;
    public String[] mIconList;
    public boolean mIsUsing;
    public String[] mLabelIcon;
    public String[] mLottieJson;
    public String mName;
    public String[] mSelectIconList;
    public String[] mTagBgColorList;
    public int mType;
    public int mUpperLimit;
    public static final long serialVersionUID = 0x189cdd2d3a46e8cb;

    public void IntimateRelationInfo(){
       super();
    }
    public static IntimateRelationInfo DEFAULT(){
       IntimateRelationInfo obj = PatchProxy.apply(null, null, IntimateRelationInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new IntimateRelationInfo();
       obj.mName = a1.p(0x7f101715);
       return obj;
    }
    public static String getIntimateTagIcon(IntimateTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IntimateRelationInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getValueSafety(p0.icons, IntimateRelationInfo.isDarkMode());
    }
    public static String getResource(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IntimateRelationInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getValueSafety(p0, IntimateRelationInfo.isDarkMode());
    }
    public static String getValueSafety(String[] p0,int p1){
       if (PatchProxy.isSupport(IntimateRelationInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, IntimateRelationInfo.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (j.h(p0) || p1 < 0) {
          return "";
       }else if(p1 >= p0.length){
          return p0[0];
       }else {
          return p0[p1];
       }
    }
    public static boolean isDarkMode(){
       Object obj = PatchProxy.apply(null, null, IntimateRelationInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.d();
    }
    public final int a(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntimateRelationInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b(p0, 0);
    }
    public final int b(String[] p0,int p1){
       if (PatchProxy.isSupport(IntimateRelationInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, IntimateRelationInfo.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       String resource = IntimateRelationInfo.getResource(p0);
       if (!TextUtils.x(resource)) {
          return Color.parseColor(resource);
       }else {
          return p1;
       }
    }
    public int getAvatarBorderColor(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b(this.mAvatarBorderColorList, -1);
    }
    public int getColor(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a(this.mColorList);
    }
    public int getDialogBgEndColor(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a(this.mDialogBgEndColorList);
    }
    public String getDialogBgImage(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getResource(this.mDialogBgImageList);
    }
    public int getDialogBgStartColor(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a(this.mDialogBgStartColorList);
    }
    public String getIcon(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getResource(this.mIconList);
    }
    public String getLabelImage(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getResource(this.mLabelIcon);
    }
    public String getLottieJson(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getValueSafety(this.mLottieJson, IntimateRelationInfo.isDarkMode());
    }
    public String getSelectIcon(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IntimateRelationInfo.getResource(this.mSelectIconList);
    }
    public int getTagBgColor(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a(this.mTagBgColorList);
    }
}
