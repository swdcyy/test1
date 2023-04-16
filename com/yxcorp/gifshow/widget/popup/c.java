package com.yxcorp.gifshow.widget.popup.c;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import q07.d;
import p07.a;
import java.lang.Object;
import java.util.BitSet;
import java.util.HashMap;
import java.util.WeakHashMap;
import t07.b;
import t07.a;
import s07.b;
import com.yxcorp.gifshow.widget.popup.c$a;
import s07.b$c;
import android.app.Activity;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import android.os.Handler;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import androidx.collection.SimpleArrayMap;
import s07.b$b;
import java.util.Objects;
import kotlin.jvm.internal.a;
import p07.e;
import java.util.Set;
import java.util.Map;
import androidx.collection.ArrayMap;
import s07.b$a;
import s07.a;
import java.util.ArrayList;
import java.util.Queue;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.f;
import com.yxcorp.gifshow.widget.popup.b;
import com.yxcorp.gifshow.widget.popup.c$b;
import androidx.fragment.app.FragmentActivity;
import q07.b;
import kzc.g;
import android.os.Handler$Callback;
import java.lang.ref.WeakReference;
import s07.c;
import o07.b;
import android.os.Message;
import java.lang.RuntimeException;

public abstract class c implements PopupInterface$i, d	// class@0019a6
{
    public final BitSet a;
    public final b b;
    public final HashMap c;
    public final Map d;
    public final Map e;
    public Handler f;
    public boolean g;
    public final b h;
    public final a i;

