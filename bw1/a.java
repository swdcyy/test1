package bw1.a;
import bw1.a$a;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.Context;
import p91.m;
import cs5.d;
import com.kuaishou.live.basic.tk.LiveTkItemManager;

public final class a	// class@00041d
{
    public final LiveTkItemManager a;
    public final Context b;
    public final m c;
    public final d d;
    public static final List e;
    public static final a$a f;

    static {
       a.f = new a$a(null);
       List list = LiveLogTag.LIVE_RIFHT_BOTTOM_MINI_WIDGET.appendTag("LiveKdsMsgHandler");
       a.m(list);
       a.e = list;
    }
    public void a(Context p0,m p1,d p2){
       a.p(p0, "context");
       a.p(p1, "liveBasicContext");
       a.p(p2, "liveMiniWidgetService");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = new LiveTkItemManager();
    }
}
