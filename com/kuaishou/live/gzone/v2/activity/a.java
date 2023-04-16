package com.kuaishou.live.gzone.v2.activity.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import android.net.Uri;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import w53.a;
import erd.g;
import crd.b;
import java.util.HashMap;
import android.content.Context;
import android.app.Activity;
import y43.a;
import com.yxcorp.utility.n;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import android.widget.FrameLayout;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;
import ekd.x0;
import com.kwai.framework.model.user.QCurrentUser;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.live.gzone.v2.activity.a$a;
import android.view.View$OnClickListener;
import t77.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.gzone.v2.activity.a$b;
import androidx.fragment.app.Fragment;
import o63.c;
import java.util.Map;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import j47.c;
import androidx.fragment.app.c;
import com.kuaishou.live.gzone.v2.activity.a$c;
import t77.a$b;
import lnc.a1;
import c77.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;

public class a extends PresenterV2	// class@001cb1
{
    public a p;
    public PagerSlidingTabStrip$d q;
    public LiveGzoneFeatureEntrances r;
    public a s;
    public FrameLayout t;
    public KwaiRnFragment u;
    public HashMap v;
    public a w;
    public View x;
    public String y;
    public String z;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       Uri uri = Uri.parse(this.r.mUrl);
       if (!uri.isHierarchical()) {
          return;
       }
       try{
          this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new a(this)));
          HashMap hashMap = new HashMap();
          this.v = hashMap;
          hashMap.put("panelHeight", String.valueOf(n.P(this.getContext(), (float)this.s.S(this.getActivity()))));
          LiveKrnDialogData liveKrnDialo = new LiveKrnDialogData(uri);
          this.y = liveKrnDialo.e();
          this.z = liveKrnDialo.f();
          String str = liveKrnDialo.c();
          boolean b = false;
          if (!PatchProxy.applyVoidOneRefs(str, this, uoa, "4") && !TextUtils.x(str)) {
             uoa = 35;
             if (uoa == str.charAt(b)) {
                this.t.setBackgroundColor(Color.parseColor(str));
             }else {
                this.t.setBackgroundColor(Integer.parseInt(str));
             }
          }
          boolean booleanQuery = uri.getBooleanQueryParameter("needLogin", b);
          Iterator iterator = uri.getQueryParameterNames().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             this.v.put(str1, x0.a(uri, str1));
          }
          if (booleanQuery && !QCurrentUser.me().isLogined()) {
             View view = c.h(this.t, b.g);
             this.x = view;
             view.setClickable(true);
             KwaiEmptyStateView$a uoa1 = KwaiEmptyStateView.e();
             uoa1.k(R.drawable.arg_RES_7f080609);
             uoa1.j(2);
             uoa1.h(R.string.arg_RES_7f1030ae);
             uoa1.e(R.string.arg_RES_7f103059);
             uoa1.p(new a$a(this));
             uoa1.a(this.x);
          }else {
             this.P8();
             this.R8(this.y, this.z);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a tw = this.w;
       if (tw != null) {
          tw.b();
          this.w = null;
       }
       this.y = null;
       this.z = null;
       this.v = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tx = this.x;
       if (tx != null) {
          c.c(this.t, tx);
       }
       return;
    }
    public final void R8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       BaseFragment uBaseFragmen = this.s.O();
       this.u = this.s.O.n3(p0, p1, new a$b(this, uBaseFragmen), this.v, false);
       c childFragmen = uBaseFragmen.getChildFragmentManager();
       a uoa = new a(childFragmen, this.u, new a$c(this), null);
       this.w = uoa;
       uoa.a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       FrameLayout uFrameLayout = p0.findViewById(R.id.content_fragment);
       this.t = uFrameLayout;
       uFrameLayout.setBackgroundColor(a1.a(R.color.arg_RES_7f0619d5));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(a.class);
       this.q = this.t8("LIVE_GZONE_TAB");
       this.r = this.s8(LiveGzoneFeatureEntrances.class);
       this.s = this.q8(a.class);
       return;
    }
}
