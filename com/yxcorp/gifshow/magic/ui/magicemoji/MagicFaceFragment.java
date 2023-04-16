package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import d4b.a$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import r5b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment$b;
import m4b.t0;
import android.view.View;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import d4b.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import lnc.a1;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.MagicEmoji;
import s5b.b;
import q87.c;
import mkc.c;
import i2b.a;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import q5b.k;
import java.util.ArrayList;
import m4b.o0;
import ekd.q$b;
import w3b.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w3b.a;
import java.lang.Exception;
import c4b.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.Map;
import k2b.e0;
import y8c.g;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import skd.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$a;
import d4b.o;
import kotlin.jvm.internal.a;
import d4b.b;
import d4b.h;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$MagicDeleteEntranceItem;
import w3b.p;
import w3b.r;
import r5b.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.k;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import b4b.i;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$NoMagicFaceItem;
import b4b.h;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import m4b.u0;
import androidx.recyclerview.widget.RecyclerView$s;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import m4b.n0;
import android.view.View$OnClickListener;
import com.yxcorp.retrofit.model.RetrofitException;
import android.widget.FrameLayout;
import com.yxcorp.retrofit.model.KwaiException;
import android.text.TextUtils;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import e17.i;
import i4b.g;
import g9c.a;
import android.os.Bundle;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import m4b.p0;
import erd.g;
import crd.b;
import android.view.LayoutInflater;
import oxa.d;
import android.app.Activity;
import l5b.a;
import androidx.recyclerview.widget.RecyclerView$z;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip$a;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import m4b.r0;
import eoc.f;
import v4b.n;
import m4b.q0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Number;
import lnc.s6;
import m4b.s0;

public abstract class MagicFaceFragment extends BaseFragment implements MagicFaceAdapter$c, a$a	// class@001bb3
{
    public int A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public c F;
    public boolean G;
    public SmoothPagerSlidingTabStrip H;
    public boolean I;
    public SmoothSlidingTabStrip$a J;
    public final RecyclerView$r K;
    public final Runnable L;
    public int j;
    public int k;
    public MagicEmoji l;
    public MagicEmoji m;
    public MagicEmojiFragment$Source n;
    public String o;
    public RecyclerView p;
    public View q;
    public KwaiPlayerFailedStateView r;
    public MagicFaceAdapter s;
    public List t;
    public String u;
    public MagicEmojiPageConfig v;
    public a w;
    public boolean x;
    public int y;
    public int z;
    public static MagicEmoji$MagicFace M;

