package com.yxcorp.gifshow.util.MultiWindowLayoutUtil$a;
import a2.z;
import z1.a;
import java.lang.Object;
import android.view.View;
import a2.u0;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil$DeviceAdapter;
import lnc.a5;
import java.lang.Runnable;
import a2.i0;

public class MultiWindowLayoutUtil$a implements z	// class@001efe
{
    public final a a;
    public int b;

    public void MultiWindowLayoutUtil$a(a p0){
       super();
       this.b = -1;
       this.a = p0;
    }
    public u0 a(View p0,u0 p1){
       int i = MultiWindowLayoutUtil.b(p0);
       if (!i) {
          i = i + MultiWindowLayoutUtil$DeviceAdapter.adaptDeviceOffset(p0);
       }
       if (this.b != i) {
          this.b = i;
          p0.post(new a5(this));
       }
       return i0.f0(p0, p1);
    }
}
