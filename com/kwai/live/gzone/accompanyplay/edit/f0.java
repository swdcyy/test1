package com.kwai.live.gzone.accompanyplay.edit.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import java.lang.CharSequence;
import android.text.TextUtils;
import n37.k;
import n37.n0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.view.View;
import com.kwai.live.gzone.accompanyplay.edit.e0;
import android.view.View$OnClickListener;

public class f0 extends PresenterV2	// class@000be3
{
    public LiveGzoneAccompanyFleetSetting$SettingItem p;
    public m q;
    public k r;
    public TextView s;
    public TextView t;
    public TextView u;
    public FloatEditorFragment v;

    public void f0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       f0 tq = this.q;
       if (tq.f != null && tq.g == null) {
          this.t.getLayoutParams().leftMargin = a1.d(0x7f0707b0);
       }
       this.s.setText(this.p.mTitle);
       this.t.setHint(this.p.mHint);
       this.t.setText(this.p.mEditingItemValue);
       if (!TextUtils.isEmpty(this.p.mTips)) {
          this.u.setVisibility(0);
          this.u.setText(this.p.mTips);
       }else {
          this.u.setVisibility(8);
       }
       this.X7(this.r.h.subscribe(new n0(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "4")) {
          return;
       }
       f0 tv = this.v;
       if (tv != null) {
          tv.dismiss();
          this.v = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a1dab);
       this.t = p0.findViewById(0x7f0a1db8);
       this.u = p0.findViewById(0x7f0a1db2);
       this.t.setOnClickListener(new e0(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAccompanyFleetSetting$SettingItem.class);
       this.q = this.q8(m.class);
       this.r = this.q8(k.class);
       return;
    }
}