    public void MagicFaceFragment(){
       super();
       this.j = -1;
       this.k = -1;
       this.x = false;
       this.A = -1;
       this.B = -1;
       this.F = new c();
       this.I = false;
       this.J = new MagicFaceFragment$a(this);
       this.K = new MagicFaceFragment$b(this);
       this.L = new t0(this);
    }
    public static void ch(MagicFaceFragment p0){
       p0.fc();
    }
    public static void dh(MagicFaceFragment p0,View p1){
       MagicFaceFragment s = p0.s;
       MagicFaceAdapter x = (s != null)? s.x: null;
       if (x != null) {
          p0.fc();
          x.n();
       }
       return;
    }
    public static void eh(RecyclerView p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(MagicFaceFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, MagicFaceFragment.class, "15")) {
          return;
       }
       int i = ((a1.h() - (p1 * 5)) - (n.c(p0.getContext(), 8.00f) * 2)) / 4;
       for (p1 = 0; p1 < p0.getItemDecorationCount(); p1++) {
          p0.removeItemDecorationAt(p1);
       }
       MagicFaceFragment$c uoc = new MagicFaceFragment$c(5, i, true, p2, p3);
       p0.addItemDecoration(p1);
       p0.setHasFixedSize(true);
       return;
    }
    private void fc(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicFaceFragment.class, "27")) {
          return;
       }
       if (this.p != null && (q.f(this.t) || this.l.mTabType == 3)) {
          String str = "MagicFaceFragment";
          if (PatchProxy.applyVoid(objArray, this, MagicFaceFragment.class, "32") || (this.p != null && this.r != null)) {
             objArray1 = new Object[0];
             b.D().w(str, "hideRetryView", objArray1);
             c.c(this.p, this.r);
          }
       label_0049 :
          if (this.q == null) {
             this.q = a.i(this.p, 0x7f0d1615);
          }
          if (this.q != null) {
             objArray1 = new Object[0];
             b.D().w(str, "showLoading", objArray1);
             c.i(this.p, this.q);
             this.wh(0);
          }
       }
    label_0071 :
       return;
    }
    private void x(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "28")) {
          return;
       }
       k1.m(this.L);
       if (this.q != null && this.p != null) {
          Object[] objArray = new Object[0];
          b.D().w("MagicFaceFragment", "hideLoading", objArray);
          c.c(this.p, this.q);
       }
       return;
    }
    public void Q6(List p0){
       boolean b;
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "25")) {
          return;
       }
       this.x();
       if (this.l.mUseLocalPageLoad != null) {
          p0 = this.mh(p0);
       }
       try{
          p0 = k.a(p0);
          if (this.l.mTabType == 3 && !q.f(p0)) {
             this.l.mMagicFaces = new ArrayList(p0);
          }else if(!q.f(this.l.mMagicFaces)){
             q.c(p0, new o0(this));
          }
          ArrayList uArrayList = new ArrayList(this.l.mMagicFaces);
          uArrayList.addAll(p0);
          this.l.mMagicFaces = uArrayList;
          b uob = b.d();
          MagicBusinessId magicBusines = l.d(this.n);
          MagicFaceFragment tl1 = this.l;
          ArrayList uArrayList1 = new ArrayList(p0);
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidThreeRefs(magicBusines, tl1, uArrayList1, uob, b.class, "4")) {
             b uob1 = b.D();
             String str = "updataCurrentResponseEmoji id "+magicBusines.name();
             Object[] objArray1 = new Object[0];
             String str1 = "MagicEmojiDataHub";
             uob1.w(str1, str, objArray1);
             b c = uob.c;
             if (c != null && !q.f(c.mMagicEmojis)) {
                iterator = uob.c.mMagicEmojis.iterator();
                while (iterator.hasNext()) {
                   MagicEmoji magicEmoji1 = iterator.next();
                   if (TextUtils.n(magicEmoji1.mId, tl1.mId)) {
                      if (!q.f(magicEmoji1.mMagicFaces)) {
                         q.c(uArrayList1, new a(magicEmoji1));
                      }
                      ArrayList uArrayList2 = new ArrayList(magicEmoji1.mMagicFaces);
                      uArrayList2.addAll(uArrayList1);
                      magicEmoji1.mMagicFaces = uArrayList2;
                      objArray1 = new Object[0];
                      b.D().w(str1, magicEmoji1.mName+" updataCurrentResponseEmoji suc ", objArray1);
                   }
                }
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
          Object[] objArray = new Object[0];
          b.D().w("MagicFaceFragment", "MagicRepo onLoadMore getSupportedSize:"+p0.size(), objArray);
          b = q.f(this.t);
          this.zh();
          k.a(this.t);
          if (q.f(this.t)) {
             return;
          }else {
             f.b().a(this.l);
             f uof = f.b();
             MagicFaceFragment tl = this.l;
             Objects.requireNonNull(uof);
             if (!PatchProxy.applyVoidOneRefs(tl, uof, f.class, "10")) {
                uof = uof.c;
                if (uof != null) {
                   iterator = uof.iterator();
                   while (iterator.hasNext()) {
                      MagicEmoji magicEmoji = iterator.next();
                      if ((tl.mId).equals(magicEmoji.mId)) {
                         magicEmoji.mMagicFaces = tl.mMagicFaces;
                         break ;
                      }
                   }
                }
             }
             this.vh(this.s, this.t);
             this.s.k0();
             if (b) {
                this.fh(0);
             }
             return;
          }
    }
    public void fh(boolean p0){
       if (PatchProxy.isSupport(MagicFaceFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicFaceFragment.class, "41")) {
          return;
       }
       if (this.B != -1) {
          MagicFaceFragment tp = this.p;
          if (tp != null && this.t != null) {
             RecyclerView$LayoutManager layoutManage = tp.getLayoutManager();
             if (layoutManage instanceof GridLayoutManager) {
                int i = layoutManage.i0();
                int i1 = layoutManage.c();
                if (i < 0 || i1 < 0) {
                   return;
                }else if(this.j != i || (this.k != i1 && i1 < this.t.size())){
                   this.j = i;
                   this.k = i1;
                   MagicFaceFragment tF = this.F;
                   MagicFaceFragment tt = this.t;
                   Objects.requireNonNull(tF);
                   if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(tt, Integer.valueOf(i), Integer.valueOf(i1), tF, c.class, "1")) {
                      while (i <= i1 && i < tt.size()) {
                         MagicEmoji$MagicFace magicFace = tt.get(i);
                         if (magicFace != null) {
                            SimpleMagicFace mId = magicFace.mId;
                            if (mId != null) {
                               tF.a.put(mId, magicFace);
                            }
                         }
                         i = i + 1;
                      }
                   }
                }
             }
             if (p0) {
                this.F.a(5, this);
             }
          }
       }
       return;
    }
    public g gh(){
       o a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MagicFaceAdapter$a obj = PatchProxy.apply(objArray, this, MagicFaceFragment.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.w == null) {
          this.w = a.b(this.getContext(), "magicFace");
       }
       this.zh();
       obj = MagicFaceAdapter.H1();
       obj.c(this.w);
       obj.b(this.o);
       obj.f(this.n);
       obj.d(this.p);
       obj.d = this.v;
       obj.e(this);
       a = o.a;
       MagicBusinessId magicBusines = l.d(this.n);
       MagicFaceFragment tm = this.m;
       MagicFaceFragment tv = this.v;
       Objects.requireNonNull(a);
       Object obj1 = PatchProxy.applyFourRefs(magicBusines, tm, tv, this, a, o.class, "1");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          a.p(magicBusines, "businessId");
          a.p(this, "listener");
          if (tm != null) {
             b uob = (tm.mUseLocalPageLoad != null)? new b(magicBusines, tm, this): new h(magicBusines, tm, tv, this);
             objArray = uob;
          }
       }
       obj.g = objArray;
       MagicFaceAdapter magicFaceAda = obj.a();
       k.a(this.t);
       this.vh(magicFaceAda, this.t);
       return magicFaceAda;
    }
    public RecyclerView$LayoutManager hh(){
       Object obj = PatchProxy.apply(null, this, MagicFaceFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GridLayoutManager(this.getActivity(), 5);
    }
    public abstract int ih();
    public MagicEmojiPageConfig jh(){
       return this.v;
    }
    public void k6(View p0,MagicEmoji$MagicFace p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicFaceFragment.class, "34")) {
          return;
       }
       if (p1 instanceof MagicFaceAdapter$MagicDeleteEntranceItem) {
          this.yh(true);
          this.zh();
          return;
       }else {
          MagicEmoji$MagicFace magicFace = p.b().c(this.o);
          if (magicFace == null) {
             magicFace = MagicFaceFragment.M;
          }
          p.b().k(this.o, p1);
          if (p1 == null || (MagicEmoji$MagicFace.isMagicFaceEquals(p1, r.b, r.c) && !PatchProxy.applyVoidOneRefs(p1, this, MagicFaceFragment.class, "33"))) {
             RecyclerView$LayoutManager layoutManage = this.p.getLayoutManager();
             int spanCount = (layoutManage instanceof GridLayoutManager)? layoutManage.getSpanCount(): 5;
             e.i(p1, spanCount, this.kh(p1));
          }
       label_005f :
          k ok = new k(p1, this.getActivity());
          ok.b = magicFace;
          RxBus.f.b(ok);
          if (p0 == null) {
             this.p.getAdapter().k0();
             Object[] objArray = new Object[0];
             b.D().s("MagicFaceFragment", "adapter.notifyDataSetChanged", objArray);
          }else {
             this.xh(p1);
             this.xh(magicFace);
          }
          if (p1 != null) {
             MagicBaseConfig mMagicEmojiI = p1.mMagicEmojiIndex;
             int i = (mMagicEmojiI / 5) + true;
             p1.mRowIndex = i;
             p1.mColumnIndex = (mMagicEmojiI + true) - ((i - 1) * 5);
          }
          MagicFaceFragment.M = p1;
          return;
       }
    }
    public String kh(MagicEmoji$MagicFace p0){
       return null;
    }
    public MagicEmoji$MagicFace lh(){
       Object obj = PatchProxy.apply(null, this, MagicFaceFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.b().c(this.o);
    }
    public List mh(List p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, MagicFaceFragment.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       while (i < p0.size()) {
          MagicEmoji$MagicFace magicFace = p0.get(i);
          if (l.q(magicFace)) {
             magicFace.mFileMd5CheckList = null;
             obj.add(magicFace);
          }
          i = i + 1;
       }
       MagicFaceFragment tl = this.l;
       MagicFaceFragment tv = this.v;
       Object[] obj1 = PatchProxy.applyThreeRefs(tl, obj, tv, null, i.class, "10");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else if(tl == null || tl.mUseLocalPageLoad == null){
          String str = "MagicFaceFilterDataHelper";
          b uob = 1;
          if (tv == null) {
             Object[] objArray = new Object[0];
             b.D().u(str, new IllegalArgumentException("pass null MagicEmojiPageConfig"), objArray);
          }else if(tv.mFilterUnswitchableEmoji == null && (tv.mNoLoginMode == null && (tv.mH5EntryEnable == null || tv.mHasRecord != null))){
             obj1 = 1;
          label_007a :
             if (!obj1) {
                obj1 = new Object[0];
                b.D().s(str, "don\'t need filter emoji", obj1);
             }else if(tv.mFilterUnswitchableEmoji != null){
                Object[] objArray1 = new Object[0];
                b.D().s(str, "need filter unswitchable emoji", objArray1);
                i = obj.size() - uob;
                while (i >= 0) {
                   MagicEmoji$MagicFace magicFace1 = obj.get(i);
                   if (!magicFace1 instanceof MagicFaceAdapter$NoMagicFaceItem && magicFace1.mSwitchable == null) {
                      obj.remove(i);
                   }
                   i = i - 1;
                }
             }
             if (tv.mH5EntryEnable == null || tv.mHasRecord != null) {
                obj1 = new Object[0];
                b.D().s(str, "need filter h5entry", obj1);
                q.c(obj, h.a);
             }
          }
          obj1 = null;
          goto label_007a ;
       }
       obj1 = new Object[0];
       b.D().w("MagicFaceFragment", "getSupportedMagicFace mTabType:"+this.A+",mSource:"+this.n, obj1);
       return obj;
    }
    public void nh(View p0){
       MagicFaceAdapter magicFaceAda;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "11")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          b.D().A("MagicFaceFragment", "initRecyclerView fail, view is null. fragment: "+this.u, objArray);
          PostUtils.x("magicFaceInitRecyclerView", "initRecyclerView fail, view is null. fragment: "+this.u);
          return;
       }else {
          this.C = i;
          this.D = c.b(p0.getContext().getResources(), 0x7f070a69);
          this.p = p0.findViewById(0x7f0a34da);
          if (MagicEmojiFragment.Yh(this.n)) {
             if (!PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "13")) {
                this.p.setLayoutManager(this.hh());
                magicFaceAda = this.gh();
                this.s = magicFaceAda;
                this.p.setAdapter(magicFaceAda);
                this.s.r1();
                this.p.addOnScrollListener(this.K);
                MagicFaceFragment.eh(this.p, this.D, true, i);
                this.oh();
                this.p.addOnScrollListener(new u0(this));
             }
          }else {
             this.p.setLayoutManager(this.hh());
             magicFaceAda = this.gh();
             this.s = magicFaceAda;
             this.p.setAdapter(magicFaceAda);
             this.s.r1();
             this.p.addOnScrollListener(this.K);
          }
          this.p.getRecycledViewPool().k(2, 30);
          return;
       }
    }
    public void o0(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "26")) {
          return;
       }
       this.x();
       if (!q.f(this.t) && (this.l.mTabType == 3 && (!PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "29") && this.p != null))) {
          if (this.r == null) {
             if (this.getContext() != null) {
                KwaiPlayerFailedStateView kwaiPlayerFa = new KwaiPlayerFailedStateView(this.getContext());
                this.r = kwaiPlayerFa;
                kwaiPlayerFa.f(new n0(this));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "30") && this.r != null) {
             String str1 = a1.p(R.string.arg_RES_7f100d25);
             if (!p0 instanceof RetrofitException) {
                this.r.findViewById(R.id.tv_network_resolve).setVisibility(8);
             }
             if (p0 instanceof KwaiException) {
                KwaiException kwaiExceptio = p0;
                if (!TextUtils.isEmpty(kwaiExceptio.mErrorMessage)) {
                   str1 = kwaiExceptio.mErrorMessage;
                }
             }
             this.r.findViewById(R.id.tv_empty_desc).setText(str1);
             this.r.setBackground(null);
          }
          this.wh(false);
          Object[] objArray = new Object[false];
          b.D().w("MagicFaceFragment", "showRetryView", objArray);
          c.i(this.p, this.r);
          String str = PatchProxy.applyOneRefs(p0, this, MagicFaceFragment.class, "31");
          if (str != PatchProxyResult.class) {
          }else {
             str = a1.p(R.string.arg_RES_7f1038e5);
             if (p0 instanceof KwaiException && !TextUtils.isEmpty(p0.mErrorMessage)) {
                str = p0.mErrorMessage;
             }
          }
          i.d(R.style.arg_RES_7f110668, str);
       }
    label_00e0 :
       return;
    }
    public void oh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicFaceFragment.class, "17")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       MagicEmoji$MagicFace magicFace = this.lh();
       if (magicFace != null) {
          MagicFaceFragment tl = this.l;
          if (tl != null) {
             MagicEmoji mId = tl.mId;
             if (mId != null && (mId.equals(magicFace.mGroupId) || this.t.contains(magicFace))) {
                if (!g.y(magicFace)) {
                   if (!PatchProxy.applyVoid(objArray, this, MagicFaceFragment.class, "19")) {
                      MagicFaceFragment tp = this.p;
                      if (tp != null && tp.getAdapter() != null) {
                         MagicEmoji$MagicFace magicFace1 = p.b().g(this.v.mPageIdentify);
                         if (this.p.getAdapter().Q0().size() > 0 && (magicFace1 != null && !g.y(magicFace1))) {
                            tp = this.t;
                            int i = 0;
                            int i1 = 0;
                            while (i1 < tp.size()) {
                               MagicEmoji$MagicFace magicFace2 = tp.get(i1);
                               if (magicFace2 != null && (magicFace2.mId != null && magicFace2.equals(magicFace1))) {
                                  i = i1;
                                  break ;
                               }
                               i1 = i1 + 1;
                            }
                            if (this.p.getLayoutManager() != null && i < this.p.getLayoutManager().getItemCount()) {
                               if (i <= (tp.size() - 5)) {
                                  this.p.getLayoutManager().scrollToPositionWithOffset(i, n.c(this.getContext(), 80.00f));
                               }else {
                                  this.p.getLayoutManager().scrollToPosition(i);
                               }
                            }
                         }
                      }
                   }
                   RxBus.f.b(new k(magicFace, this.getActivity()));
                }else {
                   this.uh();
                }
                return;
             }
          }
       }
       this.uh();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.sh(this.getArguments());
       if (!PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "44")) {
          this.Z0().compose(this.Ug(FragmentEvent.DESTROY)).subscribe(new p0(this));
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceFragment", "onCreate", objArray);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicFaceFragment.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceFragment", "onCreateView inflate cost "+k1.t(k1.i()), objArray);
       return d.d().f(this.getContext(), this.ih());
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       a.b(this.getActivity(), this.u, this.z, this.y);
       this.F.a(5, this);
       return;
    }
    public void onDestroyView(){
       MagicFaceFragment tt;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicFaceFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray1 = new Object[0];
       b.D().w("MagicFaceFragment", this.u+" onDestroyView", objArray1);
       if (this.x != null) {
          tt = this.t;
          if (tt != null) {
             Iterator iterator = tt.iterator();
             while (iterator.hasNext()) {
                l.a(iterator.next().mId);
             }
          }
       }
       tt = this.p;
       if (tt != null) {
          if (tt.getAdapter() instanceof g) {
             this.p.getAdapter().Z0();
          }
          this.p.removeOnScrollListener(this.K);
          this.p.setAdapter(objArray);
       }
       tt = this.s;
       if (tt != null) {
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(objArray, tt, MagicFaceAdapter.class, "2")) {
             tt.y.setViewCacheExtension(objArray);
          }
       }
       tt = this.H;
       if (tt != null) {
          tt.k(this.J);
       }
       return;
    }
    public void onLoading(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "24")) {
          return;
       }
       if (this.l.mTabType == 3 || q.f(this.t)) {
          k1.r(this.L, 0);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "5")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceFragment", this.u+" onPause", objArray);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "6")) {
          return;
       }
       super.onResume();
       Object[] objArray = new Object[0];
       b.D().w("MagicFaceFragment", this.u+" onResume", objArray);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicFaceFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       long l = k1.i();
       if (this.getParentFragment() != null && this.getParentFragment().getView() != null) {
          this.H = this.getParentFragment().getView().findViewById(0x7f0a3a79);
       }
       MagicFaceFragment tH = this.H;
       if (tH != null) {
          tH.setSelectedTextSize(a1.e(17.00f));
       }
       Fragment parentFragme = this.getParentFragment();
       boolean b = true;
       if (l.d(this.n) == MagicBusinessId.VIDEO && parentFragme instanceof MagicEmojiFragment) {
          tH = (parentFragme.g1 > 0)? 1: null;
          if (!tH) {
             tH = this.l;
             if (tH != null) {
                if (tH.mTabType != null) {
                label_0096 :
                   b1 = true;
                label_0099 :
                   if (!b1) {
                      this.nh(p0);
                   }else {
                      this.C = b;
                      MagicFaceFragment tH1 = this.H;
                      MagicFaceFragment tJ = this.J;
                      Objects.requireNonNull(tH1);
                      if (!PatchProxy.applyVoidOneRefs(tJ, tH1, SmoothSlidingTabStrip.class, "1") && !tH1.e.contains(tJ)) {
                         tH1.e.add(tJ);
                      }
                   }
                   f.b(PanelShowEvent.class, new r0(this), this);
                   f.b(n.class, new q0(this), this);
                   Object[] objArray = new Object[0];
                   b.D().w("MagicFaceFragment", this.u+"onViewCreated cost "+k1.t(l)+" isLazyLoad:"+b1, objArray);
                   return;
                }else {
                label_0098 :
                   b1 = false;
                   goto label_0099 ;
                }
             }
          }
       }
    label_006e :
       tH = this.H;
       if (tH != null && (tH.getViewPager() != null && this.H.f())) {
          a adapter = this.H.getViewPager().getAdapter();
          if (adapter instanceof a && adapter.t() != this) {
             goto label_0096 ;
          }else {
             goto label_0098 ;
          }
       }else {
          goto label_0098 ;
       }
    }
    public void ph(int p0){
       if (PatchProxy.isSupport(MagicFaceFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicFaceFragment.class, "39")) {
          return;
       }
       this.B = p0;
       MagicFaceFragment ts = this.s;
       if (ts != null) {
          ts.D = p0;
       }
       this.rh();
       this.fh(false);
       return;
    }
    public void qh(int p0){
       if (PatchProxy.isSupport(MagicFaceFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MagicFaceFragment.class, "40")) {
          return;
       }
       MagicFaceFragment ts = this.s;
       if (ts != null) {
          MagicFaceFragment tm = this.m;
          int i = 0;
          boolean b = (tm != null && tm.mTabType == 3)? true: false;
          Objects.requireNonNull(ts);
          MagicFaceAdapter magicFaceAda = MagicFaceAdapter.class;
          if (!PatchProxy.isSupport(magicFaceAda) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(b), ts, magicFaceAda, "18")) {
             ts.E = p0;
             if (b) {
                i = ts.e.size();
             }
             ts.s1(i);
          }
       }
       return;
    }
    public void rh(){
       this.j = -1;
       this.k = -1;
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(MagicFaceFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicFaceFragment.class, "35")) {
          return;
       }
       super.setUserVisibleHint(p0);
       if (p0) {
          this.x = true;
          MagicFaceFragment tl = this.l;
          if (tl != null) {
             MagicEmoji mMagicFaces = tl.mMagicFaces;
             if (mMagicFaces != null) {
                this.mh(mMagicFaces);
             }
          }
       }
       return;
    }
    public final void sh(Bundle p0){
       int i1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = p0.getString("arg_category");
       this.l = b.d().b(str);
       b uob = b.d();
       Objects.requireNonNull(uob);
       Object obj = PatchProxy.applyOneRefs(str, uob, b.class, "8");
       if (obj != patchProxyRe) {
       }else if(TextUtils.x(str)){
          obj = null;
       }else {
          obj = uob.b.get(str);
       }
       this.m = obj;
       this.o = SerializableHook.getSerializable(p0, "arg_magic_emoji_identify");
       this.n = SerializableHook.getSerializable(p0, "arg_source");
       this.A = p0.getInt("magicTabType");
       this.u = p0.getString("magicTabName");
       FragmentActivity activity = this.getActivity();
       MagicFaceFragment tu = this.u;
       obj = PatchProxy.applyTwoRefs(activity, tu, null, uoa, "3");
       int i = 0;
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else {
          Map map = a.a(activity);
          i1 = (map.containsKey("emoji_tab_position_"+tu))? map.get("emoji_tab_position_"+tu).intValue(): 0;
       }
       this.z = i1;
       activity = this.getActivity();
       tu = this.u;
       Map obj1 = PatchProxy.applyTwoRefs(activity, tu, null, uoa, "2");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          obj1 = a.a(activity);
          if (obj1.containsKey("emoji_tab_offset_"+tu)) {
             i = obj1.get("emoji_tab_offset_"+tu).intValue();
          }
       }
       this.y = i;
       this.v = SerializableHook.getSerializable(p0, "arg_magic_emoji_paga_config");
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "14")) {
          return;
       }
       MagicFaceFragment tp = this.p;
       if (tp != null) {
          View childAt = tp.getChildAt(0);
          if (childAt != null) {
             this.y = childAt.getTop();
             this.z = this.p.getLayoutManager().getPosition(childAt);
          }
          a.b(this.getActivity(), this.u, this.z, this.y);
       }
       return;
    }
    public final void uh(){
       if (PatchProxy.applyVoid(null, this, MagicFaceFragment.class, "18")) {
          return;
       }
       MagicFaceFragment tp = this.p;
       if (tp == null) {
          return;
       }
       boolean b = a.b;
       GridLayoutManager layoutManage = tp.getLayoutManager();
       if (layoutManage != null) {
          if (this.v.mHasRecord != null || b) {
             layoutManage.scrollToPositionWithOffset(0, 0);
          }else {
             layoutManage.scrollToPositionWithOffset(this.z, this.y);
          }
       }
       return;
    }
    public void vh(MagicFaceAdapter p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicFaceFragment.class, "22")) {
          return;
       }
       if (p0 != null && p1 != null) {
          if (s6.h()) {
             MagicFaceFragment tl = this.l;
             if (tl != null && (tl.mTabType == 3 && p1.size() > 0)) {
                ArrayList uArrayList = q.b(p1);
                uArrayList.add(0, new MagicFaceAdapter$MagicDeleteEntranceItem());
                p0.W0(uArrayList);
             }
          }
          p0.W0(p1);
       }
       return;
    }
    public abstract void wh(boolean p0);
    public void xh(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceFragment.class, "43")) {
          return;
       }
       if (p0 != null) {
          MagicFaceFragment tp = this.p;
          if (tp != null && tp.getAdapter() != null) {
             Object[] objArray = new Object[0];
             b.D().w("MagicFaceItemUpdate", "updateItemView:"+p0.mName, objArray);
             this.p.post(new s0(this.p.getAdapter(), p.b().h(this.o, p0)));
          }
       }
       return;
    }
    public abstract void yh(boolean p0);
    public abstract void zh();
}
