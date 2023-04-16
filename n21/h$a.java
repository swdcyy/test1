package n21.h$a;
import n21.f$a;
import n21.h;
import java.lang.Object;
import n21.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Map;
import n21.h$c;
import n21.s;
import n21.h$b;
import n21.e$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;

public class h$a implements f$a	// class@00328b
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(e p0){
       boolean b;
       ArrayList uArrayList1;
       Iterator iterator;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, str)) {
          return;
       }
       h$a ta = this.a;
       Objects.requireNonNull(ta);
       h oh = h.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, oh, str)) {
          h$c uoc = ta.d.get(p0.e());
          long l = 0;
          if (uoc == null) {
             if (!PatchProxy.applyVoidOneRefs(p0, ta, oh, "2") && (p0.d() - ta.b.a()) - l >= 0) {
                h$c uoc1 = new h$c(ta, p0);
                ta.d.put(p0.e(), uoc1);
                uoc1.c(p0);
                ta.a.a(p0);
             }
          }else if(PatchProxy.applyVoidTwoRefs(p0, uoc, ta, oh, "3") || uoc.a.equals(p0)){
             if ((p0.d() - ta.b.a()) - l < 0) {
                ta.a(p0.e());
             }else if(uoc.a.d() - p0.d()){
                uoc.c(p0);
             }
             h a = ta.a;
             String str1 = p0.e();
             e$a j = e.j;
             uoc = uoc.a;
             Objects.requireNonNull(j);
             List obj = PatchProxy.applyTwoRefs(uoc, p0, j, e$a.class, str);
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a.p(uoc, "data1");
                a.p(p0, "data2");
                obj = uoc.b();
                ArrayList uArrayList = null;
                int i = 10;
                if (obj != null) {
                   uArrayList1 = new ArrayList(u.Y(obj, i));
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      uArrayList1.add(iterator.next().getUrl());
                   }
                }else {
                   uArrayList1 = uArrayList;
                }
                obj = p0.b();
                if (obj != null) {
                   uArrayList = new ArrayList(u.Y(obj, i));
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().getUrl());
                   }
                }
                if (!a.g(uArrayList1, uArrayList)) {
                   obj = uoc.a();
                   ArrayList uArrayList2 = new ArrayList(u.Y(obj, i));
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      uArrayList2.add(iterator.next().getUrl());
                   }
                   obj = p0.a();
                   uArrayList = new ArrayList(u.Y(obj, i));
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().getUrl());
                   }
                   if (!a.g(uArrayList2, uArrayList)) {
                      b = 0;
                   }
                }
                b = 1;
             }
             a.b(str1, p0, (b ^ 1));
          }
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "2")) {
          return;
       }
       this.a.a(p0);
       return;
    }
}
