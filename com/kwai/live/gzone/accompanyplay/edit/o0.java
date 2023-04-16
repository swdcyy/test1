package com.kwai.live.gzone.accompanyplay.edit.o0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n37.k;
import com.kwai.live.gzone.accompanyplay.edit.o0$a;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.live.gzone.accompanyplay.edit.m;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$SettingItem;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$Option;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import mrd.a;
import android.view.View;
import n37.a2;
import io.reactivex.internal.functions.Functions;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.StringBuilder;
import n37.z1;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.n0;
import n37.y1;

public class o0 extends PresenterV2	// class@000c11
{
    public int A;
    public LiveGzoneAccompanyFleetSetting$SettingItem p;
    public m q;
    public k r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public FloatEditorFragment y;
    public int z;

    public void o0(){
       super();
    }
    public void E8(){
       String[] stringArray;
       o0 tw;
       object oobject1;
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o0.class, "3")) {
          return;
       }
       this.X7(this.r.g.subscribe(new o0$a(this)));
       o0 tq = this.q;
       int i = 0;
       if (tq.f != null && tq.g == null) {
          this.t.getLayoutParams().leftMargin = a1.d(0x7f0707b0);
          this.v.setPadding(i, i, a1.e(12.00f), i);
       }
       LiveGzoneAccompanyFleetSetting$SettingItem mOptions = this.p.mOptions;
       object oobject = 2;
       if (mOptions != null && mOptions.size() >= oobject) {
          try{
             this.z = Integer.parseInt(this.p.mOptions.get(i).mValue);
             this.A = Integer.parseInt(this.p.mOptions.get(1).mValue);
          }catch(java.lang.NumberFormatException e0){
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "5")) {
          return;
       }
       o0 ty = this.y;
       if (ty != null) {
          ty.dismiss();
          this.y = null;
       }
       this.z = 0;
       this.A = 0;
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o0.class, "7")) {
          return;
       }
       if (TextUtils.x(this.w.getText())) {
          this.p.mEditingItemValue = objArray;
          this.x.setSelected(false);
       }else {
          this.p.mEditingItemValue = "2-"+this.w.getText();
          this.x.setSelected(true);
       }
       this.r.f.onNext(new Object());
       this.t.setSelected(false);
       this.u.setSelected(true);
       this.v.setSelected(true);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "6")) {
          return;
       }
       this.w.setText("");
       this.t.setSelected(false);
       this.u.setSelected(false);
       this.v.setSelected(false);
       this.x.setSelected(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a1dab);
       this.t = p0.findViewById(0x7f0a1daa);
       this.u = p0.findViewById(0x7f0a1daf);
       this.v = p0.findViewById(0x7f0a1dae);
       this.w = p0.findViewById(0x7f0a1dad);
       this.x = p0.findViewById(0x7f0a1dac);
       this.t.setOnClickListener(new z1(this));
       this.w.setOnClickListener(new n0(this));
       this.u.setOnClickListener(new y1(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAccompanyFleetSetting$SettingItem.class);
       this.q = this.q8(m.class);
       this.r = this.q8(k.class);
       return;
    }
}
