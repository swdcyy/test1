package com.kuaishou.live.livestage.videopipe.renderarea.ui.OverlayBackgroundDecoration$helper$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.OverlayBackgroundDecoration;
import java.lang.Object;
import android.graphics.Canvas;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;

public final class OverlayBackgroundDecoration$helper$1 extends Lambda implements q	// class@000c0f
{
    public final OverlayBackgroundDecoration this$0;

    public void OverlayBackgroundDecoration$helper$1(OverlayBackgroundDecoration p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1.intValue(), p2.intValue());
       return l1.a;
    }
    public final void invoke(Canvas p0,int p1,int p2){
       if (PatchProxy.isSupport(OverlayBackgroundDecoration$helper$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, OverlayBackgroundDecoration$helper$1.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       OverlayBackgroundDecoration b = this.this$0.b;
       if (b != null) {
          b.setBounds(0, 0, p1, p2);
          b.draw(p0);
       }
       return;
    }
}
