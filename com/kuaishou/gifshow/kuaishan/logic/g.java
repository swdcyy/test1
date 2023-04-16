package com.kuaishou.gifshow.kuaishan.logic.g;
import io.reactivex.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import zsd.u;
import u80.e;
import q87.c;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import brd.g;
import fg6.a;
import com.kuaishou.gifshow.kuaishan.logic.g$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Collection;

public final class g implements g	// class@001a4a
{
    public final KSTemplateDetailInfo b;

    public void g(KSTemplateDetailInfo p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       String str = KSDownloadHelperX.n.getString(this.b.getUniqueIdentifier(), "");
       Object[] objArray = 1;
       int i = 0;
       String str1 = (str == null || u.S1(str))? 1: null;
       if (str1) {
          objArray = new Object[i];
          e.D().w("KS_Hodor", "verifyTemplate: no cache for check list", objArray);
          p0.onNext(CollectionsKt__CollectionsKt.E());
          p0.onComplete();
          return;
       }else {
          list = a.a.i(str, new g$a().getType());
          if (list != null && !list.isEmpty()) {
             objArray = null;
          }
          if (objArray != null) {
             p0.onNext(CollectionsKt__CollectionsKt.E());
             p0.onComplete();
             return;
          }else {
             p0.onNext(list);
             p0.onComplete();
             return;
          }
       }
    }
}
