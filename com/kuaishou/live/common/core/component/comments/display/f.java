package com.kuaishou.live.common.core.component.comments.display.f;
import android.app.Activity;
import g81.c;
import re1.v;
import re1.u;
import re1.n;
import re1.b;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import java.lang.Object;
import pe1.v;
import com.kuaishou.live.common.core.component.comments.display.f$c;
import com.kuaishou.live.common.core.component.comments.display.f$a;
import com.kuaishou.live.common.core.component.comments.display.f$b;
import g9c.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$a;
import com.kuaishou.live.comments.view.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$ScrollSpeed;
import androidx.recyclerview.widget.RecyclerView;
import pe1.s;
import androidx.recyclerview.widget.RecyclerView$r;
import q81.e;
import java.util.Objects;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import d61.y;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import u07.t$a;
import java.lang.CharSequence;
import u07.t;
import u07.j;
import java.lang.Math;
import pe1.t;
import e17.i;
import java.lang.Integer;
import pe1.u;
import se1.c;
import re1.q;
import com.yxcorp.utility.SystemUtil;
import j51.a;

public class f	// class@001077
{
    public LiveCommentsDisplayParams a;
    public final Activity b;
    public final v c;
    public final c d;
    public final a e;
    public final v f;
    public final u g;
    public final n h;
    public final b i;
    public final Runnable j;
    public final Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public int q;
    public int r;
    public final e s;
    public final RecyclerView$r t;

