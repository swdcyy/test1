package com.yxcorp.gifshow.v3.editor.ktv.voice.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.ktv.voice.i$a;
import kwc.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Set;
import mwc.p;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.ktv.voice.i$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ekd.m1;
import android.widget.RadioButton;
import erc.k;
import android.view.View$OnClickListener;
import erc.l;
import erc.m;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment;
import com.yxcorp.gifshow.v3.editor.i;
import uaa.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import oa0.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class i extends PresenterV2	// class@001007
{
    public KtvEditEffectFragment A;
    public y B;
    public RadioButton p;
    public RadioButton q;
    public RadioButton r;
    public View s;
    public KtvEditOperationFragment t;
    public Set u;
    public i v;
    public a w;
    public KtvInfo x;
    public KtvEditVolumeFragment y;
    public KtvEditEffectFragment z;

    public void i(){
       super();
       this.B = new i$a(this);
       this.U7(new u());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.w.c0();
       this.u.add(this.B);
       if (p.a() != null) {
          p.a().j();
       }
       i ty = this.y;
       if (ty != null) {
          ty.a();
       }
       ty = this.z;
       if (ty != null) {
          ty.a();
       }
       ty = this.A;
       if (ty != null) {
          ty.a();
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       View view = this.m8();
       view.getViewTreeObserver().addOnGlobalLayoutListener(new i$b(this, view));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.u.remove(this.B);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a2f74);
       this.r = m1.f(p0, 0x7f0a0c79);
       this.q = m1.f(p0, 0x7f0a0c7d);
       this.p = m1.f(p0, 0x7f0a0ca6);
       m1.a(p0, new k(this), R.id.edit_volume);
       m1.a(p0, new l(this), R.id.edit_effect);
       m1.a(p0, new m(this), R.id.edit_change);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("EDITOR_VIEW_LISTENERS");
       this.v = this.r8("EDITOR_HELPER_CONTRACT");
       this.w = this.r8("KARAOKE");
       this.x = this.r8("KTV_INFO");
       return;
    }
    public void onClick(View p0){
       Bundle uBundle;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "8")) {
          return;
       }
       a.h1(p0.getId());
       int id = p0.getId();
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(id), this, oi, "6")) {
          if (PatchProxy.isSupport(oi)) {
             oi = PatchProxy.applyOneRefs(Integer.valueOf(id), this, oi, "7");
             if (oi != PatchProxyResult.class) {
             }else {
             label_0042 :
                String str = "EFFECT_TYPE";
                if (id == 0x7f0a0c79) {
                   if (this.z == null) {
                      this.z = new KtvEditEffectFragment();
                      uBundle = new Bundle();
                      uBundle.putInt(str, 0);
                      this.z.setArguments(uBundle);
                      this.z.dh(this.v);
                      this.z.eh(this.w);
                      this.z.fh(this.x);
                   }
                   oi = this.z;
                }else if(id == 0x7f0a0c7d){
                   if (this.A == null) {
                      this.A = new KtvEditEffectFragment();
                      uBundle = new Bundle();
                      uBundle.putInt(str, 1);
                      this.A.setArguments(uBundle);
                      this.A.dh(this.v);
                      this.A.eh(this.w);
                      this.A.fh(this.x);
                   }
                   oi = this.A;
                }else if(this.y == null){
                   KtvEditVolumeFragment ktvEditVolum = new KtvEditVolumeFragment();
                   this.y = ktvEditVolum;
                   ktvEditVolum.t = this.v;
                   ktvEditVolum.v = this.x;
                   ktvEditVolum.u = this.w;
                }
                oi = this.y;
             }
          }else {
             goto label_0042 ;
          }
          e uoe = this.t.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.ktv_sub_fragment_container, oi);
          uoe.m();
       }
       return;
    }
}
