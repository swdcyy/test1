package l61.c;
import k61.c;
import android.view.View;
import z61.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;

public class c extends c	// class@002e88
{
    public TextView c;

    public void c(View p0){
       super(p0);
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.c.setText(TextUtils.j(p0.mText));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c = p0.findViewById(0x7f0a1aa2);
       return;
    }
}
