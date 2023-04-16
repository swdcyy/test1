package com.yxcorp.gifshow.init.module.UpdateConfigModule;
import com.kwai.framework.init.TTIInitModule;
import ekd.l0;
import com.yxcorp.gifshow.init.module.z0;
import java.lang.String;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.a1;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import crd.b;
import lnc.b9;
import android.os.Bundle;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.init.module.b1;
import com.kwai.framework.init.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import sxa.k0;
import erd.g;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$c;
import sxa.j0;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import ok.x;
import java.lang.Boolean;
import pxa.e;
import q87.c;
import com.yxcorp.gifshow.init.module.x0;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import doc.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.resource.p;
import java.util.Collection;
import com.kuaishou.android.model.response.ConfigResponse;
import com.yxcorp.gifshow.util.resource.Category;
import java.util.Iterator;
import boc.b;
import java.io.File;
import qkd.b;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$a;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import java.lang.reflect.Type;
import da6.d;
import ekd.k1;
import com.yxcorp.gifshow.util.resource.i;
import t45.c;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.init.module.UpdateConfigModule$1;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import t45.d;
import brd.z;
import sxa.l0;
import com.yxcorp.gifshow.init.module.y0;

public class UpdateConfigModule extends TTIInitModule	// class@0019a9
{
    public ConfigResponse q;
    public final l0 r;
    public final l0 s;
    public b t;
    public static final int u;

    public void UpdateConfigModule(){
       super();
       String[] stringArray = new String[]{"lock_wifi","lock_config"};
       this.r = new l0(new z0(this), stringArray);
       stringArray = new String[]{"lock_login","lock_config"};
       this.s = new l0(new a1(this), stringArray);
    }
    public int f0(){
       return 13;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateConfigModule.class, "8")) {
          return;
       }
       a.d().t(this);
       b9.a(this.t);
       PatchProxy.onMethodExit(UpdateConfigModule.class, "8");
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, UpdateConfigModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, UpdateConfigModule.class, "2")) {
          if (QCurrentUser.ME.isLogined()) {
             c.d(b1.b);
          }
          if (!a.d().i(this)) {
             a.d().p(this);
          }
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          this.t = f.g(l.class, mAIN).subscribe(new k0(this));
          f.g(ResourceDownloadInitModule$c.class, mAIN).subscribe(new j0(this));
          if (EmotionPluginInitModule.r.get().booleanValue()) {
             Object[] objArray = new Object[0];
             e.C().w("UpdateConfigModule", "registerListener MESSAGE_EMOJI", objArray);
             n.a(x0.a);
          }
          PatchProxy.onMethodExit(UpdateConfigModule.class, "2");
       }
       PatchProxy.onMethodExit(UpdateConfigModule.class, "1");
       return;
    }
    public final List n0(a p0){
       ArrayList obj = PatchProxy.applyOneRefsWithListener(p0, this, UpdateConfigModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(p.c());
       obj.addAll(p.e(p0));
       PatchProxy.onMethodExit(UpdateConfigModule.class, "6");
       return obj;
    }
    public void o0(ConfigResponse p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateConfigModule.class, "5")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(Category.THEME);
       uArrayList.add(Category.EFFECT);
       uArrayList.add(Category.TEXT);
       uArrayList.add(Category.STICKER);
       uArrayList.add(Category.STORY_STICKER);
       uArrayList.add(Category.MAGIC_FINGER);
       uArrayList.addAll(this.n0(p0));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!obj.useYcnnModelConfig() && p.g(p0, obj)) {
             File uFile = new File(obj.getResourceDir());
             if (uFile.exists()) {
                b.q(uFile);
             }
             n.j(p0, obj, true, true, true, null);
          }
       }
       PatchProxy.onMethodExit(UpdateConfigModule.class, "5");
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateConfigModule.class, "9")) {
          return;
       }
       this.r.b("lock_wifi");
       PatchProxy.onMethodExit(UpdateConfigModule.class, "9");
       return;
    }
    public void onResConfigEvent(ResourceDownloadInitModule$c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateConfigModule.class, "3")) {
          return;
       }
       String str = "lock_config";
       if (p0.a.a != null) {
          this.r.b(str);
          this.s.b(str);
       }else {
          this.r.a(str);
          this.s.a(str);
       }
       if (p0.a.a != null) {
          p0 = p0.b;
          if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, UpdateConfigModule.class, "4")) {
             Object[] objArray = new Object[0];
             e.C().w("UpdateConfigModule", "Update Config. RequestTiming: "+p0, objArray);
             ResourcePreloadingConfig resourcePrel = d.b(ResourcePreloadingConfig.class);
             if (resourcePrel == null) {
                resourcePrel = new ResourcePreloadingConfig();
             }
             if (k1.g()) {
                c.a(i.b);
             }else {
                n.d();
             }
             n.A(p0).subscribe(new UpdateConfigModule$1(this, resourcePrel), Functions.d());
             PatchProxy.onMethodExit(UpdateConfigModule.class, "4");
          }
       }
       PatchProxy.onMethodExit(UpdateConfigModule.class, "3");
       return;
    }
    public void p0(){
       if (PatchProxy.applyVoidWithListener(null, this, UpdateConfigModule.class, "7")) {
          return;
       }
       n.C().observeOn(d.c).subscribe(new l0(this), y0.b);
       PatchProxy.onMethodExit(UpdateConfigModule.class, "7");
       return;
    }
}
