package bt7.a$a;
import com.yxcorp.gifshow.widget.m;
import bt7.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;

public class a$a extends m	// class@000469
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a c = this.c.c;
       if (c != null && !TextUtils.isEmpty(c.mActionUrl)) {
          Intent intent = b.a(0x66dce92a).a(this.c.b, w0.f(this.c.c.mActionUrl));
          if (intent != null) {
             this.c.b.startActivity(intent);
          }
       }
       return;
    }
}
