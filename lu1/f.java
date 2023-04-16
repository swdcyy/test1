package lu1.f;
import androidx.lifecycle.Observer;
import lu1.q;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewStub;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import android.widget.FrameLayout;
import du1.d;
import brd.t;
import java.util.concurrent.TimeUnit;
import lu1.e;
import erd.g;
import crd.b;
import androidx.lifecycle.LiveData;
import com.kwai.framework.model.user.UserInfo;

public final class f implements Observer	// class@00303e
{
    public final q b;
    public final LiveMultiPkRenderCellViewModel c;

    public void f(q p0,LiveMultiPkRenderCellViewModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(!p0.booleanValue() && this.b.S()){
          b.Z(LiveCommonLogTag.MULTI_PK, "bindAudioWidget show audio cell");
          p0 = this.b;
          q y = p0.y;
          if (y == null) {
             a.S("audioWidgetViewStub");
          }
          if (!PatchProxy.applyVoidOneRefs(y, p0, q.class, "37") && p0.z == null) {
             View view = y.inflate();
             Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget");
             p0.z = view;
          }
          p0 = this.b.z;
          a.m(p0);
          p0.setVisibility(0);
          p0 = this.b;
          if (p0.A == null && p0.I.e()) {
             p0 = this.b;
             y = p0.z;
             a.m(y);
             p0.A = y.getFinishUpdateObservable().delay(300, TimeUnit.MILLISECONDS).subscribe(new e(this));
          }
          p0 = this.b.z;
          a.m(p0);
          p0.b(this.c.C0().getValue());
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "bindAudioWidget show video cell");
          p0 = this.b.z;
          if (p0 != null) {
             p0.setVisibility(8);
          }
          p0 = this.b.A;
          if (p0 != null) {
             p0.dispose();
          }
          p0.A = null;
       }
       return;
    }
}
