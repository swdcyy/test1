package abc.n;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import k2b.e0;
import cbc.b;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public class n extends m	// class@0000d9
{
    public final i c;

    public void n(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       b.j(this.c.g, "MORE");
       if (!TextUtils.x(this.c.y.mActionUrl)) {
          n tc = this.c;
          a.b(b.j(tc.g, tc.y.mActionUrl), null);
       }
       return;
    }
}
