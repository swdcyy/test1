package androidx.appcompat.app.d$e;
import u0.i;
import androidx.appcompat.app.d;
import android.view.Window$Callback;
import android.view.View;
import android.content.Context;
import w0.k;
import android.view.Menu;

public class d$e extends i	// class@00058d
{
    public final d c;

    public void d$e(d p0,Window$Callback p1){
       this.c = p0;
       super(p1);
    }
    public View onCreatePanelView(int p0){
       if (!p0) {
          return new View(this.c.d.getContext());
       }
       return super.onCreatePanelView(p0);
    }
    public boolean onPreparePanel(int p0,View p1,Menu p2){
       boolean b = super.onPreparePanel(p0, p1, p2);
       if (b) {
          d$e tc = this.c;
          if (tc.e == null) {
             tc.d.i();
             tc.e = true;
          }
       }
       return b;
    }
}
