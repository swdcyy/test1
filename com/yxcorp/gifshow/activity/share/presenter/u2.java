package com.yxcorp.gifshow.activity.share.presenter.u2;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import xw8.p0;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.content.Context;
import android.animation.ObjectAnimator;
import zw8.l5;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.activity.share.presenter.z2;
import android.animation.Animator$AnimatorListener;
import android.widget.EditText;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import com.yxcorp.utility.RomUtils;
import lnc.i5;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public final class u2 implements View$OnLayoutChangeListener	// class@001437
{
    public final w2 b;

    public void u2(w2 p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       int i1;
       w2 f;
       w2 m1;
       u2 tb = this.b;
       Objects.requireNonNull(tb);
       p5 = 1;
       w2 ow2 = (PostExperimentUtils.d() && (tb.Z != null && !tb.L.h()))? 1: null;
       w2 l = tb.L;
       if (l.F != null) {
          l.F = false;
       }else if(tb.Y != null){
          l.p(false);
       }else {
          int i = p8 - p4;
          if (tb.U < i && (p0.getHeight() > 0 && (p3 == p7 && !p0.getVisibility()))) {
             tb.R = i;
             if (!tb.L.b()) {
                tb.L.p(p5);
             }
             tb.V8(p5);
             if (ow2) {
                i1 = n.j(tb.M) - tb.R;
                tb.W = i1;
                tb.b9(false, i1);
             }
             if (c.i(tb.J, tb.N) == Workspace$Type.ATLAS || c.i(tb.J, tb.N) == Workspace$Type.SINGLE_PICTURE) {
                f = tb.F;
                if (f != null && (f.getVisibility() || (!PatchProxy.applyVoid(null, tb, w2.class, "21") && tb.F != null))) {
                   f = tb.j1;
                   if (f == null || !f.isRunning()) {
                      f = tb.k1;
                      if (f != null && f.isRunning()) {
                         tb.k1.cancel();
                      }else {
                         p5 = 0;
                      }
                      i1 = tb.F.getHeight() + tb.Y0;
                      ow2 = n.A(tb.M);
                      if (p5) {
                         m1 = tb.m1;
                         if (m1 != null) {
                         label_00d2 :
                            tb.F.setAlpha(0x3f800000);
                            ValueAnimator valueAnimato = ObjectAnimator.ofInt(new int[2]{1,0}).setDuration(50);
                            tb.i1 = valueAnimato;
                            valueAnimato.addUpdateListener(new l5(tb));
                            tb.i1.addListener(new z2(tb, m1, i1, ow2));
                            tb.i1.start();
                         }
                      }
                      m1 = tb.y.getHeight();
                      goto label_00d2 ;
                   }
                }
             }
          }else if((p4 - p8) > tb.U && (p3 == p7 && (!p0.getVisibility() && p0.getHeight() > 0))){
             if (PostExperimentUtils.d() && tb.Z != null) {
                if (tb.f1 != null || tb.L.b() == 2) {
                   if (tb.L.b() == p5) {
                      tb.L.p(false);
                   }
                }else {
                   tb.L.p(false);
                }
                tb.Y8();
                if (tb.w.hasFocus()) {
                   tb.w.clearFocus();
                }
             }
          label_0151 :
             if (tb.L.b() == p5) {
                tb.L.p(false);
             }
             if (c.i(tb.J, tb.N) == Workspace$Type.ATLAS || (c.i(tb.J, tb.N) == Workspace$Type.SINGLE_PICTURE && !tb.L.b())) {
                tb.Z8();
             }
             tb.V8(false);
          }else if(ow2 != null){
             f = tb.B;
             if (f != null && (f.th() > p4 && (RomUtils.s() && i5.d()))) {
                Object[] objArray = new Object[false];
                a.b().w("ShareKeyboardStatus", "bindEvents showKeyboardPopupWindow: oppo,updateLocationYoldKeyboardY: "+tb.B.th()+" bottom:"+p4, objArray);
                tb.b9(false, p4);
             }
          }
       }
       return;
    }
}
