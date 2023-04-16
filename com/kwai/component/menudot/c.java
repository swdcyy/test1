package com.kwai.component.menudot.c;
import com.kwai.component.menudot.b;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;
import com.google.common.collect.o;
import java.util.concurrent.ConcurrentHashMap;
import android.util.SparseArray;
import nc5.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.component.menudot.c$a;
import lnc.u1;
import wkd.b;
import j9c.d;
import nc5.m;
import j9c.a;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.reddot.model.RedDot;
import com.kwai.component.menudot.b$b;
import java.util.Objects;
import java.util.Map;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ekd.k1;
import com.yxcorp.gifshow.reddot.model.ClientRedDotConfig;
import com.kwai.robust.PatchProxyResult;
import xr4.a$a;
import nc5.q;
import java.lang.Runnable;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import j9c.b;
import java.util.Iterator;
import ekd.q$b;
import cub.a;
import java.lang.reflect.Type;
import aub.a;
import ekd.s0;
import nc5.p;
import nc5.l;
import nc5.c;
import nc5.r;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import com.kwai.component.menudot.b$a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.List;
import ekd.j;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import nc5.j;
import io.reactivex.i;
import brd.a0;
import t45.d;
import brd.z;
import nc5.k;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import k9c.e;
import java.lang.Number;
import b76.a;
import ekd.e0;
import k2b.u1;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import java.util.HashSet;
import wv9.a;
import brd.t;
import cjd.e;
import erd.o;
import nc5.o;
import nc5.n;

public class c implements b	// class@0009b9
{
    public Set a;
    public Set b;
    public final Set c;
    public final Set d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final SparseArray g;
    public final b h;
    public Map i;
    public ConcurrentLinkedQueue j;
    public Set k;
    public String l;
    public long m;
    public boolean n;
    public final b$b o;
    public static final String p;

