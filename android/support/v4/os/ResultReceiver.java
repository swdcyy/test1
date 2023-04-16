package android.support.v4.os.ResultReceiver;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver$a;
import android.os.Handler;
import java.lang.Object;
import android.os.Parcel;
import android.os.IBinder;
import android.support.v4.os.a;
import android.support.v4.os.a$a;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver$c;
import java.lang.Runnable;
import android.support.v4.os.ResultReceiver$b;
import android.os.IInterface;

public class ResultReceiver implements Parcelable	// class@00040b
{
    public final boolean b;
    public final Handler c;
    public a d;
    public static final Parcelable$Creator CREATOR;

    static {
       ResultReceiver.CREATOR = new ResultReceiver$a();
    }
    public void ResultReceiver(Handler p0){
       super();
       this.b = true;
       this.c = p0;
    }
    public void ResultReceiver(Parcel p0){
       super();
       this.b = false;
       this.c = null;
       this.d = a$a.L1(p0.readStrongBinder());
    }
    public void a(int p0,Bundle p1){
    }
    public void b(int p0,Bundle p1){
       ResultReceiver tc;
       if (this.b != null) {
          tc = this.c;
          if (tc != null) {
             tc.post(new ResultReceiver$c(this, p0, p1));
          }else {
             this.a(p0, p1);
          }
          return;
       }else {
          try{
             tc = this.d;
             if (tc != null) {
                tc.W0(p0, p1);
             }
             return;
          }catch(android.os.RemoteException e0){
          }
       }
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       _monitor_enter(this);
       if (this.d == null) {
          this.d = new ResultReceiver$b(this);
       }
       p0.writeStrongBinder(this.d.asBinder());
       _monitor_exit(this);
       return;
    }
}
