package com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.CustomTextStyle;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.util.List;
import java.util.Collection;
import java.lang.Number;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import huc.s;
import java.lang.CharSequence;
import bvc.d;
import java.util.Locale;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class TextStyleValue implements Parcelable	// class@001472
{
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public boolean i;
    public static final Parcelable$Creator CREATOR;

    static {
       TextStyleValue.CREATOR = new TextStyleValue$a();
    }
    public void TextStyleValue(){
       super(0, null, null, null, null, 0, null, false, 255, null);
    }
    public void TextStyleValue(int p0,String p1,String p2,String p3,String p4,int p5,String p6,boolean p7){
       a.p(p1, "fillValue");
       a.p(p2, "strokeValue");
       a.p(p3, "shadowValue");
       a.p(p4, "backgroundValue");
       a.p(p6, "usedColorValue");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public void TextStyleValue(int p0,String p1,String p2,String p3,String p4,int p5,String p6,boolean p7,int p8,u p9){
       int i = p8;
       int i1 = 0;
       int i2 = (i & 0x01)? 0: p0;
       String str = "";
       String str1 = (i & 0x02)? str: p1;
       String str2 = (i & 0x04)? str: p2;
       String str3 = (i & 0x08)? str: p3;
       String str4 = (i & 0x10)? str: p4;
       int i3 = (i & 0x20)? 0: p5;
       if (!(i & 0x40)) {
          str = 0;
       }
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       super(i2, str1, str2, str3, str4, i3, str, i1);
       return;
    }
    public void TextStyleValue(CustomTextStyle p0){
       a.p(p0, "draftCustomTextStyle");
       String fillColorKey = p0.getFillColorKey();
       a.o(fillColorKey, "draftCustomTextStyle.fillColorKey");
       String strokeColorK = p0.getStrokeColorKey();
       a.o(strokeColorK, "draftCustomTextStyle.strokeColorKey");
       String shadowColorK = p0.getShadowColorKey();
       a.o(shadowColorK, "draftCustomTextStyle.shadowColorKey");
       String backgroundCo = p0.getBackgroundColorKey();
       a.o(backgroundCo, "draftCustomTextStyle.backgroundColorKey");
       super(p0.getTextAlign(), fillColorKey, strokeColorK, shadowColorK, backgroundCo, p0.getTextMode(), null, false, 192, null);
       this.j();
    }
    public void TextStyleValue(TextDrawConfigParam p0){
       int this;
       a.p(p0, "textDrawConfigParam");
       super(0, null, null, null, null, 0, null, false, 255, null);
       this.b = p0.q();
       this = 0;
       if (p0.o().a().isEmpty() ^ 0x01) {
          this = p0.o().a().get(this).intValue();
       }
       this.g = this;
       this.j();
       return;
    }
    public static TextStyleValue a(TextStyleValue p0,int p1,String p2,String p3,String p4,String p5,int p6,String p7,boolean p8,int p9,Object p10){
       TextStyleValue b;
       TextStyleValue g;
       TextStyleValue i;
       if (p9 & 0x01) {
          b = p0.b;
       }
       TextStyleValue textStyleVal = b;
       TextStyleValue textStyleVal1 = null;
       TextStyleValue textStyleVal2 = (p9 & 0x02)? p0.c: textStyleVal1;
       TextStyleValue textStyleVal3 = (p9 & 0x04)? p0.d: textStyleVal1;
       b = (p9 & 0x08)? p0.e: textStyleVal1;
       TextStyleValue f = (p9 & 0x10)? p0.f: textStyleVal1;
       if (p9 & 0x20) {
          g = p0.g;
       }
       p10 = g;
       if (p9 & 0x40) {
          textStyleVal1 = p0.h;
       }
       TextStyleValue textStyleVal4 = textStyleVal1;
       if (p9 & 0x0080) {
          i = p0.i;
       }
       TextStyleValue textStyleVal5 = i;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(TextStyleValue.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(textStyleVal),textStyleVal2,textStyleVal3,b,f,Integer.valueOf(p10),textStyleVal4,Boolean.valueOf(textStyleVal5)};
          p0 = PatchProxy.apply(objArray, p0, TextStyleValue.class, "8");
          if (p0 != PatchProxyResult.class) {
          label_00a4 :
             return p0;
          }
       }
       a.p(textStyleVal2, "fillValue");
       a.p(textStyleVal3, "strokeValue");
       a.p(b, "shadowValue");
       a.p(f, "backgroundValue");
       a.p(textStyleVal4, "usedColorValue");
       textStyleVal1 = new TextStyleValue(textStyleVal, textStyleVal2, textStyleVal3, b, f, p10, textStyleVal4, textStyleVal5);
       goto label_00a4 ;
    }
    public static void c(TextStyleValue p0,TextStyleDataManager$a p1,int p2,Object p3){
       p0.b(null);
    }
    public final void b(TextStyleDataManager$a p0){
       Locale uS;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextStyleValue.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.h = s.a(p0.a.c);
       }
       TextStyleValue textStyleVal = 1;
       TextStyleValue textStyleVal1 = (!this.h.length())? 1: null;
       if (textStyleVal1) {
          this.j();
       }
       textStyleVal1 = this.g;
       if (textStyleVal1 != null) {
          if (textStyleVal1 != textStyleVal) {
             if (textStyleVal1 != 2) {
                if (textStyleVal1 == 3) {
                   this.c = d.c();
                   this.d = d.b();
                   this.e = this.h;
                   this.f = d.b();
                }
             }else if(this.i != null){
                textStyleVal1 = this.h;
                this.c = textStyleVal1;
                uS = Locale.US;
                a.o(uS, "Locale.US");
                Objects.requireNonNull(textStyleVal1, "null cannot be cast to non-null type java.lang.String");
                str = textStyleVal1.toUpperCase(uS);
                a.o(str, "\(this as java.lang.String\).toUpperCase\(locale\)");
                str = (d.f.contains(str))? d.a(): d.c();
                this.d = str;
             }else {
                this.c = "";
                this.d = this.h;
             }
             this.e = d.b();
             this.f = d.b();
          }else {
             textStyleVal = this.h;
             uS = Locale.US;
             a.o(uS, "Locale.US");
             Objects.requireNonNull(textStyleVal, "null cannot be cast to non-null type java.lang.String");
             String str1 = textStyleVal.toUpperCase(uS);
             a.o(str1, "\(this as java.lang.String\).toUpperCase\(locale\)");
             str = (d.e.contains(str1))? d.a(): d.c();
             this.c = str;
             this.d = d.b();
             this.e = d.b();
             this.f = this.h;
          }
       }else {
          this.c = this.h;
          this.d = d.b();
          this.e = d.b();
          this.f = d.b();
       }
       return;
    }
    public final String d(){
       return this.f;
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextStyleValue.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof TextStyleValue) {
          return super.equals(p0);
       }
       boolean b = (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && a.g(this.f, p0.f)))))? true: false;
       return b;
    }
    public final String f(){
       return this.e;
    }
    public final String g(){
       return this.d;
    }
    public final int h(){
       return this.b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, TextStyleValue.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.b * 31;
       TextStyleValue tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.e;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.f;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (((i + i2) * 31) + this.g) * 31;
       tc = this.h;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       i = (i + i1) * 31;
       tc = this.i;
       if (tc != null) {
          i2 = 1;
       }
       return (i + i2);
    }
    public final int i(){
       return this.g;
    }
    public final String j(){
       String str;
       TextStyleValue tg = this.g;
       if (tg != null) {
          if (tg != 1) {
             if (tg != 2) {
                str = (tg != 3)? "": this.e;
             }else if(this.i != null){
                str = this.c;
             }else {
                str = this.d;
             }
          }else {
             str = this.f;
          }
       }else {
          str = this.c;
       }
       this.h = str;
       return str;
    }
    public final void k(int p0){
       this.b = p0;
    }
    public final void l(int p0){
       this.g = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TextStyleValue.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextStyleValue\(textAlign="+this.b+", fillValue="+this.c+", strokeValue="+this.d+", shadowValue="+this.e+", backgroundValue="+this.f+", textMode="+this.g+", usedColorValue="+this.h+", mapStrokeToFill="+this.i+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(TextStyleValue.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TextStyleValue.class, "11")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeString(this.c);
       p0.writeString(this.d);
       p0.writeString(this.e);
       p0.writeString(this.f);
       p0.writeInt(this.g);
       p0.writeString(this.h);
       p0.writeInt(this.i);
       return;
    }
}
