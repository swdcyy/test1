package com.kuaishou.android.post.topic.d;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Throwable;
import java.lang.String;
import java.util.List;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.utility.m$a;
import com.yxcorp.utility.m;
import oq.e;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import qkd.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Integer;
import oa0.a;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import ekd.q;
import t45.d;
import brd.z;
import oq.d;
import erd.o;
import com.kuaishou.android.post.topic.b;
import java.util.concurrent.Callable;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.android.post.topic.a;
import crd.b;
import com.kuaishou.android.post.topic.c;
import oq.c;

public class d	// class@000ec7
{
    public Set a;

    public void d(){
       super();
       this.a = new HashSet();
    }
    public static void a(Throwable p0){
       d.l(p0);
    }
    public static String b(){
       return d.k();
    }
    public static List c(d p0,List p1,boolean p2,Boolean p3){
       p0.j(p1, p2, p3);
       return p1;
    }
    public static Boolean d(d p0,HashSet p1){
       p0.n(p1);
       return Boolean.TRUE;
    }
    public static HashSet e(){
       return d.m();
    }
    private List j(List p0,boolean p1,Boolean p2){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          m$a uoa = iterator.next();
          if (this.p(uoa.b())) {
             iterator.remove();
             if (p1) {
                e.b().g(uoa.a());
                Object[] objArray = new Object[0];
                a.D().w("TopicFilterManager", "delete history topic id = "+uoa.a(), objArray);
             }
          }
       }
       return p0;
    }
    public static String k(){
       String str = c.m("history_filter_topic.txt");
       HashSet hashSet = new HashSet(Arrays.asList(str.split("\\n")));
       Iterator iterator = e.b().e().iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (hashSet.contains(e.b().d(integer.intValue()))) {
             e.b().g(integer.intValue());
          }
       }
       a.W0(true);
       return str;
    }
    public static void l(Throwable p0){
       PostUtils.D("TopicFilterManager", "filterHistoryDefaultTopic", p0);
    }
    public static HashSet m(){
       Object[] objArray = new Object[0];
       a.D().w("TopicFilterManager", "loadDataIfNeed really load", objArray);
       return new HashSet(Arrays.asList((c.m("filter_topic")).split("\\n")));
    }
    private Boolean n(HashSet p0){
       this.a = p0;
       return Boolean.TRUE;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       d ta = this.a;
       if (ta != null) {
          ta.clear();
       }
       return;
    }
    public t g(List p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(p0)) {
          return t.just(p0);
       }else {
          return this.o().observeOn(d.c).map(new d(this, p0, p1));
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       if (a.E()) {
          Object[] objArray = new Object[0];
          a.D().w("TopicFilterManager", "Has Filter History Default Topic ", objArray);
          return;
       }else {
          t.fromCallable(b.b).subscribeOn(d.c).subscribe(Functions.d(), a.b);
          return;
       }
    }
    public boolean i(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(p0)) {
          return false;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (this.p(iterator.next())) {
             break ;
          }
       }
       return true;
    }
    public t o(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("TopicFilterManager", "loadDataIfNeed", objArray);
       if (!q.f(this.a)) {
          return t.just(Boolean.TRUE);
       }
       return t.fromCallable(c.b).subscribeOn(d.c).observeOn(d.a).map(new c(this));
    }
    public boolean p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.contains(p0);
    }
}
