package ec9.i;
import ec9.k;
import ec9.b1;
import ec9.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;
import crd.b;
import lnc.b9;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo$PostActivityMaterials;
import java.lang.Integer;
import java.util.Map;
import ac9.j;
import brd.t;
import ec9.b;
import erd.o;
import ec9.c;
import ec9.e;
import java.util.concurrent.TimeUnit;
import ec9.f;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import ec9.g;
import ec9.h;
import erd.g;

public final class i extends k	// class@00217d
{
    public b b;
    public final j c;

    public void i(b1 p0,j p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
    }
    public void c(a p0){
       int i;
       z a;
       Object obj = this;
       t obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, i.class, "1")) {
       }else {
          a.p(obj1, "action");
          i = 0;
          this.a().h(b.a(this.a().j(), false, false, i, false, false, false, null, null, true, false, false, false, false, false, false, false, false, 0x1fcf1, null));
          b9.a(obj.b);
          HashMap hashMap = new HashMap();
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          List list = obj1.b();
          list = (list == null || list.isEmpty())? 1: null;
          if (!list) {
             Iterator iterator = obj1.b().iterator();
             while (iterator.hasNext()) {
                PosterActivityTabInfo$PostActivityMaterials postActivity = iterator.next();
                int i1 = -124;
                if (postActivity.mType == i1) {
                   postActivity.mId = String.valueOf(i1);
                }
                PosterActivityTabInfo$PostActivityMaterials mId = postActivity.mId;
                if (mId == null) {
                   mId = "0";
                }
                HashMap hashMap1 = hashMap.get(mId);
                if (hashMap1 == null) {
                   hashMap1 = new HashMap();
                }
                hashMap1.put(Integer.valueOf(postActivity.mType), Integer.valueOf(i));
                hashMap.put(mId, hashMap1);
                i = i + 1;
                if (postActivity.mType == i1) {
                   uArrayList1.add(postActivity);
                }else {
                   uArrayList.add(postActivity);
                }
             }
          }
          long l = (obj1.d != null)? 500: 0;
          a = d.a;
          obj1 = obj.c.u0().B(obj1.b, obj1.c, uArrayList, obj1.g).map(new b(obj1, hashMap)).map(new c(uArrayList1)).map(new e(obj1, hashMap)).zipWith(t.just("").delay(l, TimeUnit.MILLISECONDS), f.a).subscribeOn(a).observeOn(a);
          obj.b = obj1.subscribe(new g(obj), new h(obj));
       }
       return;
    }
}
