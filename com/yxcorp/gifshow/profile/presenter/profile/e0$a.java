package com.yxcorp.gifshow.profile.presenter.profile.e0$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.e0;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.model.ProfileTubeCardInfo;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.User;
import z5c.b3;
import ql5.b;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import android.content.SharedPreferences$Editor;
import oe6.g;
import qvb.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout;
import z5c.k0;
import zf6.j;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import lnc.a1;
import j4c.l0;
import androidx.recyclerview.widget.RecyclerView$n;
import z5c.h2;
import y8c.g;
import t3c.f;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewParent;
import com.yxcorp.utility.n;
import v1c.b;
import s1c.r0;
import s1c.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;

public class e0$a implements q	// class@00148d
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       int a;
       e0 u;
       ProfileTemplateCard profileTempl;
       boolean b;
       e0$a uoa = e0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          e0$a tb = this.b;
          Objects.requireNonNull(tb);
          e0 uoe0 = e0.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, uoe0, "4")) {
             if (!PatchProxy.applyVoid(objArray, tb, uoe0, "8")) {
                tb.w = (tb.r.L0() != null && (tb.r.L0().getProfileTubeCardInfo() == null || q.f(tb.r.L0().getProfileTubeCardInfo().mProfileTubeCards)))? objArray: tb.r.L0().getProfileTubeCardInfo().mProfileTubeCards;
             }
          label_0074 :
             e0 w = tb.w;
             int i = 1;
             if (!PatchProxy.applyVoidOneRefs(w, tb, uoe0, "5")) {
                if (b3.b(tb.s.getId()) && (!q.f(w) && !b.a.getBoolean("isProfileAdoptBubbleShowed", 0))) {
                   Iterator iterator = w.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         profileTempl = iterator.next();
                         if (!b3.a(profileTempl)) {
                            continue ;
                         }
                      }else {
                         profileTempl = objArray;
                      }
                      if (profileTempl != null) {
                         w.remove(profileTempl);
                         w.add(0, profileTempl);
                         profileTempl.mIsTopSerial = i;
                         b = true;
                      label_00c2 :
                         SharedPreferences$Editor uEditor = b.a.edit();
                         uEditor.putBoolean("isTopAdoptFeed", b);
                         g.a(uEditor);
                      }
                   }
                }
             label_00c1 :
                b = false;
                goto label_00c2 ;
             }
             if (q.f(tb.w) || tb.r.isEmpty()) {
                View[] viewArray = new View[i];
                viewArray[0] = tb.t;
                n.Z(8, viewArray);
                tb.p.ia().m1(tb.t);
                tb.t = objArray;
             }else {
                w = tb.t;
                if (w == null) {
                   View view = a.a(tb.getContext(), R.layout.arg_RES_7f0d1253);
                   tb.t = view;
                   tb.u = view.findViewById(0x7f0a32c9);
                   tb.y = tb.t.findViewById(0x7f0a32ca);
                   int i1 = 0x7f061ca6;
                   if (k0.s()) {
                      w = tb.u;
                      w.setBackgroundColor(j.d(w, i1));
                   }
                   tb.P8();
                   w = tb.u;
                   w.setLayoutManager(new LinearLayoutManager(w.getContext(), 0, 0));
                   tb.u.setItemAnimator(objArray);
                   a = e0.A;
                   if (k0.u()) {
                      u = tb.u;
                      u.setBackgroundColor(j.d(u, i1));
                      a = a1.e(10.00f);
                   }
                   tb.u.addItemDecoration(new l0(tb, a, 0));
                   h2 oh2 = new h2(tb.u, tb.x, tb.s.getId());
                   tb.v = oh2;
                   oh2.d();
                   d uod = tb.p.ia();
                   w = tb.t;
                   if (!PatchProxy.applyVoidTwoRefs(uod, w, tb, uoe0, "9")) {
                      if (uod.U0(w)) {
                         uod.m1(w);
                      }
                      if (!uod.U0(w)) {
                         if (PatchProxy.applyVoidOneRefs(w, tb, uoe0, "10") || (w != null && w.getParent() instanceof ViewGroup)) {
                            w.getParent().removeView(w);
                         }
                      label_01a5 :
                         uod.P0(w);
                      }
                   }
                }else {
                   View[] viewArray1 = new View[i];
                   viewArray1[0] = w;
                   n.Z(0, viewArray1);
                   tb.P8();
                }
                uoe0 = tb.x;
                if (uoe0 == null || uoe0.x != null) {
                   w = tb.q;
                   tb.x = new b(tb.s.getId(), w.e, w.d);
                }
                u = tb.x;
                uoe0.b = u;
                tb.u.setAdapter(u);
                tb.u.scrollToPosition(0);
                tb.u.setFixScrollConflictDirection(2);
                tb.v.c();
                tb.x.W0(tb.w);
                tb.x.k0();
             }
          }
       }
       return;
    }
}
