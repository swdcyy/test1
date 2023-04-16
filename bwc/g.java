package bwc.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bwc.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.Button;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import android.app.Activity;
import com.kwai.library.widget.popup.common.f;
import android.view.ViewTreeObserver;
import java.util.Objects;
import com.kwai.library.widget.popup.bubble.a$c;
import android.view.View;
import com.yxcorp.gifshow.v3.f;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class g implements ViewTreeObserver$OnGlobalLayoutListener	// class@0004a9
{
    public final h b;

    public void g(h p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "1")) {
          return;
       }
       int[] ointArray = new int[2];
       this.b.p.getLocationInWindow(ointArray);
       if (ointArray[1] < f.k(this.b.t.j)) {
          return;
       }
       this.b.p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       g tb = this.b;
       MixImporterFragment j = tb.t.j;
       h p = tb.p;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(j, p, tb, h.class, "10")) {
          a$c uoc = new a$c(j);
          uoc.q0(1);
          uoc.o0(p);
          int i = 0x7f101104;
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             str = PatchProxy.applyOneRefs(Integer.valueOf(i), objArray, uof, "16");
             if (str != PatchProxyResult.class) {
             label_0085 :
                uoc.F0(str);
                uoc.P(1);
                uoc.T(3000);
                uoc.D(PopupInterface$Excluded.SAME_TYPE);
                uoc.A(1);
                p.o(uoc);
                if (!PatchProxy.applyVoid(objArray, tb, h.class, "11")) {
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putBoolean("HasShownNewFullVideoHint", 1);
                   g.a(uEditor);
                }
             }
          }
          Object[] objArray1 = new Object[]{String.valueOf(LongVideoLocalProject.f())};
          str = String.format(a1.p(i), objArray1);
          goto label_0085 ;
       }
       return;
    }
}
