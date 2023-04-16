package com.kwai.live.gzone.accompanyplay.edit.m0;
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
import java.lang.Integer;
import java.util.List;
import android.content.Context;
import android.view.View;
import i2b.a;
import n37.t1;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$Option;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting$ValuesOptionContent;
import android.widget.SeekBar;
import com.kwai.live.gzone.accompanyplay.edit.l0;
import com.kwai.live.gzone.accompanyplay.edit.GzoneProgressTextSeekBar$a;
import com.kwai.live.gzone.accompanyplay.edit.GzoneProgressTextSeekBar;
import n37.v1;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import n37.k;
import n37.u1;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.lang.StringBuilder;
import mrd.a;
import java.lang.Boolean;
import com.nex3z.flowlayout.FlowLayout;

public class m0 extends PresenterV2	// class@000c0a
{
    public TextView A;
    public int B;
    public View C;
    public View D;
    public LiveGzoneAccompanyFleetSetting$SettingItem p;
    public m q;
    public k r;
    public String s;
    public TextView t;
    public TextView u;
    public FlowLayout v;
    public TextView w;
    public ViewGroup x;
    public GzoneProgressTextSeekBar y;
    public TextView z;

    public void m0(){
       super();
       this.s = "0";
    }
    public void E8(){
       object oobject;
       int i2;
       int i3;
       View view;
       LiveGzoneAccompanyFleetSetting$Option option;
       int i4;
       int i5;
       int i6;
       int i7;
       String str1;
       int i8;
       String str = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, m0.class, "3")) {
          return;
       }
       m0 q = str.q;
       if (q.f != null && q.g == null) {
          str.v.getLayoutParams().leftMargin = a1.d(0x7f0707b0);
       }
       str.t.setText(str.p.mTitle);
       str.u.setText(R.string.arg_RES_7f1023c0);
       int i = 0;
       if (!TextUtils.x(str.p.mTips)) {
          str.w.setVisibility(i);
          str.w.setText(str.p.mTips);
       }else {
          str.w.setVisibility(8);
       }
       str.v.removeAllViews();
       if (q.f(str.p.mOptions)) {
          return;
       }else {
          int i1 = 1;
          if (!TextUtils.x(str.p.mEditingItemValue)) {
             String[] stringArray = (str.p.mEditingItemValue).split("-");
             if (stringArray.length >= 2) {
                objArray = stringArray[i];
                if (!TextUtils.x(stringArray[i1])) {
                   try{
                      oobject = objArray;
                      i2 = Integer.parseInt(stringArray[i1]);
                   }catch(java.lang.NumberFormatException e0){
                   }
                }
             }else if(stringArray.length == i1){
                objArray = stringArray[i];
             }
          }
          oobject = e0;
          i2 = -1;
       }
    }
    public final void P8(int p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om0, "6")) {
          return;
       }
       boolean b = true;
       this.v.getChildAt(p0).setSelected(b);
       om0 = null;
       for (int i = 0; i < this.p.mOptions.size(); i = i + 1) {
          View childAt = this.v.getChildAt(i);
          boolean b1 = (p0 == i)? true: false;
          childAt.setSelected(b1);
       }
       LiveGzoneAccompanyFleetSetting$Option mValue = this.p.mOptions.get(p0).mValue;
       this.s = mValue;
       if (("2").equals(mValue)) {
          this.R8(b);
          this.p.mEditingItemValue = mValue+"-"+this.B;
          this.r.g.onNext(Integer.valueOf(this.B));
       }else {
          this.R8(om0);
          this.p.mEditingItemValue = mValue;
          this.r.g.onNext(Integer.valueOf(-1));
       }
       this.r.f.onNext(Boolean.TRUE);
       return;
    }
    public final void R8(boolean p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om0, "7")) {
          return;
       }
       om0 = this.x;
       int i = (p0)? 0: 8;
       om0.setVisibility(i);
       if (this.x.getVisibility() == this.C.getVisibility() && !this.x.getVisibility()) {
          this.D.setVisibility(0);
       }else {
          this.D.setVisibility(8);
       }
       return;
    }
    public final void S8(boolean p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om0, "8")) {
          return;
       }
       om0 = this.C;
       int i = (p0)? 0: 8;
       om0.setVisibility(i);
       if (this.x.getVisibility() == this.C.getVisibility() && !this.x.getVisibility()) {
          this.D.setVisibility(0);
       }else {
          this.D.setVisibility(8);
       }
       return;
    }
    public void V8(int p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om0, "5")) {
          return;
       }
       this.B = p0 * 60;
       if (("2").equals(this.s)) {
          p0.mEditingItemValue = "2-"+this.B;
          this.r.f.onNext(Boolean.TRUE);
          this.r.g.onNext(Integer.valueOf(this.B));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "2")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a1dab);
       this.u = p0.findViewById(0x7f0a1db1);
       this.z = p0.findViewById(0x7f0a1dc3);
       this.A = p0.findViewById(0x7f0a1dc2);
       this.v = p0.findViewById(0x7f0a1db0);
       this.w = p0.findViewById(0x7f0a1db2);
       this.C = p0.findViewById(0x7f0a11e1);
       this.D = p0.findViewById(0x7f0a006f);
       this.x = p0.findViewById(0x7f0a006e);
       this.y = p0.findViewById(0x7f0a3806);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAccompanyFleetSetting$SettingItem.class);
       this.q = this.q8(m.class);
       this.r = this.q8(k.class);
       return;
    }
}
