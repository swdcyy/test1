package com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$mResourceManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import crd.a;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$a;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import jb7.b;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import itc.e3;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$d;
import brd.w;
import erd.c;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$b;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$c;
import erd.g;
import crd.b;

public final class EditStickerRepo	// class@00128b
{
    public final p a;
    public final a b;

    public void EditStickerRepo(){
       super();
       this.a = s.c(EditStickerRepo$mResourceManager$2.INSTANCE);
       this.b = new a();
    }
    public static void b(EditStickerRepo p0,EditStickerRepo$a p1,CachePolicy p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = CachePolicy.NETWORK_ELSE_CACHE;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.a(p1, p2, p3);
       return;
    }
    public final void a(EditStickerRepo$a p0,CachePolicy p1,boolean p2){
       t ot;
       Map a;
       if (PatchProxy.isSupport(EditStickerRepo.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, EditStickerRepo.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       a.p(p1, "cachePolicy");
       Map[] mapArray = new Map[1];
       if (p2) {
          ot = this.c().a(p1);
          StickerRanker i = StickerRanker.i;
          Objects.requireNonNull(i);
          t ot1 = PatchProxy.apply(null, i, StickerRanker.class, "9");
          if (ot1 != PatchProxyResult.class) {
          }else {
             a = StickerRanker.a;
             if (a != null) {
                ot1 = t.just(a);
                a.o(ot1, "Observable.just\(stickerScoreMap\)");
             }else {
                ot1 = t.fromCallable(e3.b).subscribeOn(d.c);
                a.o(ot1, "Observable.fromCallable ¡­eOn\(KwaiSchedulers.ASYNC\)");
             }
          }
          ot = t.zip(ot, ot1, new EditStickerRepo$d(mapArray));
       }else {
          ot = this.c().a(p1);
       }
       this.b.c(ot.observeOn(d.a).subscribe(new EditStickerRepo$b(mapArray, p0), new EditStickerRepo$c(p1, p0)));
       return;
    }
    public final b c(){
       Object obj = PatchProxy.apply(null, this, EditStickerRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, EditStickerRepo.class, "3")) {
          return;
       }
       if (!this.b.isDisposed()) {
          this.b.dispose();
          this.b.d();
       }
       return;
    }
}
