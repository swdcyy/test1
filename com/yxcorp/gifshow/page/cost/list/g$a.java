package com.yxcorp.gifshow.page.cost.list.g$a;
import android.os.Handler;
import com.yxcorp.gifshow.page.cost.list.g;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dd5.m;

public class g$a extends Handler	// class@000e2d
{
    public final g a;

    public void g$a(g p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == 1) {
          g$a ta = this.a;
          g i = ta.i;
          if (i - null > 0) {
             ta.e("enterToListRender", i, ta.g);
          }
          g$a ta1 = this.a;
          ta1.e("dataToListRender", ta1.f, ta1.g);
          this.a.b.c();
       }
       return;
    }
}
