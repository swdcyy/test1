package com.yxcorp.gifshow.camerasdk.j$l;
import org.wysaid.nativePort.CGEAlertBoxUtil$CGEAlertBoxListener;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qi9.y0;
import java.lang.Runnable;
import ekd.k1;

public class j$l implements CGEAlertBoxUtil$CGEAlertBoxListener	// class@001025
{
    public final j a;

    public void j$l(j p0){
       this.a = p0;
       super();
    }
    public void onReceivedMessage(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$l.class, "1")) {
          return;
       }
       k1.o(new y0(this, p0, p1));
       return;
    }
}
