package axc.a0;
import android.text.TextWatcher;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class a0 implements TextWatcher	// class@0002dd
{
    public final TextBasePanelFragment b;

    public void a0(TextBasePanelFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a0.class, "1")) {
          return;
       }
       this.b.beforeTextChanged(p0, p1, p2, p3);
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
