package com.kwai.feature.component.commonfragment.baseeditor.b$a$a;
import java.lang.Runnable;
import com.kwai.feature.component.commonfragment.baseeditor.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.commonfragment.baseeditor.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import android.view.ViewGroup;
import android.view.View;
import android.view.Window;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.yxcorp.utility.RomUtils;
import android.graphics.Point;
import java.lang.Math;
import android.widget.EditText;
import android.widget.GridView;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$j;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import android.app.Activity;
import android.os.Handler;

public class b$a$a implements Runnable	// class@0011f9
{
    public final b$a b;

    public void b$a$a(b$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       b d;
       if (PatchProxy.applyVoid(null, this, b$a$a.class, "1")) {
          return;
       }
       FragmentActivity activity = this.b.d.d.getActivity();
       if (activity != null && this.b.d.d.getDialog() != null) {
          int i = this.b.d.d.oi();
          int i1 = 2;
          int[] ointArray = new int[i1];
          if (this.b.d.d.qi()) {
             this.b.d.d.g1.getLocationOnScreen(ointArray);
          }else {
             this.b.d.d.b1.getLocationOnScreen(ointArray);
          }
          Window window = this.b.d.d.getDialog().getWindow();
          int height = window.getDecorView().getHeight();
          n.A(activity);
          int i2 = height - n.g(window).getHeight();
          b$a$a tb = this.b;
          int i3 = 1;
          if (i == tb.b) {
             if (tb.d.d.Oh() != null) {
                int[] ointArray1 = new int[i1];
                this.b.d.d.b1.getLocationOnScreen(ointArray1);
                this.b.d.d.Oh().a(ointArray1[0], ointArray1[i3]);
             }
             i1 = n.n(this.b.d.d.getContext());
             height = (height - i) - this.b.d.d.ni();
             if (i1 < 0 || (RomUtils.o() || (RomUtils.s() && (i1 || (height > i2 || Math.abs(((height - i1) - n.r(this.b.d.d.getContext()).y)) < 5))))) {
                i1 = height;
             }else {
                i2 = 0;
             }
             if (i1 > i2) {
                d = this.b.d.d;
                if (d.P != null) {
                   d.W0.requestLayout();
                   this.b.d.d.P = false;
                }
                this.b.d.d.O = i1;
             }else if(this.b.d.d.f1.getVisibility()){
                d = this.b.d.d;
                if (d.P == null && (d.M.mCancelWhenKeyboardHidden != null && d.i1 == null)) {
                   d.cancel();
                   return;
                }
             }
             FloatEditorFragment t1 = this.b.d.d.t1;
             if (t1 != null) {
                t1.a();
             }
             this.b.d.d.Vh(ointArray);
             if (this.b.d.d.f1.getVisibility() == 4) {
                LinearLayout$LayoutParams layoutParams = this.b.d.d.a1.getLayoutParams();
                if (!layoutParams.weight) {
                   layoutParams.height = 0;
                   layoutParams.weight = 0x3f800000;
                }
                this.b.d.d.f1.getLayoutParams().height = 0;
                if (this.b.d.d.f1.getHeight() > 0 && i1 > 0) {
                   this.b.d.d.f1.requestLayout();
                }
             }else if(!this.b.d.d.f1.getHeight() && this.b.d.d.f1.getLayoutParams().height == null){
                b d1 = this.b.d.d;
                this.b.d.d.f1.getLayoutParams().height = d1.O;
                d1.f1.requestLayout();
             }
          }else if((tb.d.d.ni() + i) >= height && this.b.d.d.Lh() != null){
             if (this.b.d.d.pi()) {
                i2 = n.n(this.b.d.d.getActivity());
                if (i2 < 0) {
                   int[] ointArray2 = new int[i1];
                   this.b.d.d.c1.getLocationInWindow(ointArray2);
                   if (((ointArray2[i3] + this.b.d.d.c1.getHeight()) - n.j(this.b.d.d.getActivity())) < 0) {
                   label_0242 :
                      i3 = false;
                   }
                }else if(!i2){
                }
             }else if(this.b.b != null){
             }
             this.b.d.d.Wh(ointArray, i3);
          }
          b$a$a tb1 = this.b;
          tb1.b = i;
          tb1.d.d.n1.postDelayed(this, 50);
       }
    label_0265 :
       return;
    }
}
