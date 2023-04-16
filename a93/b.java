package a93.b;
import vb3.l;
import com.kuaishou.live.lite.background.a;
import java.lang.Object;
import com.kuaishou.live.lite.layoutmanager.StageType;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import android.view.View;

public final class b implements l	// class@000083
{
    public final a a;

    public void b(a p0){
       this.a = p0;
    }
    public final void a(StageType p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       b.d0(LiveLiteLogTag.LITE_BACKGROUND, "StageChange", "stageType", p0, "mIsRenderStarted", Boolean.valueOf(ta.w));
       if (p0 == StageType.MultiChat) {
          ta.v = true;
          ta.W2(true);
          ta.l.setVisibility(0);
       }else {
          ta.v = false;
          if (ta.w != null) {
             ta.W2(0);
          }
          ta.l.setVisibility(8);
       }
       return;
    }
}
