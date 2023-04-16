package com.yxcorp.gifshow.social_arch.init.SocialArchInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import com.yxcorp.gifshow.social_arch.init.SocialArchInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import i0c.a;
import i0c.c;
import java.lang.Boolean;
import i0c.h;
import com.kwai.plugin.dva.Dva;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.yxcorp.gifshow.social_arch.init.SocialArchInitModule$b;
import com.kwai.plugin.dva.work.c$c;
import android.app.Activity;
import android.os.Bundle;
import h0c.c;
import java.util.Objects;
import b69.f;
import i0c.g;
import i0c.e;
import b69.e;
import h0c.b;
import com.yxcorp.gifshow.reminder.friend.preload.FriendsSlidePrefetchHelper;
import i0c.b;
import i0c.d;
import vdc.j;
import vdc.k;
import java.lang.Long;
import io.reactivex.subjects.PublishSubject;
import h0c.d;
import erd.g;
import crd.b;
import brd.t;

public final class SocialArchInitModule extends HomeCreateInitModule	// class@001d78
{
    public static final SocialArchInitModule$a q;

    static {
       SocialArchInitModule.q = new SocialArchInitModule$a(null);
    }
    public void SocialArchInitModule(){
       super();
    }
    public boolean C(){
       return false;
    }
    public int f0(){
       return 13;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialArchInitModule.class, "2")) {
          return;
       }
       PluginDownloadExtension.k.a("social_arch_silence_components");
       c.a().c(Boolean.TRUE);
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().j("social_arch_silence_components").a(new SocialArchInitModule$b());
       return;
    }
    public void l0(Activity p0,Bundle p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialArchInitModule.class, str)) {
          return;
       }
       c b = c.b;
       Objects.requireNonNull(b);
       c uoc = c.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, b, uoc, "2") && !PatchProxy.applyVoid(objArray, objArray, uoc, str)) {
          if (!PatchProxy.applyVoid(objArray, objArray, f.class, str)) {
             c.c(e.a(), new e(), false);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, FriendsSlidePrefetchHelper.class, "3")) {
             c.c(d.a(), new j(), true);
             a uoa = c.a();
             k ok = new k();
             long l = 2000;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidFourRefs(uoa, ok, Long.valueOf(l), Boolean.TRUE, null, c.class, "5")) {
                a.p(uoa, "event");
                a.p(ok, "supplier");
                d uod = new d(ok, uoa, 1, 2000);
                uoa.b().subscribe(l);
             }
          }
       }
    label_0097 :
       return;
    }
    public void n(){
    }
}
