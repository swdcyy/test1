package com.yxcorp.gifshow.bubble.PostBubbleManager;
import java.util.HashSet;
import java.util.HashMap;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.bubble.PostBubbleManager$a;
import android.os.Looper;
import java.util.Map;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.bubble.PostBubbleManager$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager$LifeCycleObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra9.c;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.bubble.c;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.Iterator;
import com.yxcorp.gifshow.bubble.a;
import lnc.l3;
import java.lang.StringBuilder;
import q87.c;
import ra9.f;
import com.yxcorp.gifshow.bubble.PostBubbleManager$b;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.util.Set;
import ra9.d;
import ra9.e;
import android.os.Handler;
import android.os.Message;

public class PostBubbleManager	// class@001c72
{
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public b e;
    public FragmentActivity f;
    public final List g;
    public final List h;
    public final Set i;
    public a j;
    public int k;
    public final Handler l;
    public static final Set m;
    public static final Map n;

    static {
       PostBubbleManager.m = new HashSet();
       PostBubbleManager.n = new HashMap();
    }
    public void PostBubbleManager(Fragment p0){
       super();
       this.b = true;
       this.c = true;
       this.d = 2;
       this.e = null;
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new HashSet();
       this.l = new PostBubbleManager$a(this, Looper.myLooper());
       PostBubbleManager.n.put(p0, this);
       this.f = p0.getActivity();
       p0.getLifecycle().addObserver(new PostBubbleManager$2(this, p0, p0.getLifecycle(), p0));
    }
    public void PostBubbleManager(GifshowActivity p0){
       super();
       this.b = true;
       this.c = true;
       this.d = 2;
       this.e = null;
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new HashSet();
       this.l = new PostBubbleManager$a(this, Looper.myLooper());
       PostBubbleManager.n.put(p0, this);
       this.f = p0;
       p0.getLifecycle().addObserver(new PostBubbleManager$LifeCycleObserver(this, p0, p0.getLifecycle()));
    }
    public static PostBubbleManager d(Fragment p0){
       PostBubbleManager obj = PatchProxy.applyOneRefs(p0, null, PostBubbleManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PostBubbleManager.n.get(p0);
       if (obj == null) {
          obj = new PostBubbleManager(p0);
       }
       return obj;
    }
    public static PostBubbleManager e(GifshowActivity p0){
       PostBubbleManager obj = PatchProxy.applyOneRefs(p0, null, PostBubbleManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PostBubbleManager.n.get(p0);
       if (obj == null) {
          obj = new PostBubbleManager(p0);
       }
       return obj;
    }
    public static boolean k(c p0,int p1){
       PostBubbleManager postBubbleMa = PostBubbleManager.class;
       if (PatchProxy.isSupport(postBubbleMa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, postBubbleMa, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0.getMode() == 2 || p0.getMode() == p1)? true: false;
       return b;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, PostBubbleManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.h.isEmpty() || y.c(this.h, c.b))? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PostBubbleManager.class, "16")) {
          return;
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa.d().isBlockedByOthersBeforeShowing() && this.d == uoa.d().getMode()) {
             Object[] objArray = new Object[0];
             l3.C().w("PostBubbleManager", "remove "+uoa.d().name(), objArray);
             iterator.remove();
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PostBubbleManager.class, "9")) {
          return;
       }
       PostBubbleManager tj = this.j;
       if (tj != null) {
          tj.dismiss();
          this.j = null;
       }
       return;
    }
    public a f(){
       boolean b;
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, PostBubbleManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g.iterator();
       while (obj.hasNext()) {
          a uoa = obj.next();
          Object obj1 = PatchProxy.applyOneRefs(uoa, this, PostBubbleManager.class, "14");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(PostBubbleManager.k(uoa.d(), this.d) && (uoa.c() && (uoa.d().couldShow() && (uoa.d().isBlockedByOthersBeforeShowing() && (!this.j() || (this.j() && this.a())))))){
             b = true;
          }else {
             b = false;
          }
          if (b && (objArray == null || uoa.d().getPriority() < objArray.d().getPriority())) {
             objArray = uoa;
          }
       }
       return objArray;
    }
    public int g(){
       return this.d;
    }
    public a h(){
       return this.j;
    }
    public c i(){
       Object[] objArray = null;
       PostBubbleManager obj = PatchProxy.apply(objArray, this, PostBubbleManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj != null) {
          objArray = obj.d();
       }
       return objArray;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, PostBubbleManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return y.c(this.h, new f(this));
    }
    public final void l(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       l3.C().w("PostBubbleManager", "realShow "+p0.d().name(), objArray);
       if (p0.i(this.f, new PostBubbleManager$b(this, p0))) {
          this.j = p0;
          this.h.add(p0);
          if (this.j.d().isBlockedAfterShowingSelf()) {
             this.b();
          }
       }else {
          this.r(p0);
       }
       return;
    }
    public void m(PostBubbleManager$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager.class, "7")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void n(a p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = 0;
       if (y.c(this.g, new d(p0))) {
          objArray = new Object[i];
          l3.C().w("PostBubbleManager", "same bubble already in request list "+p0.d().name(), objArray);
          return;
       }else if(p0.d().isBlockedByOthersBeforeShowing() && y.c(this.h, new e(p0))){
          objArray = new Object[i];
          l3.C().w("PostBubbleManager", "same bubble already showed "+p0.d().name(), objArray);
          return;
       }else if(p0.d().isBlockedByOthersBeforeShowing() && !this.a()){
          objArray = new Object[i];
          l3.C().w("PostBubbleManager", "same mode bubble already showed "+p0.d().name(), objArray);
          return;
       }else {
          objArray = new Object[i];
          l3.C().w("PostBubbleManager", "requestShowBubble "+p0.d().name(), objArray);
          this.g.add(p0);
          this.r(this.j);
          return;
       }
    }
    public void o(boolean p0){
       PostBubbleManager postBubbleMa = PostBubbleManager.class;
       if (PatchProxy.isSupport(postBubbleMa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, postBubbleMa, "4")) {
          return;
       }
       this.b = p0;
       if (p0) {
          this.r(this.j);
       }
       return;
    }
    public void p(int p0){
       PostBubbleManager postBubbleMa = PostBubbleManager.class;
       if (PatchProxy.isSupport(postBubbleMa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, postBubbleMa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       l3.C().w("PostBubbleManager", "setCurrentMode "+p0, objArray);
       this.d = p0;
       PostBubbleManager tj = this.j;
       if (tj != null && !PostBubbleManager.k(tj.d(), this.d)) {
          tj = this.j;
          if (tj != null && tj.d().isAutoDismissWhenPageStop()) {
             this.c();
          }
       }
       this.r(this.j);
       return;
    }
    public void q(boolean p0){
       this.c = p0 ^ 0x01;
    }
    public void r(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostBubbleManager.class, "11")) {
          return;
       }
       this.g.remove(p0);
       int i = 1;
       if (this.l.hasMessages(i)) {
          this.l.removeMessages(i);
       }
       PostBubbleManager tl = this.l;
       tl.sendMessage(tl.obtainMessage(i));
       return;
    }
}
