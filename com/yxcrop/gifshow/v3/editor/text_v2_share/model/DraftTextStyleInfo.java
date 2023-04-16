package com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import android.os.Parcelable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo$a;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Enum;

public final class DraftTextStyleInfo implements Parcelable	// class@000bcd
{
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final String f;
    public final TextStyleValue g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final CommonDraftTextAssetModel$ResourceType l;
    public static final Parcelable$Creator CREATOR;

    static {
       DraftTextStyleInfo.CREATOR = new DraftTextStyleInfo$a();
    }
    public void DraftTextStyleInfo(String p0,float p1,float p2,float p3,String p4,TextStyleValue p5,int p6,int p7,String p8,String p9,CommonDraftTextAssetModel$ResourceType p10){
       a.p(p0, "textId");
       a.p(p4, "fontName");
       a.p(p5, "customStyleValue");
       a.p(p8, "text");
       a.p(p9, "hintText");
       a.p(p10, "textType");
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
    public void DraftTextStyleInfo(String p0,float p1,float p2,float p3,String p4,TextStyleValue p5,int p6,int p7,String p8,String p9,CommonDraftTextAssetModel$ResourceType p10,int p11,u p12){
       TextStyleValue textStyleVal1;
       int i = p11;
       float f = (i & 0x02)? 0x3f800000: p1;
       float f1 = (i & 0x04)? 0x3f800000: p2;
       float f2 = (i & 0x08)? 0: p3;
       if (i & 0x20) {
          TextStyleValue textStyleVal = new TextStyleValue(0, null, null, null, null, 0, null, false, 255, null);
          textStyleVal1 = v1;
       }else {
          textStyleVal1 = p5;
       }
       int i1 = (i & 0x40)? 1: p6;
       TextStyleDataManager$TextColors textColors = (i & 0x0080)? TextStyleDataManager.b.c: p7;
       String str = (i & 0x0100)? "": p8;
       String str1 = (i & 0x0200)? "": p9;
       CommonDraftTextAssetModel$ResourceType resourceType = (i & 0x0400)? CommonDraftTextAssetModel$ResourceType.FLOWER_WORD: p10;
       super(p0, f, f1, f2, p4, textStyleVal1, i1, textColors, str, str1, resourceType);
       return;
    }
    public static DraftTextStyleInfo a(DraftTextStyleInfo p0,String p1,float p2,float p3,float p4,String p5,TextStyleValue p6,int p7,int p8,String p9,String p10,CommonDraftTextAssetModel$ResourceType p11,int p12,Object p13){
       DraftTextStyleInfo uDraftTextSt = p0;
       int i = p12;
       DraftTextStyleInfo b = (i & 0x01)? uDraftTextSt.b: p1;
       DraftTextStyleInfo c = (i & 0x02)? uDraftTextSt.c: p2;
       DraftTextStyleInfo d = (i & 0x04)? uDraftTextSt.d: p3;
       DraftTextStyleInfo e = (i & 0x08)? uDraftTextSt.e: p4;
       DraftTextStyleInfo f = (i & 0x10)? uDraftTextSt.f: p5;
       DraftTextStyleInfo g = (i & 0x20)? uDraftTextSt.g: p6;
       DraftTextStyleInfo h = (i & 0x40)? uDraftTextSt.h: p7;
       DraftTextStyleInfo i1 = (i & 0x0080)? uDraftTextSt.i: p8;
       object oobject = null;
       DraftTextStyleInfo j = (i & 0x0100)? uDraftTextSt.j: oobject;
       DraftTextStyleInfo k = (i & 0x0200)? uDraftTextSt.k: oobject;
       if (i & 0x0400) {
          oobject = uDraftTextSt.l;
       }
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(DraftTextStyleInfo.class)) {
          Object[] objArray = new Object[11];
          objArray[0] = b;
          objArray[1] = Float.valueOf(c);
          objArray[2] = Float.valueOf(d);
          objArray[3] = Float.valueOf(e);
          objArray[4] = f;
          objArray[5] = g;
          objArray[6] = Integer.valueOf(h);
          objArray[7] = Integer.valueOf(i1);
          objArray[8] = j;
          objArray[9] = k;
          objArray[10] = oobject;
          uDraftTextSt = PatchProxy.apply(objArray, p0, DraftTextStyleInfo.class, "3");
          if (uDraftTextSt != PatchProxyResult.class) {
          label_00f3 :
             return uDraftTextSt;
          }
       }
       a.p(b, "textId");
       a.p(f, "fontName");
       a.p(g, "customStyleValue");
       a.p(j, "text");
       a.p(k, "hintText");
       a.p(oobject, "textType");
       p0 = new DraftTextStyleInfo(b, c, d, e, f, g, h, i1, j, k, oobject);
       goto label_00f3 ;
    }
    public final float b(){
       return this.d;
    }
    public final int c(){
       return this.h;
    }
    public final int d(){
       return this.i;
    }
    public int describeContents(){
       return 0;
    }
    public final TextStyleValue e(){
       return this.g;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftTextStyleInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       DraftTextStyleInfo uDraftTextSt = DraftTextStyleInfo.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (a.g(uDraftTextSt, class) ^ true) {
          return false;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo");
          if (a.g(this.b, p0.b) ^ true) {
             return false;
          }else if(this.c - p0.c){
             return false;
          }else if(this.d - p0.d){
             return false;
          }else if(this.e - p0.e){
             return false;
          }else if(a.g(this.f, p0.f) ^ true){
             return false;
          }else if(a.g(this.g, p0.g) ^ true){
             return false;
          }else if(this.h != p0.h){
             return false;
          }else if(this.i != p0.i){
             return false;
          }else if(a.g(this.j, p0.j) ^ true){
             return false;
          }else if(a.g(this.k, p0.k) ^ true){
             return false;
          }else if(this.l != p0.l){
             return false;
          }else {
             return true;
          }
       }
    }
    public final String f(){
       return this.f;
    }
    public final String g(){
       return this.k;
    }
    public final float h(){
       return this.e;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DraftTextStyleInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((((((((((((this.b).hashCode() * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + (this.f).hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i);
    }
    public final float i(){
       return this.c;
    }
    public final String j(){
       return this.b;
    }
    public final CommonDraftTextAssetModel$ResourceType k(){
       return this.l;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DraftTextStyleInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DraftTextStyleInfo\(textId="+this.b+", scale="+this.c+", additionScale="+this.d+", rotate="+this.e+", fontName="+this.f+", customStyleValue="+this.g+", alignType="+this.h+", color="+this.i+", text="+this.j+", hintText="+this.k+", textType="+this.l+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(DraftTextStyleInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DraftTextStyleInfo.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.b);
       p0.writeFloat(this.c);
       p0.writeFloat(this.d);
       p0.writeFloat(this.e);
       p0.writeString(this.f);
       this.g.writeToParcel(p0, 0);
       p0.writeInt(this.h);
       p0.writeInt(this.i);
       p0.writeString(this.j);
       p0.writeString(this.k);
       p0.writeString(this.l.name());
       return;
    }
}
