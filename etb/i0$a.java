package etb.i0$a;
import com.yxcorp.gifshow.widget.m;
import etb.i0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import ctb.a;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import dtb.c;

public class i0$a extends m	// class@0027f8
{
    public final i0 c;

    public void i0$a(i0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "1")) {
          return;
       }
       i0$a tc = this.c;
       i0 t = tc.t;
       if (t.mUnread != null) {
          t.mUnread = false;
          tc.P8();
       }
       tc = this.c;
       c.h(tc.u, tc.t, "card", tc.v, (tc.s.e + 1));
       tc = this.c;
       tc.S8(tc.t.mLinkUrl);
       return;
    }
}
