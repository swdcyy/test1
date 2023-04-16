package lld.e$f;
import erd.a;
import lld.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import haa.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import qsc.a;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import vpc.c;
import wba.z;
import com.kuaishou.edit.draft.AssetSegment;
import lld.e$f$a;
import t36.f$a;
import t36.f;

public final class e$f implements a	// class@001c4e
{
    public final e b;
    public final c c;

    public void e$f(e p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Asset uAsset;
       if (PatchProxy.applyVoid(null, this, e$f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "CropPicTemplateProcessor";
       a.D().w(str, "discard: ", objArray);
       a uoa = a.c(this.c);
       List list = uoa.z();
       String str1 = "assetDraft.messages";
       a.o(list, str1);
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(list, 10)), 16));
       Iterator iterator = list.iterator();
       String str2 = "it";
       while (iterator.hasNext()) {
          uAsset = iterator.next();
          a.o(uAsset, str2);
          str2 = uAsset.getIdentifier();
          Pair pair = r0.a(str2, this.b.j(uAsset));
          Object first = pair.getFirst();
          linkedHashMa.put(first, pair.getSecond());
       }
       this.b.h(uoa);
       HashMap hashMap = new HashMap();
       List list1 = uoa.z();
       a.o(list1, str1);
       Iterator iterator1 = list1.iterator();
       while (iterator1.hasNext()) {
          uAsset = iterator1.next();
          a.o(uAsset, str2);
          Size size = linkedHashMa.get(uAsset.getIdentifier());
          if (size == null) {
             PostUtils.F(str, "discard: asset old size is null: "+uAsset.getIdentifier());
          }else {
             Size size1 = this.b.j(uAsset);
             if (size1 == null) {
                PostUtils.F(str, "discard: asset new size is null: "+uAsset.getIdentifier());
             }else if(a.g(size, size1)){
                continue ;
             }else {
                String identifier = uAsset.getIdentifier();
                a.o(identifier, "it.identifier");
                hashMap.put(identifier, new c(z.a.i(uAsset, uoa), size, size1));
             }
          }
       }
       this.b.c.s0(new e$f$a(hashMap));
       return;
    }
}
