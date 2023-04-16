package com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader;
import db7.b;
import jb7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$_apiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Collection;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import ztc.l;
import com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$c;
import erd.o;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.data.PicMaterialRemoteDataLoader$a;

public final class PicMaterialRemoteDataLoader implements b	// class@00131e
{
    public final p a;
    public final a b;
    public final int c;

    public void PicMaterialRemoteDataLoader(a p0,int p1){
       a.p(p0, "bizConfig");
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(PicMaterialRemoteDataLoader$_apiService$2.INSTANCE);
    }
    public t a(Collection p0){
       Pair pair;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PicMaterialRemoteDataLoader picMaterialR = PicMaterialRemoteDataLoader.class;
       String obj = PatchProxy.applyOneRefs(p0, this, picMaterialR, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "ids";
       a.p(p0, obj);
       Object[] objArray = new Object[0];
       a.D().w("Pic_Template", "requestMultiApi: ", objArray);
       String str = PatchProxy.applyOneRefs(p0, this, picMaterialR, "2");
       if (str != patchProxyRe) {
       }else if(p0.isEmpty()){
          pair = null;
       }else {
          pair = CollectionsKt___CollectionsKt.V2(p0, ",", "[", "]", 0, null, null, 56, null);
       }
       str = pair;
       if (str != null) {
          s0.k(r0.a(obj, str));
       }
       t ot = this.c().a(this.c, CollectionsKt___CollectionsKt.V2(p0, ",", null, null, 0, null, null, 62, null)).map(PicMaterialRemoteDataLoader$c.b);
       Objects.requireNonNull(ot, "null cannot be cast to non-null type io.reactivex.Observable<com.kwai.middleware.resourcemanager.cache.adt.DetailResponse<com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo>>");
       ot = ot.doOnNext(new PicMaterialRemoteDataLoader$b(this));
       a.o(ot, "observable.doOnNext { de¡­g.extClass\)\n      }\n    }");
       return ot;
    }
    public t b(){
       t obj = PatchProxy.apply(null, this, PicMaterialRemoteDataLoader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("Pic_Template", "requestBriefApi: ", objArray);
       obj = this.c().c(this.c).map(PicMaterialRemoteDataLoader$a.b);
       Objects.requireNonNull(obj, "null cannot be cast to non-null type io.reactivex.Observable<com.kwai.middleware.resourcemanager.cache.adt.UnionResponse<com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo>>");
       return obj;
    }
    public final l c(){
       Object obj = PatchProxy.apply(null, this, PicMaterialRemoteDataLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
