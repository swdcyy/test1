package com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor;
import com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.graphics.Path;
import android.graphics.RectF;
import com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor$srcPath$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import qrd.l1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.view.View;
import android.graphics.Path$Direction;
import android.graphics.Path$Op;

public final class ClipCornerProcessor	// class@000f2a
{
    public final boolean a;
    public float b;
    public float c;
    public float d;
    public final Path e;
    public final RectF f;
    public final p g;
    public final Paint h;
    public boolean i;
    public final ClipCornerProcessor$a j;

    public void ClipCornerProcessor(ClipCornerProcessor$a p0){
       a.p(p0, "view");
       super();
       this.j = p0;
       boolean b = true;
       boolean b1 = (Build$VERSION.SDK_INT >= 28)? true: false;
       this.a = b1;
       this.e = new Path();
       this.f = new RectF();
       this.g = s.c(ClipCornerProcessor$srcPath$2.INSTANCE);
       Paint paint = new Paint();
       paint.setAntiAlias(b);
       paint.setStyle(Paint$Style.FILL);
       PorterDuffXfermode porterDuffXf = (!b1)? new PorterDuffXfermode(PorterDuff$Mode.DST_IN): new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
       paint.setXfermode(porterDuffXf);
       this.h = paint;
       return;
    }
    public final void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipCornerProcessor.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       int i = 0;
       if (this.b - i <= 0 && (this.c - i <= 0 && this.d - i <= 0)) {
          this.j.v(p0);
          return;
       }else if(this.i == null){
          int i1 = p0.saveLayer(this.f, null);
          this.j.v(p0);
          if (this.a == null) {
             p0.drawPath(this.e, this.h);
          }else if(!this.c().isEmpty()){
             p0.drawPath(this.c(), this.h);
          }
          p0.restoreToCount(i1);
       }else {
          this.j.v(p0);
       }
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipCornerProcessor.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       int i = 0;
       if (this.b - i <= 0 && (this.c - i <= 0 && this.d - i <= 0)) {
          this.j.j(p0);
          return;
       }else {
          this.i = true;
          int i1 = p0.saveLayer(this.f, null);
          this.j.j(p0);
          if (this.a == null) {
             p0.drawPath(this.e, this.h);
          }else if(!this.c().isEmpty()){
             p0.drawPath(this.c(), this.h);
          }
          p0.restoreToCount(i1);
          this.i = false;
          return;
       }
    }
    public final Path c(){
       Object obj = PatchProxy.apply(null, this, ClipCornerProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final void d(int p0,int p1,int p2,int p3){
       ClipCornerProcessor tb;
       ClipCornerProcessor tc;
       if (PatchProxy.isSupport(ClipCornerProcessor.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ClipCornerProcessor.class, "2")) {
          return;
       }
       float f = (float)p0;
       float f1 = this.d * f;
       p3 = 0;
       if (f1 - (float)p3 > 0) {
          this.j.getView().setPadding((int)f1, this.j.getView().getPaddingTop(), (int)f1, this.j.getView().getPaddingBottom());
       }
       this.f.set(f1, 0, (f - f1), (float)p1);
       this.e.reset();
       float[] uofloatArray = new float[]{tb,tb,tb,tb,tc,tc,tc,tc};
       tb = this.b;
       tc = this.c;
       this.e.addRoundRect(this.f, uofloatArray, Path$Direction.CCW);
       if (this.a != null) {
          this.c().reset();
          this.c().addRect(this.f, Path$Direction.CCW);
          this.c().op(this.e, Path$Op.DIFFERENCE);
       }
       return;
    }
    public final void e(float p0){
       this.b = p0;
    }
}
