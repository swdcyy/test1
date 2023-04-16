package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView;
import com.kwai.written.view.IWrittenLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import qrd.l1;
import com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2;
import android.view.ViewGroup$LayoutParams;
import msd.l;
import android.widget.FrameLayout;

public final class BottomBarView extends IWrittenLayout	// class@000f4b
{

    public void BottomBarView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public View k1(){
       FrameLayout$LayoutParams obj = PatchProxy.apply(null, this, BottomBarView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FrameLayout$LayoutParams(-1, a1.d(0x7f070285));
       obj.gravity = 80;
       return this.T(obj, new BottomBarView$createView$2(this));
    }
}
