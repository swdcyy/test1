package com.kwai.component.homepage_interface.uxmonitor.CoveredRegionDrawView;
import android.widget.FrameLayout;
import android.graphics.Region;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import qrd.l1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.RegionIterator;

public final class CoveredRegionDrawView extends FrameLayout	// class@000976
{
    public final Rect b;
    public final Paint c;
    public final Region d;

    public void CoveredRegionDrawView(Region p0,Context p1){
       a.p(p0, "mRegion");
       a.p(p1, "context");
       super(p1);
       this.d = p0;
       this.b = new Rect();
       Paint paint = new Paint(1);
       paint.setStyle(Paint$Style.FILL);
       paint.setColor(0xffff0000);
       paint.setAlpha(120);
       this.c = paint;
       this.setWillNotDraw(false);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoveredRegionDrawView.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       RegionIterator regionIterat = new RegionIterator(this.d);
       while (regionIterat.next(this.b)) {
          p0.drawRect(this.b, this.c);
       }
       return;
    }
}
