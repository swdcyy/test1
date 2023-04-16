package com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mrd.a;
import te3.a;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow$imagePipeDataMap$1;
import msd.p;
import com.kuaishou.live.livestage.utils.ReactiveExtensionKt;
import com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow$a;
import brd.w;
import erd.c;
import com.kuaishou.live.livestage.videopipe.renderarea.ImageRenderDataFlow$b;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import te3.a$a;
import ue3.e;
import android.graphics.Bitmap;

public final class ImageRenderDataFlow	// class@000c07
{
    public final a a;
    public final t b;
    public final b c;
    public final a d;
    public final PublishSubject e;

    public void ImageRenderDataFlow(t p0,t p1){
       a.p(p0, "renderLayoutConfig");
       a.p(p1, "imagePipeDataSetObservable");
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<List<BackgroundData>>\(\)");
       this.a = uoa;
       this.b = uoa;
       this.d = new a();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Ma¡­treamId.Image, Bitmap>>\(\)");
       this.e = publishSubje;
       p0 = t.combineLatest(ReactiveExtensionKt.a(p0, p1, ImageRenderDataFlow$imagePipeDataMap$1.INSTANCE), publishSubje, ImageRenderDataFlow$a.a);
       a.o(p0, "Observable.combineLatest¡­streamId.sourceId }\n    }");
       this.c = ReactiveExtensionKt.f(p0, new ImageRenderDataFlow$b(this));
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ImageRenderDataFlow.class, "2")) {
          return;
       }
       ImageRenderDataFlow te = this.e;
       ImageRenderDataFlow td = this.d;
       Objects.requireNonNull(td);
       LinkedHashMap linkedHashMa = PatchProxy.apply(objArray, td, a.class, "4");
       if (linkedHashMa != PatchProxyResult.class) {
       }else {
          a b = td.b;
          linkedHashMa = new LinkedHashMap(s0.j(b.size()));
          Iterator iterator = b.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object key = uEntry.getKey();
             e uoe = uEntry.getValue().b();
             Bitmap uBitmap = (uoe != null)? uoe.b(): objArray;
             linkedHashMa.put(key, uBitmap);
          }
       }
       Objects.requireNonNull(linkedHashMa, "null cannot be cast to non-null type kotlin.collections.Map<com.kuaishou.live.livestage.basic.StreamId.Image, android.graphics.Bitmap>");
       te.onNext(linkedHashMa);
       return;
    }
}
