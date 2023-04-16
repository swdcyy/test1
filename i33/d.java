package i33.d;
import tkd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import ao2.b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import yf6.h;
import m33.b;
import android.app.Activity;
import android.content.Context;

public interface abstract d implements b	// class@002e84
{
    public static final List r0;

    static {
       d.r0 = LiveLogTag.LIVE_PLUGIN.appendTag("Invoke");
    }
    void D30();
    b Dl();
    void Xf(LiveConfigStartupResponse p0);
    void d3(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3);
    h dc();
    b j4();
    void oV(Activity p0,Context p1);
    void ta(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3);
}
