package com.kwai.feature.component.commonfragment.baseeditor.d;
import android.view.View$OnTouchListener;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import java.lang.Number;
import android.view.Window;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import com.yxcorp.utility.n;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.lang.Math;

public class d implements View$OnTouchListener	// class@0011fd
{
    public final FloatEditorFragment b;

    public void d(FloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       d tb;
       float f;
       d tb1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       if (this.b.getActivity() != null) {
          float rawX = p1.getRawX();
          tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.applyOneRefs(p1, tb, FloatEditorFragment.class, "31");
          if (obj != patchProxyRe) {
             f = obj.floatValue();
          }else if(tb.getActivity() == null){
             f = p1.getRawY();
          }else {
             f = p1.getRawY() - (float)(n.s(tb.getContext()).y - tb.getActivity().getWindow().getDecorView().getHeight());
          }
          p1.setLocation(rawX, f);
          tb1 = this.b;
          if (tb1.M.mInterceptEvents == null) {
             tb1.getActivity().dispatchTouchEvent(p1);
          }
       }
       f = 0x3f000000;
       if (!p1.getActionMasked()) {
          tb1.k1 = (int)(p1.getX() + f);
          tb1.l1 = (int)(p1.getY() + f);
       }
       tb1 = this.b;
       if (tb1.M.mTouchCancel != null && (tb1.S == null && p1.getActionMasked() == 0.00f)) {
          tb = this.b;
          tb1 = this.b;
          if (Math.sqrt((Math.pow((double)(tb.k1 - (int)(p1.getX() + f)), 2.00f) + Math.pow((double)(tb.l1 - (int)(p1.getY() + f)), 2.00f))) - (double)tb1.m1 > 0) {
             tb1.S = true;
             tb1.cancel();
          }
       }
       if (p1.getActionMasked() == 1) {
          tb1 = this.b;
          if (tb1.R != null) {
             tb1.R = false;
          }else {
             Objects.requireNonNull(tb1);
             if (!PatchProxy.isSupport(FloatEditorFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tb1, FloatEditorFragment.class, "20")) {
                tb1.cancel();
             }
          }
       }
       return true;
    }
}
