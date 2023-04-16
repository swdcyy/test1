package com.kuaishou.live.core.show.ask.LiveAskTabFragment$b;
import qvb.f;
import com.kuaishou.live.core.show.ask.LiveAskTabFragment;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatTabConfig;
import java.lang.Boolean;
import i32.j;
import o02.e;
import cjd.e;
import erd.o;
import qvb.n0$a;
import qvb.n0;
import com.kuaishou.live.core.show.ask.model.LiveAskTabResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.ask.model.LiveAskTabResponse$LiveAskMaxLikeQuestion;
import java.lang.StringBuffer;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import java.lang.Long;
import uw9.l;
import android.view.View;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.core.show.ask.model.LiveAskItem;
import com.kuaishou.live.core.show.ask.model.LiveAskAndChatType;
import i32.p;
import android.view.View$OnClickListener;
import i32.m;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.utility.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Iterable;
import zsd.u;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LiveAskTabFragment$b extends f	// class@0009ba
{
    public final String p;
    public final LiveAskTabFragment q;

    public void LiveAskTabFragment$b(LiveAskTabFragment p0,String p1){
       a.p(p1, "liveStreamId");
       this.q = p0;
       super();
       this.p = p1;
    }
    public t I1(){
       j oj;
       LiveAskTabFragment$b tp;
       LiveAskTabFragment u0;
       LiveAskAndChatTabConfig mCurrentAskI;
       t ot;
       Object[] objArray1;
       Object[] objArray = null;
       LiveAskTabFragment obj = PatchProxy.apply(objArray, this, LiveAskTabFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.U0;
       Boolean uBoolean = (obj != null)? Boolean.valueOf(obj.mIsAnchor): objArray;
       a.m(uBoolean);
       if (uBoolean.booleanValue()) {
          oj = e.d();
          tp = this.p;
          u0 = this.q.U0;
          mCurrentAskI = (u0 != null)? u0.mCurrentAskId: objArray;
          ot = oj.g(tp, mCurrentAskI);
          if (ot != null) {
             objArray = ot.map(new e());
          }
       }else {
          oj = e.d();
          tp = this.p;
          u0 = this.q.U0;
          mCurrentAskI = (u0 != null)? u0.mCurrentAskId: objArray;
          ot = oj.n(tp, mCurrentAskI);
          if (ot != null) {
             objArray = ot.map(new e());
          }
       }
       return objArray;
    }
    public void K1(n0$a p0){
       LiveAskTabFragment u0;
       Boolean uBoolean;
       List mAskItemList;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAskTabFragment$b.class, "2")) {
          return;
       }
       super.K1(p0);
       LiveAskTabFragment$b tq = this.q;
       LiveAskItem liveAskItem = null;
       LiveAskTabResponse liveAskTabRe = (p0 != null)? p0.a(): liveAskItem;
       a.m(liveAskTabRe);
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidOneRefs(liveAskTabRe, tq, LiveAskTabFragment.class, "12")) {
          String str = "";
          LiveAskTabFragment liveAskTabFr = 8;
          if (!PatchProxy.applyVoidOneRefs(liveAskTabRe, tq, LiveAskTabFragment.class, "16")) {
             u0 = tq.U0;
             uBoolean = (u0 != null)? Boolean.valueOf(u0.mIsAnchor): liveAskItem;
             a.m(uBoolean);
             if (!uBoolean.booleanValue()) {
                if (liveAskTabRe.getMMaxLikeQuestion() != null) {
                   StringBuffer str1 = "";
                   LiveAskTabResponse$LiveAskMaxLikeQuestion mMaxLikeQues = liveAskTabRe.getMMaxLikeQuestion();
                   Integer integer1 = (mMaxLikeQues != null)? Integer.valueOf(mMaxLikeQues.getMOrder()): liveAskItem;
                   str1 = str1+String.valueOf(integer1)+". ";
                   mMaxLikeQues = liveAskTabRe.getMMaxLikeQuestion();
                   mMaxLikeQues = (mMaxLikeQues != null)? mMaxLikeQues.mContent: liveAskItem;
                   str1 = str1+mMaxLikeQues;
                   tq.Kh(str1);
                   LiveAskTabFragment v = tq.V;
                   if (v != null) {
                      v.setText(str1);
                   }
                   u0 = tq.V;
                   if (u0 != null) {
                      u0.setTextColor(a1.a(R.color.arg_RES_7f061dc4));
                   }
                   u0 = tq.W;
                   if (u0 != null) {
                      u0.setVisibility(0);
                   }
                   u0 = tq.W;
                   if (u0 != null) {
                      mMaxLikeQues = liveAskTabRe.getMMaxLikeQuestion();
                      Long longx = (mMaxLikeQues != null)? Long.valueOf((long)mMaxLikeQues.mLikeCount): liveAskItem;
                      a.m(longx);
                      u0.setText(l.b(longx.longValue()));
                   }
                }else {
                   tq.Kh(str);
                   u0 = tq.V;
                   if (u0 != null) {
                      u0.setText(a1.p(R.string.arg_RES_7f101e0e));
                   }
                   u0 = tq.V;
                   if (u0 != null) {
                      u0.setTextColor(a1.a(R.color.arg_RES_7f061d99));
                   }
                   u0 = tq.W;
                   if (u0 != null) {
                      u0.setVisibility(liveAskTabFr);
                   }
                   u0 = tq.W;
                   if (u0 != null) {
                      u0.setText(str);
                   }
                }
             }else {
                u0 = tq.T;
                if (u0 != null) {
                   u0.setVisibility(liveAskTabFr);
                }
                u0 = tq.U;
                if (u0 != null) {
                   u0.setVisibility(liveAskTabFr);
                }
             }
          }
       label_0108 :
          if (!PatchProxy.applyVoidOneRefs(liveAskTabRe, tq, LiveAskTabFragment.class, "15")) {
             u0 = tq.U0;
             uBoolean = (u0 != null)? Boolean.valueOf(u0.mIsAnchor): liveAskItem;
             a.m(uBoolean);
             if (uBoolean.booleanValue() && !q.f(liveAskTabRe.getMAskItemList())) {
                mAskItemList = liveAskTabRe.getMAskItemList();
                a.m(mAskItemList);
                Iterator iterator1 = mAskItemList.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      LiveAskItem liveAskItem2 = iterator1.next();
                      if (liveAskItem2 != null && liveAskItem2.mQuestionStatus == 2) {
                         tq.S = true;
                      }
                   }
                }
             }
             tq.S = false;
          }
          tq.M = liveAskTabRe.mLocked;
          u0 = tq.U0;
          uBoolean = (u0 != null)? Boolean.valueOf(u0.mEnableLockAsk): liveAskItem;
          a.m(uBoolean);
          boolean b = uBoolean.booleanValue();
          LiveAskTabFragment m = tq.M;
          if (!PatchProxy.isSupport(LiveAskTabFragment.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(m), tq, LiveAskTabFragment.class, "18")) {
             LiveAskTabFragment u01 = tq.U0;
             Boolean uBoolean2 = (u01 != null)? Boolean.valueOf(u01.mIsAnchor): liveAskItem;
             a.m(uBoolean2);
             if (uBoolean2.booleanValue()) {
                if (b) {
                   u0 = tq.U0;
                   LiveAskAndChatTabConfig mLiveAskAndC = (u0 != null)? u0.mLiveAskAndChatType: liveAskItem;
                   if (mLiveAskAndC == LiveAskAndChatType.ONLY_ASK) {
                      u0 = tq.Y;
                      if (u0 != null) {
                         u0.setVisibility(0);
                      }
                      u0 = tq.Y;
                      if (u0 != null) {
                         u0.setSelected(m);
                      }
                      u0 = tq.Y;
                      if (u0 != null) {
                         u0.setOnClickListener(new p(tq));
                      }
                   }
                }
                u0 = tq.Y;
                if (u0 != null) {
                   u0.setVisibility(liveAskTabFr);
                }
             }else {
                u0 = tq.Y;
                if (u0 != null) {
                   u0.setVisibility(liveAskTabFr);
                }
             }
          }
       label_01d7 :
          tq.Ih();
          tq.Hh(tq.M);
          u0 = tq.U0;
          uBoolean = (u0 != null)? Boolean.valueOf(u0.mIsAnchor): liveAskItem;
          a.m(uBoolean);
          if (!uBoolean.booleanValue()) {
             u0 = tq.F;
             if (u0 != null) {
                liveAskTabFr = tq.U0;
                Boolean uBoolean1 = (liveAskTabFr != null)? Boolean.valueOf(liveAskTabFr.mEnableThanks): liveAskItem;
                a.m(uBoolean1);
                u0.y = uBoolean1.booleanValue();
             }
             u0 = tq.F;
             if (u0 != null) {
                u0.l0(0);
             }
          }
          mAskItemList = liveAskTabRe.getMAskItemList();
          Integer integer = (mAskItemList != null)? Integer.valueOf(mAskItemList.size()): liveAskItem;
          tq.Lh(integer);
          if (liveAskTabRe.getMAskItemList() != null) {
             mAskItemList = liveAskTabRe.getMAskItemList();
             integer = (mAskItemList != null)? Integer.valueOf(mAskItemList.size()): liveAskItem;
             a.m(integer);
             if (integer.intValue() > 0 && !TextUtils.x(tq.N)) {
                RecyclerView recyclerView = tq.h0();
                List mAskItemList1 = liveAskTabRe.getMAskItemList();
                if (mAskItemList1 != null) {
                   List mAskItemList2 = liveAskTabRe.getMAskItemList();
                   if (mAskItemList2 != null) {
                      Iterator iterator = mAskItemList2.iterator();
                      while (true) {
                         if (!iterator.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                         }
                         LiveAskItem liveAskItem1 = iterator.next();
                         if (u.J1(liveAskItem1.mItemId, tq.N, 0, 2, liveAskItem)) {
                            liveAskItem = liveAskItem1;
                         }else {
                            continue ;
                         }
                      }
                   }
                   liveAskItem = Integer.valueOf(CollectionsKt___CollectionsKt.M2(mAskItemList1, liveAskItem));
                }
                a.m(liveAskItem);
                recyclerView.smoothScrollToPosition(liveAskItem.intValue());
                tq.N = str;
             }
          }
       label_0296 :
          if (tq.O == null) {
             tq.O = true;
             int mFocusPositi = liveAskTabRe.getMFocusPosition();
             if (PatchProxy.isSupport(LiveAskTabFragment.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(mFocusPositi), tq, LiveAskTabFragment.class, "13") && mFocusPositi > 0)) {
                RecyclerView recyclerView1 = tq.h0();
                if (recyclerView1 != null) {
                   recyclerView1.smoothScrollToPosition(mFocusPositi);
                }
             }
          }
       }
       return;
    }
}
