package com.kwai.live.gzone.accompanyplay.edit.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import g37.d;
import com.kwai.live.gzone.accompanyplay.edit.a0$a;
import erd.g;
import crd.b;
import com.kwai.live.gzone.accompanyplay.edit.a0$b;
import com.kwai.live.gzone.accompanyplay.edit.a0$c;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.live.gzone.accompanyplay.edit.a0$d;
import com.kwai.live.gzone.accompanyplay.edit.a0$e;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.kwai.live.gzone.accompanyplay.edit.z;
import n37.g0;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import f37.a;
import android.content.SharedPreferences;
import com.kwai.live.gzone.accompanyplay.edit.c0;
import io.reactivex.g;
import com.kwai.live.gzone.accompanyplay.edit.a0$f;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import mrd.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import h37.n0;
import com.kwai.live.gzone.accompanyplay.edit.a0$g;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.live.gzone.accompanyplay.edit.g0;

public class a0 extends PresenterV2	// class@000bd8
{
    public View A;
    public a0$g B;
    public boolean C;
    public m p;
    public g0 q;
    public d r;
    public k s;
    public View t;
    public View u;
    public View v;
    public RecyclerView w;
    public View x;
    public KwaiImageView y;
    public KwaiImageView z;

    public void a0(){
       super();
    }
    public void E8(){
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa0, "3")) {
          return;
       }
       this.X7(this.r.c().subscribe(new a0$a(this)));
       this.X7(this.r.d().subscribe(new a0$b(this)));
       this.A.setOnClickListener(new a0$c(this));
       this.v.setOnClickListener(new a0$d(this));
       this.u.setOnClickListener(new a0$e(this));
       this.S8();
       if (!PatchProxy.applyVoid(objArray, this, uoa0, "5")) {
          this.X7(this.p.l.subscribe(new z(this), new g0(this)));
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, a0.class, "17");
    }
    public void P8(boolean p0){
       t ot;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "13")) {
          return;
       }
       if (PatchProxy.isSupport(uoa0)) {
          ot = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa0, "15");
          if (ot != PatchProxyResult.class) {
          }else if(!p0 || a.a.getBoolean("gzoneDoNotShowBindGameAlert", false)){
             ot = t.just(Boolean.TRUE);
          }else {
             ot = t.create(new c0(this));
          }
       }else {
          goto label_002c ;
       }
       this.X7(ot.subscribe(new a0$f(this)));
       return;
    }
    public final void R8(k p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa0, "9")) {
          return;
       }
       if (p0.b.mEnableOneClick == null) {
          this.S8();
          return;
       }else {
          LiveGzoneAccompanyFleetSetting liveGzoneAcc = null;
          k a = p0.a;
          if (a != null) {
             LiveGzoneAccompanyGameFleetSetting mFleetSettin = a.mFleetSettingList;
             if (mFleetSettin != null) {
                Iterator iterator = mFleetSettin.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      LiveGzoneAccompanyFleetSetting liveGzoneAcc1 = iterator.next();
                      if (TextUtils.n(liveGzoneAcc1.mFleetId, this.s.d)) {
                         liveGzoneAcc = liveGzoneAcc1;
                      }
                   }
                   if (liveGzoneAcc == null) {
                      return;
                   }else {
                      p0 = p0.b;
                      if (!PatchProxy.applyVoidOneRefs(p0, this, uoa0, "10")) {
                         this.y.U(p0.mGameIcon);
                         this.z.U(p0.mBackground);
                      }
                      this.V8(liveGzoneAcc.mBindGameAccountInfo);
                      break ;
                   }
                }
             }
          }
          return;
       }
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "7")) {
          return;
       }
       this.x.setVisibility(8);
       return;
    }
    public void V8(LiveGzoneAccompanyBindGameAccountInfo p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa0, "11")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoa0, "8")) {
          this.x.setVisibility(0);
       }
       Iterator iterator = this.s.a.mFleetSettingList.iterator();
       while (true) {
          if (iterator.hasNext()) {
             LiveGzoneAccompanyFleetSetting liveGzoneAcc = iterator.next();
             if (TextUtils.n(liveGzoneAcc.mFleetId, this.s.d)) {
                liveGzoneAcc.mEditingGameAccountInfo = p0;
             }
          }
          this.s.f.onNext(Boolean.TRUE);
          int i = 8;
          if (p0 == null) {
             this.t.setVisibility(i);
             if (this.A.getVisibility()) {
                n0.a(this.p.o.a(), this.s.b);
                this.A.setVisibility(0);
                break ;
             }
          }else {
             this.t.setVisibility(0);
             this.A.setVisibility(i);
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoa0, "12")) {
                if (this.B == null) {
                   this.B = new a0$g(objArray);
                   this.w.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, 0));
                   this.w.setAdapter(this.B);
                   while (this.w.getItemDecorationCount() > 0) {
                      this.w.removeItemDecorationAt(0);
                   }
                   this.w.addItemDecoration(new b(1, a1.e(13.00f)));
                }
                uoa0 = this.B;
                p0 = p0.mInfoList;
                Objects.requireNonNull(uoa0);
                if (!PatchProxy.applyVoidOneRefs(p0, uoa0, a0$g.class, "4") && uoa0.e != p0) {
                   uoa0.e = p0;
                   uoa0.k0();
                   break ;
                }
             }
          }
          break ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a1e97);
       this.u = p0.findViewById(0x7f0a0071);
       this.v = p0.findViewById(0x7f0a0070);
       this.w = p0.findViewById(0x7f0a1dcd);
       this.y = p0.findViewById(0x7f0a1f06);
       this.z = p0.findViewById(0x7f0a1f05);
       this.A = p0.findViewById(0x7f0a043c);
       this.x = p0.findViewById(0x7f0a0065);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.r = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE");
       this.p = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_PARAMS");
       this.q = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_POPUP");
       return;
    }
}
