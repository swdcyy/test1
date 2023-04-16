package com.kuaishou.tuna_core.plugin.k;
import com.kuaishou.tuna_core.plugin.n$a;
import com.kuaishou.tuna_core.plugin.l;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter;
import brd.v;
import androidx.fragment.app.DialogFragment;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkPhotoParam;
import java.lang.Object;
import java.lang.Exception;
import f05.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.plugin.TunaQigsawPluginReporter$PluginState;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.kuaishou.tuna_core.plugin.i;
import msd.a;
import c15.b;
import brd.g;
import com.kuaishou.tuna_core.plugin.j;
import tkd.b;
import tkd.d;
import nmc.d;
import androidx.fragment.app.Fragment;

public class k implements n$a	// class@00111f
{
    public final TunaQigsawPluginReporter a;
    public final v b;
    public final DialogFragment c;
    public final ShareBusinessLinkInfo$DialogInfo d;
    public final UpdateShareBusinessLinkModel e;
    public final ShareBusinessLinkPhotoParam f;
    public final l g;

    public void k(l p0,TunaQigsawPluginReporter p1,v p2,DialogFragment p3,ShareBusinessLinkInfo$DialogInfo p4,UpdateShareBusinessLinkModel p5,ShareBusinessLinkPhotoParam p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void a(Exception p0){
       f.c(this, p0);
    }
    public void b(){
       f.d(this);
    }
    public void c(){
       f.a(this);
    }
    public void d(){
       f.b(this);
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.a.b(TunaQigsawPluginReporter$PluginState.INSTALL_FAIL);
       this.a.c();
       b.f(KsLogTunaPlcTag.PLC_POST.appendTag("generatePlcPostFragment"), i.b);
       this.b.onNext(null);
       this.b.onComplete();
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.a.b(TunaQigsawPluginReporter$PluginState.INSTALL_SUCCESS);
       this.a.c();
       b.f(KsLogTunaPlcTag.PLC_POST.appendTag("generatePlcPostFragment"), j.b);
       this.b.onNext(d.a(-1959809423).TO(this.c, this.d, this.e, this.f));
       this.b.onComplete();
       return;
    }
}
