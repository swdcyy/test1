package com.kuaishou.live.common.core.component.comments.display.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.display.c;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.app.Activity;
import d61.y;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import com.kuaishou.live.basic.model.QLiveMessage;
import va1.a0;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import pe1.v;
import java.util.Map;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.util.List;
import pe1.f;
import ekd.k1;
import u07.t$a;
import java.lang.CharSequence;
import pe1.d;
import u07.u;
import u07.t;
import u07.j;
import pe1.g;
import e17.i;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.comments.view.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import se1.a;
import ze1.a;
import java.lang.Integer;
import re1.b;
import pe1.c;
import p81.d;
import com.kuaishou.live.common.core.component.comments.display.a;
import java.lang.Iterable;
import ok.o;
import qk.y;

public final class b implements Runnable	// class@00106e
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       boolean i1;
       QLiveMessage mId;
       ArrayList obj1;
       c l2;
       List obj3;
       boolean b4;
       b b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uoc, "10")) {
       }else {
          b.m.removeCallbacks(b.o);
          if (!y.d(b.s)) {
             boolean b1 = true;
             int i = 0;
             if (!PatchProxy.applyVoid(objArray, b, uoc, "13") && !q.f(b.c)) {
                obj1 = new ArrayList();
                Iterator iterator3 = b.c.iterator();
                while (iterator3.hasNext()) {
                   QLiveMessage qLiveMessage4 = iterator3.next();
                   c t = b.t;
                   Object obj4 = PatchProxy.applyTwoRefs(qLiveMessage4, t, objArray, a0.class, "6");
                   if (obj4 != patchProxyRe) {
                      i1 = obj4.booleanValue();
                   }else if(qLiveMessage4 != null && (qLiveMessage4.getUser() != null && (t != null && (t.mId).equals(qLiveMessage4.getUser().mId)))){
                      i1 = true;
                   }else {
                      i1 = false;
                   }
                   if (i1) {
                      qLiveMessage4.setLiveAssistantType(LiveApiParams$AssistantType.PUSHER.ordinal());
                   }
                   if (!qLiveMessage4 instanceof CommentMessage || (a0.g(qLiveMessage4) || qLiveMessage4 instanceof SystemNoticeMessage)) {
                      t = b.n;
                      mId = qLiveMessage4.mId;
                      Objects.requireNonNull(t);
                      Object obj5 = PatchProxy.applyOneRefs(mId, t, v.class, "3");
                      i1 = (obj5 != patchProxyRe)? obj5.booleanValue(): t.a.containsKey(mId);
                      if (!i1) {
                         b.e.add(qLiveMessage4);
                      }
                   }
                   if (qLiveMessage4 instanceof GiftMessage && !b.k(qLiveMessage4)) {
                      continue ;
                   }else {
                      obj1.add(qLiveMessage4);
                   }
                }
                b.d.addAll(obj1);
                if (b.d.size() >= 64) {
                   b.j(b.d, 32);
                }
                b.c.clear();
             }
             QLiveMessage obj = PatchProxy.apply(objArray, b, uoc, "14");
             boolean b2 = (obj != patchProxyRe)? obj.booleanValue(): b.e.isEmpty() ^ b1;
             long l = 2000;
             i1 = 2;
             if (b2) {
                if (!PatchProxy.applyVoid(objArray, b, uoc, "15")) {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = b.e.iterator();
                   while (iterator.hasNext()) {
                      QLiveMessage qLiveMessage = iterator.next();
                      if (qLiveMessage instanceof CommentMessage && a0.g(qLiveMessage)) {
                         obj = qLiveMessage.mId;
                         b.n.a(obj);
                         k1.s(new f(b, obj), b, l);
                      }else if(qLiveMessage instanceof SystemNoticeMessage){
                         SystemNoticeMessage systemNotice = qLiveMessage.cast();
                         SystemNoticeMessage mDisplayType = systemNotice.mDisplayType;
                         if (mDisplayType == i1) {
                            t$a uoa = new t$a(b.s);
                            uoa.X0(systemNotice.mTitle);
                            uoa.z0(systemNotice.mContent);
                            uoa.S0(R.string.arg_RES_7f103a83);
                            uoa.u0(new d(b, systemNotice));
                            j.d(uoa);
                         }else if(mDisplayType == b1){
                            if (systemNotice.mDisplayDuration - null > 0) {
                               mId = systemNotice.mId;
                               b.n.a(mId);
                               k1.s(new g(b, mId), b, systemNotice.mDisplayDuration);
                            }
                         }else if(mDisplayType == 3){
                            i.d(R.style.arg_RES_7f11066a, systemNotice.mContent);
                         }
                         systemNotice = 1;
                      label_01a3 :
                         if (!b2) {
                            uArrayList.add(qLiveMessage);
                         }
                      }
                      b2 = 0;
                      goto label_01a3 ;
                   }
                   if (uArrayList.size() > 0) {
                      b.l.L0(uArrayList);
                      b.l.k0();
                      b.q.If(b1);
                   }
                   b.e.clear();
                }
             }else if(b.n.b()){
                b.Z(LiveLogTag.COMMENT, "fireRefresh, hasNewSystemNotice");
             }else {
                long l1 = 1600;
                if (b.q.Zb()) {
                   b.m.postDelayed(b.o, l1);
                   b.Z(LiveLogTag.COMMENT, "fireRefresh, isCommentsListInTouching");
                }else {
                   obj1 = PatchProxy.apply(objArray, b, uoc, "17");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else if(b.l.getItemCount() >= 150){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   if (b2) {
                      if (!PatchProxy.applyVoid(objArray, b, uoc, "18")) {
                         int i2 = 100;
                         if (b.l.getItemCount() > i2) {
                            l2 = b.l;
                            l2.U0(i, (l2.getItemCount() - i2));
                            b.l.k0();
                         }
                      }
                      b.m.postDelayed(b.o, 200);
                   }else {
                      long l3 = System.currentTimeMillis() - b.i;
                      if (l3 - l1 < 0) {
                         b.m.postDelayed(b.o, (l1 - l3));
                      }else {
                         String str = "size";
                         if (!(b.k % i1) && !PatchProxy.applyVoid(objArray, b, uoc, "20")) {
                            b.Z(LiveLogTag.COMMENT, "fireUpdateFoldMessageQueue, begin");
                            obj3 = b.x.a(b.a, b.g, 6);
                            b.f.clear();
                            Iterator iterator1 = obj3.iterator();
                            while (iterator1.hasNext()) {
                               iterator1.next().mIsFoldMessage = b1;
                            }
                            c w = b.w;
                            if (w != null) {
                               w.b(obj3);
                            }else {
                               b.f.addAll(obj3);
                            }
                            Iterator iterator2 = b.g.values().iterator();
                            while (iterator2.hasNext()) {
                               iterator2.next().clear();
                            }
                            LiveLogTag cOMMENT = LiveLogTag.COMMENT;
                            w = b.f;
                            int i3 = (w == null)? 0: w.size();
                            b.c0(cOMMENT, "fireUpdateFoldMessageQueue, end", str, Integer.valueOf(i3));
                         }
                         b.k = b.k + b1;
                         c obj2 = PatchProxy.apply(objArray, b, uoc, "16");
                         if (obj2 != patchProxyRe) {
                            b1 = obj2.booleanValue();
                         }else if(q.f(b.d) && q.f(b.f)){
                            b1 = false;
                         }else {
                            obj2 = b.h;
                            LinkedList linkedList = new LinkedList();
                            while (!b.d.isEmpty()) {
                               QLiveMessage qLiveMessage1 = b.d.pollLast();
                               if (a0.g(qLiveMessage1)) {
                                  linkedList.addFirst(qLiveMessage1);
                               }else if(obj2 > 0){
                                  linkedList.addFirst(qLiveMessage1);
                                  i = obj2 - 1;
                               }
                            }
                            if (!q.f(linkedList)) {
                               obj2 = b.b;
                               if (obj2 != null) {
                                  List list = PatchProxy.apply(objArray, b, uoc, "22");
                                  if (list != patchProxyRe) {
                                  }else {
                                     list = b.l.Q0();
                                  }
                                  obj2.a(list, linkedList);
                               }
                            }
                            b.c0(LiveLogTag.COMMENT, "showComments", str, Integer.valueOf(linkedList.size()));
                            if (!q.f(b.f)) {
                               QLiveMessage qLiveMessage2 = b.f.poll();
                               c b3 = b.b;
                               if (b3 != null) {
                                  b3.b(qLiveMessage2);
                               }
                               linkedList.add(qLiveMessage2);
                               obj3 = PatchProxy.apply(objArray, b, uoc, "21");
                               if (obj3 != patchProxyRe) {
                                  b4 = obj3.booleanValue();
                               }else {
                                  QLiveMessage qLiveMessage3 = b.i();
                                  b4 = (qLiveMessage3 != null && (qLiveMessage3.mIsFoldMessage != null && (System.currentTimeMillis() - b.j) - 2000 < 0))? true: false;
                               }
                               if (b4 && b.l.getItemCount() > 0) {
                                  l2 = b.l;
                                  l2.S0((l2.getItemCount() - b1));
                               }
                               b.l.L0(linkedList);
                               b.j = System.currentTimeMillis();
                            }else {
                               b.l.L0(linkedList);
                            }
                            b.l.k0();
                            b.q.If(false);
                         }
                         if (b1) {
                            b.i = System.currentTimeMillis();
                            b.m.postDelayed(b.o, l1);
                            b.m.removeCallbacks(b.p);
                            if (!q.f(b.f)) {
                               b.u = false;
                               if (!PatchProxy.applyVoid(objArray, b, uoc, "11") && b.v == null) {
                                  l2 = new c(b);
                                  b.v = l2;
                                  b.q.ho(l2);
                               }
                            }
                         }else if(y.c(b.g.values(), a.b)){
                            b.m.postDelayed(b.o, l1);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0409 :
       return;
    }
}
