package com.kuaishou.tuna_core.krn.d;
import android.content.DialogInterface$OnShowListener;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.String;
import com.kwai.kds.krn.api.page.KwaiKrnBottomSheetFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.krn.TunaKrnUtils;
import java.util.Objects;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import by5.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.tuna_core.krn.c;
import erd.g;

public final class d implements DialogInterface$OnShowListener	// class@0010d8
{
    public final Ref$ObjectRef b;
    public final String c;
    public final KwaiKrnBottomSheetFragment d;

    public void d(Ref$ObjectRef p0,String p1,KwaiKrnBottomSheetFragment p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       TunaKrnUtils$Companion b = TunaKrnUtils.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(b);
       b uob = PatchProxy.applyTwoRefs(tc, td, b, TunaKrnUtils$Companion.class, "2");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(tc, "eventId");
          a.p(td, "bottomSheetFragment");
          uob = RxBus.f.f(a.class).observeOn(d.a).subscribe(new c(tc, td));
       }
       tb.element = uob;
       return;
    }
}
