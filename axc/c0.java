package axc.c0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import java.lang.CharSequence;

public final class c0 implements View$OnClickListener	// class@0002e1
{
    public final TextBasePanelFragment b;

    public void c0(TextBasePanelFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       this.b.vh().setText("");
       return;
    }
}
