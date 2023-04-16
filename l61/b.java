package l61.b;
import k61.c;
import android.view.View;
import k61.f;
import z61.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z61.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import n61.a;
import l61.b$a;
import android.view.View$OnClickListener;

public class b extends c	// class@002e87
{
    public final f c;
    public TextView d;
    public TextView e;

    public void b(View p0,f p1){
       super(p0);
       this.c = p1;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (!p0 instanceof f) {
          return;
       }
       f uof = p0;
       if (!TextUtils.x(uof.c)) {
          this.e.setText(uof.c);
       }else {
          uof = uof.b;
          if (uof != -1) {
             this.e.setText(uof);
          }else {
             this.e.setText("");
          }
       }
       a.d(this.d, p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.e = p0.findViewById(0x7f0a1aa0);
       this.d = p0.findViewById(0x7f0a1aa5);
       p0.setOnClickListener(new b$a(this));
       return;
    }
}
