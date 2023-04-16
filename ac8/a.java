package ac8.a;
import ma8.n;
import com.mini.widget.actionsheet.a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.hhh.smartwidget.popup.c;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.Resources;
import android.app.Activity;

public final class a implements n	// class@00005f
{
    public final a a;
    public final FragmentActivity b;

    public void a(a p0,FragmentActivity p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onConfigurationChanged(Configuration p0){
       boolean b;
       a ta = this.a;
       a tb = this.b;
       if (ta != null) {
          FrameLayout$LayoutParams obj = PatchProxy.apply(null, ta, a.class, "3");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             a g = ta.g;
             b = (g != null && g.l())? true: false;
          }
          if (b) {
             ta = ta.f;
             if (ta != null) {
                obj = ta.getLayoutParams();
                if (obj != null) {
                   if (p0.orientation == 1) {
                      i = 1;
                   }
                   int i1 = (i)? -1: (int)tb.getResources().getDimension(0x7f070ab4);
                   obj.width = i1;
                   obj.gravity = 81;
                   ta.setLayoutParams(obj);
                }
             }
          }
       }
    label_0057 :
       return;
    }
}
