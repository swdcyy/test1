package a1d.r$a;
import android.text.TextWatcher;
import a1d.r;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class r$a implements TextWatcher	// class@00004d
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
          return;
       }
       String str = p0.toString();
       str.D = (TextUtils.x(str) || !str.length())? false: true;
       this.b.S8();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