    static {
       c.p = b.class.getSimpleName();
    }
    public void c(){
       super();
       this.a = new CopyOnWriteArraySet();
       this.b = new CopyOnWriteArraySet();
       this.c = o.g();
       this.d = o.g();
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap(64);
       this.g = new SparseArray();
       this.h = new b();
       this.j = new ConcurrentLinkedQueue();
       this.k = o.g();
       this.o = new c$a(this);
       u1.a(this);
       b.a(0x2c71dec4).h(new m(this));
    }
    public void A(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "23")) {
          return;
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot == null) {
          return;
       }
       if (this.C(redDot).d(redDot)) {
          c th = this.h;
          Objects.requireNonNull(th);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), th, uob, "6")) {
             th.a();
             if (th.a.containsKey(Integer.valueOf(p0))) {
                String str = "MenuRedDotManager";
                if (p0 == 1003) {
                   Log.b(str, "removeClientType update: "+p0);
                   th.a.put(Integer.valueOf(p0), ClientRedDotConfig.of(k1.i()));
                }else {
                   Log.b(str, "removeClientType type: "+p0);
                   th.a.remove(Integer.valueOf(p0));
                }
                th.b();
             }
          }
       }
       this.C(redDot).a(redDot);
       return;
    }
    public final RedDot B(int p0){
       RedDot obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new RedDot(p0, this.m);
       obj.mRealShow = true;
       return obj;
    }
    public final b$b C(RedDot p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mRoot;
       if (p0 == null) {
          return this.o;
       }
       b$b uob = this.g.get(p0.mTypeValue);
       if (uob == null) {
          uob = this.o;
       }
       return uob;
    }
    public final void D(a$a p0){
       RedDot redDot;
       boolean b;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "20")) {
          return;
       }
       if (!k1.g()) {
          k1.o(new q(this, p0));
          return;
       }else if(!this.f.containsKey(Integer.valueOf(p0.g))){
          Log.g(c.p, "redDot not exist type = "+p0.g);
          return;
       }else {
          redDot = this.f.get(Integer.valueOf(p0.g));
          if (redDot == null) {
             Log.g(c.p, "cacheDot为null，直接return");
             return;
          }else if(!q.f(redDot.mChildren)){
             Log.g(c.p, "receiveRedDot filtered not leaf");
             return;
          }else {
             c th = this.h;
             Objects.requireNonNull(th);
             Object obj = PatchProxy.applyTwoRefs(p0, redDot, th, b.class, "2");
             b = true;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(p0.h - redDot.mUpdateTime < 0 || !redDot.isShown()){
                StringBuilder str = "updateTime : ";
                boolean b1 = (p0.h - redDot.mUpdateTime < 0)? true: false;
                Log.g("MenuRedDotManager", str+b1+" receivedRedDot的type = "+p0.g);
             }else if(p0.i != null && p0.c - p0.d <= 0){
                Log.d("MenuRedDotManager", "showInMenubar cannot be true when count=0 receivedRedDot的type = "+p0.g);
             }else {
                th.a();
                if (th.c.contains(Integer.valueOf(p0.g)) && (!th.a.containsKey(Integer.valueOf(p0.g)) && b.h(p0) > 0)) {
                   Log.g("MenuRedDotManager", "not client type generate: "+redDot.mTypeValue);
                }else {
                   Iterator iterator = th.b.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().a(p0)) {
                            Log.g("MenuRedDotManager", "filter type: "+redDot.mTypeValue);
                         }
                      }else {
                         b = false;
                      }
                   }
                }
             }
             if (b) {
                Log.g(c.p, "receiveRedDot filtered");
                return;
             }else {
                RedDot redDot1 = redDot.cloneWithDotData();
                redDot.mUpdateTime = p0.h;
                redDot.mTotal = p0.c;
                redDot.mWaterline = p0.d;
                redDot.mUserId = p0.a;
                redDot.mShownInMenuBar = p0.i;
                redDot.mMenuBarShownCount = p0.k;
                redDot.mSpecial = p0.j;
                redDot.mExtParams = p0.f;
                redDot.mData = p0.e;
                if (!PatchProxy.applyVoidOneRefs(redDot, this, uoc, "22")) {
                   if (redDot.mSpecial != null) {
                      redDot.mPriority = 0;
                   }else if(this.i == null){
                      this.i = a.b(a.d);
                   }
                   c ti = this.i;
                   if (ti != null) {
                      Integer integer = ti.get(String.valueOf(redDot.mTypeValue));
                      if (integer != null) {
                         redDot.mPriority = integer.intValue();
                      }else {
                         redDot.mPriority = Integer.MAX_VALUE;
                      }
                   }
                }
                this.C(redDot).b(redDot, redDot1);
                return;
             }
          }
       }
    }
    public final boolean E(){
       Object obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!q.f(this.a) && s0.a(this.a, this.b))? true: false;
       return b;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       Log.g(c.p, "sendCacheReceiveRedDot");
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          a$a uoa = iterator.next();
          if (this.f.containsKey(Integer.valueOf(uoa.g))) {
             if (!uoa.a - this.m) {
                this.D(uoa);
             }
             iterator.remove();
          }else {
             Log.g(c.p, "reddot is not in mRedDots  type = "+uoa.g);
          }
       }
       return;
    }
    public void a(int p0){
       Iterator iterator;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "11")) {
          return;
       }
       if (!k1.g()) {
          k1.o(new p(this, p0));
          return;
       }else {
          Set set = this.e.get(Integer.valueOf(p0));
          int i = l.c(this.c(p0));
          if (!this.i(p0)) {
             i = 0;
          }
          if (set != null) {
             iterator = set.iterator();
             while (iterator.hasNext()) {
                iterator.next().onUpdate(p0, i);
                Log.g(c.p, "handler.onUpdate , type= "+p0+",redDotCount ="+i);
             }
          }else {
             Log.g(c.p, "typeHandlers = null , type = "+p0);
          }
          if (this.c.isEmpty()) {
             Log.g(c.p, "mGlobalTypeHandlers is empty");
          }else {
             iterator = this.c.iterator();
             while (iterator.hasNext()) {
                c uoc1 = iterator.next();
                Log.g(c.p, "GlobalTypeHandler = "+uoc1);
                uoc1.onUpdate(p0, i);
             }
          }
          return;
       }
    }
    public void b(String p0){
       c uoc = c.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, str)) {
          return;
       }
       if (!k1.g()) {
          k1.o(new r(this, p0));
          return;
       }else if(!TextUtils.n(this.l, p0)){
          if (!PatchProxy.applyVoid(null, this, uoc, "4")) {
             this.c.clear();
             this.e.clear();
             Log.g(c.p, "mTypeHandlers  clear");
             this.f.clear();
             this.g.clear();
             this.a.clear();
             this.b.clear();
             uoc = this.h;
             Objects.requireNonNull(uoc);
             if (!PatchProxy.applyVoid(null, uoc, b.class, str)) {
                b a = uoc.a;
                if (a != null) {
                   a.clear();
                   uoc.a = null;
                   uoc.a();
                }
             }
             this.k.clear();
             this.j.clear();
             uoc = this.i;
             if (uoc != null) {
                uoc.clear();
                this.i = null;
             }
          }
          this.l = p0;
          if (TextUtils.x(p0)) {
             this.m = 0;
             return;
          }else {
             try{
                this.m = Long.parseLong(this.l);
                Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a();
                }
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
    }
    public RedDot c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot != null) {
          return redDot.cloneWithDotData();
       }else {
          return null;
       }
    }
    public void d(int p0,RequestTiming p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "28")) {
          return;
       }
       this.z(p0, null, p1);
       return;
    }
    public void e(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "24")) {
          return;
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot != null && redDot.mRealShow != null) {
          if (!l.c(redDot) || redDot.mParent == null) {
             redDot.hide();
          }else {
             this.C(redDot).e(redDot);
             return;
          }
       }
       return;
    }
    public void f(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "10")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void g(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "26")) {
          return;
       }
       RedDot redDot = this.f.get(Integer.valueOf(p1));
       RedDot redDot1 = this.f.get(Integer.valueOf(p0));
       if (redDot1 == null) {
          return;
       }
       if (redDot == null) {
          this.p(p0, p1);
          return;
       }else {
          this.C(redDot).c(redDot1, redDot);
          return;
       }
    }
    public String h(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot != null) {
          try{
             return l.d(redDot);
          }catch(java.lang.Exception e0){
             return e0;
          }
       }else {
          goto label_002e ;
       }
    }
    public boolean i(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot == null) {
          return false;
       }else {
          return this.C(redDot).d(redDot);
       }
    }
    public b$b j(int p0,b$b p1){
       b$b obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoc, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.g.get(p0);
       if (obj != null) {
          return obj;
       }else {
          this.g.put(p0, p1);
          return p1;
       }
    }
    public void k(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "31")) {
          return;
       }
       try{
          RedDot redDot = this.f.get(Integer.valueOf(p1));
          if (redDot != null) {
             Log.g(c.p, p0+l.d(redDot));
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void l(int p0,int[] p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "14")) {
          return;
       }
       if (j.g(p1)) {
          return;
       }
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          this.p(p0, p1[i]);
       }
       return;
    }
    public void m(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "32")) {
          return;
       }
       String p = c.p;
       StringBuilder str = p0;
       RedDot redDot = this.f.get(Integer.valueOf(p1));
       String str1 = PatchProxy.applyOneRefs(redDot, null, l.class, "2");
       if (str1 != PatchProxyResult.class) {
       }else if(redDot == null || q.f(redDot.mChildren)){
          str1 = "";
       }else {
          JsonArray jsonArray = new JsonArray();
          jsonArray.G(l.a(redDot));
          Iterator iterator = redDot.mChildren.iterator();
          while (iterator.hasNext()) {
             jsonArray.G(l.a(iterator.next()));
          }
          str1 = jsonArray.toString();
       }
    }
    public void n(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "15")) {
          return;
       }
       this.b.add(Integer.valueOf(p0));
       String p = c.p;
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (!PatchProxy.applyVoidThreeRefs(p, "prepared: ", redDot, null, l.class, "8") && redDot != null) {
          a0.k(new j(redDot)).T(d.c).G(d.a).R(new k(p, "prepared: "), e.b);
       }
       if (this.E() && this.n != null) {
          this.F();
       }
       return;
    }
    public void o(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       String p = c.p;
       StringBuilder str = "receiveRedDot origin: ";
       String str1 = PatchProxy.applyOneRefs(p0, null, e.class, "7");
       if (str1 != PatchProxyResult.class) {
       }else if(p0 == null){
          str1 = "";
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("type", Integer.valueOf(p0.g));
          jsonObject.a0("count", Integer.valueOf(b.h(p0)));
          jsonObject.a0("time", Long.valueOf(p0.h));
          jsonObject.H("menu", Boolean.valueOf(p0.i));
          jsonObject.H("special", Boolean.valueOf(p0.j));
          jsonObject.a0("menuCount", Integer.valueOf(p0.k));
          if (!TextUtils.x(p0.f)) {
             jsonObject.c0("extParams", p0.f);
          }
          str1 = jsonObject.toString();
       }
       Log.g(p, str+str1);
       if (this.E() && (this.n == null || !this.f.containsKey(Integer.valueOf(p0.g)))) {
          Log.g(p, "receiveRedDot when has not inited ");
          this.j.add(p0);
          return;
       }else {
          this.D(p0);
          return;
       }
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       Log.g(c.p, "accept LaunchFinishEvent");
       if (this.n == null) {
          this.n = true;
          if (this.E()) {
             this.F();
          }
       }
       return;
    }
    public void p(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "13")) {
          return;
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot == null) {
          if (!e0.a) {
             u1.R("MenuRedDotManager", "parent "+p0+" not create", 13);
             return;
          }else {
             throw new IllegalStateException("父节点"+p0+"必须先创建");
          }
       }else {
          RedDot redDot1 = this.B(p1);
          if (redDot.mChildren == null) {
             redDot.mChildren = new ArrayList();
          }
          redDot.mChildren.add(redDot1);
          redDot1.mParent = redDot;
          redDot1.mRoot = redDot.mRoot;
          redDot1.mLevel = redDot.mLevel + 1;
          this.f.put(Integer.valueOf(p1), redDot1);
          return;
       }
    }
    public void q(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public void r(int p0,c p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "5")) {
          return;
       }
       Set set = this.e.get(Integer.valueOf(p0));
       if (set == null) {
          set = new HashSet();
          this.e.put(Integer.valueOf(p0), set);
       }
       set.add(p1);
       Log.g(c.p, "registerTypeHandler  type = "+p0+",handler = "+p1);
       return;
    }
    public void s(int p0,c p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "6")) {
          return;
       }
       Set set = this.e.get(Integer.valueOf(p0));
       if (set == null) {
          return;
       }
       set.remove(p1);
       Log.g(c.p, "unregisterTypeHandler  type = "+p0+",handler = "+p1);
       return;
    }
    public void t(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       if (p0 != null) {
          this.c.add(p0);
       }
       return;
    }
    public boolean u(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.contains(Integer.valueOf(p0));
    }
    public void v(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       if (p0 != null) {
          this.c.remove(p0);
       }
       return;
    }
    public void w(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "12")) {
          return;
       }
       RedDot redDot = this.B(p0);
       redDot.mRoot = redDot;
       this.a.add(Integer.valueOf(p0));
       this.f.put(Integer.valueOf(p0), redDot);
       return;
    }
    public void x(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "25")) {
          return;
       }
       RedDot redDot = this.f.get(Integer.valueOf(p0));
       if (redDot != null && redDot.mRealShow == null) {
          redDot.mRealShow = true;
       }
       return;
    }
    public void y(q$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "30")) {
          return;
       }
       c th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoidOneRefs(p0, th, b.class, "3")) {
          th.b.add(p0);
       }
       return;
    }
    public void z(int p0,List p1,RequestTiming p2){
       boolean b;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "29")) {
          return;
       }
       c th = this.h;
       Objects.requireNonNull(th);
       b uob = b.class;
       b = true;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, th, uob, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_003e :
             th.a();
             String str = "MenuRedDotManager";
             if (!th.c.contains(Integer.valueOf(p0))) {
                Log.b(str, "generateRedDot invalid: "+p0);
             }else {
                uob = th.a;
                if (uob != null && uob.containsKey(Integer.valueOf(p0))) {
                   ClientRedDotConfig uClientRedDo = th.a.get(Integer.valueOf(p0));
                   if (p0 == 1003) {
                      long str1 = 0;
                      long l = (uClientRedDo == null)? str1: uClientRedDo.mTime;
                      if (!l - str1 || (k1.i() - l) - b.d <= 0) {
                      label_009d :
                         b = false;
                      }
                   }else if(!q.f(p1)){
                      if (uClientRedDo != null && !q.f(uClientRedDo.mConfigs)) {
                         b = b ^ uClientRedDo.mConfigs.containsAll(p1);
                         Log.b(str, "old configs:"+uClientRedDo.mConfigs+" : new config "+p1);
                      }
                   }else {
                      Log.b(str, "generateRedDot already have: "+p0);
                      goto label_009d ;
                   }
                }
             }
          }
       }else {
          goto label_003e ;
       }
    label_00eb :
       if (!b) {
          Log.b(c.p, "generateRedDot failed: "+p0);
          return;
       }else if(this.k.contains(Integer.valueOf(p0))){
          Log.b(c.p, "client generate int request: "+p0);
          return;
       }else {
          this.k.add(Integer.valueOf(p0));
          b.a(0x4960f043).b(String.valueOf(p0), p2).map(new e()).subscribe(new o(this, p0, p1), new n(this, p0));
          return;
       }
    }
}
