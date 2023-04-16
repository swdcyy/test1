package a63.s;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.util.rx.RxBus;
import a63.c;
import java.lang.Math;
import a63.d;
import android.graphics.Rect;
import android.view.View;
import java.lang.Float;
import android.animation.Animator;
import ekd.f;
import android.widget.ImageView;
import android.animation.ValueAnimator;

public class s implements DraggedFrameLayout$b	// class@000063
{
    public final KwaiZoomImageView a;
    public final n b;

    public void s(n p0,KwaiZoomImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0,int p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, os, "1")) {
          return;
       }
       if (p1 < 0 && this.b.F == null) {
          return;
       }
       RxBus.f.b(new c(false));
       this.b.F = p1;
       float f = 0x3f800000;
       float f1 = f - Math.min(f, (((float)Math.abs(p1) * f) / (float)this.b.y.c.height()));
       float f2 = (p1 < 0)? 0x3f800000: f1;
       Rect rect = new Rect();
       rect.left = p0;
       rect.right = (int)(((float)p0 + ((float)(this.b.y.c.width() - this.b.y.a.width()) * f2)) + (float)this.b.y.a.width());
       rect.top = p1;
       rect.bottom = (int)(((float)p1 + ((float)(this.b.y.c.height() - this.b.y.a.height()) * f2)) + (float)this.b.y.a.height());
       this.b.b9(rect, this.a, f2, p0, p1);
       return;
    }
    public void b(int p0,int p1,float p2){
       n y;
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, s.class, "2")) {
          return;
       }
       RxBus.f.b(new c(true));
       s tb = this.b;
       tb.F = 0;
       f.a(tb.C);
       Rect rect = new Rect();
       this.a.getGlobalVisibleRect(rect);
       s tb1 = this.b;
       if (p1 >= tb1.B) {
          y = tb1.y;
          tb1.P8(2, new d(rect, y.a, y.c));
       }else {
          y = tb1.y;
          tb1.C = tb1.V8(new d(rect, y.b, y.c), this.a, tb1.X8(tb1.q), 255);
          this.b.C.start();
       }
       return;
    }
    public long c(){
       return 10;
    }
}
