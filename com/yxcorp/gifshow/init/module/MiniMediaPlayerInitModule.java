package com.yxcorp.gifshow.init.module.MiniMediaPlayerInitModule;
import com.kwai.framework.player.KsMediaPlayerInitModule;
import com.yxcorp.gifshow.init.module.i0;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.init.module.j0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Thread;
import java.lang.String;
import x98.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Application;
import o56.a;
import java.lang.Boolean;
import bl0.b;
import sxa.x;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;

public class MiniMediaPlayerInitModule extends KsMediaPlayerInitModule	// class@00198d
{
    public final x s;
    public Application t;
    public final x u;
    public static final int v;

    public void MiniMediaPlayerInitModule(){
       super();
       this.s = Suppliers.a(i0.b);
       this.u = Suppliers.a(j0.b);
    }
    public static void o0(MiniMediaPlayerInitModule p0){
       Objects.requireNonNull(p0);
       Thread.currentThread().getName();
       super.n();
       a.b().a();
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, MiniMediaPlayerInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{SwitchConfigInitModule.class};
       PatchProxy.onMethodExit(MiniMediaPlayerInitModule.class, "2");
       return Lists.e(obj);
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, MiniMediaPlayerInitModule.class, "1")) {
          return;
       }
       this.t = a.b();
       if (this.s.get().booleanValue() && this.u.get().booleanValue()) {
          b.a.execute(new x(this));
       }else {
          Thread.currentThread().getName();
          super.n();
          a.b().a();
       }
       PatchProxy.onMethodExit(MiniMediaPlayerInitModule.class, "1");
       return;
    }
}
