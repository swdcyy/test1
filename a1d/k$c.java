package a1d.k$c;
import android.text.TextWatcher;
import a1d.k;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class k$c implements TextWatcher	// class@000034
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
          return;
       }
       boolean b = false;
       int i = (p0 != null && !TextUtils.x(p0.toString()))? (p0.toString()).length(): 0;
       k$c tb = this.b;
       if (i == 6) {
          b = true;
       }
       tb.E = b;
       tb.S8();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
