package dqa.d;
import java.lang.Runnable;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Number;
import com.yxcorp.gifshow.growth.pre_embedded.PreEmbeddedHelper;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.Long;
import java.io.File;
import wkd.b;
import com.yxcorp.gifshow.growth.test.network.api.TestApi;
import com.kwai.robust.PatchProxyResult;
import wqa.b;
import qrd.p;
import brd.t;
import brd.z;
import lrd.b;
import dqa.b;
import dqa.c;
import erd.g;
import crd.b;

public final class d implements Runnable	// class@0024ec
{
    public final ArrayList b;

    public void d(ArrayList p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          long l = obj.longValue();
          PreEmbeddedHelper c = PreEmbeddedHelper.c;
          c.f("总计"+this.b.size()+" 个视频要下载，现在开始下载第 "+i1+" 个，ID = "+l);
          Objects.requireNonNull(c);
          PreEmbeddedHelper preEmbeddedH = PreEmbeddedHelper.class;
          if (!PatchProxy.isSupport(preEmbeddedH) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), c, preEmbeddedH, "9")) {
             String str = c.d()+'/'+l;
             c.a(str, false);
             TestApi testApi = b.a(-2136190822);
             Objects.requireNonNull(testApi);
             Object obj1 = PatchProxy.apply(null, testApi, TestApi.class, "2");
             if (obj1 != PatchProxyResult.class) {
             }else {
                obj1 = testApi.b.getValue();
             }
             obj1.a(String.valueOf(l)).observeOn(b.c()).subscribeOn(b.c()).subscribe(new b(str, l), new c(l));
          }
          i = i1;
       }
       return;
    }
}