    public void c(a p0){
       super();
       this.a = new BitSet();
       this.c = new HashMap(4);
       this.d = new WeakHashMap();
       this.e = new HashMap(4);
       this.i = p0;
       this.b = new b(p0.b());
       this.h = new b(new c$a(this));
    }
    public void a(Activity p0){
       Log.g("Popup#PopupPriorityManager", "onActivityDestroy "+this.i(p0));
       this.j().removeMessages(1, p0);
       List list = this.l(p0);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (uoc.K()) {
                uoc.o();
             }else {
                uoc.n();
             }
          }
       }
       this.c.remove(Integer.valueOf(p0.hashCode()));
       c th = this.h;
       Collection uCollection = th.b.get(p0);
       if (uCollection != null) {
          Iterator iterator1 = uCollection.iterator();
          while (iterator1.hasNext()) {
             b$b uob = iterator1.next();
             b$b a = uob.a;
             uob = uob.b;
             Objects.requireNonNull(a);
             a.p(uob, "observer");
             a.a();
             a.a.remove(uob);
          }
       }
       th.b.remove(p0);
       return;
    }
    public void b(Activity p0){
       this.q(p0);
    }
    public void c(Activity p0,c p1){
       this.o("dismiss", p1);
       this.d.remove(p1);
       this.b.c(p0, p1);
       this.p(2, p0, p1);
       this.t(p0);
       this.q(p0);
    }
    public void d(){
       Iterator iterator = this.b.b.keySet().iterator();
       while (iterator.hasNext()) {
          this.q(iterator.next());
       }
       return;
    }
    public void e(Activity p0,c p1){
       this.o("discard", p1);
       this.d.remove(p1);
       this.b.c(p0, p1);
       this.p(3, p0, p1);
       this.t(p0);
    }
    public final boolean f(Activity p0,c p1){
       int i;
       c th = this.h;
       e uoe = this.k(p1);
       Iterator iterator = th.b.values().iterator();
       while (true) {
          String str = null;
          if (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().iterator();
             do {
                if (iterator1.hasNext()) {
                }else {
                   continue ;
                }
             } while (iterator1.next().a.equals(uoe));
          }else {
             b$b uob = new b$b(str);
             uob.a = uoe;
             a uoa = new a(th, p0, uoe);
             Objects.requireNonNull(uoe);
             a.p(uoa, "observer");
             uoe.e();
             uoe.a.add(uoa);
             e b1 = uoe.b;
             if (b1 != null) {
                uoe.c(b1);
             }
             uob.b = uoa;
             List list1 = th.b.get(p0);
             if (list1 == null) {
                list1 = new ArrayList();
             }
             list1.add(uob);
             th.b.put(p0, list1);
          }
          Queue queue = this.b.a(p0);
          boolean b = false;
          c uoc = (p1.b.q != null && (q.f(queue) && (f.B() && !this.n(p0))))? 1: null;
          if (uoc) {
             this.b.b(p0, p1);
          }
          if (uoc || (this.g != null && (queue != null && queue.contains(p1)))) {
             if (p0 instanceof FragmentActivity) {
                c$b d = p1.b.D;
                if (d == null) {
                   i = c.E(p1) ^ 1;
                }else if(d == 1){
                   b = 1;
                }
                i = b;
                if (i) {
                   return b.a(p0, this);
                }
             }
             break ;
          }else {
             List list = this.l(p0);
             int i1 = this.i.d(p1, (this.r(b.a, list) ^ 1), q.f(list));
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 == 3) {
                      this.b.b(p0, p1);
                      this.q(p0);
                      str = "action_enqueue_and_show";
                   }
                }else {
                   this.b.b(p0, p1);
                   str = "action_enqueue";
                }
             }else {
                p1.n();
                str = "action_discard";
             }
             this.o("enqueuePopup#"+str, p1);
             return b;
          }
       }
       return 1;
    }
    public final void g(Activity p0,c p1){
    }
    public int getPriority(){
       return this.i.getPriority();
    }
    public final void h(Activity p0,c p1){
       this.o("show", p1);
       this.p(1, p0, p1);
    }
    public final String i(Activity p0){
       return "activity "+p0.getLocalClassName()+" hashCode "+p0.hashCode();
    }
    public boolean isValid(){
       return true;
    }
    public final Handler j(){
       c tf = this.f;
       if (tf != null) {
          return tf;
       }
       Handler handler = new Handler(new g(this));
       this.f = handler;
       return handler;
    }
    public e k(c p0){
       WeakReference weakReferenc = this.d.get(p0);
       e uoe = (weakReferenc != null && weakReferenc.get() != null)? weakReferenc.get(): null;
       if (uoe == null) {
          uoe = new c(p0.u());
          this.d.put(p0, new WeakReference(uoe));
       }
       return uoe;
    }
    public List l(Activity p0){
       Queue queue = this.b.a(p0);
       if (!q.f(queue)) {
          return new ArrayList(queue);
       }
       return null;
    }
    public final boolean m(Activity p0){
       return q.f(this.l(p0));
    }
    public final boolean n(Activity p0){
       if (p0.isFinishing()) {
          Log.n("Popup#PopupPriorityManager", "postShowQueue fail because activity "+p0+" is finishing!");
          return true;
       }else if(this.a.cardinality() > 0){
          Log.n("Popup#PopupPriorityManager", "postShowQueue disable by "+this.a);
          return true;
       }else {
          BitSet uBitSet = this.c.get(Integer.valueOf(p0.hashCode()));
          if (uBitSet == null || uBitSet.cardinality() <= 0) {
             return false;
          }
          Log.n("Popup#PopupPriorityManager", "postShowQueue disable Popup for Activity "+p0+" by reason: "+uBitSet);
          return true;
       }
    }
    public final void o(String p0,c p1){
       Log.g("Popup#PopupPriorityManager", p0+" "+this.i.c(p1)+" pageOwner "+this.k(p1).hashCode()+" "+this.i(p1.u()));
    }
    public final void p(int p0,Activity p1,c p2){
       if (this.e.isEmpty()) {
          return;
       }
       Iterator iterator = this.e.values().iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null && weakReferenc.get() != null) {
             b uob = weakReferenc.get();
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      continue ;
                   }else {
                      uob.e(p1, p2);
                   }
                }else {
                   uob.c(p1, p2);
                }
             }else {
                uob.h(p1, p2);
             }
          }
       }
       return;
    }
    public void q(Activity p0){
       if (this.m(p0)) {
          Log.n("Popup#PopupPriorityManager", "postShowQueue fail because activity "+p0+" queue is empty!");
          return;
       }else if(this.n(p0)){
          return;
       }else {
          Handler handler = this.j();
          handler.removeMessages(1, p0);
          handler.sendMessage(handler.obtainMessage(1, p0));
          return;
       }
    }
    public final boolean r(c$b p0,List p1){
       if (q.f(p1)) {
          return false;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (p0.a(iterator.next())) {
             break ;
          }
       }
       return true;
    }
    public final void s(b p0){
       if (!f.B()) {
          throw new RuntimeException("Must be called on the main thread!!!");
       }
       this.e.put(Integer.valueOf(p0.hashCode()), new WeakReference(p0));
       return;
    }
    public final void t(Activity p0){
       if (p0 instanceof FragmentActivity && !this.r(b.a, this.l(p0))) {
          b.c(p0, this, this.m(p0));
       }
       return;
    }
    public final void u(int p0){
       Log.g("Popup#PopupPriorityManager", "setDisablePopup "+p0);
       this.a.set(p0);
    }
    public final void v(int p0){
       Log.g("Popup#PopupPriorityManager", "setEnablePopup "+p0);
       this.a.clear(p0);
       if (!this.a.cardinality()) {
          this.d();
       }
       return;
    }
}
