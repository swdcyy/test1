package abc.j;
import com.yxcorp.gifshow.widget.m;
import abc.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import k2b.e0;
import cbc.b;

public class j extends m	// class@0000d5
{
    public final i c;

    public void j(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.c.m.mActionUrl)) {
          j tc = this.c;
          a.b(b.j(tc.g, tc.m.mActionUrl), null);
       }
       b.j(this.c.g, "MORE");
       return;
    }
}
