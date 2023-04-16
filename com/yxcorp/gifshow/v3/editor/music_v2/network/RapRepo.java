package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$a;
import nsd.u;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$rapApi$2;
import msd.a;
import qrd.p;
import qrd.s;
import ftd.z1;
import ftd.w;
import ftd.c3;
import ftd.j2;
import ftd.z0;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ftd.l0;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import trc.t0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo$a;
import src.g;
import urc.b;
import lsc.w;
import trc.n0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.RuntimeException;
import java.util.concurrent.CancellationException;

public final class RapRepo	// class@0010bc
{
    public final p a;
    public final k0 b;
    public z1 c;
    public b d;
    public final List e;
    public t0 f;
    public t0 g;
    public final EditorDelegate h;
    public static final Music i;
    public static final RapRepo$a j;

    static {
       RapRepo.j = new RapRepo$a(null);
       RapRepo.i = new Music();
    }
    public void RapRepo(EditorDelegate p0){
       a.p(p0, "delegate");
       super();
       this.h = p0;
       this.a = s.c(RapRepo$rapApi$2.INSTANCE);
       this.b = l0.a(c3.c(null, 1, null).plus(z0.g().A()));
       this.e = new ArrayList();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RapRepo.class, "9")) {
          return;
       }
       RapRepo tf = this.f;
       if (tf != null) {
          Iterator iterator = this.e.iterator();
          int i = 0;
          while (true) {
             if (iterator.hasNext()) {
                boolean b = (iterator.next().e() == tf.e())? true: false;
                if (b) {
                label_0038 :
                   if (i >= 0 && i < this.e.size()) {
                      this.e.set(i, tf);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                i = -1;
                goto label_0038 ;
             }
          }
       }
       return;
    }
    public final t0 b(){
       RapRepo rapRepo = RapRepo.class;
       Object[] objArray = null;
       RapRepo obj = PatchProxy.apply(objArray, this, rapRepo, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj == null) {
          return objArray;
       }
       a.m(obj);
       if (!PatchProxy.applyVoidOneRefs(obj, this, rapRepo, "3")) {
          g og = LyricRepo.i.b().c(obj.c());
          if (og != null) {
             obj.h(w.a(og));
          }
       }
       return this.g;
    }
    public final n0 c(){
       Object obj = PatchProxy.apply(null, this, RapRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final t0 d(){
       Object[] objArray = null;
       RapRepo obj = PatchProxy.apply(objArray, this, RapRepo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e.isEmpty()) {
          return objArray;
       }
       obj = this.g;
       if (obj == null) {
          return this.e.get(0);
       }
       int i = CollectionsKt___CollectionsKt.M2(this.e, obj);
       if (i < 0) {
          throw new RuntimeException("current rap style is not in the list!");
       }
       int i1 = (i + 1) % this.e.size();
       if (i1 != i) {
          return this.e.get(i1);
       }
       return objArray;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, RapRepo.class, "5")) {
          return;
       }
       l0.f(this.b, null, 1, null);
       return;
    }
}
