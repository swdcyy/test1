package com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import android.os.Parcelable;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class AdtkPageConfig implements Parcelable	// class@001845
{
    public float b;
    public final String c;
    public int d;
    public String e;
    public float f;
    public static final Parcelable$Creator CREATOR;

    static {
       AdtkPageConfig.CREATOR = new AdtkPageConfig$a();
    }
    public void AdtkPageConfig(float p0,String p1,int p2,String p3,float p4){
       a.p(p1, "templateId");
       a.p(p3, "tkPageType");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final int a(){
       return this.d;
    }
    public final String b(){
       return this.c;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(AdtkPageConfig.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AdtkPageConfig.class, "2")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeFloat(this.b);
       p0.writeString(this.c);
       p0.writeInt(this.d);
       p0.writeString(this.e);
       p0.writeFloat(this.f);
       return;
    }
}
