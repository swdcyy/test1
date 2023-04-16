package com.kwai.framework.model.common.ResponseTimeBean;
import android.os.Parcelable;
import java.lang.Cloneable;
import com.kwai.framework.model.common.ResponseTimeBean$a;
import nsd.u;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Integer;

public final class ResponseTimeBean implements Parcelable, Cloneable	// class@001690
{
    public long b;
    public String recoResponseTime;
    public String serverResponseTime;
    public static final ResponseTimeBean$a CREATOR;

    static {
       ResponseTimeBean.CREATOR = new ResponseTimeBean$a(null);
    }
    public void ResponseTimeBean(){
       super("", "");
    }
    public void ResponseTimeBean(Parcel p0){
       a.p(p0, "parcel");
       super(p0.readString(), p0.readString());
       this.b = p0.readLong();
    }
    public void ResponseTimeBean(String p0,String p1){
       super();
       this.serverResponseTime = p0;
       this.recoResponseTime = p1;
       this.b = -1;
    }
    public ResponseTimeBean a(){
       Object obj = PatchProxy.apply(null, this, ResponseTimeBean.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.framework.model.common.ResponseTimeBean");
       return obj;
    }
    public final long b(){
       return this.b;
    }
    public final String c(){
       return this.recoResponseTime;
    }
    public Object clone(){
       return this.a();
    }
    public final String d(){
       return this.serverResponseTime;
    }
    public int describeContents(){
       return 0;
    }
    public final void e(long p0){
       this.b = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, ResponseTimeBean.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this);
       a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       return obj;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ResponseTimeBean.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ResponseTimeBean.class, "1")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.serverResponseTime);
       p0.writeString(this.recoResponseTime);
       p0.writeLong(this.b);
       return;
    }
}
