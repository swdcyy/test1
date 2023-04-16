package com.kwai.live.gzone.accompanyplay.edit.k0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.content.Context;
import android.view.View;
import i2b.a;
import n37.r1;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$Option;
import n37.k;
import n37.s1;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.nex3z.flowlayout.FlowLayout;

public class k0 extends PresenterV2	// class@000c04
{
    public LiveGzoneAccompanyFleetSetting$SettingItem p;
    public m q;
    public k r;
    public TextView s;
    public FlowLayout t;
    public TextView u;

    public void k0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "3")) {
          return;
       }
       k0 tq = this.q;
       if (tq.f != null && tq.g == null) {
          this.t.getLayoutParams().leftMargin = a1.d(0x7f0707b0);
       }
       this.s.setText(this.p.mTitle);
       int i = 0;
       if (!TextUtils.x(this.p.mTips)) {
          this.u.setVisibility(i);
          this.u.setText(this.p.mTips);
       }else {
          this.u.setVisibility(8);
       }
       this.t.removeAllViews();
       if (q.f(this.p.mOptions)) {
          return;
       }else {
          for (int i1 = 0; i1 < this.p.mOptions.size(); i1 = i1 + 1) {
             TextView textView = a.d(this.getContext(), R.layout.arg_RES_7f0d0b5a, this.t, i);
             textView.setOnClickListener(new r1(this, i1));
             LiveGzoneAccompanyFleetSetting$Option option = this.p.mOptions.get(i1);
             textView.setText(option.mContent);
             if (TextUtils.n(this.p.mEditingItemValue, option.mValue)) {
                textView.setSelected(true);
             }
             this.t.addView(textView);
          }
          this.X7(this.r.h.subscribe(new s1(this), Functions.e));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a1dab);
       this.t = p0.findViewById(0x7f0a1db0);
       this.u = p0.findViewById(0x7f0a1db2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAccompanyFleetSetting$SettingItem.class);
       this.q = this.q8(m.class);
       this.r = this.q8(k.class);
       return;
    }
}