    public void f(Activity p0,c p1,v p2,u p3,n p4,b p5,LiveCommentsDisplayParams p6){
       super();
       this.c = new v();
       this.j = new f$c(this);
       this.k = new Object();
       this.s = new f$a(this);
       this.t = new f$b(this);
       this.b = p0;
       this.d = p1;
       this.e = p1.ia();
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       if (PatchProxy.applyVoidTwoRefs(p0, p6, this, f.class, "1")) {
       }else {
          p1.db(new LiveCommentLinearLayoutManager$a(true, n.c(p0, (float)p6.mFastScrollSpeedDp), n.c(p0, (float)p6.mSlowScrollSpeedDp)));
       }
       this.a = p6;
       b.c0(LiveLogTag.COMMENT, "updateComments, LiveCommentsFetchController", "mLiveCommentDisplayParams", p6.toString());
       return;
    }
    public void a(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "6")) {
          return;
       }
       boolean b = (this.m != null || this.n == null)? true: false;
       if (this.o != b) {
          this.o = b;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uof, "7")) {
             b.f0(LiveLogTag.COMMENT, "updateComments, notifyCommentsViewLivingStatusChanged", "mIsCommentsViewTouching", Boolean.valueOf(this.m), "mIsCommentsViewIdle", Boolean.valueOf(this.n), "isLiving", Boolean.valueOf(b), "mUpdateDelayMs", Long.valueOf(this.p));
             if (!b) {
                uof = this.p;
                if (uof > 0) {
                   this.c(uof);
                   this.p = 0;
                }
             }
          }
       }
       return;
    }
    public final void b(QLiveMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "10")) {
          return;
       }
       f ti = this.i;
       if (ti != null) {
          ti.b(p0);
       }
       return;
    }
    public final void c(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "14")) {
          return;
       }
       k1.m(this.j);
       k1.s(this.j, this.k, p0);
       return;
    }
    public final void d(long p0,LiveCommentLinearLayoutManager$ScrollSpeed p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uof, "13")) {
          return;
       }
       b.c0(LiveLogTag.COMMENT, "updateComments, scrollToBottomThenDelayUpdate", "delayMs", Long.valueOf(p0));
       s os = new s(this, this.d.vk(), p1, p0);
       k1.p(uof, this.k);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       if (this.l == null) {
          b.Z(LiveLogTag.COMMENT, "updateComments, startUpdate");
          this.l = true;
          this.d.vk().addOnScrollListener(this.t);
          this.d.sm(this.s);
          this.g();
       }
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "3")) {
          return;
       }
       k1.n(this);
       k1.n(this.k);
       this.d.vk().removeOnScrollListener(this.t);
       this.d.wf(this.s);
       if (this.l != null) {
          b.Z(LiveLogTag.COMMENT, "updateComments, stopUpdate");
          this.l = false;
          f tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, v.class, "4")) {
             tc.a.clear();
          }
       }
       return;
    }
    public void g(){
       int b;
       Object[] obj1;
       boolean b1;
       f g;
       boolean b3;
       long l2;
       f e1;
       String str2;
       LiveCommentLinearLayoutManager$ScrollSpeed sLOW;
       f a;
       ArrayList uArrayList;
       ArrayList obj4;
       QLiveMessage mId;
       int i = this;
       u ou = u.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, i, uof, "8")) {
          return;
       }
       if (i.l == null) {
          b.Z(LiveLogTag.COMMENT, "updateComments, mEnableUpdateÎªfalse£¬return");
          return;
       }else {
          long l = 1000;
          if (y.d(i.b)) {
             i.c(l);
             return;
          }else {
             long l1 = 100;
             boolean i1 = 0;
             if (i.o != null) {
                b.Z(LiveLogTag.COMMENT, "updateComments, mCommentsViewIsLivingÎªtrue, return");
                i.q = i1;
                i.p = l1;
                return;
             }else if(i.c.b()){
                b.Z(LiveLogTag.COMMENT, "updateComments, hasNewSystemNotice£¬return");
                i.q = i1;
                return;
             }else {
                Object obj = PatchProxy.apply(objArray, i, uof, "16");
                int i2 = 1;
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(i.e.getItemCount() >= 150){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   i.q = i1;
                   if (!PatchProxy.applyVoid(objArray, i, uof, "17") && i.e.getItemCount() > 100) {
                      f e = i.e;
                      e.U0(i1, (e.getItemCount() - 100));
                      i.e.k0();
                   }
                   i.c(l1);
                   return;
                }else {
                   b = i.d.ga() ^ i2;
                   v ov = v.class;
                   String str = "3";
                   if (PatchProxy.isSupport(uof)) {
                      obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b), i, uof, "15");
                      if (obj1 != patchProxyRe) {
                         b1 = obj1.booleanValue();
                      }else {
                      label_00bd :
                         a = i.f;
                         Objects.requireNonNull(a);
                         f obj5 = PatchProxy.apply(objArray, a, ov, str);
                         boolean b5 = (obj5 != patchProxyRe)? obj5.booleanValue(): q.f(a.a) ^ i2;
                         if (b5) {
                            ArrayList uArrayList2 = new ArrayList();
                            obj5 = i.f;
                            Objects.requireNonNull(obj5);
                            obj4 = PatchProxy.apply(objArray, obj5, ov, "2");
                            if (obj4 != patchProxyRe) {
                            }else {
                               obj4 = new ArrayList(obj5.a);
                               obj5.a.clear();
                            }
                            Iterator iterator2 = obj4.iterator();
                            while (iterator2.hasNext()) {
                               QLiveMessage qLiveMessage5 = iterator2.next();
                               if (qLiveMessage5 instanceof SystemNoticeMessage) {
                                  SystemNoticeMessage systemNotice = qLiveMessage5.cast();
                                  SystemNoticeMessage mDisplayType = systemNotice.mDisplayType;
                                  if (mDisplayType == 2) {
                                     t$a uoa = new t$a(i.b);
                                     uoa.X0(systemNotice.mTitle);
                                     uoa.z0(systemNotice.mContent);
                                     uoa.S0(R.string.arg_RES_7f103a83);
                                     j.d(uoa);
                                  }else if(mDisplayType == i2){
                                     SystemNoticeMessage mDisplayDura = systemNotice.mDisplayDuration;
                                     long l3 = 500;
                                     if (mDisplayDura - l3 < 0) {
                                        b.c0(LiveLogTag.COMMENT, "updateComments, warning", "notice.mDisplayDuration", Long.valueOf(mDisplayDura));
                                     }
                                     mId = systemNotice.mId;
                                     i.c.a(mId);
                                     t ot = new t(i, mId);
                                     k1.s(ot, i.k, Math.max(systemNotice.mDisplayDuration, l3));
                                  }else if(mDisplayType == 3){
                                     i.d(R.style.arg_RES_7f11066a, systemNotice.mContent);
                                  }else {
                                     b.d0(LiveLogTag.COMMENT, "SystemNoticeMessage displayType is error", "mDisplayType", Integer.valueOf(mDisplayType), "mContent", systemNotice.mContent);
                                  }
                                  sLOW = 1;
                               label_019a :
                                  if (!sLOW) {
                                     uArrayList2.add(qLiveMessage5);
                                  }
                                  i2 = 1;
                               }else {
                                  mId = qLiveMessage5.mId;
                                  i.c.a(mId);
                                  u ou1 = new u(i, mId);
                                  k1.s(ou1, i.k, 2000);
                               }
                               mId = 0;
                               goto label_019a ;
                            }
                            if (uArrayList2.size() > 0) {
                               g = i.d;
                               LiveCommentLinearLayoutManager$ScrollSpeed iMMEDIATELY = (b)? LiveCommentLinearLayoutManager$ScrollSpeed.IMMEDIATELY: LiveCommentLinearLayoutManager$ScrollSpeed.SLOW;
                               g.cn(iMMEDIATELY);
                               i.e.L0(uArrayList2);
                               i.e.k0();
                               i.d.If(true);
                               b1 = true;
                            }
                         }
                         b1 = false;
                      }
                   }else {
                      goto label_00bd ;
                   }
                   if (b1) {
                      b.Z(LiveLogTag.COMMENT, "updateComments, updatePreferentialCommentsIfNecessary, return");
                      i.q = 0;
                      return;
                   }else {
                      g = i.g;
                      Objects.requireNonNull(g);
                      String str1 = "4";
                      QLiveMessage obj2 = PatchProxy.apply(null, g, ou, str1);
                      boolean b2 = (obj2 != patchProxyRe)? obj2.booleanValue(): q.f(g.b) ^ 1;
                      f h = i.h;
                      Objects.requireNonNull(h);
                      obj1 = null;
                      obj2 = PatchProxy.apply(obj1, h, n.class, str);
                      if (obj2 != patchProxyRe) {
                         b3 = obj2.booleanValue();
                      }else {
                         n b4 = h.b;
                         Objects.requireNonNull(b4);
                         obj4 = PatchProxy.apply(obj1, b4, c.class, str1);
                         b3 = (obj4 != patchProxyRe)? obj4.booleanValue(): q.f(b4.b) ^ 1;
                      }
                      if (b3) {
                         if (!b2 || i.q > null) {
                            i.q = i.q - 1;
                            QLiveMessage qLiveMessage = i.h.a();
                            i.b(qLiveMessage);
                            if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(qLiveMessage, Boolean.valueOf(b), i, uof, "11")) {
                               LiveCommentLinearLayoutManager$ScrollSpeed obj3 = PatchProxy.apply(null, i, uof, "12");
                               if (obj3 != patchProxyRe) {
                                  i1 = obj3.booleanValue();
                               }else {
                                  e1 = i.e;
                                  QLiveMessage qLiveMessage1 = e1.N0((e1.getItemCount() - 1));
                                  i1 = (qLiveMessage1 != null && qLiveMessage1.mIsFoldMessage != null)? true: false;
                               }
                               if (i1 && !b) {
                                  int i3 = i.e.getItemCount() - 1;
                                  i.e.V0(i3, qLiveMessage);
                                  i.e.l0(i3);
                                  i.c((long)i.a.mUpdateFoldIntervalMs);
                               }else {
                                  i.e.K0(qLiveMessage);
                                  i.e.k0();
                                  l2 = (long)i.a.mUpdateFoldIntervalMs;
                                  obj3 = (b)? LiveCommentLinearLayoutManager$ScrollSpeed.IMMEDIATELY: LiveCommentLinearLayoutManager$ScrollSpeed.SLOW;
                                  i.d(l2, obj3);
                               }
                            }
                            return;
                         }else if(i.r <= null){
                            i.r = i.a.mShowFoldBatchNum;
                            QLiveMessage qLiveMessage2 = i.h.a();
                            i.b(qLiveMessage2);
                            obj2 = qLiveMessage2;
                            str2 = null;
                         label_02c8 :
                            if (b2) {
                               i.r = i.r - 1;
                               sLOW = LiveCommentLinearLayoutManager$ScrollSpeed.SLOW;
                               a = i.a;
                               LiveCommentsDisplayParams mSlowScrollS = a.mSlowScrollSpeedDelayMs;
                               LiveCommentsDisplayParams mSlowScrollS1 = a.mSlowScrollSpeedNum;
                               f a1 = i.a;
                               if (i.g.b() >= a1.mChangeScrollSpeedLimitNum) {
                                  sLOW = LiveCommentLinearLayoutManager$ScrollSpeed.NORMAL;
                                  mSlowScrollS = a1.mFastScrollSpeedDelayMs;
                                  mSlowScrollS1 = a1.mFastScrollSpeedNum;
                               }
                               f g1 = i.g;
                               Objects.requireNonNull(g1);
                               if (PatchProxy.isSupport(ou)) {
                                  uArrayList = PatchProxy.applyOneRefs(Integer.valueOf(mSlowScrollS1), g1, ou, "7");
                                  if (uArrayList != patchProxyRe) {
                                  label_0364 :
                                     e1 = i.i;
                                     if (e1 != null) {
                                        e1.a(i.e.Q0(), uArrayList);
                                     }
                                     if (obj2 != null) {
                                        e1 = i.a;
                                        i.q = e1.mFoldContinueMaxNum - 1;
                                        mSlowScrollS = e1.mUpdateFoldIntervalMs;
                                        uArrayList.add(obj2);
                                     }
                                     LiveLogTag cOMMENT = LiveLogTag.COMMENT;
                                     Integer integer = (uArrayList != null)? Integer.valueOf(uArrayList.size()): str2;
                                     b.c0(cOMMENT, "updateComments, has common", "addMessages.size", integer);
                                     if (!PatchProxy.applyVoidOneRefs(uArrayList, i, uof, "9")) {
                                        Iterator iterator = uArrayList.iterator();
                                        while (iterator.hasNext()) {
                                           QLiveMessage qLiveMessage3 = iterator.next();
                                           if (qLiveMessage3 instanceof a) {
                                              qLiveMessage3.onMessageShow();
                                           }
                                        }
                                     }
                                     i.e.L0(uArrayList);
                                     i.e.k0();
                                     l2 = (long)mSlowScrollS;
                                     if (b) {
                                        sLOW = LiveCommentLinearLayoutManager$ScrollSpeed.IMMEDIATELY;
                                     }
                                     i.d(l2, sLOW);
                                     return;
                                  }
                               }
                               g1.a("popFrontMessagesByNum");
                               ArrayList uArrayList1 = new ArrayList(g1.b.subList(0, Math.min(g1.b(), mSlowScrollS1)));
                               g1.b.removeAll(uArrayList1);
                               ou = g1.c;
                               Objects.requireNonNull(ou);
                               if (PatchProxy.applyVoidOneRefs(uArrayList1, ou, q.class, str1) || (SystemUtil.I() && !q.f(uArrayList1))) {
                                  Iterator iterator1 = uArrayList1.iterator();
                                  while (iterator1.hasNext()) {
                                     QLiveMessage qLiveMessage4 = iterator1.next();
                                     b.d0(LiveLogTag.LIVE_RECRUIT_QUESTION, "logMessageWithFrequencyInfo", "content", qLiveMessage4.mContent, "mIsFrequencyMessage", Boolean.valueOf(ou.a(qLiveMessage4)));
                                  }
                               }
                               uArrayList = uArrayList1;
                               goto label_0364 ;
                            }else {
                               b.Z(LiveLogTag.COMMENT, "updateComments, none message");
                               i.c(1000);
                               return;
                            }
                         }
                      }
                      str2 = null;
                      obj2 = str2;
                      goto label_02c8 ;
                   }
                }
             }
          }
       }
    }
}
