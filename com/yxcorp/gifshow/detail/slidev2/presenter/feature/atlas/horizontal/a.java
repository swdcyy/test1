package com.yxcorp.gifshow.detail.slidev2.presenter.feature.atlas.horizontal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import android.graphics.RectF;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import g8a.b;
import msd.r;
import ekd.m1;

public class a extends e	// class@00193b
{
    public View G;
    public RecyclerView H;
    public View I;
    public static final RectF J;

    static {
       a.J = new RectF();
    }
    public void a(){
       super();
    }
    public static RectF e9(a p0,RectF p1,float p2,float p3,float p4){
       RectF rectF;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(a.class)) {
          rectF = PatchProxy.applyFourRefs(p1, Float.valueOf(p2), Float.valueOf(p3), Float.valueOf(p4), p0, a.class, "4");
          if (rectF != PatchProxyResult.class) {
          label_0078 :
             return rectF;
          }
       }
       rectF = a.J;
       rectF.setEmpty();
       RectF rectF1 = p0.X8(p0.I);
       p3 = p3 / rectF1.height();
       float f = rectF1.height() * p3;
       float f1 = p1.width() * p3;
       p3 = p3 * p1.height();
       RectF top = p1.top;
       float f2 = top - ((top - ((- (p3 - f)) / 2.00f)) * p4);
       p2 = ((p2 - f1) / 2.00f) * p4;
       rectF.set(p2, f2, ((p1.width() - ((p1.width() - f1) * p4)) + p2), ((p1.height() - ((p1.height() - p3) * p4)) + f2));
       goto label_0078 ;
    }
    public void R8(float p0,float p1,float p2){
       View view;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, a.class, "2")) {
          return;
       }
       Object[] objArray = null;
       RecyclerView$LayoutManager obj = PatchProxy.apply(objArray, this, uoa, "3");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = this.H.getLayoutManager();
          if (obj instanceof LinearLayoutManager) {
             RecyclerView$ViewHolder viewHolder = this.H.findViewHolderForAdapterPosition(obj.i0());
             if (viewHolder != null) {
                view = viewHolder.itemView.findViewById(R.id.autoplay_image_item_image);
             }
          }
       }
       this.I = objArray;
       if (objArray == null) {
          return;
       }else {
          a tH = this.H;
          view = this;
          float f = p0;
          view.V8(tH, tH, this.E, this.F, f, new b(this), true);
          tH = this.G;
          view.V8(tH, tH, this.E, this.F, f, new b(this), true);
          this.G.setAlpha((0x3f800000 - p0));
          return;
       }
    }
    public int W8(){
       return 0;
    }
    public int Y8(){
       return 0;
    }
    public boolean Z8(){
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a3a43);
       this.H = m1.f(p0, 0x7f0a032f);
       return;
    }
}
