package be3.a;
import android.app.Activity;
import android.view.ViewGroup;
import eq3.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gq3.a;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$Event;
import qrd.l1;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import crd.a;
import java.util.LinkedHashMap;
import be3.a$a;
import vb3.e;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.liteend.framework.LiteEndLayoutViewType;
import java.util.Map;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a	// class@000393
{
    public final a a;
    public final int b;
    public final a c;
    public final Map d;
    public final ConstraintLayout e;
    public final n f;
    public final e g;
    public final Activity h;
    public final ViewGroup i;
    public final d j;

    public void a(Activity p0,ViewGroup p1,d p2){
       View view;
       a uoa = a.class;
       a.p(p0, "activity");
       a.p(p1, "container");
       a.p(p2, "vcManager");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       a uoa1 = new a();
       uoa1.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_RESUME);
       this.a = uoa1;
       int i = n.A(p0) + a1.d(0x7f070fdf);
       this.b = i;
       this.c = new a();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       this.d = linkedHashMa;
       this.f = new a$a(this);
       e uoe = new e();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       p0.F2(uoe);
       this.g = uoe;
       this.e = p1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
       }else {
          View view2 = p1.findViewById(R.id.live_lite_end_container);
          a.o(view2, "layoutRoot.findViewById<¡­.live_lite_end_container\)");
          ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.topMargin = i;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          view = p1.findViewById(R.id.live_lite_end_background_container);
          a.o(view, "layoutRoot.findViewById\(¡­end_background_container\)");
          linkedHashMa.put(LiteEndLayoutViewType.Background, view);
          View view1 = p1.findViewById(R.id.live_lite_end_base_info_container);
          a.o(view1, "layoutRoot.findViewById\(¡­_end_base_info_container\)");
          linkedHashMa.put(LiteEndLayoutViewType.BaseInfo, view1);
       }
       b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "LiveLiteLayoutManager "+this+" onCreate");
       return;
    }
}
