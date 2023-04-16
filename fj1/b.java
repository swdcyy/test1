package fj1.b;
import android.text.TextWatcher;
import fj1.f;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import fj1.f$a$a;
import fj1.f$a;

public final class b implements TextWatcher	// class@002354
{
    public final f b;

    public void b(f p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "1")) {
          return;
       }
       this.b.u0(new f$a$a(String.valueOf(p0)));
       return;
    }
}
