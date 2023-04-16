package com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import android.os.Parcelable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class DraftTTSInfo implements Parcelable	// class@000bcb
{
    public final int b;
    public final int c;
    public final double d;
    public final double e;
    public final int f;
    public final String g;
    public final String h;
    public static final Parcelable$Creator CREATOR;

    static {
       DraftTTSInfo.CREATOR = new DraftTTSInfo$a();
    }
    public void DraftTTSInfo(){
       super(0, 0, 0, 0, 0, null, null, 127, null);
    }
    public void DraftTTSInfo(int p0,int p1,double p2,double p3,int p4,String p5,String p6){
       a.p(p5, "filePath");
       a.p(p6, "speakerName");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public void DraftTTSInfo(int p0,int p1,double p2,double p3,int p4,String p5,String p6,int p7,u p8){
       int i = -1;
       int i1 = (p7 & 0x01)? -1: p0;
       if (!(p7 & 0x02)) {
          i = p1;
       }
       int i2 = 0;
       int i3 = (p7 & 0x04)? i2: p2;
       if (!(p7 & 0x08)) {
          i2 = p3;
       }
       int i4 = (p7 & 0x10)? 200: p4;
       String str = "";
       String str1 = (p7 & 0x20)? str: 0;
       if (!(p7 & 0x40)) {
          str = 0;
       }
       super(i1, i, i3, i2, i4, str1, str);
       return;
    }
    public final double a(){
       return this.e;
    }
    public final String b(){
       return this.g;
    }
    public final int c(){
       return this.c;
    }
    public final int d(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public final String e(){
       return this.h;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftTTSInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DraftTTSInfo && (this.b == p0.b && (this.c == p0.c && (!Double.compare(this.d, p0.d) && (!Double.compare(this.e, p0.e) && (this.f == p0.f && (a.g(this.g, p0.g) && a.g(this.h, p0.h))))))))) {
          return true;
       }
       return false;
    }
    public final double f(){
       return this.d;
    }
    public final int g(){
       return this.f;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DraftTTSInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.d);
       l = Double.doubleToLongBits(this.e);
       int i = ((((((((this.b * 31) + this.c) * 31) + (int)(l ^ (l >> 32))) * 31) + (int)(l ^ (l >> 32))) * 31) + this.f) * 31;
       DraftTTSInfo tg = this.g;
       int i1 = 0;
       int i2 = (tg != null)? tg.hashCode(): 0;
       i = (i + i2) * 31;
       tg = this.h;
       if (tg != null) {
          i1 = tg.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DraftTTSInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DraftTTSInfo\(speakerId="+this.b+", languageType="+this.c+", startTime="+this.d+", "+"duration="+this.e+", volume="+this.f+", filePath="+this.g+", speakerName="+this.h;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(DraftTTSInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DraftTTSInfo.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeDouble(this.d);
       p0.writeDouble(this.e);
       p0.writeInt(this.f);
       p0.writeString(this.g);
       p0.writeString(this.h);
       return;
    }
}
