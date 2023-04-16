package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.WindmillAnimView;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.net.Uri;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.live.common.core.component.redpacket.LiveNewRedPacketLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.WindmillAnimView$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import crd.b;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Xfermode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Math;

public class WindmillAnimView extends View	// class@000f39
{
    public Bitmap b;
    public Bitmap c;
    public final long d;
    public final RectF e;
    public final Paint f;
    public final PorterDuffXfermode g;
    public long h;
    public float i;
    public boolean j;
    public b k;
    public HashMap l;

    public void WindmillAnimView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void WindmillAnimView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void WindmillAnimView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.d = 0x5dc0;
       this.e = new RectF();
       Paint paint = new Paint();
       this.f = paint;
       this.g = new PorterDuffXfermode(PorterDuff$Mode.DST_IN);
       paint.setStyle(Paint$Style.FILL);
       paint.setAntiAlias(true);
    }
    public final t a(Uri p0){
       PublishSubject obj = PatchProxy.applyOneRefs(p0, this, WindmillAnimView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PublishSubject.g();
       a.o(obj, "PublishSubject.create<Optional<Bitmap?>>\(\)");
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       imageRequest.s(false);
       b.c0(LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET, "[WindmillAnimView]DownloadImageStart:", "uri", p0);
       a.d(imageRequest.a(), new WindmillAnimView$a(obj));
       return obj;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, WindmillAnimView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       WindmillAnimView tk = this.k;
       if (tk != null) {
          tk.dispose();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WindmillAnimView.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       if (this.j == null) {
          return;
       }
       float f = 0;
       if (!PatchProxy.applyVoid(null, this, WindmillAnimView.class, "6")) {
          long l = SystemClock.uptimeMillis();
          long l1 = 0;
          if (!this.h - l1) {
             this.h = l;
          }
          long l2 = l - this.h;
          WindmillAnimView td = this.d;
          if (l2 - td > 0) {
             this.h = l;
             this.i = f;
          }else {
             l1 = l2;
          }
          this.i = ((float)l1 / (float)td) * 360.00f;
       }
       p0.save();
       p0.translate(((float)(- (this.getHeight() - this.getWidth())) / 2.00f), f);
       p0.rotate(this.i, this.e.centerX(), this.e.centerY());
       WindmillAnimView tb = this.b;
       if (tb != null) {
          p0.drawBitmap(tb, null, this.e, this.f);
       }
       p0.rotate((- this.i), this.e.centerX(), this.e.centerY());
       this.f.setXfermode(this.g);
       tb = this.c;
       if (tb != null) {
          p0.drawBitmap(tb, null, this.e, this.f);
       }
       this.f.setXfermode(null);
       p0.restore();
       this.invalidate();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(WindmillAnimView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, WindmillAnimView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0 && (this.getWidth() > 0 && this.getHeight() > 0)) {
          this.e.set(0, 0, (float)Math.max(this.getHeight(), this.getWidth()), (float)Math.max(this.getHeight(), this.getWidth()));
       }
    label_006a :
       return;
    }
}
