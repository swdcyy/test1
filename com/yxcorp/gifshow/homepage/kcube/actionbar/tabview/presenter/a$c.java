package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$c;
import android.os.Handler;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lr6.a;

public final class a$c extends Handler	// class@001716
{
    public final a a;

    public void a$c(a p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       if (p0.what == 1001) {
          a$c ta = this.a;
          a x = ta.x;
          if (x != null && x == a.P8(ta).k()) {
             this.a.Z8();
          }
       }
       return;
    }
}
