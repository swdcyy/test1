package com.kwai.live.gzone.accompanyplay.edit.j0$e;
import sfc.a;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import n37.p1;
import android.view.View$OnClickListener;

public class j0$e extends a	// class@000bfe
{
    public final j0 c;

    public void j0$e(j0 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$e.class, "1")) {
          return;
       }
       super.b(p0);
       b[] uobArray = new b[]{b.d};
       c.d(this.c.C, uobArray);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.b();
       uoa.p(new p1(this));
       c.e(this.c.C, b.g, uoa);
       return;
    }
}
