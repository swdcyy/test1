package d2c.a$b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.view.View;
import d2c.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$b extends m	// class@0020b4
{
    public final User c;
    public final KwaiImageView d;
    public final TextView e;
    public final View f;
    public final a g;
    public final BaseFeed h;

    public void a$b(User p0,KwaiImageView p1,TextView p2,View p3,a p4,BaseFeed p5){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       a$b tc = this.c;
       a.o(tc, "user");
       String id = this.h.getId();
       a.o(id, "nonNullFeed.id");
       this.g.P8(tc, id);
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
