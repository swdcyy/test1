package knd.d$e;
import erd.g;
import knd.d;
import msd.l;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2.network.RecommendTextResponseV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import java.util.List;
import q87.c;
import java.util.Collection;
import ekd.q;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.response.RecoTextResult;
import java.lang.Boolean;

public final class d$e implements g	// class@0017db
{
    public final d b;
    public final l c;

    public void d$e(d p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("RecommendTextRepoV2", "loadRecoTextList, mNextIndex = "+this.b.a+", recoText count = "+p0.mRecoTextList.size()+", defaultRecoText count = "+this.b.c.size(), objArray);
          if (!q.f(p0.mRecoTextList)) {
             d$e tb = this.b;
             if (tb.b == null) {
                tb.c.clear();
             }
             d c = this.b.c;
             p0 = p0.mRecoTextList;
             a.o(p0, "response.mRecoTextList");
             ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
             p0 = p0.iterator();
             while (p0.hasNext()) {
                uArrayList.add(p0.next().mText);
             }
             c.addAll(uArrayList);
             this.c.invoke(Boolean.TRUE);
          }
       }
       return;
    }
}
