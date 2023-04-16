package com.kwai.live.gzone.accompanyplay.edit.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.lang.CharSequence;
import android.widget.TextView;
import n37.k;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.widget.ImageView;
import n37.t;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import n37.u;
import com.kwai.library.widget.popup.common.c;
import io.reactivex.subjects.PublishSubject;
import j37.b;
import j37.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import cjd.e;
import erd.o;
import n37.v;
import com.kwai.live.gzone.accompanyplay.edit.q;
import android.view.View$OnClickListener;
import n37.q;
import com.kwai.live.gzone.accompanyplay.edit.r;

public class s extends PresenterV2	// class@000c17
{
    public LiveGzoneAccompanyFleetSetting p;
    public k q;
    public View r;
    public TextView s;
    public TextView t;
    public ImageView u;
    public ImageView v;
    public c w;
    public c x;

    public void s(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.s.setText(this.p.mEditingTitle);
       boolean b = true;
       boolean b1 = false;
       if (TextUtils.n(this.p.mFleetId, this.q.d)) {
          this.r.setSelected(b);
          this.t.setText(R.string.arg_RES_7f102345);
          this.t.setAlpha(0x3f000000);
          this.t.setEnabled(b1);
       }else {
          this.r.setSelected(b1);
          this.t.setText(R.string.arg_RES_7f100912);
          this.t.setAlpha(0x3f800000);
          this.t.setEnabled(b);
          if (this.p.mIsEmptyFleet != null) {
             this.v.setAlpha(0.30f);
             this.v.setEnabled(b1);
          }
       }
       this.S8();
       g e = Functions.e;
       this.X7(this.q.i.subscribe(new t(this), e));
       this.X7(this.q.h.subscribe(new u(this), e));
       return;
    }
    public void J8(){
       s os = s.class;
       if (PatchProxy.applyVoid(null, this, os, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, os, "12")) {
          os = this.w;
          if (os != null) {
             os.o();
             this.w = null;
          }
          os = this.x;
          if (os != null) {
             os.o();
             this.x = null;
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, s.class, "10")) {
          return;
       }
       this.p.clearSettingItemValue();
       this.q.h.onNext(this.p.mFleetId);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, s.class, "9")) {
          return;
       }
       if (this.p.mIsEmptyFleet != null) {
          this.P8();
       }else {
          this.X7(a.b().i(this.q.b.mGameId, this.p.mFleetId).map(new e()).subscribe(new v(this), Functions.e));
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       if (this.p.isEmptySetting()) {
          this.u.setAlpha(0.30f);
          this.u.setEnabled(false);
       }else {
          this.u.setAlpha(0x3f800000);
          this.u.setEnabled(true);
       }
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "4")) {
          return;
       }
       if (TextUtils.n(p0, this.p.mFleetId)) {
          this.s.setText(this.p.mEditingTitle);
          this.S8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a1dc7);
       this.s = p0.findViewById(0x7f0a1dca);
       this.t = p0.findViewById(0x7f0a1dc8);
       this.u = p0.findViewById(0x7f0a1dc6);
       this.v = p0.findViewById(0x7f0a1dc9);
       this.t.setOnClickListener(new q(this));
       this.v.setOnClickListener(new q(this));
       this.u.setOnClickListener(new r(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAccompanyFleetSetting.class);
       this.q = this.q8(k.class);
       return;
    }
}
