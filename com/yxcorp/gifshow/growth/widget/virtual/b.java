package com.yxcorp.gifshow.growth.widget.virtual.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.widget.virtual.e;
import java.lang.Object;
import java.util.Objects;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.String;
import u07.t$a;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import w07.i;
import w07.l;
import mra.f;
import u07.u;
import com.yxcorp.gifshow.growth.widget.virtual.d;
import u07.t;
import u07.j;
import java.lang.Exception;
import cra.w;
import java.lang.StringBuilder;
import q87.c;

public final class b implements Runnable	// class@00160f
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       try{
          Objects.requireNonNull(tb);
          Activity uActivity = ActivityContext.g().e();
          if (uActivity != null) {
             n.C(uActivity);
             t$a uoa = new t$a(uActivity);
             uoa.X0(tb.e(R.string.arg_RES_7f104ebf, "模拟失败"));
             uoa.z0(tb.e(R.string.arg_RES_7f104ebb, "推荐数据准备失败，请重试"));
             uoa.v(true);
             uoa.z(true);
             uoa.A(true);
             uoa.T0(tb.e(R.string.arg_RES_7f104ebe, "重试"));
             uoa.R0(tb.e(R.string.arg_RES_7f104eb0, "取消"));
             uoa.a0(new i());
             uoa.u0(new f(tb));
             uoa.t0(d.b);
             j.d(uoa);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          Object[] objArray = new Object[0];
          w.C().t("GrowthSimulation", "showRetryDialog error "+e0, objArray);
       }
       return;
    }
}
