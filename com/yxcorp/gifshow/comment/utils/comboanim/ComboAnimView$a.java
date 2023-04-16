package com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView$a;
import android.os.Handler;
import com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import il9.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.TouchDelegate;
import il9.b$a;

public class ComboAnimView$a extends Handler	// class@001109
{
    public final WeakReference a;

    public void ComboAnimView$a(ComboAnimView p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void dispatchMessage(Message p0){
       ComboAnimView k;
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ComboAnimView$a.class, "1")) {
          return;
       }
       super.dispatchMessage(p0);
       ComboAnimView uComboAnimVi = this.a.get();
       if (uComboAnimVi == null) {
          return;
       }
       p0 = p0.what;
       Object[] objArray = null;
       int i = 2;
       if (p0 != i) {
          if (p0 != 3) {
             if (p0 != 4) {
                if (p0 == 5) {
                   uComboAnimVi.c();
                }
             }else {
                uComboAnimVi.a();
             }
          }else if(PatchProxy.applyVoid(objArray, uComboAnimVi, ComboAnimView.class, "8")){
             k = uComboAnimVi.k;
             if (k != null) {
                k.setTag(R.id.like_comment_anim_view, objArray);
                uComboAnimVi.k.removeView(uComboAnimVi);
                uComboAnimVi.k = objArray;
             }
          }
       }else if(PatchProxy.applyVoid(objArray, uComboAnimVi, ComboAnimView.class, "4")){
          k = uComboAnimVi.l;
          if (k != null) {
             boolean b = false;
             if (k.a(b, true)) {
                uComboAnimVi.b(true);
                k = uComboAnimVi.l;
                if (k != null) {
                   Object obj = PatchProxy.apply(objArray, k, d.class, "5");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   }else if(k.a.get() != null && (k.a.get().isEnabled() && k.a.get().getTouchDelegate() instanceof b$a)){
                      b = 1;
                   }
                   b1 = b;
                   if (!b1) {
                      uComboAnimVi.c();
                   }
                }
                uComboAnimVi.e.sendEmptyMessageDelayed(i, 100);
             }
          }
       }
       return;
    }
}
