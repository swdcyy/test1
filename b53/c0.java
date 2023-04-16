package b53.c0;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.barrage.l;
import java.lang.Object;
import android.view.View;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class c0 implements View$OnLayoutChangeListener	// class@000303
{
    public final l b;

    public void c0(l p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       c0 tb = this.b;
       if (!tb.s.Th()) {
          tb.H = tb.C.getHeight();
       }
       return;
    }
}
