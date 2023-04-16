package com.kwai.live.gzone.accompanyplay.edit.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.kwai.live.gzone.accompanyplay.edit.u;
import n37.b0;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.live.gzone.accompanyplay.edit.w;
import com.kwai.live.gzone.accompanyplay.edit.v$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.live.gzone.accompanyplay.edit.v$b;
import com.kwai.live.gzone.accompanyplay.edit.v$c;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindUserInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyJsonInfoItem;
import java.lang.Boolean;
import android.app.Activity;
import lnc.a1;
import java.lang.StringBuilder;
import android.text.SpannableString;
import n37.d0;
import u07.t$a;
import u07.f;
import n37.a0;
import u07.u;
import n37.e0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kwai.live.gzone.accompanyplay.edit.x;
import com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import com.kwai.live.gzone.accompanyplay.edit.v$d;
import s77.b;
import f37.o0;
import lnc.u1;
import lnc.b9;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import h37.n0;
import com.kwai.live.gzone.accompanyplay.edit.v$e;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.live.gzone.accompanyplay.edit.g0;
import m56.g;
import com.kwai.live.gzone.accompanyplay.edit.g0$b;

public class v extends PresenterV2	// class@000c20
{
    public v$e A;
    public b B;
    public m p;
    public g0 q;
    public k r;
    public View s;
    public View t;
    public View u;
    public RecyclerView v;
    public View w;
    public KwaiImageView x;
    public KwaiImageView y;
    public View z;

    public void v(){
       super();
    }
    public void E8(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       this.S8();
       if (!PatchProxy.applyVoid(objArray, this, ov, "11")) {
          this.X7(this.p.l.subscribe(new u(this), new b0(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "4")) {
          this.X7(this.p.m.subscribe(new w(this)));
       }
       this.z.setOnClickListener(new v$a(this));
       this.u.setOnClickListener(new v$b(this));
       this.t.setOnClickListener(new v$c(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       this.W8();
       return;
    }
    public final void P8(k p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "16")) {
          return;
       }
       if (p0.c == null) {
          this.S8();
          return;
       }else {
          String str = null;
          k a = p0.a;
          if (a != null) {
             LiveGzoneAccompanyGameFleetSetting mFleetSettin = a.mFleetSettingList;
             if (mFleetSettin != null) {
                Iterator iterator = mFleetSettin.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      LiveGzoneAccompanyFleetSetting liveGzoneAcc = iterator.next();
                      if (TextUtils.n(liveGzoneAcc.mFleetId, this.r.d)) {
                         str = liveGzoneAcc;
                      }
                   }
                   if (str == null) {
                      return;
                   }else {
                      p0 = p0.b;
                      if (!PatchProxy.applyVoidOneRefs(p0, this, ov, "17")) {
                         this.x.U(p0.mGameIcon);
                         this.y.U(p0.mBackground);
                         break ;
                      }
                   }
                }
             }
          }
          return;
       }
    }
    public LiveGzoneAccompanyBindGameAccountInfo R8(List p0){
       LiveGzoneAccompanyBindGameAccountInfo obj = PatchProxy.applyOneRefs(p0, this, v.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.size()) {
          return null;
       }
       obj = new LiveGzoneAccompanyBindGameAccountInfo();
       obj.mInfoList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveGzoneAccompanyBindUserInfo liveGzoneAcc = iterator.next();
          LiveGzoneAccompanyJsonInfoItem liveGzoneAcc1 = new LiveGzoneAccompanyJsonInfoItem();
          liveGzoneAcc1.mTitle = liveGzoneAcc.mTitle;
          liveGzoneAcc1.mContent = liveGzoneAcc.mContent;
          obj.mInfoList.add(liveGzoneAcc1);
       }
       return obj;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, v.class, "14")) {
          return;
       }
       this.w.setVisibility(8);
       return;
    }
    public void V8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "9")) {
          return;
       }
       if (this.r.c == null) {
          return;
       }
       if (p0) {
          Activity activity = this.getActivity();
          if (!PatchProxy.applyVoidOneRefs(activity, this, ov, "20") && a1.i(activity)) {
             String str = a1.p(R.string.arg_RES_7f1013b6);
             String str1 = "¡¶"+a1.p(0x7f1013b7)+"¡·";
             SpannableString spannableStr = new SpannableString(str);
             int i = str.indexOf(str1);
             int i1 = str.indexOf(str1);
             spannableStr.setSpan(new d0(this), i, (i1 + str1.length()), 33);
             t$a uoa = f.e(new t$a(activity));
             uoa.W0(R.string.arg_RES_7f1013b7);
             uoa.z0(spannableStr);
             uoa.S0(R.string.arg_RES_7f1013b5);
             uoa.Q0(R.string.arg_RES_7f103e40);
             uoa.u0(new a0(this));
             uoa.Y(new e0(this));
          }
          return;
       }else if(PatchProxy.applyVoid(null, this, ov, "7")){
          this.W8();
          this.B = this.getActivity().m().subscribe(new x(this));
       }
       k c = this.r.c;
       o0.n(this.getActivity(), c.mOriginId, c.mLivelinkPath, false, new v$d(this));
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, v.class, "8")) {
          return;
       }
       u1.b(this);
       b9.a(this.B);
       return;
    }
    public void X8(LiveGzoneAccompanyBindGameAccountInfo p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "18")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ov, "15")) {
          this.w.setVisibility(0);
       }
       int i = 8;
       if (p0 == null) {
          this.s.setVisibility(i);
          if (this.z.getVisibility()) {
             n0.a(this.p.o.a(), this.r.b);
             this.z.setVisibility(0);
          }
       }else {
          this.s.setVisibility(0);
          this.z.setVisibility(i);
          if (!PatchProxy.applyVoidOneRefs(p0, this, ov, "19")) {
             if (this.A == null) {
                this.A = new v$e(objArray);
                this.v.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, 0));
                this.v.setAdapter(this.A);
                while (this.v.getItemDecorationCount() > 0) {
                   this.v.removeItemDecorationAt(0);
                }
                this.v.addItemDecoration(new b(1, a1.e(13.00f)));
             }
             ov = this.A;
             p0 = p0.mInfoList;
             Objects.requireNonNull(ov);
             if (!PatchProxy.applyVoidOneRefs(p0, ov, v$e.class, "4") && ov.e != p0) {
                ov.e = p0;
                ov.k0();
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a1e97);
       this.t = p0.findViewById(0x7f0a0071);
       this.u = p0.findViewById(0x7f0a0070);
       this.v = p0.findViewById(0x7f0a1dcd);
       this.x = p0.findViewById(0x7f0a1f06);
       this.y = p0.findViewById(0x7f0a1f05);
       this.z = p0.findViewById(0x7f0a043c);
       this.w = p0.findViewById(0x7f0a0065);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_PARAMS");
       this.q = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_POPUP");
       return;
    }
    public void onEvent(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "6")) {
          return;
       }
       this.W8();
       v tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(null, tq, g0.class, "5")) {
          b9.a(tq.s);
          tq.s = tq.p.H.a();
       }
       return;
    }
}
