package c.t.m.g.dv$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.dv;
import c.t.m.g.dr;
import c.t.m.g.dp;
import c.t.m.g.dt;
import java.lang.String;
import android.os.Bundle;

public final class dv$1 implements Parcelable$Creator	// class@000c56
{

    public void dv$1(){
       super();
    }
    public TencentLocation a(Parcel p0){
       dv uodv = new dv(p0.readInt(), null);
       dr uodr = new dr();
       dp uodp = new dp();
       dt uodt = new dt();
       uodp.c = uodt;
       dv.a(uodv, p0.readString());
       uodr.a = p0.readDouble();
       uodr.b = p0.readDouble();
       uodr.d = p0.readFloat();
       uodr.c = p0.readDouble();
       uodr.f = p0.readString();
       uodt.b = p0.readString();
       uodt.f = p0.readString();
       uodt.g = p0.readString();
       uodt.h = p0.readString();
       uodt.k = p0.readString();
       uodt.l = p0.readString();
       uodt.c = p0.readString();
       dv.a(uodv, uodr);
       dv.a(uodv, uodp);
       dv.a(uodv, p0.readLong());
       dv.b(uodv, p0.readLong());
       Bundle uBundle = p0.readBundle();
       if (uBundle != null) {
          dv.b(uodv).putAll(uBundle);
       }
       return uodv;
    }
    public TencentLocation[] a(int p0){
       TencentLocation[] tencentLocat = new TencentLocation[p0];
       return tencentLocat;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.a(p0);
    }
}
