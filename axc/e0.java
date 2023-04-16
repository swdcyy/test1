package axc.e0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.text.Editable;
import java.lang.CharSequence;

public final class e0 implements View$OnClickListener	// class@0002e5
{
    public final TextBasePanelFragment b;

    public void e0(TextBasePanelFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       e0 tb = this.b;
       Editable text = tb.vh().getText();
       if (text == null) {
          text = "";
       }
       tb.Bh(text.toString());
       return;
    }
}
