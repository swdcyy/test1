package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import lnc.a1;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.k;
import java.util.Collection;
import ok.h;
import com.google.common.collect.e;
import java.lang.Iterable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Iterator;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import java.util.Map;
import java.lang.Runnable;
import rwc.j;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.n;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import ekd.q;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import itc.x2;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import crd.b;
import android.view.View;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.widget.FadingEdgeContainer;
import com.yxcorp.gifshow.widget.LibraryLoadingView;
import rtc.m;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.l;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.m;
import erd.g;
import brd.t;
import java.util.Collections;

public class StickerLibraryFragment extends FlyWheelTabHostFragment	// class@001299
{
    public StickerLibraryFragment$c E;
    public List F;
    public Map G;
    public LibraryLoadingView H;
    public b I;
    public List J;
    public j K;
    public int L;
    public static final int M;

    static {
       StickerLibraryFragment.M = a1.e(18.00f);
    }
    public void StickerLibraryFragment(){
       super();
       this.F = Lists.b();
       this.G = new HashMap();
       this.J = new ArrayList();
       this.L = 1;
    }
    public String E7(){
       return "StickerLibrary";
    }
    public StickerGroupInfo Qh(){
       StickerLibraryFragment obj = PatchProxy.apply(null, this, StickerLibraryFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null) {
          return obj.g;
       }
       return null;
    }
    public void Rh(){
       if (PatchProxy.applyVoid(null, this, StickerLibraryFragment.class, "10")) {
          return;
       }
       if (this.J == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MORE_SHOW_STICKER";
       ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
       ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[0];
       tagShowPacka.tagPackage = Lists.c(e.f(this.J, k.b)).toArray(tagPackageAr);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.tagShowPackage = tagShowPacka;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          if (pair.second.mStickerScore != null) {
             HashMap hashMap = new HashMap();
             hashMap.put("identity", pair.second.mStickerId);
             hashMap.put("score", String.valueOf(pair.second.mStickerScore));
             uArrayList.add(hashMap);
          }
       }
       HashMap hashMap1 = new HashMap();
       hashMap1.put("rerank", uArrayList);
       uElementPack.params = a.a.q(hashMap1);
       u1.u0(6, uElementPack, uContentPack);
       this.J.clear();
       return;
    }
    public final void Sh(){
       if (PatchProxy.applyVoid(null, this, StickerLibraryFragment.class, "4")) {
          return;
       }
       if (this.E == null) {
          return;
       }
       this.F.clear();
       Iterator iterator = this.E.a.iterator();
       while (iterator.hasNext()) {
          StickerGroupInfo stickerGroup = iterator.next();
          if (stickerGroup.mOnTab == null) {
             continue ;
          }else {
             this.F.add(stickerGroup);
             this.G.put(stickerGroup.mGroupName, stickerGroup.mGroupId);
          }
       }
       return;
    }
    public void Th(StickerLibraryFragment$c p0){
       this.E = p0;
    }
    public final void Uh(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerLibraryFragment.class, "5")) {
          return;
       }
       if (this.E == null) {
          return;
       }
       StickerLibraryFragment tF = this.F;
       if (tF != null && !tF.isEmpty()) {
          this.E.a(this.F.get(0));
          this.K = new j(this.F.get(0).mGroupId);
       }
       if (!PatchProxy.applyVoid(null, this, StickerLibraryFragment.class, "7")) {
          this.Oh(new n(this));
       }
       ArrayList uArrayList = Lists.b();
       if (q.f(this.F)) {
          this.Kh(uArrayList);
          return;
       }else {
          Iterator iterator = this.F.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Bundle uBundle = new Bundle();
             uBundle.putString("ARG_STICKER_TAB_ID", obj.mGroupId);
             uBundle.putString("ARG_STICKER_TAB_NAME", obj.mGroupName);
             StickerLibraryFragment$a uoa = new StickerLibraryFragment$a(this, new PagerSlidingTabStrip$d(obj.mGroupId, obj.mGroupName), StickerGroupFragment.class, uBundle, obj);
             uArrayList.add(v3);
          }
          if (!q.f(this.F) && this.F.size() > h1.h()) {
             StickerGroupInfo stickerGroup = this.F.get(h1.h());
             x2.a(stickerGroup.mGroupName, stickerGroup.mGroupId);
          }
          this.Kh(uArrayList);
          this.u.setCurrentItem(h1.h(), 0);
          if (p0 != null) {
             this.u.getViewTreeObserver().addOnGlobalLayoutListener(new StickerLibraryFragment$b(this, p0));
          }
          this.L = 0;
          return;
       }
    }
    public int getLayoutResId(){
       StickerLibraryFragment tE = this.E;
       int i = (tE != null && tE.f != null)? 0x7f0d04b5: 0x7f0d04b4;
       return i;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, StickerLibraryFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       StickerLibraryFragment tI = this.I;
       if (tI != null) {
          tI.dispose();
          this.I = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerLibraryFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       p1 = PatchProxy.apply(objArray, this, StickerLibraryFragment.class, "2");
       if (p1 != PatchProxyResult.class) {
          b = p1.booleanValue();
       }else {
          StickerLibraryFragment tE1 = this.E;
          b = (tE1 != null && !q.f(tE1.b))? true: false;
       }
       if (!b) {
          return;
       }else {
          FadingEdgeContainer uFadingEdgeC = p0.findViewById(R.id.fading_edge_container);
          if (uFadingEdgeC != null) {
             uFadingEdgeC.a(3, StickerLibraryFragment.M);
          }
          this.H = p0.findViewById(0x7f0a3b68);
          if (!PatchProxy.applyVoid(objArray, this, StickerLibraryFragment.class, "3")) {
             StickerLibraryFragment tE = this.E;
             if (tE != null) {
                if (!q.f(tE.a)) {
                   this.Sh();
                   this.Uh(objArray);
                }else {
                   this.H.L(new m(this));
                   this.H.setVisibility(0);
                   this.I = this.E.c.subscribe(new l(this), m.b);
                }
             }
          }
          return;
       }
    }
    public List wh(){
       Object obj = PatchProxy.apply(null, this, StickerLibraryFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.emptyList();
    }
}
