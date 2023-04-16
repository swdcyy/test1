package com.loc.z$a;
import android.os.Handler;
import android.os.Looper;
import com.loc.z;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.String;

public final class z$a extends Handler	// class@001474
{
    public final WeakReference a;

    public void z$a(Looper p0,z p1){
       this.a = new WeakReference(p1);
    }
    public void z$a(z p0){
       this.a = new WeakReference(p0);
    }
    public final void handleMessage(Message p0){
       z oz = this.a.get();
       if (oz == null) {
          return;
       }
       if (p0 != null) {
          Message obj = p0.obj;
          if (obj != null) {
             z.a(oz, obj, p0.what);
          }
       }
       return;
    }
}
