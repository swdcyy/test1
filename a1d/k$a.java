package a1d.k$a;
import android.text.TextWatcher;
import a1d.k;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.utility.n;

public class k$a implements TextWatcher	// class@000032
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       String str = p0.toString();
       if (TextUtils.x(str)) {
          this.b.B.setVisibility(8);
          n.Y(this.b.C, 8, false);
          this.b.P8("");
          return;
       }else {
          this.b.B.setVisibility(false);
          n.Y(this.b.C, false, true);
          this.b.P8(str);
          return;
       }
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
