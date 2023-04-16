package com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam$a;
import android.graphics.Rect;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class TextDrawConfigParam implements Parcelable	// class@00146a
{
    public final TextStyleValue A;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Rect i;
    public final int j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final TextStyleAttrs z;
    public static final Parcelable$Creator CREATOR;

    static {
       TextDrawConfigParam.CREATOR = new TextDrawConfigParam$a();
    }
    public void TextDrawConfigParam(){
       super(0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, null, null, null, null, false, 0, 0, 0, 0, 0, null, null, 0x3ffffff, null);
    }
    public void TextDrawConfigParam(int p0,int p1,int p2,int p3,int p4,int p5,int p6,Rect p7,int p8,int p9,String p10,int p11,int p12,int p13,String p14,String p15,String p16,String p17,boolean p18,int p19,int p20,int p21,int p22,int p23,TextStyleAttrs p24,TextStyleValue p25){
       int i = this;
       Object obj = p7;
       Object obj1 = p10;
       Object obj2 = p14;
       Object obj3 = p15;
       Object obj4 = p16;
       Object obj5 = p17;
       Object obj6 = p24;
       Object obj7 = p25;
       a.p(obj, "textPadding");
       a.p(obj1, "defaultText");
       a.p(obj2, "timeText");
       a.p(obj3, "authorText");
       a.p(obj4, "locationText");
       a.p(obj5, "fontFileName");
       a.p(obj6, "styleAttrs");
       a.p(obj7, "initAttrsValue");
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = p3;
       i.f = p4;
       i.g = p5;
       i.h = p6;
       i.i = obj;
       i.j = p8;
       i.k = p9;
       i.l = obj1;
       i.m = p11;
       i.n = p12;
       i.o = p13;
       i.p = obj2;
       i.q = obj3;
       i.r = obj4;
       i.s = obj5;
       i.t = p18;
       i.u = p19;
       i.v = p20;
       i.w = p21;
       i.x = p22;
       i.y = p23;
       i.z = obj6;
       i.A = obj7;
    }
    public void TextDrawConfigParam(int p0,int p1,int p2,int p3,int p4,int p5,int p6,Rect p7,int p8,int p9,String p10,int p11,int p12,int p13,String p14,String p15,String p16,String p17,boolean p18,int p19,int p20,int p21,int p22,int p23,TextStyleAttrs p24,TextStyleValue p25,int p26,u p27){
       String str;
       int i = p26;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x04)? 0: p2;
       int i4 = (i & 0x08)? 0: p3;
       int i5 = (i & 0x10)? 0: p4;
       int i6 = Integer.MAX_VALUE;
       int i7 = (i & 0x20)? Integer.MAX_VALUE: p5;
       int i8 = (i & 0x40)? 0: p6;
       Rect rect = (i & 0x0080)? new Rect(): p7;
       int i9 = (i & 0x0100)? Integer.MAX_VALUE: p8;
       if (!(i & 0x0200)) {
          i6 = p9;
       }
       if (i & 0x0400) {
          str = PostExperimentUtils.z0();
          a.o(str, "PostExperimentUtils.getTextDefaultTips\(\)");
       }else {
          str = p10;
       }
       int i10 = (i & 0x0800)? 33: p11;
       int i11 = (i & 0x1000)? 0: p12;
       int i12 = (i & 0x2000)? 0: p13;
       String str1 = "";
       String str2 = null;
       String str3 = (i & 0x4000)? str1: str2;
       String str4 = (i & 0x8000)? str1: str2;
       if (i & 0x10000) {
          str2 = str1;
       }
       if (!(i & 0x20000)) {
          str1 = p17;
       }
       int i13 = (i & 0x40000)? 1: p18;
       int i14 = (i & 0x80000)? 0: p19;
       int i15 = (i & 0x100000)? 0: p20;
       int i16 = (i & 0x200000)? 0: p21;
       int i17 = (i & 0x400000)? 0: p22;
       int i18 = (i & Float.MIN_NORMAL)? i1: p23;
       if (i & 0x1000000) {
          TextStyleAttrs textStyleAtt = new TextStyleAttrs(0, 0, 0, 0, 15, 0);
       }else {
          int i19 = p24;
       }
       if (i & 0x2000000) {
          TextStyleValue textStyleVal = new TextStyleValue(0, 0, 0, 0, 0, 0, 0, 0, 255, 0);
       }else {
          i = p25;
       }
       super(i1, i2, i3, i4, i5, i7, i8, rect, i9, i6, str, i10, i11, i12, str3, str4, str2, str1, i13, i14, i15, i16, i17, i18, v25, i);
       return;
    }
    public static TextDrawConfigParam b(TextDrawConfigParam p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,Rect p8,int p9,int p10,String p11,int p12,int p13,int p14,String p15,String p16,String p17,String p18,boolean p19,int p20,int p21,int p22,int p23,int p24,TextStyleAttrs p25,TextStyleValue p26,int p27,Object p28){
       TextDrawConfigParam textDrawConf12;
       TextDrawConfigParam textDrawConf13;
       TextDrawConfigParam textDrawConf14;
       object oobject;
       int i2;
       TextDrawConfigParam textDrawConf = p0;
       int i = p27;
       TextDrawConfigParam b = (i & 0x01)? textDrawConf.b: p1;
       TextDrawConfigParam c = (i & 0x02)? textDrawConf.c: p2;
       TextDrawConfigParam d = (i & 0x04)? textDrawConf.d: p3;
       TextDrawConfigParam e = (i & 0x08)? textDrawConf.e: p4;
       TextDrawConfigParam f = (i & 0x10)? textDrawConf.f: p5;
       TextDrawConfigParam g = (i & 0x20)? textDrawConf.g: p6;
       TextDrawConfigParam h = (i & 0x40)? textDrawConf.h: p7;
       TextDrawConfigParam i1 = (i & 0x0080)? textDrawConf.i: null;
       TextDrawConfigParam j = (i & 0x0100)? textDrawConf.j: p9;
       TextDrawConfigParam k = (i & 0x0200)? textDrawConf.k: p10;
       TextDrawConfigParam l = (i & 0x0400)? textDrawConf.l: p11;
       TextDrawConfigParam m = (i & 0x0800)? textDrawConf.m: p12;
       TextDrawConfigParam n = (i & 0x1000)? textDrawConf.n: p13;
       TextDrawConfigParam o = (i & 0x2000)? textDrawConf.o: p14;
       TextDrawConfigParam textDrawConf1 = o;
       o = (i & 0x4000)? textDrawConf.p: p15;
       TextDrawConfigParam textDrawConf2 = o;
       o = (i & 0x8000)? textDrawConf.q: p16;
       TextDrawConfigParam textDrawConf3 = o;
       o = (i & 0x10000)? textDrawConf.r: p17;
       TextDrawConfigParam textDrawConf4 = o;
       o = (i & 0x20000)? textDrawConf.s: p18;
       TextDrawConfigParam textDrawConf5 = o;
       o = (i & 0x40000)? textDrawConf.t: p19;
       TextDrawConfigParam textDrawConf6 = o;
       o = (i & 0x80000)? textDrawConf.u: p20;
       TextDrawConfigParam textDrawConf7 = o;
       o = (i & 0x100000)? textDrawConf.v: p21;
       TextDrawConfigParam textDrawConf8 = o;
       o = (i & 0x200000)? textDrawConf.w: p22;
       TextDrawConfigParam textDrawConf9 = o;
       o = (i & 0x400000)? textDrawConf.x: p23;
       TextDrawConfigParam textDrawConf10 = o;
       o = (i & Float.MIN_NORMAL)? textDrawConf.y: p24;
       TextDrawConfigParam textDrawConf11 = o;
       o = (i & 0x1000000)? textDrawConf.z: null;
       TextDrawConfigParam a = (i & 0x2000000)? textDrawConf.A: null;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(TextDrawConfigParam.class)) {
          Object[] objArray = new Object[26];
          objArray[0] = Integer.valueOf(b);
          objArray[1] = Integer.valueOf(c);
          objArray[2] = Integer.valueOf(d);
          objArray[3] = Integer.valueOf(e);
          objArray[4] = Integer.valueOf(f);
          objArray[5] = Integer.valueOf(g);
          objArray[6] = Integer.valueOf(h);
          objArray[7] = i1;
          objArray[8] = Integer.valueOf(j);
          objArray[9] = Integer.valueOf(k);
          objArray[10] = l;
          objArray[11] = Integer.valueOf(m);
          objArray[12] = Integer.valueOf(n);
          objArray[13] = Integer.valueOf(textDrawConf1);
          objArray[14] = textDrawConf2;
          objArray[15] = textDrawConf3;
          objArray[16] = textDrawConf4;
          objArray[17] = textDrawConf5;
          objArray[18] = Boolean.valueOf(textDrawConf6);
          objArray[19] = Integer.valueOf(textDrawConf7);
          objArray[20] = Integer.valueOf(textDrawConf8);
          objArray[21] = Integer.valueOf(textDrawConf9);
          objArray[22] = Integer.valueOf(textDrawConf10);
          objArray[23] = Integer.valueOf(textDrawConf11);
          objArray[24] = o;
          objArray[25] = a;
          textDrawConf12 = n;
          textDrawConf13 = m;
          textDrawConf14 = k;
          textDrawConf = PatchProxy.apply(objArray, p0, TextDrawConfigParam.class, "8");
          if (textDrawConf != PatchProxyResult.class) {
          label_0243 :
             return textDrawConf;
          }
       }else {
          textDrawConf14 = k;
          textDrawConf13 = m;
          textDrawConf12 = n;
       }
       a.p(i1, "textPadding");
       a.p(l, "defaultText");
       a.p(textDrawConf2, "timeText");
       a.p(textDrawConf3, "authorText");
       a.p(textDrawConf4, "locationText");
       a.p(textDrawConf5, "fontFileName");
       a.p(o, "styleAttrs");
       a.p(a, "initAttrsValue");
       p0 = new TextDrawConfigParam(b, c, d, e, f, g, h, i1, j, textDrawConf14, l, textDrawConf13, textDrawConf12, textDrawConf1, textDrawConf2, textDrawConf3, textDrawConf4, textDrawConf5, textDrawConf6, textDrawConf7, textDrawConf8, textDrawConf9, textDrawConf10, textDrawConf11, o, a);
       goto label_0243 ;
    }
    public final TextDrawConfigParam a(String p0){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, TextDrawConfigParam.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "timeText");
       return TextDrawConfigParam.b(this, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, p0, obj.q, null, null, false, 0, 0, 0, 0, 0, null, null, 0x3ff3fff, null);
    }
    public final TextDrawConfigParam c(int p0,int p1){
       if (PatchProxy.isSupport(TextDrawConfigParam.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TextDrawConfigParam.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return TextDrawConfigParam.b(this, 0, p0, 0, 0, 0, 0, 0, null, p1, 0, null, 0, 0, 0, null, null, null, null, false, 0, 0, 0, 0, 0, null, null, 0x3fffefd, null);
    }
    public final TextDrawConfigParam d(String p0,int p1){
       Object obj = p0;
       if (PatchProxy.isSupport(TextDrawConfigParam.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), this, TextDrawConfigParam.class, "4");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }else {
          int i = this;
       }
       a.p(obj, "fontFileName");
       return TextDrawConfigParam.b(this, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, p1, 0, 0, 0, null, null, p0, false, 0, 0, 0, 0, 0, null, null, 0x3fdf7ff, null);
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       return this.q;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextDrawConfigParam.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TextDrawConfigParam && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && (a.g(this.i, p0.i) && (this.j == p0.j && (this.k == p0.k && (a.g(this.l, p0.l) && (this.m == p0.m && (this.n == p0.n && (this.o == p0.o && (a.g(this.p, p0.p) && (a.g(this.q, p0.q) && (a.g(this.r, p0.r) && (a.g(this.s, p0.s) && (this.t == p0.t && (this.u == p0.u && (this.v == p0.v && (this.w == p0.w && (this.x == p0.x && (this.y == p0.y && (a.g(this.z, p0.z) && a.g(this.A, p0.A)))))))))))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.j;
    }
    public final String g(){
       return this.l;
    }
    public final int g0(){
       return this.e;
    }
    public final int h(){
       return this.c;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, TextDrawConfigParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((((((((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
       TextDrawConfigParam ti = this.i;
       int i1 = 0;
       int i2 = (ti != null)? ti.hashCode(): 0;
       i = (((((i + i2) * 31) + this.j) * 31) + this.k) * 31;
       ti = this.l;
       i2 = (ti != null)? ti.hashCode(): 0;
       i = (((((((i + i2) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31;
       ti = this.p;
       i2 = (ti != null)? ti.hashCode(): 0;
       i = (i + i2) * 31;
       ti = this.q;
       i2 = (ti != null)? ti.hashCode(): 0;
       i = (i + i2) * 31;
       ti = this.r;
       i2 = (ti != null)? ti.hashCode(): 0;
       i = (i + i2) * 31;
       ti = this.s;
       i2 = (ti != null)? ti.hashCode(): 0;
       i = (i + i2) * 31;
       ti = this.t;
       if (ti != null) {
          i2 = 1;
       }
       i = (((((((((((i + i2) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31;
       ti = this.z;
       i2 = (ti != null)? ti.hashCode(): 0;
       i = (i + i2) * 31;
       ti = this.A;
       if (ti != null) {
          i1 = ti.hashCode();
       }
       return (i + i1);
    }
    public final boolean i(){
       return this.t;
    }
    public final int j(){
       return (this.m + this.u);
    }
    public final String k(){
       return this.s;
    }
    public final TextStyleValue l(){
       return this.A;
    }
    public final String m(){
       return this.r;
    }
    public final int n(){
       return this.d;
    }
    public final TextStyleAttrs o(){
       return this.z;
    }
    public final int q(){
       return this.h;
    }
    public final int s(){
       return this.f;
    }
    public final int t(){
       return this.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TextDrawConfigParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextDrawConfigParam\(textColor="+this.b+", defaultTextSize="+this.c+", minTextSize="+this.d+", maxWidth="+this.e+", minWidth="+this.f+", maxHeight="+this.g+", textAlign="+this.h+", textPadding="+this.i+", defaultMaxLinesSize="+this.j+", maxTextLength="+this.k+", defaultText="+this.l+", lineSpacing="+this.m+", imageBackgroundId="+this.n+", backgroundColor="+this.o+", timeText="+this.p+", authorText="+this.q+", locationText="+this.r+", fontFileName="+this.s+", enableChangeFont="+this.t+", additionalLineSpacing="+this.u+", hintColor="+this.v+", hintType="+this.w+", textFontType="+this.x+", cursorColor="+this.y+", styleAttrs="+this.z+", initAttrsValue="+this.A+"\)";
    }
    public final int v(){
       return this.g;
    }
    public final Rect w(){
       return this.i;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextDrawConfigParam.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextDrawConfigParam.class, "12")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
       this.i.writeToParcel(p0, 0);
       p0.writeInt(this.j);
       p0.writeInt(this.k);
       p0.writeString(this.l);
       p0.writeInt(this.m);
       p0.writeInt(this.n);
       p0.writeInt(this.o);
       p0.writeString(this.p);
       p0.writeString(this.q);
       p0.writeString(this.r);
       p0.writeString(this.s);
       p0.writeInt(this.t);
       p0.writeInt(this.u);
       p0.writeInt(this.v);
       p0.writeInt(this.w);
       p0.writeInt(this.x);
       p0.writeInt(this.y);
       this.z.writeToParcel(p0, 0);
       this.A.writeToParcel(p0, 0);
       return;
    }
    public final String x(){
       return this.p;
    }
}
