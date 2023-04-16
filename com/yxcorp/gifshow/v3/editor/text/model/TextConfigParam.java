package com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam$a;
import android.graphics.RectF;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import h80.c;
import h80.k;
import h80.m;
import huc.t;
import huc.d;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.CharSequence;
import java.lang.Number;
import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;

public final class TextConfigParam implements Parcelable	// class@001468
{
    public final int b;
    public final RectF c;
    public final RectF d;
    public final int e;
    public final boolean f;
    public final int g;
    public final String h;
    public final int i;
    public final List j;
    public final List k;
    public final TextDrawConfigParam l;
    public static final Parcelable$Creator CREATOR;

    static {
       TextConfigParam.CREATOR = new TextConfigParam$a();
    }
    public void TextConfigParam(){
       super(0, null, null, 0, false, 0, null, 0, null, null, null, 2047, null);
    }
    public void TextConfigParam(int p0,RectF p1,RectF p2,int p3,boolean p4,int p5,String p6,int p7,List p8,List p9,TextDrawConfigParam p10){
       a.p(p1, "textMoveLimitRect");
       a.p(p2, "textDrawLimitRect");
       a.p(p6, "textId");
       a.p(p10, "textDrawConfigParam");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
    }
    public void TextConfigParam(int p0,RectF p1,RectF p2,int p3,boolean p4,int p5,String p6,int p7,List p8,List p9,TextDrawConfigParam p10,int p11,u p12){
       int i = p11;
       int i1 = 0;
       int i2 = (i & 0x01)? 0: p0;
       int i3 = 0;
       RectF rectF = (i & 0x02)? new RectF((- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH), (- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH), (- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH), (- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH)): i3;
       RectF rectF1 = (i & 0x04)? new RectF(BaseDrawer.DRAWER_WIDTH_LEFT_RIGHT_LIMIT, BaseDrawer.DRAWER_HEIGHT_TOP_BOTTOM_LIMIT, BaseDrawer.DRAWER_WIDTH_LEFT_RIGHT_LIMIT, BaseDrawer.DRAWER_HEIGHT_TOP_BOTTOM_LIMIT): p2;
       int i4 = 17;
       int i5 = (i & 0x08)? 17: p3;
       int i6 = (i & 0x10)? 1: p4;
       if (!(i & 0x20)) {
          i4 = p5;
       }
       String str = (i & 0x40)? "": p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       int i7 = (i & 0x0100)? i3: p8;
       if (!(i & 0x0200)) {
          i3 = p9;
       }
       if (i & 0x0400) {
          TextDrawConfigParam textDrawConf = new TextDrawConfigParam(0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, null, null, null, null, false, 0, 0, 0, 0, 0, null, null, 0x3ffffff, null);
       }else {
          i = p10;
       }
       super(i2, rectF, rectF1, i5, i6, i4, str, i1, i7, i3, i);
       return;
    }
    public static TextConfigParam c(TextConfigParam p0,int p1,RectF p2,RectF p3,int p4,boolean p5,int p6,String p7,int p8,List p9,List p10,TextDrawConfigParam p11,int p12,Object p13){
       TextConfigParam textConfigPa = p0;
       int i = p12;
       TextConfigParam b = (i & 0x01)? textConfigPa.b: p1;
       TextConfigParam textConfigPa1 = null;
       TextConfigParam c = (i & 0x02)? textConfigPa.c: textConfigPa1;
       TextConfigParam d = (i & 0x04)? textConfigPa.d: textConfigPa1;
       TextConfigParam e = (i & 0x08)? textConfigPa.e: p4;
       TextConfigParam f = (i & 0x10)? textConfigPa.f: p5;
       TextConfigParam g = (i & 0x20)? textConfigPa.g: p6;
       TextConfigParam h = (i & 0x40)? textConfigPa.h: textConfigPa1;
       TextConfigParam i1 = (i & 0x0080)? textConfigPa.i: p8;
       TextConfigParam j = (i & 0x0100)? textConfigPa.j: textConfigPa1;
       if (i & 0x0200) {
          textConfigPa1 = textConfigPa.k;
       }
       TextConfigParam l = (i & 0x0400)? textConfigPa.l: p11;
       if (PatchProxy.isSupport(TextConfigParam.class)) {
          Object[] objArray = new Object[11];
          objArray[0] = Integer.valueOf(b);
          objArray[1] = c;
          objArray[2] = d;
          objArray[3] = Integer.valueOf(e);
          objArray[4] = Boolean.valueOf(f);
          objArray[5] = Integer.valueOf(g);
          objArray[6] = h;
          objArray[7] = Integer.valueOf(i1);
          objArray[8] = j;
          objArray[9] = textConfigPa1;
          objArray[10] = l;
          textConfigPa = PatchProxy.apply(objArray, p0, TextConfigParam.class, "5");
          if (textConfigPa != PatchProxyResult.class) {
          label_00e3 :
             return textConfigPa;
          }
       }
       a.p(c, "textMoveLimitRect");
       a.p(d, "textDrawLimitRect");
       a.p(h, "textId");
       a.p(l, "textDrawConfigParam");
       p0 = new TextConfigParam(b, c, d, e, f, g, h, i1, j, textConfigPa1, l);
       goto label_00e3 ;
    }
    public final boolean a(){
       boolean b;
       c obj = PatchProxy.apply(null, this, TextConfigParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 16;
       if ((this.e & i) != i) {
          obj = k.a();
          a.o(obj, "PostConfiguration.getEditEnvContext\(\)");
          if (!obj.b().a()) {
             b = false;
          label_0032 :
             return b;
          }
       }
       b = true;
       goto label_0032 ;
    }
    public final boolean b(){
       int i = 1;
       if ((this.e & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
    public final TextConfigParam d(TextDrawConfigParam p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, TextConfigParam.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "textDrawConfigParam");
       return TextConfigParam.c(this, 0, null, null, 0, false, 0, null, 0, null, null, p0, 1023, null);
    }
    public int describeContents(){
       return 0;
    }
    public final TextConfigParam e(String p0,String p1){
       String str2;
       TextConfigParam textConfigPa = this;
       String obj = p0;
       TextConfigParam obj1 = p1;
       t ot = t.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       Object[] obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, TextConfigParam.class, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj, "textId");
       a.p(obj1, "defaultTimeText");
       if (d.q(p0)) {
          obj = "";
          obj2 = null;
          String str1 = PatchProxy.apply(obj2, obj2, ot, "5");
          if (str1 != patchProxyRe) {
          }else {
             str1 = new SimpleDateFormat("dd").format(new Date());
          }
          str1 = "/";
          obj = obj+str1+str1;
          str = PatchProxy.apply(obj2, obj2, ot, str);
          if (str != patchProxyRe) {
          }else {
             str = new SimpleDateFormat("MM").format(new Date());
          }
          obj = obj+str+str1;
          str2 = PatchProxy.apply(obj2, obj2, ot, "3");
          if (str2 != patchProxyRe) {
          }else {
             str2 = new SimpleDateFormat("yyyy").format(new Date());
          }
          obj = obj+str2;
       }else {
          obj = "";
       }
       str2 = (!p1.length())? 1: null;
       if (!str2) {
          obj = obj1;
       }
       obj1 = PatchProxy.applyOneRefs(obj, this, TextConfigParam.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(obj, "timeText");
          obj1 = TextConfigParam.c(this, 0, null, null, 0, false, 0, null, 0, null, null, textConfigPa.l.a(obj), 1023, null);
       }
       return obj1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextConfigParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TextConfigParam && (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && (a.g(this.h, p0.h) && (this.i == p0.i && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && a.g(this.l, p0.l))))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.f;
    }
    public final int g(){
       return this.b;
    }
    public final int h(){
       return this.i;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, TextConfigParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.b * 31;
       TextConfigParam tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (((i + i2) * 31) + this.e) * 31;
       tc = this.f;
       if (tc != null) {
          i2 = 1;
       }
       i = (((i + i2) * 31) + this.g) * 31;
       tc = this.h;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (((i + i2) * 31) + this.i) * 31;
       tc = this.j;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.k;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.l;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public final TextDrawConfigParam i(){
       return this.l;
    }
    public final String j(){
       return this.h;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TextConfigParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextConfigParam\(fromType="+this.b+", textMoveLimitRect="+this.c+", textDrawLimitRect="+this.d+", controllerType="+this.e+", canHorizontalMove="+this.f+", showInWhereFlag="+this.g+", textId="+this.h+", listImageIconResId="+this.i+", listImageIconCDNUrl="+this.j+", listImageIconNewCDNUrl="+this.k+", textDrawConfigParam="+this.l+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       Iterator iterator;
       if (PatchProxy.isSupport(TextConfigParam.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextConfigParam.class, "9")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeParcelable(this.c, p1);
       p0.writeParcelable(this.d, p1);
       p0.writeInt(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.g);
       p0.writeString(this.h);
       p0.writeInt(this.i);
       TextConfigParam tj = this.j;
       int i = 1;
       if (tj != null) {
          p0.writeInt(i);
          p0.writeInt(tj.size());
          iterator = tj.iterator();
          while (iterator.hasNext()) {
             p0.writeSerializable(iterator.next());
          }
       }else {
          p0.writeInt(0);
       }
       tj = this.k;
       if (tj != null) {
          p0.writeInt(i);
          p0.writeInt(tj.size());
          iterator = tj.iterator();
          while (iterator.hasNext()) {
             p0.writeSerializable(iterator.next());
          }
       }else {
          p0.writeInt(0);
       }
       this.l.writeToParcel(p0, 0);
       return;
    }
}
