package cy0.e$b;
import java.lang.Runnable;
import cy0.e;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cy0.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.view.ViewTreeObserver;
import cy0.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import xf3.c;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class e$b implements Runnable	// class@001ea4
{
    public WeakReference b;

    public void e$b(e p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$b.class, "1")) {
          return;
       }
       e uoe = this.b.get();
       if (uoe == null) {
          return;
       }
       e uoe1 = e.class;
       if (!PatchProxy.applyVoid(objArray, uoe, uoe1, "8") && (uoe.v == null && (uoe.t != null && uoe.u != null))) {
          g og = new g(uoe.getActivity());
          uoe.v = og;
          e t = uoe.t;
          if (!PatchProxy.applyVoidOneRefs(t, og, g.class, "2")) {
             og.getContentView().measure(0, 0);
             t.getViewTreeObserver().addOnGlobalLayoutListener(new f(og, t, og.getContentView().getMeasuredWidth(), og.getContentView().getMeasuredHeight()));
             t.requestLayout();
          }
          if (!PatchProxy.applyVoid(objArray, uoe, uoe1, "10")) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putLong("live_audience_merchant_cs_guide_time", c.a());
             g.a(uEditor);
          }
          uoe.m8().postDelayed(uoe.w, 0x2710);
       }
    label_0093 :
       return;
    }
}
