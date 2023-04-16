package com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class TextChangeParam implements Parcelable	// class@001466
{
    public float b;
    public String c;
    public String d;
    public String[] e;
    public int f;
    public int g;
    public int h;
    public float i;
    public int j;
    public int k;
    public static final Parcelable$Creator CREATOR;

    static {
       TextChangeParam.CREATOR = new TextChangeParam$a();
    }
    public void TextChangeParam(){
       super(0, null, null, null, 0, 0, 0, 0, 0, 0, 1023, null);
    }
    public void TextChangeParam(float p0,String p1,String p2,String[] p3,int p4,int p5,int p6,float p7,int p8,int p9){
       a.p(p1, "originText");
       a.p(p2, "currentText");
       a.p(p3, "lines");
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
    }
    public void TextChangeParam(float p0,String p1,String p2,String[] p3,int p4,int p5,int p6,float p7,int p8,int p9,int p10,u p11){
       int i = p10;
       int i1 = 0x3f800000;
       int i2 = (i & 0x01)? 0x3f800000: p0;
       String str = "";
       String[] stringArray = null;
       String str1 = (i & 0x02)? str: stringArray;
       if (!(i & 0x04)) {
          str = stringArray;
       }
       int i3 = 0;
       if (i & 0x08) {
          stringArray = new String[i3];
       }
       int i4 = (i & 0x10)? 0: p4;
       int i5 = (i & 0x20)? 0: p5;
       int i6 = (i & 0x40)? 0: p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       int i7 = (i & 0x0100)? 0: p8;
       if (!(i & 0x0200)) {
          i3 = p9;
       }
       super(i2, str1, str, stringArray, i4, i5, i6, i1, i7, i3);
       return;
    }
    public final int a(){
       return this.j;
    }
    public final String b(){
       return this.d;
    }
    public final float c(){
       return this.i;
    }
    public final String[] d(){
       return this.e;
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextChangeParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TextChangeParam && (!Float.compare(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && (!Float.compare(this.i, p0.i) && (this.j == p0.j && this.k == p0.k))))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.h;
    }
    public final int g(){
       return this.f;
    }
    public final float h(){
       return this.b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, TextChangeParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Float.floatToIntBits(this.b) * 31;
       TextChangeParam tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.e;
       if (tc != null) {
          i1 = Arrays.hashCode(tc);
       }
       return (((((((((((((i + i1) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + Float.floatToIntBits(this.i)) * 31) + this.j) * 31) + this.k);
    }
    public final void i(int p0){
       this.k = p0;
    }
    public final void j(int p0){
       this.j = p0;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextChangeParam.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public final void l(float p0){
       this.i = p0;
    }
    public final void m(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextChangeParam.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextChangeParam.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void o(int p0){
       this.g = p0;
    }
    public final void q(int p0){
       this.h = p0;
    }
    public final void t(int p0){
       this.f = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TextChangeParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextChangeParam\(scale="+this.b+", originText="+this.c+", currentText="+this.d+", lines="+Arrays.toString(this.e)+", realMaxWidth="+this.f+", realMaxHeight="+this.g+", realMaxLinesSize="+this.h+", inputScale="+this.i+", containerViewWidth="+this.j+", containerViewHeight="+this.k+"\)";
    }
    public final void w(float p0){
       this.b = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextChangeParam.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextChangeParam.class, "8")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeFloat(this.b);
       p0.writeString(this.c);
       p0.writeString(this.d);
       p0.writeStringArray(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
       p0.writeFloat(this.i);
       p0.writeInt(this.j);
       p0.writeInt(this.k);
       return;
    }
}
