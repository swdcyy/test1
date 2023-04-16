package com.kuaishou.live.common.core.component.comments.display.LiveCommentsDisplayControllerV2;
import pe1.b;
import com.kuaishou.live.common.core.component.comments.display.LiveCommentsDisplayControllerV2$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import g81.c;
import lp3.e;
import java.lang.Object;
import re1.v;
import re1.n;
import xp5.g;
import lp3.i;
import java.lang.Class;
import lp3.c;
import re1.b;
import xp5.e;
import java.lang.String;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import re1.u;
import com.kuaishou.live.common.core.component.comments.display.f;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import java.util.Objects;
import se1.c;
import ze1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.ArrayList;
import java.util.Collection;
import g9c.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import re1.q;
import ekd.q;
import com.kuaishou.live.basic.utils.b;
import com.kuaishou.live.common.core.component.comments.display.CommentMessageQueueType;
import java.util.LinkedList;
import java.util.Collections;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.common.core.component.comments.display.d;
import ok.o;
import re1.p;
import com.google.common.collect.ImmutableList;
import re1.s;
import java.util.Comparator;
import re1.t;
import java.lang.Math;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import pe1.i;
import com.google.common.base.Optional;
import qk.y;
import pe1.h;
import pe1.a;

public class LiveCommentsDisplayControllerV2 implements b	// class@00106c
{
    public boolean a;
    public final User b;
    public b c;
    public final f d;
    public final v e;
    public final u f;
    public final n g;
    public static final Type h;

