package b90.a;
import x80.g;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import z80.a;
import q87.c;
import z80.s;
import android.graphics.Bitmap;
import brd.t;
import java.util.Objects;
import z80.c;
import z80.f0;
import erd.o;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.util.Collection;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.feature.post.api.mediascene.MediaSceneAssetContent;
import com.yxcorp.gifshow.models.QMedia;
import brd.w;
import z80.z;
import z80.a0;
import z80.b0;
import t45.d;
import brd.z;
import b90.a$a;
import erd.a;
import java.lang.IllegalArgumentException;

public final class a implements g	// class@000ae9
{

    public void a(){
       super();
    }
    public boolean a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       Object[] objArray = new Object[0];
       a.D().w("MediaSceneLoadingHelper", "navigateToEdit", objArray);
       s.d.h(null, p0);
       return true;
    }
    public t b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("MediaSceneLoadingHelper", "doPrepareTask", objArray);
       obj = s.d;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(null, obj, s.class, "5");
       if (ot != patchProxyRe) {
       }else {
          ot = c.j.k().flatMap(f0.b);
          a.o(ot, "initTask.flatMap {\n     ¡­NE_HUNDRED\)\n      \)\n    }");
       }
       return ot;
    }
    public t c(List p0){
       t ot1;
       Map$Entry uEntry;
       w[] obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "mediaList";
       a.p(p0, obj);
       m1 om1 = m1.w0();
       a.o(om1, "KuaiShanManager.getInstance\(\)");
       o1 oo1 = om1.v0();
       if (oo1 == null) {
          throw new IllegalArgumentException("currentProject is null");
       }
       a.o(oo1, "KuaiShanManager.getInsta¡­\"currentProject is null\"\)");
       s d = s.d;
       Objects.requireNonNull(d);
       t ot = PatchProxy.applyTwoRefs(oo1, p0, d, s.class, "6");
       if (ot != patchProxyRe) {
       }else {
          a.p(oo1, "project");
          a.p(p0, obj);
          boolean b = false;
          if (p0.isEmpty() ^ 1) {
             MediaSceneConfig mediaSceneCo = c.j.r();
             if (mediaSceneCo != null) {
                HashMap assetContent = mediaSceneCo.getAssetContents();
                if (assetContent != null) {
                   LinkedHashMap linkedHashMa = new LinkedHashMap();
                   Iterator iterator = assetContent.entrySet().iterator();
                   while (iterator.hasNext()) {
                      uEntry = iterator.next();
                      obj1 = (uEntry.getValue().mAssetType == 5)? 1: null;
                      if (obj1) {
                         linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                      }
                   }
                   iterator = linkedHashMa.entrySet().iterator();
                   int i = 0;
                   while (iterator.hasNext()) {
                      uEntry = iterator.next();
                      if (i < p0.size()) {
                         int i1 = i + 1;
                         uEntry.getValue().mContent = p0.get(i).path;
                         i = i1;
                      }
                   }
                }
             }
          }
          ot1 = oo1.O0(p0, null, b);
          a.o(ot1, "project.setupMedias\(mediaList, null, false\)");
          c j = c.j;
          t ot2 = j.p();
          obj1 = new w[]{ot1.map(new z(50.00f)),ot2.map(new a0(80.00f)),j.o().map(b0.b)};
          ot = t.concatArray(obj1).subscribeOn(d.c).observeOn(d.a);
          a.o(ot, "Observable.concatArray\(\n¡­veOn\(KwaiSchedulers.MAIN\)");
       }
       ot1 = ot.doOnComplete(a$a.b);
       a.o(ot1, "MediaSceneUtil.doAlbumNe¡­.postPageSceneEnd\(\)\n    }");
       return ot1;
    }
}
