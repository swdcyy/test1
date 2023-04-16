package com.yxcorp.gifshow.fragment.PopupWindowFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;
import android.view.Window;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.Objects;
import android.view.View;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Math;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public class PopupWindowFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@00126b
{
    public final Window b;
    public final PopupWindowFragment c;

    public void PopupWindowFragment$b(PopupWindowFragment p0,Window p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PopupWindowFragment$b.class, "1")) {
          return;
       }
       if (!this.c.isAdded()) {
          return;
       }
       this.c.u.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       PopupWindowFragment$b tc = this.c;
       PopupWindowFragment x = tc.x;
       if (tc.t != null) {
          PopupWindowFragment$b tb = this.b;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(x, tb, tc, PopupWindowFragment.class, "5")) {
             int[] ointArray = new int[2];
             tc.t.getLocationOnScreen(ointArray);
             int[] ointArray1 = new int[2];
             tb.getDecorView().getLocationOnScreen(ointArray1);
             int i = ointArray1[0];
             int i1 = 1;
             int i2 = ointArray1[i1];
             int i3 = (ointArray[0] + (tc.t.getWidth() / 2)) - i;
             int i4 = (ointArray[i1] + (tc.t.getHeight() / 2)) - i2;
             PopupWindowFragment b = tc.B;
             if (b != null) {
                if (b != i1) {
                   if (b != 2) {
                      if (b == 3) {
                         tc.r = 0;
                         tc.s = i4 - (tc.x.getHeight() / 2);
                      }
                   }else {
                      tc.r = (ointArray[0] - tc.x.getWidth()) - i;
                      tc.s = i4 - (tc.x.getHeight() / 2);
                   }
                }else {
                   tc.r = i3 - (x.getWidth() / 2);
                   tc.s = (ointArray[i1] + tc.t.getHeight()) - i2;
                }
             }else {
                tc.r = i3 - (x.getWidth() / 2);
                tc.s = (ointArray[i1] - x.getHeight()) - i2;
             }
             if (tc.y != null) {
                tc.r = Math.max(tc.z, Math.min((((n.y(tc.getContext()) - x.getWidth()) - tc.z) - i), tc.r));
                tc.s = Math.max(tc.A, Math.min(((n.j(tc.getActivity()) - x.getHeight()) - i2), tc.s));
             }
             PopupWindowFragment b1 = tc.B;
             if (b1 != 2 && b1 != 3) {
                i1 = 0;
             }
             if (i1) {
                tc.yh(i4, tc.s);
             }else {
                tc.zh(i3, tc.r);
             }
          }
       }
       tc = this.c;
       if (tc.E != null) {
          if (tc.wh()) {
             tc = this.c;
             if (tc.w < null) {
                x.setTranslationX((float)tc.r);
             }
          }
          tc = this.c;
          x.setTranslationX((float)(tc.r + tc.w));
       }
       tc = this.c;
       x.setTranslationY((float)(tc.s + tc.v));
       this.c.u.setVisibility(0);
       return;
    }
}
