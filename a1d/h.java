package a1d.h;
import n3d.a;
import a1d.k;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import ekd.j0;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;

public final class h implements a	// class@00002b
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       h tb = this.b;
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), p2, tb, ok, "6") || (p1 == -1 && p2 != null))) {
          tb.u.setText("+"+j0.f(p2, "COUNTRY_CODE"));
       }
    label_003c :
       String str = TextUtils.G(tb.z).toString();
       if (!TextUtils.x(str)) {
          tb.P8(str);
       }
       return;
    }
}
