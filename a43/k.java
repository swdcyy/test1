package a43.k;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.feedback.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a43.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import a43.o;

public class k extends m	// class@000043
{
    public final BaseFeed c;
    public final String d;
    public final String e;
    public final boolean f;
    public final b g;

    public void k(b p0,BaseFeed p1,String p2,String p3,boolean p4){
       this.g = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.g.c();
       b.a(this.c, this.d, this.e, this.f);
       RxBus.f.b(new o());
       return;
    }
}
