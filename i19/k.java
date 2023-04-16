package i19.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import i19.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import android.view.View;
import msd.r;
import java.lang.Float;
import java.lang.Boolean;
import java.util.Map;
import android.view.ViewGroup$LayoutParams;
import android.graphics.RectF;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Throwable;
import yx.j0;
import java.lang.RuntimeException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.entity.QPhoto;

public abstract class k extends PresenterV2	// class@002612
{
    public MilanoContainerEventBus p;
    public List q;
    public PublishSubject r;
    public QPhoto s;
    public float t;
    public final Map u;
    public final Map v;
    public final t0 w;
    public float x;
    public float y;

    public void k(){
       super();
       this.t = 0;
       this.u = new HashMap();
       this.v = new HashMap();
       this.w = new k$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.q.add(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       this.q.remove(this.w);
       this.Y8();
       this.t = 0;
       return;
    }
    public abstract void P8(float p0,float p1,float p2);
    public final void R8(View p0,View p1,float p2,float p3,float p4,r p5){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
             return;
          }
       }
       this.S8(p0, p1, p2, p3, p4, p5, false);
       return;
    }
    public final void S8(View p0,View p1,float p2,float p3,float p4,r p5,boolean p6){
       FrameLayout$LayoutParams layoutParams1;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, ok, "5")) {
             return;
          }
       }
       if (p0 == null || p1 == null) {
          return;
       }else if(!p4){
          if (!PatchProxy.applyVoidOneRefs(p0, this, ok, "7")) {
             ViewGroup$LayoutParams layoutParams = this.v.get(p0);
             if (layoutParams != null) {
                p0.setLayoutParams(layoutParams);
             }
             this.v.remove(p0);
          }
          if (p6) {
             this.X8(p0);
          }
          return;
       }else {
          RectF rectF = this.V8(p1);
          if (rectF.isEmpty()) {
             return;
          }else {
             ViewGroup$MarginLayoutParams marginLayout = PatchProxy.applyOneRefs(p0, this, ok, "9");
             if (marginLayout != PatchProxyResult.class) {
             }else if(this.v.get(p0) != null){
                marginLayout = p0.getLayoutParams();
             }else {
                marginLayout = p0.getLayoutParams();
                this.v.put(p0, marginLayout);
                if (marginLayout instanceof FrameLayout$LayoutParams) {
                   layoutParams1 = new FrameLayout$LayoutParams(marginLayout.width, marginLayout.height);
                }else if(marginLayout instanceof RelativeLayout$LayoutParams){
                   layoutParams1 = new RelativeLayout$LayoutParams(marginLayout.width, marginLayout.height);
                }else if(marginLayout instanceof LinearLayout$LayoutParams){
                   layoutParams1 = new LinearLayout$LayoutParams(marginLayout.width, marginLayout.height);
                }else {
                   throw new RuntimeException("no support other LayoutParams");
                }
                marginLayout = layoutParams1;
             }
             RectF rectF1 = p5.invoke(rectF, Float.valueOf(p2), Float.valueOf(p3), Float.valueOf(p4));
             if (p6) {
                try{
                   p0.setPivotX(rectF.centerX());
                   p3 = rectF1.width() / rectF.width();
                   p0.setPivotY(0);
                   p0.setTranslationY((rectF1.bottom - (rectF.bottom * p3)));
                   p0.setScaleX(p3);
                   p0.setScaleY(p3);
                }catch(java.lang.Exception e6){
                   Object[] objArray1 = new Object[0];
                   j0.d("NasaBaseSmallWindowPresenter", e6, objArray1);
                }
                return;
             }else {
                marginLayout.leftMargin = (int)rectF1.left;
                marginLayout.topMargin = (int)rectF1.top;
                marginLayout.width = (int)rectF1.width();
                marginLayout.height = (int)rectF1.height();
                p0.setLayoutParams(marginLayout);
                return;
             }
          }
       }
    }
    public final RectF V8(View p0){
       RectF obj = PatchProxy.applyOneRefs(p0, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u.get(p0);
       if (obj == null) {
          obj = new RectF();
          this.u.put(p0, obj);
       }
       if (obj.isEmpty()) {
          obj.set((float)p0.getLeft(), (float)p0.getTop(), (float)p0.getRight(), (float)p0.getBottom());
       }
       return obj;
    }
    public boolean W8(){
       boolean b = (!this.t - 0x3f800000)? true: false;
       return b;
    }
    public final void X8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "8")) {
          return;
       }
       p0.setScaleY(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setPivotX(0);
       p0.setPivotY(0);
       p0.setTranslationY(0);
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, k.class, "11")) {
          return;
       }
       Iterator iterator = this.v.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          View key = uEntry.getKey();
          key.setLayoutParams(uEntry.getValue());
       }
       this.v.clear();
       this.u.clear();
       if (this.W8()) {
          k tp = this.p;
          float f = 0x3f800000;
          if (tp != null) {
             tp.j.onNext(Float.valueOf(f));
          }
          this.r.onNext(Float.valueOf(f));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.s8(MilanoContainerEventBus.class);
       this.r = this.r8("SLIDE_PLAY_SMALL_WINDOW_PROGRESS");
       this.s = this.q8(QPhoto.class);
       this.q = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       return;
    }
}
