package com.yxcorp.gifshow.v3.editor.transition.b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$g;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import android.widget.CheckBox;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;
import voc.w;

public final class b implements TransitionEffectFragment$b	// class@00151f
{
    public final TransitionEffectFragment$g a;

    public void b(TransitionEffectFragment$g p0){
       this.a = p0;
       super();
    }
    public boolean a(View p0,MotionEvent p1,int p2){
       TransitionEffectFragment$g obj;
       boolean b;
       TransitionEffectFragment n;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "v");
       a.p(p1, "event");
       int actionMasked = p1.getActionMasked();
       b = false;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 3) {
                if (actionMasked != 4) {
                   if (actionMasked == 12) {
                      obj = this.a.b;
                      n = obj.n;
                      if (n != null) {
                         n.e(b, TransitionEffectFragment.dh(obj).isChecked(), p2);
                      }
                   }
                }else {
                   obj = this.a.b;
                   n = obj.n;
                   if (n != null) {
                      n.e(b, TransitionEffectFragment.dh(obj).isChecked(), p2);
                   }
                }
             }else {
                obj = this.a.b;
                n = obj.n;
                if (n != null) {
                   n.e(b, TransitionEffectFragment.dh(obj).isChecked(), p2);
                }
             }
          }else {
             obj = this.a.b;
             n = obj.n;
             if (n != null) {
                n.e(b, TransitionEffectFragment.dh(obj).isChecked(), p2);
             }
          }
       }else {
          obj = this.a.b;
          n = obj.n;
          if (n != null) {
             n.e(true, TransitionEffectFragment.dh(obj).isChecked(), p2);
          }
       }
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, null, w.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p0 == null){
          int actionMasked1 = p1.getActionMasked();
          if (actionMasked1) {
             if (actionMasked1 == 1 || (actionMasked1 == 3 || (actionMasked1 == 4 || actionMasked1 == 12))) {
                w.b(p0, 0x3f666666, 0x3f800000, 300);
             }
          }else {
             w.b(p0, 0x3f800000, 0x3f666666, 100);
          }
       }
       return b;
    }
}
