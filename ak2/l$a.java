package ak2.l$a;
import ds5.c;
import ak2.l;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import lu7.f;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import ks5.b;
import ks5.c;
import java.lang.Throwable;

public class l$a implements c	// class@0000ef
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       this.b.W8(p0.mLiveAccumulatedWatchCount);
       l$a tb = this.b;
       p0 = p0.mGRPRTitle;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, l.class, "11")) {
          tb.s.setText(TextUtils.i(p0, f.a(tb.F.getUser())));
       }
       l$a tb1 = this.b;
       l p = tb1.P;
       if (p != null) {
          p.b(tb1.D);
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
