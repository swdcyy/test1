package a43.h;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.feedback.b;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public class h extends m	// class@000040
{
    public final String c;
    public final BaseFeed d;
    public final GifshowActivity e;
    public final String f;
    public final boolean g;
    public final b h;

    public void h(b p0,String p1,BaseFeed p2,GifshowActivity p3,String p4,boolean p5){
       this.h = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.h.d(this.c, this.d, this.e.Q2(), this.f, this.g);
       return;
    }
}
