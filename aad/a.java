package aad.a;
import android.view.View$OnClickListener;
import aad.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements View$OnClickListener	// class@0000b1
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "4")) {
       }else {
          tb.W8();
          tb.V8();
       }
       return;
    }
}
