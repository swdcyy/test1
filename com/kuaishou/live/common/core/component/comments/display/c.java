package com.kuaishou.live.common.core.component.comments.display.c;
import pe1.b;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import g81.c;
import lp3.e;
import java.lang.Object;
import java.util.LinkedList;
import androidx.collection.ArrayMap;
import android.os.Handler;
import android.os.Looper;
import pe1.v;
import com.kuaishou.live.common.core.component.comments.display.b;
import pe1.e;
import se1.a;
import g9c.a;
import xp5.g;
import lp3.i;
import java.lang.Class;
import lp3.c;
import re1.b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import pe1.a;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import ze1.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p81.d;
import com.kuaishou.live.comments.view.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.display.CommentMessageQueueType;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.comments.display.c$a;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Boolean;
import java.lang.Math;

public class c implements b	// class@001070
{
    public LiveCommentsFoldMessageConfig a;
    public b b;
    public final LinkedList c;
    public final LinkedList d;
    public final LinkedList e;
    public final LinkedList f;
    public final Map g;
    public int h;
    public long i;
    public long j;
    public int k;
    public final a l;
    public final Handler m;
    public final v n;
    public final Runnable o;
    public final Runnable p;
    public final c q;
    public boolean r;
    public final Activity s;
    public final User t;
    public boolean u;
    public d v;
    public a w;
    public final a x;

    public void c(Activity p0,User p1,c p2,e p3){
       super();
       this.c = new LinkedList();
       this.d = new LinkedList();
       this.e = new LinkedList();
       this.f = new LinkedList();
       this.g = new ArrayMap();
       this.h = 20;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.m = new Handler(Looper.getMainLooper());
       this.n = new v();
       this.o = new b(this);
       this.p = new e(this);
       this.r = true;
       this.x = new a();
       this.s = p0;
       this.t = p1;
       this.q = p2;
       this.l = p2.ia();
       if (p3 != null && !p3.a(g.class).e()) {
          this.b = new b(p3);
       }
       return;
    }
    public void E3(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.m.removeCallbacksAndMessages(null);
       return;
    }
    public void M3(LiveCommentsDisplayParams p0){
       a.e(this, p0);
    }
    public void N1(LiveCommentsFoldMessageConfig p0){
       this.a = p0;
    }
    public void a(a p0){
       this.w = p0;
    }
    public void b(){
       a.b(this);
    }
    public List c(){
       ArrayList obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.c);
       obj.addAll(this.d);
       if (this.l.Q0() != null) {
          obj.addAll(this.l.Q0());
       }
       return obj;
    }
    public void clear(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       this.c.clear();
       this.m.removeCallbacksAndMessages(objArray);
       this.d.clear();
       this.f.clear();
       this.e.clear();
       this.g.clear();
       this.a = objArray;
       this.q.ic(this.v);
       int itemCount = this.l.getItemCount();
       this.l.M0();
       if (itemCount > 0) {
          this.l.s0(0, itemCount);
       }
       return;
    }
    public void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "8")) {
          return;
       }
       b.c0(LiveLogTag.COMMENT, "startUpdate: ", "increasedMessagesCount", Integer.valueOf(p0));
       this.m.postDelayed(this.o, 0);
       return;
    }
    public void e(int p0,Collection p1){
       a.a(this, p0, p1);
    }
    public void f(CommentMessageQueueType p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       if (p0 != null && !q.f(p1)) {
          if (p0 == CommentMessageQueueType.GIFT) {
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                QLiveMessage qLiveMessage = iterator.next();
                if (qLiveMessage instanceof GiftMessage && !this.k(qLiveMessage)) {
                   iterator.remove();
                }
             }
          }
          if (this.g.get(p0) == null) {
             this.g.put(p0, new LinkedList());
          }
          LinkedList linkedList = this.g.get(p0);
          linkedList.addAll(p1);
          if (p0 != CommentMessageQueueType.OTHER) {
             Collections.sort(linkedList, new c$a(this));
          }
          if (linkedList.size() > 12) {
             this.j(linkedList, 12);
          }
       }
    label_006c :
       return;
    }
    public void g(List p0){
       a.d(this, p0);
    }
    public void h(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.c.addAll(p0);
       if (this.c.size() >= 64) {
          this.j(this.c, 32);
       }
       return;
    }
    public final QLiveMessage i(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj == null) {
          return objArray;
       }
       List list = obj.Q0();
       if (!q.f(list)) {
          objArray = list.get((list.size() - 1));
       }
       return objArray;
    }
    public final void j(List p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "19")) {
          return;
       }
       p0.clear();
       p0.addAll(new ArrayList(p0.subList((p0.size() - p1), (p0.size() - 1))));
       return;
    }
    public final boolean k(GiftMessage p0){
       boolean b = (this.r != null && p0.mShouldOnlyDisplayInSlot == null)? true: false;
       return b;
    }
    public void m2(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.r = p0;
       this.w4();
       return;
    }
    public void s2(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (p0 > 0) {
          b.c0(LiveLogTag.COMMENT, "setDisplayBatchSize", "batchSize", Integer.valueOf(p0));
          this.h = Math.min(p0, 60);
       }
       return;
    }
    public void w4(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.d(-1);
       return;
    }
}
