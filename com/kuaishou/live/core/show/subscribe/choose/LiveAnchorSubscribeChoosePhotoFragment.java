package com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoFragment;
import ml8.d;
import erd.g;
import qk2.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lnc.a1;
import java.lang.String;
import qk2.a;
import androidx.collection.ArraySet;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoFragment$b;
import wk2.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import pk2.c;
import pk2.b;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import cjd.e;
import erd.o;
import qk2.e;
import sfc.a;
import crd.b;
import java.lang.Boolean;
import java.util.Set;
import java.util.Collection;
import android.view.View;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhoto;
import y8c.g;
import g9c.a;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhotoResponse;
import ekd.q;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.core.show.subscribe.choose.c;
import qk2.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import qk2.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoFragment$a;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import qk2.f;
import androidx.recyclerview.widget.GridLayoutManager$b;
import k17.a;
import com.kuaishou.live.core.show.subscribe.choose.a;
import qvb.i;
import com.kuaishou.live.core.show.subscribe.choose.b;

public class LiveAnchorSubscribeChoosePhotoFragment extends RecyclerFragment implements d, g, i	// class@0010c8
{
    public final String F;
    public final int G;
    public final a H;
    public c I;
    public final Set J;
    public final Set K;
    public View L;
    public View M;
    public TextView N;
    public ObjectAnimator O;
    public ObjectAnimator P;
    public LiveAnchorSubscribeChoosePhotoFragment$c Q;
    public static final int R;

