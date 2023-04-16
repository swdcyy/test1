package com.oplus.ocs.base.common.Status;
import com.oplus.ocs.base.internal.safeparcel.AbstractSafeParcelable;
import com.oplus.ocs.base.common.b;
import java.lang.String;
import android.app.PendingIntent;
import java.lang.Object;
import com.oplus.ocs.base.utils.e;
import java.lang.Integer;
import java.util.Arrays;
import com.oplus.ocs.base.utils.e$a;
import com.oplus.ocs.base.common.constant.CommonStatusCodes;
import android.os.Parcel;
import com.oplus.ocs.base.internal.safeparcel.b;

public class Status extends AbstractSafeParcelable	// class@000aba
{
    public int a;
    public int b;
    public String c;
    public PendingIntent d;
    public static final Parcelable$Creator CREATOR;

    static {
       Status.CREATOR = new b();
    }
    public void Status(int p0,int p1,String p2,PendingIntent p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Status && (this.a == p0.a && (this.b == p0.b && (e.a(this.c, p0.c) && e.a(this.d, p0.d)))))? true: false;
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a),Integer.valueOf(this.b),this.c,this.d};
       return Arrays.hashCode(objArray);
    }
    public String toString(){
       e$a uoa = e.a(this);
       Status tc = this.c;
       if (tc != null) {
       }else {
          tc = CommonStatusCodes.getStatusCodeString(this.b);
       }
       return uoa.a("statusCode", tc).a("resolution", this.d).toString();
    }
    public void writeToParcel(Parcel p0,int p1){
       int i = b.b(p0, 0x4f45);
       b.a(p0, 1, this.b);
       b.a(p0, 1000, this.a);
       Status tc = this.c;
       if (tc != null) {
          p0.writeString(tc);
          b.a(p0, b.b(p0, 2));
       }
       tc = this.d;
       if (tc != null) {
          tc.writeToParcel(p0, p1);
          b.a(p0, b.b(p0, 3));
       }
       b.a(p0, i);
       return;
    }
}
