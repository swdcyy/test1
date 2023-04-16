package com.yxcorp.gifshow.growth.model.GrowthSearchEncourageResp;
import android.os.Parcelable;
import com.yxcorp.gifshow.growth.model.GrowthSearchEncourageResp$a;
import android.os.Parcel;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.GrowthWidgetBean;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.model.EncourageBean;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class GrowthSearchEncourageResp implements Parcelable	// class@001436
{
    public String b;
    public List c;
    public List d;
    public List e;
    public EncourageBean f;
    public static final Parcelable$Creator CREATOR;

    static {
       GrowthSearchEncourageResp.CREATOR = new GrowthSearchEncourageResp$a();
    }
    public void GrowthSearchEncourageResp(Parcel p0){
       super();
       Parcelable$Creator cREATOR = GrowthWidgetBean.CREATOR;
       this.c = p0.createTypedArrayList(cREATOR);
       this.d = p0.createTypedArrayList(cREATOR);
       this.e = p0.createTypedArrayList(cREATOR);
       this.f = p0.readParcelable(EncourageBean.class.getClassLoader());
    }
    public void GrowthSearchEncourageResp(String p0){
       super();
       this.b = p0;
    }
    public EncourageBean a(){
       return this.f;
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, GrowthSearchEncourageResp.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new ArrayList();
       }
       return this.d;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, GrowthSearchEncourageResp.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.e = new ArrayList();
       }
       return this.e;
    }
    public List d(){
       Object obj = PatchProxy.apply(null, this, GrowthSearchEncourageResp.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new ArrayList();
       }
       return this.c;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(GrowthSearchEncourageResp.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GrowthSearchEncourageResp.class, "5")) {
          return;
       }
       p0.writeTypedList(this.c);
       p0.writeTypedList(this.d);
       p0.writeTypedList(this.e);
       p0.writeParcelable(this.f, p1);
       return;
    }
}
