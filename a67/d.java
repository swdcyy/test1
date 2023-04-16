package a67.d;
import android.view.View$OnClickListener;
import a67.e$a;
import java.lang.Object;
import android.view.View;
import a67.e;
import java.lang.String;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;

public final class d implements View$OnClickListener	// class@000054
{
    public final e$a b;

    public void d(e$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       e w = tb.s.w;
       if (w != null) {
          w.a(tb.q, tb.r);
       }
       return;
    }
}