    static {
       LiveCommentsDisplayControllerV2.h = new LiveCommentsDisplayControllerV2$1().getType();
    }
    public void LiveCommentsDisplayControllerV2(Activity p0,User p1,c p2,e p3){
       super();
       this.a = true;
       v ov = new v();
       this.e = ov;
       n on = new n();
       this.g = on;
       this.b = p1;
       if (p3 != null && !p3.a(g.class).e()) {
          this.c = new b(p3);
       }
       LiveCommentsDisplayParams liveComments = (p3 != null && p3.a(e.class).S7())? this.i("GRPR"): this.i("normal");
       LiveCommentsDisplayParams liveComments1 = liveComments;
       u ou = new u(liveComments1.mCachedCommonMaxNum);
       this.f = ou;
       f uof = new f(p0, p2, ov, ou, on, this.c, liveComments1);
       this.d = liveComments1.mCachedCommonMaxNum;
       return;
    }
    public void E3(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsDisplayControllerV2.class, "11")) {
          return;
       }
       this.d.f();
       return;
    }
    public void M3(LiveCommentsDisplayParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "13")) {
          return;
       }
       this.d.a = p0;
       return;
    }
    public void N1(LiveCommentsFoldMessageConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "1")) {
          return;
       }
       LiveCommentsDisplayControllerV2 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, n.class, "5")) {
          tg.b.d(p0);
       }
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "12")) {
          return;
       }
       this.g.c = p0;
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCommentsDisplayControllerV2.class, "8")) {
          return;
       }
       LiveCommentsDisplayControllerV2 tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, n.class, "6")) {
          n b = tg.b;
          Objects.requireNonNull(b);
          n obj = PatchProxy.apply(objArray, b, c.class, "5");
          boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): b.a.isEmpty();
          if (!b1) {
             obj = tg.a;
             if (obj % 2) {
                tg.a = obj + 1;
             }else {
                List list = tg.b.c();
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().mIsFoldMessage = true;
                   }
                }
                b = tg.c;
                if (b != null) {
                   b.b(list);
                   tg.b.a();
                }
             }
          }
       }
    label_0077 :
       return;
    }
    public List c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "5";
       ArrayList obj = PatchProxy.apply(objArray, this, LiveCommentsDisplayControllerV2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       LiveCommentsDisplayControllerV2 tf = this.f;
       Objects.requireNonNull(tf);
       ArrayList uArrayList = PatchProxy.apply(objArray, tf, u.class, "8");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList(tf.b);
       }
       obj.addAll(uArrayList);
       tf = this.d;
       Objects.requireNonNull(tf);
       Object[] objArray1 = PatchProxy.apply(objArray, tf, f.class, str);
       if (objArray1 != patchProxyRe) {
       }else {
          List list = tf.e.Q0();
          if (list != null) {
             objArray = new ArrayList(list);
          }
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          obj.addAll(objArray1);
       }
       return obj;
    }
    public void clear(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveCommentsDisplayControllerV2.class, "3")) {
          return;
       }
       LiveCommentsDisplayControllerV2 td = this.d;
       Objects.requireNonNull(td);
       String str = "4";
       if (!PatchProxy.applyVoid(objArray, td, f.class, str)) {
          LiveLogTag cOMMENT = LiveLogTag.COMMENT;
          b.Z(cOMMENT, "updateComments, clear");
          td.f();
          td.o = false;
          int itemCount = td.e.getItemCount();
          td.e.M0();
          if (itemCount > 0 && td.e.f == null) {
             b.Z(cOMMENT, "updateComments, clear, notifyItemRangeRemoved");
             td.e.s0(false, itemCount);
          }
       }
       td = this.e;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, v.class, str)) {
          td.a.clear();
       }
       td = this.f;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, u.class, "6")) {
          td.a("clear");
          td.b.clear();
       }
       td = this.g;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, n.class, "2")) {
          td.b.a();
       }
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(LiveCommentsDisplayControllerV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveCommentsDisplayControllerV2.class, "10")) {
          return;
       }
       this.d.e();
       return;
    }
    public void e(int p0,Collection p1){
       LiveCommentsDisplayControllerV2 liveComments = LiveCommentsDisplayControllerV2.class;
       if (PatchProxy.isSupport(liveComments) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveComments, "6")) {
          return;
       }
       liveComments = this.f;
       Objects.requireNonNull(liveComments);
       u ou = u.class;
       if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, liveComments, ou, "3")) {
          u c = liveComments.c;
          Objects.requireNonNull(c);
          q oq = q.class;
          if (!PatchProxy.isSupport(oq) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, c, oq, "1") || (!q.f(p1) && p0 > 0))) {
             c.c = p0;
             ArrayList uArrayList = new ArrayList(p1);
             c.b = uArrayList;
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                b.c(iterator.next(), q.d, true);
             }
          }
       }
       return;
    }
    public void f(CommentMessageQueueType p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommentsDisplayControllerV2.class, "7")) {
          return;
       }
       if (p0 != null && !q.f(p1)) {
          if (p0 == CommentMessageQueueType.GIFT) {
             this.j(p1);
          }
          LiveCommentsDisplayControllerV2 tg = this.g;
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, tg, n.class, "1")) {
             n b = tg.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, b, c.class, "1")) {
                LinkedList linkedList = b.a.get(p0);
                if (linkedList == null) {
                   linkedList = new LinkedList();
                   b.a.put(p0, linkedList);
                }
                linkedList.addAll(p1);
             }
          }
       }
    label_0050 :
       return;
    }
    public void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "2")) {
          return;
       }
       LiveCommentsDisplayControllerV2 tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(p0, tf, u.class, "1")) {
          if (p0 == null) {
             p0 = Collections.emptyList();
          }
          tf.d = p0;
       }
       return;
    }
    public void h(Collection p0){
       int b3;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "4")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.j(p0);
       ArrayList uArrayList = new ArrayList();
       m.s(p0).p(d.b).n(uArrayList);
       p0.removeAll(uArrayList);
       LiveCommentsDisplayControllerV2 te = this.e;
       Objects.requireNonNull(te);
       v ov = v.class;
       if (!PatchProxy.applyVoidOneRefs(uArrayList, te, ov, "1")) {
          te.a.addAll(uArrayList);
          v a1 = te.a;
          int i2 = 50;
          if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidTwoRefs(a1, Integer.valueOf(i2), te, ov, "5")) {
             while (a1.size() > i2) {
                a1.remove(0);
             }
          }
       }
       LiveCommentsDisplayControllerV2 tf = this.f;
       Objects.requireNonNull(tf);
       q oq = q.class;
       u ou = u.class;
       String str = "2";
       if (!PatchProxy.applyVoidOneRefs(p0, tf, ou, str) && !q.f(p0)) {
          u c = tf.c;
          u b = tf.b;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(b, c, oq, str)) {
             ImmutableList immutableLis = m.s(b).p(new p(c)).B();
             if (!q.f(immutableLis)) {
                c.a = b.indexOf(immutableLis.get(0));
                c.b.addAll(0, immutableLis);
                b.removeAll(immutableLis);
             }
          }
          tf.b.addAll(p0);
          u b1 = tf.b;
          if (!PatchProxy.applyVoidOneRefs(b1, tf, ou, "9")) {
             tf.a("sortMessagesByRelationAndTag");
             Collections.sort(b1, new s(tf));
          }
          b1 = tf.b;
          u a = tf.a;
          if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidTwoRefs(b1, Integer.valueOf(a), tf, ou, "12")) {
             while (b1.size() > a) {
                int i1 = b1.size() - 1;
                b1.remove(i1);
             }
          }
          b1 = tf.b;
          if (!PatchProxy.applyVoidOneRefs(b1, tf, ou, "11")) {
             Collections.sort(b1, t.b);
          }
          b1 = tf.c;
          u b2 = tf.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoidOneRefs(b2, b1, oq, "3")) {
             Object obj = PatchProxy.apply(null, b1, oq, "5");
             if (obj != PatchProxyResult.class) {
                b3 = obj.booleanValue();
             }else if(!q.f(b1.b) && b1.c > null){
                b3 = true;
             }else {
                b3 = false;
             }
             if (b3) {
                oq = b1.a;
                while (!q.f(b1.b) && b2.size() >= oq) {
                   b2.add(oq, b1.b.remove(0));
                   int i = b1.c + 1;
                   b3 = oq + i;
                }
                b1.a = Math.max(0, (oq - b2.size()));
             }
          }
       }
    label_0165 :
       return;
    }
    public final LiveCommentsDisplayParams i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.y(a.t().u("SOURCE_LIVE").getValue("liveCommentsDisplayConfig", LiveCommentsDisplayControllerV2.h, new ArrayList()), new i(p0)).or(LiveCommentsDisplayParams.createDefaultParams());
    }
    public final void j(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCommentsDisplayControllerV2.class, "14")) {
          return;
       }
       y.q(p0, new h(this));
       return;
    }
    public void m2(boolean p0){
       this.a = p0;
    }
    public void s2(int p0){
       a.c(this, p0);
    }
    public void w4(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsDisplayControllerV2.class, "9")) {
          return;
       }
       this.d.e();
       return;
    }
}
