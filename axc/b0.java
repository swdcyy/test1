package axc.b0;
import android.text.TextWatcher;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class b0 implements TextWatcher	// class@0002df
{
    public final TextBasePanelFragment b;

    public void b0(TextBasePanelFragment p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b0.class, "1")) {
          return;
       }
       this.b.onTextChanged(p0, p1, p2, p3);
       return;
    }
}
