package a93.a;
import msd.a;
import com.kuaishou.live.lite.background.LiveLiteBackgroundPresenter;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.background.b;
import sj3.l;
import ga1.e;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import qrd.l1;

public final class a implements a	// class@000082
{
    public final LiveLiteBackgroundPresenter b;

    public void a(LiveLiteBackgroundPresenter p0){
       this.b = p0;
    }
    public final Object invoke(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveLiteLogTag.LITE_BACKGROUND, "add LiveLiteLoadingController");
       tb.v.c(LayoutViewType.PlayerViewMask, new b(tb.y, tb.w));
       return l1.a;
    }
}
