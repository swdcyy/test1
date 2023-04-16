package com.yxcorp.gifshow.v3.editor.text.n0$b;
import voc.y;
import com.yxcorp.gifshow.v3.editor.text.n0;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h80.c;
import h80.k;
import h80.m;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.List;
import oa0.a;
import hvc.m;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Tts;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import kvc.e;
import jb7.a;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import hvc.l;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.text.tts.h;
import erd.g;
import crd.b;

public class n0$b implements y	// class@001475
{
    public final n0 b;

    public void n0$b(n0 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n0$b.class, "1")) {
          return;
       }
       if (!k.a().b().b() && PostExperimentUtils.j1()) {
          a.t1(this.b.O);
          a.u1(this.b.P);
       }
       n0 r = this.b.r;
       if (!PatchProxy.applyVoidOneRefs(r, objArray, m.class, "6") && r != null) {
          Workspace workspace = r.v();
          if (workspace != null && workspace.getTextsCount()) {
             List ttsAudiosLis = workspace.getTts().getTtsAudiosList();
             if (ttsAudiosLis != null && !ttsAudiosLis.isEmpty()) {
                ResourceSdk.f.b(e.v).a(CachePolicy.CACHE_ELSE_NETWORK).observeOn(d.c).observeOn(d.a).subscribe(new l(ttsAudiosLis, r), h.b);
             }
          }
       }
       return;
    }
    public void z2(){
       x.c(this);
    }
}
