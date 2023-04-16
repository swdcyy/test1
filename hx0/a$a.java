package hx0.a$a;
import sj3.b;
import hx0.a;
import java.lang.Object;
import sj3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vb1.b;
import lp3.c;
import lp3.i;
import java.lang.Throwable;

public final class a$a implements b	// class@002798
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void c(){
       a.a(this);
    }
    public void e(){
       a.d(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "newConfig");
       a.p(p1, "oldConfig");
       a.b(this, p0, p1);
       if (TextUtils.x(p0.mLiveStreamId)) {
          return;
       }
       if (!TextUtils.n(p0.mLiveStreamId, p1.mLiveStreamId)) {
          a w = this.b.w;
          if (w == null) {
             a.S("liveServiceManager");
          }
          w.a(b.class).Pe(false);
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(this, p0);
    }
}
