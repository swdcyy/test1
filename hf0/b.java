package hf0.b;
import hf0.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentMap;
import com.google.common.collect.Maps;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.o;
import java.util.Map;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.CharSequence;
import zsd.u;
import hg0.b;
import hg0.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import cg0.a;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import nsd.s0;
import java.lang.System;
import wkd.b;
import yf0.b;

public class b implements a	// class@00267f
{
    public final Map a;

    public void b(){
       super();
       ConcurrentMap uConcurrentM = Maps.q();
       a.o(uConcurrentM, "Maps.newConcurrentMap\(\)");
       this.a = uConcurrentM;
    }
    public void B3(Activity p0,String p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       if (!p0 instanceof GifshowActivity) {
          return;
       }
       Set set = this.b(p0);
       if (set == null) {
          set = o.h();
          this.a.put(this.a(p0), set);
       }
       a.m(set);
       if (CollectionsKt___CollectionsKt.H1(set, p1)) {
          return;
       }else if(p1 == null || u.S1(p1)){
          i = 1;
       }else {
          i = 0;
       }
       if (!i) {
          set.add(p1);
       }
       this.d(false);
       return;
    }
    public void C3(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       b uob = this.c();
       if (!uob instanceof a) {
          uob = null;
       }
       if (uob != null && !PatchProxy.applyVoidOneRefs(p0, uob, a.class, "7")) {
          a.p(p0, str);
          uob.h.h(p0);
       }
       return;
    }
    public boolean D3(GifshowActivity p0,int p1,String p2,String p3,boolean p4){
       Object obj;
       b uob = b.class;
       int i = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       uob = this.c();
       if (!uob instanceof a) {
          obj = 0;
       }
       b uob1 = obj;
       if (uob1 != null) {
          i = uob1.t(p0, p1, p2, p3, p4);
       }
       return i;
    }
    public boolean E3(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       Set set = this.b(p0);
       if (set != null && set.size() > 0) {
          return true;
       }
       return false;
    }
    public void P0(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       if (!p0 instanceof GifshowActivity) {
          return;
       }
       Set set = this.b(p0);
       if (set != null) {
          s0.a(set).remove(p1);
          if (!set.size()) {
             this.d(true);
          }
       }
       return;
    }
    public final String a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(System.identityHashCode(p0));
    }
    public final Set b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = this.a(p0);
       Set set = ((u.S1(str) ^ 0x01) && this.a.containsKey(str))? this.a.get(str): null;
       return set;
    }
    public final b c(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x686d9295).D();
    }
    public final void d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "6")) {
          return;
       }
       uob = this.c();
       if (!uob instanceof a) {
          uob = null;
       }
       if (uob != null) {
          uob.s(p0);
       }
       return;
    }
}
