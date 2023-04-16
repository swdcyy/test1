package com.yxcorp.gifshow.growth.model.GrowthWidgetBean;
import android.os.Parcelable;
import com.yxcorp.gifshow.growth.model.GrowthWidgetBean$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class GrowthWidgetBean implements Parcelable	// class@001438
{
    public String b;
    public int c;
    public long d;
    public String e;
    public String f;
    public GrowthWidgetBean g;
    public static final Parcelable$Creator CREATOR;

    static {
       GrowthWidgetBean.CREATOR = new GrowthWidgetBean$a();
    }
    public void GrowthWidgetBean(){
       super();
    }
    public void GrowthWidgetBean(Parcel p0){
       super();
       this.b = p0.readString();
       this.c = p0.readInt();
       this.d = p0.readLong();
       this.e = p0.readString();
       this.f = p0.readString();
       this.g = p0.readParcelable(GrowthWidgetBean.class.getClassLoader());
    }
    public String a(){
       return this.e;
    }
    public String b(){
       return this.f;
    }
    public String c(){
       return this.b;
    }
    public void d(GrowthWidgetBean p0){
       this.g = p0;
    }
    public int describeContents(){
       return 0;
    }
    public void e(int p0){
       this.c = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthWidgetBean.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof GrowthWidgetBean) {
          return false;
       }
       return (p0.b).equals(this.b);
    }
    public void f(String p0){
       this.b = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(GrowthWidgetBean.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GrowthWidgetBean.class, "2")) {
          return;
       }
       p0.writeString(this.b);
       p0.writeInt(this.c);
       p0.writeLong(this.d);
       p0.writeString(this.e);
       p0.writeString(this.f);
       p0.writeParcelable(this.g, p1);
       return;
    }
}
