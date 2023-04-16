package g33.h;
import java.lang.Runnable;
import com.kuaishou.live.external.p;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import os5.l;

public final class h implements Runnable	// class@002a52
{
    public final p b;
    public final GifshowActivity c;
    public final String d;
    public final int e;
    public final LiveStreamFeed f;

    public void h(p p0,GifshowActivity p1,String p2,int p3,LiveStreamFeed p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       this.b.n().tP(this.c, this.d, this.e, this.f);
    }
}
