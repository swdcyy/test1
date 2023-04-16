package al3.b;
import msd.l;
import al3.d;
import com.kuaishou.live.preview.item.model.LivePreviewPendantModel;
import java.lang.Object;
import z51.c;
import java.util.Objects;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dk3.b;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o63.a;
import lp3.c;
import lp3.i;
import z51.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import qrd.l1;

public final class b implements l	// class@0000f3
{
    public final d b;
    public final LivePreviewPendantModel c;

    public void b(d p0,LivePreviewPendantModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       b tb = this.b;
       b tc = this.c;
       Object obj = p0;
       Objects.requireNonNull(tb);
       p0 = LivePreviewLogTag.LIVE_PREVIEW_PENDANT;
       b.Z(p0, "load Tk Bundle success");
       if (obj) {
          LivePreviewPendantModel mPendantId = tc.mPendantId;
          if (!PatchProxy.applyVoidTwoRefs(mPendantId, obj, tb, d.class, "5")) {
             b.Z(p0, "initWidgetKdsView\(\) Method start");
             if (!tb.E()) {
                b.Z(p0, "initWidgetKdsView\(\) failed, because of current fragment is not attached");
             }else if(tb.A == null){
                LiveMiniWidgetKdsView liveMiniWidg = new LiveMiniWidgetKdsView(tb.getContext(), tb.z.a(a.class), mPendantId, obj, null);
                tb.A = tc;
                tb.B.addView(tc, new ViewGroup$LayoutParams(-2, -2));
                b.Z(p0, "call LiveMiniWidgetKdsView#createTkView\(\) method");
                tb.A.a();
             }
          }
       }
       return l1.a;
    }
}
