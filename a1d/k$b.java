package a1d.k$b;
import android.view.View$OnFocusChangeListener;
import a1d.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.n;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;

public class k$b implements View$OnFocusChangeListener	// class@000033
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(k$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, k$b.class, "1")) {
          return;
       }
       if (!p1) {
          n.Y(this.b.C, 8, false);
          return;
       }else if(TextUtils.G(this.b.z).length() > 0){
          n.Y(this.b.C, false, true);
       }
       return;
    }
}
