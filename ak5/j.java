package ak5.j;
import java.lang.Object;
import com.kwai.emotionsdk.core.EmotionManagerDelegate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.io.File;
import jl5.h;
import ck5.r;
import ck5.q;
import brd.t;
import java.lang.Integer;
import lk5.b;
import lk5.a;
import com.kwai.emotionsdk.core.j;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import bk5.e;
import java.lang.Throwable;
import ak5.a;
import bk5.k;
import jl5.m;
import brd.z;
import cjd.e;
import erd.o;
import ck5.e;
import ck5.f;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.util.Log;
import nk5.m;
import ak5.h;
import java.lang.Runnable;
import crd.b;
import java.lang.CharSequence;
import jl5.f;
import java.lang.Float;
import dk5.d;
import android.view.View;
import brd.a0;
import java.util.List;
import java.util.ArrayList;
import ekd.q;
import java.lang.Iterable;
import ak5.c;
import ak5.f;
import erd.r;
import ak5.d;
import ak5.e;
import dk5.b;
import android.graphics.Bitmap;
import java.util.Map;
import dk5.b$a;
import java.util.Collection;
import java.util.Collections;
import ck5.a;
import ck5.h;
import com.kwai.emotionsdk.core.i;
import ck5.b;
import com.kwai.emotionsdk.bean.EmotionPackage;
import ck5.m;
import ek5.a;
import java.util.LinkedHashMap;
import ok5.a;
import java.util.regex.Matcher;
import dk5.e;
import z47.d;
import com.google.common.collect.Lists;
import java.util.Iterator;
import ck5.c;
import java.util.concurrent.Callable;
import com.kwai.emotionsdk.core.e;
import ck5.d;
import com.kwai.emotionsdk.core.f;
import com.yxcorp.utility.TextUtils;
import com.kwai.emotionsdk.http.a;
import com.kwai.emotionsdk.core.g;
import com.kwai.emotionsdk.core.h;
import brd.w;
import com.kwai.emotionsdk.core.c;

public class j	// class@0000c5
{
    public final q a;
    public a b;
    public static j c;

