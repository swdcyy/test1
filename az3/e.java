package az3.e;
import com.smile.gifmaker.mvps.presenter.a;
import az3.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed$ActivityInfo;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import android.view.ViewStub;
import java.util.Objects;
import android.view.View;
import ekd.m1;

public final class e extends a	// class@0002db
{
    public b r;
    public View s;

    public void e(){
       super();
       this.U7(new f());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tr = this.r;
       if (tr == null) {
          a.S("feedUiModel");
       }
       LiveFeed$ActivityInfo activityInfo = tr.c.getActivityInfo();
       if (activityInfo != null && activityInfo.mType > null) {
          tr = this.s;
          String str = "activityViewStub";
          if (tr == null) {
             a.S(str);
          }
          if (tr instanceof ViewStub) {
             tr = this.s;
             if (tr == null) {
                a.S(str);
             }
             Objects.requireNonNull(tr, "null cannot be cast to non-null type android.view.ViewStub");
             this.s = tr.inflate();
          }
          this.P8(true);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a00d3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.r = this.q8(b.class);
       return;
    }
}
