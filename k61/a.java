package k61.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import java.lang.Object;
import android.view.View;
import k61.f;

public final class a implements View$OnClickListener	// class@002c92
{
    public final LiveBottomBarBasePanelFragment b;

    public void a(LiveBottomBarBasePanelFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       LiveBottomBarBasePanelFragment f = this.b.f;
       if (f != null) {
          f.d();
       }
       return;
    }
}
