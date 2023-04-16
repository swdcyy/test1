package a43.g;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.feedback.b;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class g extends m	// class@00003f
{
    public final String c;
    public final GifshowActivity d;
    public final BaseFeed e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final b i;

    public void g(b p0,String p1,GifshowActivity p2,BaseFeed p3,boolean p4,String p5,boolean p6){
       this.i = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.i.b(this.c, this.d.getUrl(), this.e, this.f, this.g, this.h);
       return;
    }
}
