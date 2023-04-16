package bc9.u;
import android.view.View$OnClickListener;
import bc9.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.a;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import java.util.List;
import nsd.u;
import sa6.a;

public final class u implements View$OnClickListener	// class@000406
{
    public final l b;

    public void u(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       u ou;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, u.class, "1")) {
          return;
       }
       j oj = this.b.g2().g();
       String str = this.b.g2().b();
       if (str == null) {
          str = "";
       }
       String str1 = str;
       PosterActivityTabInfo posterActivi = this.b.g2().o();
       posterActivi = (posterActivi != null)? posterActivi.mSources: null;
       PosterActivityTabInfo posterActivi1 = posterActivi;
       posterActivi = this.b.g2().o();
       PosterActivityTabInfo posterActivi2 = (posterActivi != null)? posterActivi.mOrderBySources: false;
       a uoa = new a(str1, "", false, posterActivi1, posterActivi2, false, 36, null);
       oj.w0(v0);
       PatchProxy.onMethodExit(u.class, "1");
       return;
    }
}
