package f1a.c;
import qvb.d;
import f1a.c$b;
import nsd.u;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import wkd.b;
import az5.k;
import java.util.Map;
import az5.i;
import kotlin.jvm.internal.a;
import java.util.Set;
import f1a.c$a;
import java.lang.Iterable;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import psb.c;
import psb.a;
import java.util.Collection;
import ekd.q;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.detail.history.HistoryResponse;
import kotlin.collections.CollectionsKt__CollectionsKt;
import qvb.a;
import java.lang.Integer;

public final class c extends d	// class@002274
{
    public int l;
    public int m;
    public int n;
    public List o;
    public final ArrayList p;
    public int q;
    public final String r;
    public static final c$b s;

    static {
       c.s = new c$b(null);
    }
    public void c(String p0){
       super();
       this.r = p0;
       this.p = new ArrayList();
       Map map = b.a(-1691162587).d(false);
       a.o(map, "Singleton.get\(VideoHisto¡­va\).getHistoryData\(false\)");
       List list = CollectionsKt___CollectionsKt.f5(map.entrySet(), new c$a());
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(list, 10)), 16));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          linkedHashMa.put(key, uEntry.getValue());
       }
       list = CollectionsKt___CollectionsKt.G5(linkedHashMa.keySet());
       this.o = list;
       int i = CollectionsKt___CollectionsKt.M2(list, this.r);
       this.l = i;
       this.m = i;
       this.n = i;
       return;
    }
    public t C1(){
       c tl;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, uoc, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.a();
       List list = PatchProxy.apply(objArray, this, uoc, "6");
       if (list != patchProxyRe) {
       }else if(this.l == -1 || q.f(this.o)){
          list = this.o;
       }else {
          int i = this.x1();
          if (i != 1) {
             if (i != 2) {
                tl = this.l;
                i1 = q.u(this.o.size(), (this.l + 10));
             }else {
                tl = q.u(this.o.size(), this.n);
                i1 = q.u(this.o.size(), (tl + 10));
             }
          }else {
             tl = q.n(0, (this.m - 10));
             i1 = this.m;
          }
          this.q = i1 - tl;
          list = this.o.subList(tl, i1);
       }
       t ot = obj.B(list.toString()).map(new e());
       a.o(ot, "DetailApi.getApiService\(¡­\).map\(ResponseFunction\(\)\)");
       return ot;
    }
    public void D1(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
       }else {
          super.D1(p0);
          if (this.K()) {
             this.B1();
          }
       }
       return;
    }
    public void E1(Object p0,List p1){
       String str1;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
       }else if(p0 != null){
          p0 = p0.getMFeeds();
          if (p0 != null) {
          label_001d :
             if (!this.K()) {
                this.p.clear();
                this.p.addAll(p0);
             }
             if (this.x1() == 1) {
                this.b.addAll(0, p0);
                this.m = this.m - this.q;
             }else {
                this.b.addAll(p0);
                this.n = this.n + this.q;
             }
             p0 = this.m;
             String str = null;
             if (PatchProxy.isSupport(uoc)) {
                str1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "4");
                if (str1 != patchProxyRe) {
                }else if(p0 > null){
                   str1 = String.valueOf(p0);
                }else {
                   str1 = str;
                }
             }else {
                goto label_0066 ;
             }
             p0 = this.n;
             if (PatchProxy.isSupport(uoc)) {
                str2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "5");
                if (str2 != patchProxyRe) {
                label_0092 :
                   this.F1(str1, str2);
                }
             }
             if (p0 < this.o.size()) {
                str = String.valueOf(p0);
             }
             str2 = str;
             goto label_0092 ;
          }
       }
       p0 = CollectionsKt__CollectionsKt.E();
       goto label_001d ;
       return;
    }
    public List d1(){
       a obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a.o(obj, "mItems");
       return obj;
    }
    public long y1(){
       return 0;
    }
}