    static {
       LiveAnchorSubscribeChoosePhotoFragment.R = a1.e(80.00f);
    }
    public void LiveAnchorSubscribeChoosePhotoFragment(String p0,int p1){
       super();
       this.H = new a(this);
       this.J = new ArraySet();
       this.K = new ArraySet();
       this.F = p0;
       this.G = p1;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorSubscribeChoosePhotoFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAnchorSubscribeChoosePhotoFragment$b(this, this);
    }
    public final void Gh(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorSubscribeChoosePhotoFragment.class, "17")) {
          return;
       }
       LiveAnchorSubscribeChoosePhotoFragment tG = this.G;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tG), objArray, uoa, "5")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "LIVE_APPOINTMENT_PHOTO_CHOOSE";
          i3 oi3 = i3.f();
          if (tG != 3) {
             str = (tG != 6)? "": "LIVE_ENDED_HOST_SIDE";
          }else {
             str = "LIVE_PREVIEW_ENTRANCE";
          }
          oi3.d("source", str);
          urlPackage.params = oi3.e();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_APPOINTMENT_PHOTO_CONFIRM_BUTTON";
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.elementPackage = uElementPack;
          u1.z(urlPackage, uClickEvent);
       }
       b.b().C0(QCurrentUser.me().getId(), Lists.c(this.K), this.F, this.G).compose(c.c(this.m(), FragmentEvent.DESTROY)).map(new e()).subscribe(new e(this), new a());
       return;
    }
    public final void Hh(){
       boolean b;
       float translationY;
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAnchorSubscribeChoosePhotoFragment.class, "13")) {
          return;
       }
       LiveAnchorSubscribeChoosePhotoFragment tM = this.M;
       String obj = PatchProxy.apply(objArray, this, LiveAnchorSubscribeChoosePhotoFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          LiveAnchorSubscribeChoosePhotoFragment tK = this.K;
          LiveAnchorSubscribeChoosePhotoFragment tJ = this.J;
          b = (this.H.b == 1 && (!tK.isEmpty() && (!tK.containsAll(tJ) || !tJ.containsAll(tK))))? true: false;
       }
       tM.setEnabled(b);
       this.N.setText(TextUtils.i(this.H.e, a1.p(R.string.arg_RES_7f102ce9)));
       this.N.setVisibility(0);
       int i = this.K.isEmpty() ^ 1;
       obj = (!this.L.getTranslationY())? 1: null;
       int i1 = 2;
       if (!obj && i) {
          if (!PatchProxy.applyVoid(objArray, this, LiveAnchorSubscribeChoosePhotoFragment.class, "14")) {
             tM = this.O;
             if (tM != null) {
                tM.cancel();
             }
             translationY = this.L.getTranslationY();
             uofloatArray = new float[i1];
             uofloatArray[0] = translationY;
             uofloatArray[1] = translationY - (float)LiveAnchorSubscribeChoosePhotoFragment.R;
             objectAnimat = ObjectAnimator.ofFloat(this.L, View.TRANSLATION_Y, uofloatArray);
             this.O = objectAnimat;
             objectAnimat.setDuration(300);
             this.O.start();
          }
       }else if(obj != null && (i || PatchProxy.applyVoid(objArray, this, LiveAnchorSubscribeChoosePhotoFragment.class, "15"))){
          tM = this.P;
          if (tM != null) {
             tM.cancel();
          }
          translationY = this.L.getTranslationY();
          uofloatArray = new float[i1];
          uofloatArray[0] = translationY;
          uofloatArray[1] = (float)LiveAnchorSubscribeChoosePhotoFragment.R + translationY;
          objectAnimat = ObjectAnimator.ofFloat(this.L, View.TRANSLATION_Y, uofloatArray);
          this.P = objectAnimat;
          objectAnimat.setDuration(300);
          this.P.start();
       }
       return;
    }
    public final void Ih(LiveAnchorSubscribePhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "12")) {
          return;
       }
       LiveAnchorSubscribeChoosePhotoFragment tI = this.I;
       LiveAnchorSubscribeChoosePhotoFragment tK = this.K;
       if (this.H.b == true) {
          Iterator iterator = this.g7().Q0().iterator();
          while (iterator.hasNext()) {
             LiveAnchorSubscribePhoto liveAnchorSu = iterator.next();
             if (p0.mIsSelected != null && !TextUtils.n(liveAnchorSu.mPhotoId, p0.mPhotoId)) {
                liveAnchorSu.mIsSelected = false;
             }
          }
          tK.clear();
          tI.M0();
       }
       if (p0.mIsSelected != null) {
          tK.add(p0.mPhotoId);
          tI.K0(p0);
       }else {
          tK.remove(p0.mPhotoId);
          tI.T0(p0);
       }
       this.Hh();
       return;
    }
    public Set O3(){
       return this.K;
    }
    public void S7(LiveAnchorSubscribePhoto p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "5")) {
          return;
       }
       LiveAnchorSubscribeChoosePhotoFragment obj = PatchProxy.apply(null, this, LiveAnchorSubscribeChoosePhotoFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.O;
          if (obj == null || !obj.isRunning()) {
             obj = this.P;
             if (obj == null || !obj.isRunning()) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          p0.mIsSelected = p0.mIsSelected ^ 1;
          this.Ih(p0);
          this.g7().k0();
       }
       return;
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "10")) {
       }else {
          LiveAnchorSubscribeChoosePhotoFragment tH = this.H;
          tH.c = p0.mReservationActivityType;
          tH.b = p0.mMaxRelateCount;
          tH.d = p0.mRelatePhotosTips;
          tH.e = p0.mSelectedPhotosHint;
          if (!q.f(p0.mPhotos)) {
             p0 = p0.mPhotos;
             if (!PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "11")) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   LiveAnchorSubscribePhoto liveAnchorSu = p0.next();
                   if (liveAnchorSu.mRelated != null) {
                      this.J.add(liveAnchorSu.mPhotoId);
                   }
                   boolean b = true;
                   if (this.H.b == b || liveAnchorSu.mRelated == null) {
                      b = false;
                   }
                   liveAnchorSu.mIsSelected = b;
                   this.Ih(liveAnchorSu);
                }
             }
          }else {
             this.Hh();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "4")) {
          RecyclerView recyclerView = m1.f(p0, R.id.live_subscribe_selected_photo_list_view);
          c uoc = new c();
          this.I = uoc;
          uoc.w = new d(this);
          recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          recyclerView.setAdapter(this.I);
          recyclerView.addItemDecoration(new e(0, a1.e(4.00f), 0));
          this.M = m1.f(p0, 0x7f0a261c);
          this.N = m1.f(p0, 0x7f0a261a);
          this.M.setOnClickListener(new c(this));
       }
       View view = m1.f(p0, R.id.live_subscribe_choose_photo_bottom_layout);
       this.L = view;
       view.setTranslationY((float)LiveAnchorSubscribeChoosePhotoFragment.R);
       KwaiActionBar kwaiActionBa = m1.f(p0, R.id.title_root);
       kwaiActionBa.d(R.drawable.arg_RES_7f0819e0, 0, R.string.arg_RES_7f102ce5);
       kwaiActionBa.setBackground(null);
       kwaiActionBa.h(new LiveAnchorSubscribeChoosePhotoFragment$a(this));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0de7;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAnchorSubscribeChoosePhotoFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorSubscribeChoosePhotoFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       if (!PatchProxy.applyVoid(null, this, LiveAnchorSubscribeChoosePhotoFragment.class, "7")) {
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), 4, 1, false);
          gridLayoutMa.m1(new f(this));
          this.h0().setLayoutManager(gridLayoutMa);
          this.h0().addItemDecoration(new a(4, a1.e(0x3f800000)));
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorSubscribeChoosePhotoFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.H);
    }
    public i yh(){
       b obj = PatchProxy.apply(null, this, LiveAnchorSubscribeChoosePhotoFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b(this.F);
       obj.q = this;
       return obj;
    }
    public boolean zd(LiveAnchorSubscribePhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.J.contains(p0.mPhotoId);
    }
}
