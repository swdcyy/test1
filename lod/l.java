package lod.l;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper;
import java.util.List;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Objects;
import qrd.p;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import bod.c;
import bod.d;
import java.util.Collection;
import nuc.a;
import quc.b;
import d0c.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import bod.e;
import brd.t;

public final class l implements o	// class@001c88
{
    public final TextTemplateConfigHelper b;
    public final List c;

    public void l(TextTemplateConfigHelper p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       d obj1;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          ArrayList uArrayList = new ArrayList();
          l tb = this.b;
          Objects.requireNonNull(tb);
          c obj = PatchProxy.apply(null, tb, TextTemplateConfigHelper.class, "3");
          if (obj != patchProxyRe) {
          }else {
             obj2 = tb.c.getValue();
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(obj, 10));
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             this.b.a(obj, this.c);
             uArrayList1.add(obj);
          }
          uArrayList.addAll(uArrayList1);
          uArrayList1 = new ArrayList();
          p0 = p0.iterator();
          while (p0.hasNext()) {
             obj1 = p0.next();
             int i = b.b(obj1.q()) & 0x10;
             obj2 = (i)? 1: null;
             if (obj2) {
                uArrayList1.add(obj1);
             }
          }
          p0 = uArrayList1.iterator();
          while (p0.hasNext()) {
             obj1 = new d(p0.next(), null, null, false, null, false, null, null, null, 510, null);
             this.b.a(uArrayList1, this.c);
             e.d(e.b(e.c(uArrayList1)));
             uArrayList.add(uArrayList1);
          }
          ot = t.just(uArrayList);
       }
       return ot;
    }
}
