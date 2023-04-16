package com.kuaishou.live.core.show.activityredpacket.view.LiveNineImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kuaishou.live.core.show.activityredpacket.view.LiveNineImageView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import crd.b;
import lnc.b9;

public final class LiveNineImageView extends ConstraintLayout	// class@0009ad
{
    public b B;
    public HashMap C;
    public static final LiveNineImageView$a D;

    static {
       LiveNineImageView.D = new LiveNineImageView$a(null);
    }
    public void LiveNineImageView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveNineImageView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveNineImageView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveNineImageView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.B);
       return;
    }
}
