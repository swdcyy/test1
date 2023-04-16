package com.yxcorp.gifshow.hypertag.b;
import com.yxcorp.gifshow.hypertag.a;
import com.kuaishou.android.model.mix.HyperTag;
import java.lang.Object;
import com.yxcorp.gifshow.hypertag.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.HyperTag$Icon;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.hypertag.a$d;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import java.lang.Boolean;
import lnc.a1;
import com.yxcorp.gifshow.hypertag.a$c;
import com.yxcorp.gifshow.hypertag.a$a;
import android.graphics.drawable.Drawable;
import wwa.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;

public class b implements a	// class@00191b
{
    public final HyperTag a;

    public void b(HyperTag p0){
       super();
       this.a = p0;
    }
    public a$b a(){
       Object[] objArray = null;
       HyperTag obj = PatchProxy.apply(objArray, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s();
       if (obj != null) {
          HyperTag mNormalIcon = obj.mNormalIcon;
          if (mNormalIcon != null && !TextUtils.x(mNormalIcon.mUrl)) {
             obj = obj.mNormalIcon;
             objArray = new a$b(obj.mUrl, obj.mWidth, obj.mHeight);
          }
       }
       return objArray;
    }
    public void b(){
    }
    public a$d c(){
       boolean b;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       HyperTag obj = PatchProxy.apply(objArray, this, uob, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.s();
       UserExtraInfo$TextColor textColor = this.t();
       String str = PatchProxy.applyOneRefs(obj, this, uob, "5");
       String str1 = "";
       if (str != patchProxyRe) {
       }else {
          Object obj1 = PatchProxy.applyOneRefs(obj, this, uob, "6");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): TextUtils.x(this.r(obj)) ^ 0x01;
          if (b) {
             str = this.r(obj);
          }else if(obj == null){
             str2 = str1;
          }else {
             str2 = obj.mUntruncableText;
          }
          str = TextUtils.I(str2);
       }
       if (!(a1.p(0x7f104c62)).equals(str)) {
          str1 = str;
       }
       if (textColor != null) {
          objArray = textColor.mUntruncableText;
       }
       return new a$d(str1, objArray, this.g());
    }
    public a$c d(){
       Object[] objArray = null;
       HyperTag obj = PatchProxy.apply(objArray, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s();
       if (obj == null || !this.q(obj)) {
          return objArray;
       }
       UserExtraInfo$TextColor textColor = this.t();
       obj = obj.mExtraTagText;
       if (textColor != null) {
          objArray = textColor.mExtraText;
       }
       return new a$c(obj, objArray, this.g());
    }
    public a$a e(){
       String str;
       Object[] objArray = null;
       HyperTag obj = PatchProxy.apply(objArray, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s();
       UserExtraInfo$TextColor textColor = this.t();
       obj = (obj != null && !TextUtils.x(obj.mTruncableText))? obj.mTruncableText: "";
       if (textColor != null) {
          objArray = textColor.mTruncableText;
       }
       return new a$a(obj, objArray, this.g());
    }
    public Drawable f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       HyperTag hyperTag = PatchProxy.apply(null, this, uob, "16");
       if (hyperTag != patchProxyRe) {
       }else {
          HyperTag hyperTag1 = this.s();
          hyperTag = (hyperTag1 == null || TextUtils.x(hyperTag1.mActionUrl))? "": hyperTag1.mActionUrl;
       }
       if (TextUtils.x(hyperTag)) {
          return a1.f(0x7f081ded);
       }else {
          return a1.f(0x7f081dee);
       }
    }
    public int g(){
       return a.e(this);
    }
    public String getActionUrl(){
       HyperTag obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s();
       if (obj == null || TextUtils.x(obj.mActionUrl)) {
          return "";
       }
       return obj.mActionUrl;
    }
    public String[] h(){
       int len;
       HyperTag obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s();
       int i = 0;
       if (obj != null) {
          HyperTag mIcons = obj.mIcons;
          if (mIcons != null) {
             len = mIcons.length;
          label_001e :
             String[] stringArray = new String[len];
             for (; i < len; i = i + 1) {
                stringArray[i] = obj.mIcons[i].mUrl;
             }
             return stringArray;
          }
       }
       len = 0;
       goto label_001e ;
    }
    public int i(){
       return a.b(this);
    }
    public boolean j(){
       boolean b;
       HyperTag obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s();
       b = (obj != null && (this.q(obj) && obj.mDisableTailSpace != null))? true: false;
       return b;
    }
    public boolean k(){
       HyperTag obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s();
       if (obj != null && this.q(obj)) {
          return obj.mShowSeparator;
       }
       return false;
    }
    public boolean l(){
       boolean b;
       HyperTag obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s();
       b = (obj != null && obj.mShowArrow != null)? true: false;
       return b;
    }
    public boolean m(){
       boolean b;
       HyperTag obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s();
       b = false;
       if (obj != null && (this.q(obj) || this.l())) {
          b = true;
       }
       return b;
    }
    public int n(){
       return a.a(this);
    }
    public int[] o(){
       return a.d(this);
    }
    public int p(){
       return a.c(this);
    }
    public final boolean q(HyperTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(p0.mExtraTagText) ^ 0x01);
    }
    public String r(HyperTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.mUseRecoTextInfo != null) {
          p0 = p0.mExtraData;
          if (p0 != null) {
             UserExtraInfo mRecoTextInf = p0.mRecoTextInfo;
             if (mRecoTextInf != null) {
                return RichTextMetaExt.f(mRecoTextInf, 7);
             }
          }
       }
       return "";
    }
    public HyperTag s(){
       return this.a;
    }
    public final UserExtraInfo$TextColor t(){
       Object[] objArray = null;
       HyperTag obj = PatchProxy.apply(objArray, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s();
       if (obj != null) {
          obj = obj.mExtraData;
          if (obj != null) {
             objArray = obj.mTextColor;
          }
       }
       return objArray;
    }
}
