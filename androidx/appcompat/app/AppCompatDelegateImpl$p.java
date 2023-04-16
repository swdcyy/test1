package androidx.appcompat.app.AppCompatDelegateImpl$p;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import android.view.Menu;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState;
import android.view.Window$Callback;

public final class AppCompatDelegateImpl$p implements j$a	// class@000581
{
    public final AppCompatDelegateImpl b;

    public void AppCompatDelegateImpl$p(AppCompatDelegateImpl p0){
       this.b = p0;
       super();
    }
    public void b(e p0,boolean p1){
       e uoe = p0.F();
       AppCompatDelegateImpl$PanelFeatureState panelFeature = (uoe != p0)? 1: null;
       AppCompatDelegateImpl$p tb = this.b;
       if (panelFeature) {
          p0 = uoe;
       }
       AppCompatDelegateImpl$PanelFeatureState panelFeature1 = tb.h0(p0);
       if (panelFeature1 != null) {
          if (panelFeature) {
             this.b.U(panelFeature1.a, panelFeature1, uoe);
             this.b.Y(panelFeature1, true);
          }else {
             this.b.Y(panelFeature1, p1);
          }
       }
       return;
    }
    public boolean c(e p0){
       if (p0 == p0.F()) {
          AppCompatDelegateImpl$p tb = this.b;
          if (tb.D != null) {
             Window$Callback uCallback = tb.o0();
             if (uCallback != null && this.b.P == null) {
                uCallback.onMenuOpened(108, p0);
             }
          }
       }
       return true;
    }
}
