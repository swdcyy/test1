package br7.a;
import androidx.lifecycle.Observer;
import br7.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;

public final class a implements Observer	// class@00044f
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          TextView textView = this.b.v(R.id.create_date_tv);
          a.o(textView, "create_date_tv");
          textView.setVisibility(0);
          textView = this.b.v(R.id.create_date_tv);
          a.o(textView, "create_date_tv");
          textView.setText(p0);
       }
       return;
    }
}
