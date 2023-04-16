package com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;
import lnc.a1;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$a;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.View;
import bld.c;
import bld.b;
import android.graphics.drawable.Drawable;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.widget.KwaiRadiusStyles;
import com.kuaishou.live.common.core.component.gift.h;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import java.lang.Number;
import java.lang.System;
import ekd.k1;
import android.text.TextPaint;
import java.lang.Math;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Boolean;
import ug1.h0;
import androidx.recyclerview.widget.RecyclerView$r;
import ug1.g0;
import java.lang.Runnable;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import i2b.a;
import ug1.e0;
import android.app.Dialog;
import android.view.Window;
import qka.b;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$d;

public class LiveGiftNumberNewSelectDialog extends LiveSafeDialogFragment implements d	// class@001134
{
    public View s;
    public View t;
    public RecyclerView u;
    public LiveGiftNumberNewSelectDialog$d v;
    public int w;
    public View x;
    public b y;
    public LiveGiftNumberNewSelectDialog$a z;
    public static final int A;

    public void LiveGiftNumberNewSelectDialog(){
       super();
       this.w = 1;
    }
    public static List wh(int p0){
       ArrayList obj;
       if (PatchProxy.isSupport(LiveGiftNumberNewSelectDialog.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, LiveGiftNumberNewSelectDialog.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       int i = 1314;
       if (p0 >= i) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a61)));
       }
       i = 520;
       if (p0 >= i) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a64)));
       }
       i = 188;
       if (p0 >= i) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a62)));
       }
       i = 66;
       if (p0 >= i) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a65)));
       }
       i = 30;
       if (p0 >= i) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a63)));
       }
       i = 10;
       if (p0 >= i) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(i, a1.p(R.string.arg_RES_7f103a60)));
       }
       if (p0 >= 1) {
          obj.add(new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(1, a1.p(R.string.arg_RES_7f103a5f)));
       }
       return obj;
    }
    public static LiveGiftNumberNewSelectDialog xh(int p0,LiveGiftNumberNewSelectDialog$a p1){
       LiveGiftNumberNewSelectDialog obj;
       if (PatchProxy.isSupport(LiveGiftNumberNewSelectDialog.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, LiveGiftNumberNewSelectDialog.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveGiftNumberNewSelectDialog();
       obj.kh("maxBatchCount", p0);
       obj.z = p1;
       return obj;
    }
    public void Ah(View p0,int p1,c p2){
       if (PatchProxy.isSupport(LiveGiftNumberNewSelectDialog.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveGiftNumberNewSelectDialog.class, "4")) {
          return;
       }
       b uob = new b();
       uob.p(a1.a(R.color.arg_RES_7f061dd7), a1.a(p1));
       if (p2 != null) {
          uob.g(p2);
       }
       p0.setBackground(uob.a());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberNewSelectDialog.class, "3")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1d52);
       this.t = m1.f(p0, 0x7f0a3ffa);
       this.u = m1.f(p0, 0x7f0a222f);
       this.Ah(m1.f(p0, R.id.edit_count_text), R.color.arg_RES_7f06008c, KwaiRadiusStyles.BL8_BR8);
       m1.a(p0, new h(this), R.id.edit_count_text);
       return;
    }
    public void onActivityCreated(Bundle p0){
       List list;
       int i3;
       int i4;
       int i5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberNewSelectDialog.class, "8")) {
          return;
       }
       super.onActivityCreated(p0);
       int i = 1;
       int i1 = this.ch("maxBatchCount", i);
       this.w = i1;
       if (PatchProxy.isSupport(LiveGiftNumberNewSelectDialog.class)) {
          list = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, LiveGiftNumberNewSelectDialog.class, "13");
          if (list != patchProxyRe) {
          }else {
          label_0032 :
             LiveGiftNumberNewSelectDialog tz = this.z;
             list = (tz != null)? tz.a(i1): LiveGiftNumberNewSelectDialog.wh(i1);
          }
       }else {
          goto label_0032 ;
       }
       ViewGroup$LayoutParams layoutParams = this.s.getLayoutParams();
       TextPaint obj = PatchProxy.applyOneRefs(list, this, LiveGiftNumberNewSelectDialog.class, "10");
       int i2 = 0;
       if (obj != patchProxyRe) {
          i3 = obj.intValue();
       }else {
          System.currentTimeMillis();
          if (!k1.h()) {
             i3 = a1.e(0x42f00000);
          }else {
             obj = new TextPaint(i);
             obj.setTextSize((float)a1.d(R.dimen.arg_RES_7f070895));
             i4 = 0;
             int i7 = 0;
             for (int i6 = 0; i6 < list.size(); i6 = i6 + 1) {
                LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem liveGiftBatc = list.get(i6);
                int i8 = (int)Math.ceil((double)obj.measureText(liveGiftBatc.mGiftBatchCountDescription));
                if (!TextUtils.x(liveGiftBatc.mLabel)) {
                   i7 = a1.d(0x7f070894) + a1.d(0x7f070893);
                   i8 = i8 + i7;
                   i7 = 1;
                }
                i4 = Math.max(i8, i4);
             }
             i4 = i4 + (a1.d(0x7f070892) + a1.d(0x7f07088f));
             i3 = (i7)? Math.max(i4, a1.e(131.00f)): Math.max(i4, a1.e(113.00f));
          }
       }
       layoutParams.width = i3;
       i3 = a1.d(R.dimen.arg_RES_7f07088b);
       i4 = (a1.d(0x7f070890) * list.size()) + a1.d(0x7f07088e);
       layoutParams.height = Math.min(i3, i4);
       this.s.setLayoutParams(layoutParams);
       if (PatchProxy.applyVoid(null, this, LiveGiftNumberNewSelectDialog.class, "12") || (this.x != null && this.getActivity() != null)) {
          int[] ointArray = new int[2];
          this.x.getLocationOnScreen(ointArray);
          int[] ointArray1 = new int[2];
          n.f(this.getActivity()).getLocationOnScreen(ointArray1);
          ViewGroup$MarginLayoutParams layoutParams1 = this.s.getLayoutParams();
          layoutParams1.bottomMargin = (n.j(this.getActivity()) - (ointArray[i] - ointArray1[i])) + a1.e(24.00f);
          layoutParams1.leftMargin = ((ointArray[i2] - ointArray1[i2]) + (this.x.getWidth() / 2)) - (layoutParams1.width / 2);
          this.s.setLayoutParams(layoutParams1);
       }
    label_0166 :
       LiveGiftNumberNewSelectDialog$b uob = new LiveGiftNumberNewSelectDialog$b(this);
       uob.W0(list);
       this.u.setAdapter(uob);
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
       this.u.setLayoutManager(linearLayout);
       if (i4 <= i3) {
          i = false;
       }
       if (!PatchProxy.isSupport(LiveGiftNumberNewSelectDialog.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), this, LiveGiftNumberNewSelectDialog.class, "11")) {
          if (i) {
             this.u.addOnScrollListener(new h0(this));
             this.u.post(new g0(this));
          }else {
             this.t.setVisibility(8);
          }
       }
       LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem obj1 = PatchProxy.applyOneRefs(list, this, LiveGiftNumberNewSelectDialog.class, "9");
       if (obj1 != patchProxyRe) {
          i5 = obj1.intValue();
       }else {
          i5 = -1;
          if (list.size()) {
             while (i2 < list.size()) {
                obj1 = list.get(i2);
                if (obj1 != null && !TextUtils.x(obj1.mLabel)) {
                   i5 = i2;
                   break ;
                }
                i2 = i2 + 1;
             }
          }
       }
       if (i5 > 0) {
          linearLayout.scrollToPositionWithOffset(i5, (a1.d(R.dimen.arg_RES_7f070890) * 3));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftNumberNewSelectDialog.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(0, R.style.arg_RES_7f110382);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGiftNumberNewSelectDialog.class, "6");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0cec, null, false);
       view.setOnClickListener(new e0(this));
       this.doBindView(view);
       this.nh(false);
       return view;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveGiftNumberNewSelectDialog.class, "7")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          b.a(dialog.getWindow());
          dialog.getWindow().setDimAmount(0);
          dialog.getWindow().getDecorView().setPadding(0, 0, 0, 0);
          dialog.getWindow().setLayout(-1, -1);
          dialog.getWindow().setWindowAnimations(0);
          dialog.setCanceledOnTouchOutside(true);
       }
       return;
    }
    public LiveGiftNumberNewSelectDialog yh(View p0){
       this.x = p0;
       return this;
    }
    public void zh(LiveGiftNumberNewSelectDialog$d p0){
       this.v = p0;
    }
}
