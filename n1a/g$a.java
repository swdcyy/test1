package n1a.g$a;
import qvb.q;
import n1a.g;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;

public class g$a implements q	// class@0030b8
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, g$a.class, "1")) {
          return;
       }
       this.b.r.setEnabled(false);
       this.b.s.setEnabled(false);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, g$a.class, "3")) {
          return;
       }
       this.b.S8();
       return;
    }
    public void v2(boolean p0,boolean p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.b.r.setEnabled(true);
       g$a tb = this.b;
       tb.s.setEnabled(tb.P8(TextUtils.G(tb.r).toString()));
       this.b.S8();
       return;
    }
}