    public void j(){
       super();
       this.a = new EmotionManagerDelegate();
    }
    public static j o(){
       j oj = j.class;
       Object obj = PatchProxy.apply(null, null, oj, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.c == null) {
          _monitor_enter(oj);
          if (j.c == null) {
             j.c = new j();
          }
          _monitor_exit(oj);
       }
       return j.c;
    }
    public static File r(EmotionInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.i(p0);
    }
    public void A(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "31")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public t B(String p0,String p1,String p2,int p3,int p4,int p5){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, oj, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.b().a().c(p0, p1, p2, p3, p4, p5);
    }
    public t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(p0, null);
    }
    public t b(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j.e();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyTwoRefs(p0, p1, obj, j.class, "6");
       if (ot != patchProxyRe) {
       }else if(obj.g()){
          a uoa = new a(null, 7806, e.a, null, 0, 0);
          ot = t.error(new KwaiException(p1));
       }else {
          ot = b.b().a().f(j.o().i().f.g, p0, p1).subscribeOn(m.b).map(new e()).flatMap(new e(obj));
       }
       return ot;
    }
    public t c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j.e();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, j.class, "7");
       if (ot != patchProxyRe) {
       }else if(obj.g()){
          a uoa = new a(null, 7806, e.a, null, 0, 0);
          ot = t.error(new KwaiException(v9));
       }else {
          ot = b.b().a().l(j.o().i().f.h, p0).subscribeOn(m.b).map(new e()).flatMap(new f(obj));
       }
       return ot;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.isAvailable()) {
          return true;
       }
       m.b("KwaiEmotionManager", "stack trace:"+Log.getStackTraceString(new Throwable()));
       m.b.d(new h(this));
       return false;
    }
    public void e(CharSequence p0,int p1,int p2,float p3,f p4){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, oj, "28")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else {
          d.a().e(p0, p1, p2, Integer.MAX_VALUE, (int)p3, p4);
          return;
       }
    }
    public void f(CharSequence p0,View p1,float p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, j.class, "26")) {
          return;
       }
       this.g(p0, p1, p2, null);
       return;
    }
    public void g(CharSequence p0,View p1,float p2,f p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), null, this, j.class, "27")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       d.a().f(p0, (int)p2, null);
       return;
    }
    public a0 h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromIterable(q.b(j.e().c(3))).map(c.b).filter(f.b).flatMap(d.b).filter(new e(this, "["+p0.trim()+"]")).toList();
    }
    public a i(){
       return this.b;
    }
    public List j(){
       Object obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e().c();
    }
    public Bitmap k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e().d(p0);
    }
    public List l(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, j.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.e();
       Objects.requireNonNull(obj);
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, obj, b.class, "7");
       if (uArrayList != patchProxyRe) {
       }else {
          b$a uoa = obj.c.get(p0);
          uArrayList = (uoa == null || q.f(uoa.c))? Collections.emptyList(): new ArrayList(uoa.c);
       }
       return uArrayList;
    }
    public a0 m(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j.e();
       Objects.requireNonNull(obj);
       a0 uoa0 = PatchProxy.applyTwoRefs(p0, p1, obj, j.class, "30");
       if (uoa0 != patchProxyRe) {
       }else {
          uoa0 = t.fromIterable(obj.a.values()).filter(new a(p0)).map(new h(p0)).flatMapIterable(i.b).filter(new b(p1)).firstOrError().T(m.c);
       }
       return uoa0;
    }
    public List n(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return j.e().c(p0);
    }
    public EmotionPackage p(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.e().f(p0);
    }
    public CharSequence q(CharSequence p0,View p1,float p2,f p3){
       if (PatchProxy.isSupport(j.class)) {
          p1 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), p3, this, j.class, "29");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          return d.a().f(p0, (int)p2, p3);
       }
    }
    public boolean s(){
       m obj = PatchProxy.apply(null, this, j.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = j.e().d(4);
       boolean b = (obj != null && !q.f(obj.c()))? true: false;
       return b;
    }
    public boolean t(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, j.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.a.isAvailable();
       this.a.d();
       boolean b1 = this.a.c();
       a uoa = a.class;
       String str = "3";
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(b1), objArray, uoa, str)) {
          if (b) {
             str = "1";
          }else if(b1){
             str = "2";
          }
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          linkedHashMa.put("state", str);
          a.a("EmotionSDKState", String.valueOf(linkedHashMa));
          a.b("EmotionSDKState", linkedHashMa);
       }
       return b;
    }
    public boolean u(String p0,int p1,int p2,f p3){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, j.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 >= 0 && p2 <= p0.length()) {
          Matcher matcher = e.c(p0.subSequence(p1, (p2 + p1)));
          while (matcher.find()) {
             String str = matcher.group();
             d uod = (p3 != null && p3.c(str))? 1: null;
             if (b.e().a(str) || uod) {
                return true;
             }
          }
       }
       return false;
    }
    public boolean v(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = j.e();
       Objects.requireNonNull(obj);
       EmotionInfo obj1 = PatchProxy.applyOneRefs(p0, obj, j.class, "16");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          m om = obj.d(2);
          if (om != null) {
             EmotionPackage uEmotionPack = om.b("5xnpyuq5r6gqhgq");
             if (uEmotionPack != null && !q.f(uEmotionPack.mEmotions)) {
                Iterator iterator = Lists.c(uEmotionPack.mEmotions).iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      if (obj1 != null && p0.equals(obj1.mId)) {
                         b = true;
                         break ;
                      }
                   }
                }
             }
          }
          b = false;
       }
       return b;
    }
    public boolean w(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, j.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.e();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b$a uoa = obj.c.get(p0);
          b = (uoa != null && uoa.a != null)? true: false;
       }
       return b;
    }
    public void x(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "3")) {
          return;
       }
       d.a();
       this.a.a(p0);
       return;
    }
    public a0 y(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j.e();
       Objects.requireNonNull(obj);
       a0 uoa0 = PatchProxy.applyOneRefs(p0, obj, j.class, "21");
       if (uoa0 != patchProxyRe) {
       }else {
          t ot = PatchProxy.applyOneRefs(p0, obj, j.class, "22");
          if (ot != patchProxyRe) {
          }else {
             ot = t.fromCallable(new c(obj, p0)).onErrorReturn(e.b);
          }
          t ot1 = PatchProxy.applyOneRefs(p0, obj, j.class, "23");
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = t.fromCallable(new d(p0)).onErrorReturn(f.b);
          }
          t ot2 = PatchProxy.applyOneRefs(p0, obj, j.class, "24");
          if (ot2 != patchProxyRe) {
          }else if(TextUtils.x(p0)){
             ot2 = t.just(EmotionPackage.EMPTY_PKG);
          }else {
             z b = m.b;
             t ot3 = b.b().a().a(j.o().i().f.i, p0).retryWhen(new a()).subscribeOn(b).observeOn(b);
             ot2 = ot3.map(new e()).map(g.b).onErrorReturn(h.b);
          }
          uoa0 = t.concat(ot, ot1, ot2).filter(c.b).first(new EmotionPackage(p0)).T(m.b).G(m.a);
       }
       return uoa0;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, j.class, "23")) {
          return;
       }
       d.a().d(new Throwable("call setFailStatus"));
       this.a.logout();
       return;
    }
}
