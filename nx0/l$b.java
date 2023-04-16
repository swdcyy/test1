package nx0.l$b;
import xq5.c;
import nx0.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class l$b implements c	// class@0033f2
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void P(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l$b.class, "2")) {
          return;
       }
       b.a(this);
       LiveLogTag lIVE_OVER_RO = LiveLogTag.LIVE_OVER_ROOM_v2;
       String str = "LiveAudienceOverRoomV2Presenter";
       lIVE_OVER_RO.appendTag(str);
       b.P(lIVE_OVER_RO, "onPageHide");
       l$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, l.class, "5")) {
          l y = tb.y;
          if (y != null) {
             b.S(lIVE_OVER_RO.appendTag(str), "removeVC", "VC hashCode", Integer.valueOf(y.hashCode()));
             tb.o1(y);
          }
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_OVER_ROOM_v2.appendTag("LiveAudienceOverRoomV2Presenter"), "onPageShow");
       this.b.W8();
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
