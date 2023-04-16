package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$l;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GrowthWidgetManager$l implements ImageCallback	// class@0015d4
{
    public final GrowthScreensTodayEatWidgetResponse b;
    public final GrowthWidgetManager c;
    public final WidgetType d;
    public final boolean e;

    public void GrowthWidgetManager$l(GrowthScreensTodayEatWidgetResponse p0,GrowthWidgetManager p1,WidgetType p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthWidgetManager$l.class, "1")) {
          return;
       }
       l.b(this, p0);
       if (p0 != null) {
          this.c.k(this.b, this.d, p0);
       }
       PatchProxy.onMethodExit(GrowthWidgetManager$l.class, "1");
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
