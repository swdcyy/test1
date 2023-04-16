package a43.l;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.feedback.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import a43.n;

public class l extends m	// class@000044
{
    public final GifshowActivity c;
    public final BaseFeed d;
    public final b e;

    public void l(b p0,GifshowActivity p1,BaseFeed p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       n.c(this.c, new QPhoto(this.d));
       return;
    }
}
