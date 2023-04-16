package com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$b;
import ik0.b;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Boolean;

public final class KtvTuneKrnFragment$b implements b	// class@000ff7
{

    public void KtvTuneKrnFragment$b(){
       super();
    }
    public View a(ViewGroup p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KtvTuneKrnFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "viewGroup");
       KwaiLoadingView kwaiLoadingV = (!p1 instanceof KwaiLoadingView)? null: p1;
       if (kwaiLoadingV) {
          kwaiLoadingV.setLoadingStyle(LoadingStyle.GRAY);
       }
       return p1;
    }
    public View b(ViewGroup p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KtvTuneKrnFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "viewGroup");
       KwaiEmptyStateView kwaiEmptySta = (!p1 instanceof KwaiEmptyStateView)? null: p1;
       if (kwaiEmptySta) {
          kwaiEmptySta.q(3);
       }
       return p1;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, KtvTuneKrnFragment$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public boolean isErrorEnabled(){
       Object obj = PatchProxy.apply(null, this, KtvTuneKrnFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
}
