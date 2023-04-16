package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$d;
import tx4.o;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import kotlin.jvm.internal.a;
import zn.b;
import zn.a;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$d$a;
import qn.j;
import rn.b;
import qn.h;
import rn.a;
import qn.l;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.Throwable;
import java.lang.Integer;

public final class KwaiPopTk$d implements o	// class@000790
{
    public final KwaiPopTk a;

    public void KwaiPopTk$d(KwaiPopTk p0){
       this.a = p0;
       super();
    }
    public void a(e p0,w p1){
       Activity activity;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPopTk$d.class, "1")) {
          return;
       }
       if (this.a.getActivity() != null) {
          activity = this.a.getActivity();
          a.m(activity);
          if (!activity.isFinishing() && p0 != null) {
             KwaiPopTk$d ta = this.a;
             ta.e = p0;
             a uoa = ta.h().n();
             if (uoa != null) {
                uoa.onSuccess();
             }
             this.a.h().j(new KwaiPopTk$d$a(this, p0));
             p0.a = new h(this.a).a().d(this.a);
             return;
          }
       }
       Object[] objArray = new Object[0];
       KwaiPopLog.e.D("activity is dead", objArray);
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(KwaiPopTk$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KwaiPopTk$d.class, "2")) {
          return;
       }
       a uoa = this.a.h().n();
       if (uoa != null) {
          uoa.a(p0, p1);
       }
       this.a.release();
       return;
    }
}
