package com.yxcorp.gifshow.detail.slideplay.presenter.recreation.view.VideoHotAreaMaskView;
import android.view.View;
import android.content.Context;
import android.graphics.Path;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.view.VideoHotAreaMaskView$a;
import android.view.View$OnTouchListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.List;
import m7a.d;
import android.graphics.Region;
import uw9.o;
import q87.c;
import m7a.a;
import java.lang.Number;
import lnc.a1;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import com.kuaishou.android.model.mix.HotAreaInfo;
import com.kuaishou.android.model.mix.HotAreaInfo$Location;
import android.graphics.RectF;
import xf6.d;
import xf6.l;

public class VideoHotAreaMaskView extends View	// class@001865
{
    public Paint b;
    public List c;
    public boolean d;
    public Path e;
    public List f;
    public View g;
    public List h;
    public final View$OnTouchListener i;

    public void VideoHotAreaMaskView(Context p0){
       super(p0);
       this.e = new Path();
       this.f = new ArrayList();
       VideoHotAreaMaskView$a uoa = new VideoHotAreaMaskView$a(this);
       this.i = uoa;
       this.setOnTouchListener(uoa);
    }
    public void VideoHotAreaMaskView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new Path();
       this.f = new ArrayList();
       this.i = new VideoHotAreaMaskView$a(this);
    }
    public void VideoHotAreaMaskView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new Path();
       this.f = new ArrayList();
       this.i = new VideoHotAreaMaskView$a(this);
    }
    public boolean a(MotionEvent p0,boolean p1){
       Object obj;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(VideoHotAreaMaskView.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, VideoHotAreaMaskView.class, "4");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int i2 = 0;
       if (PatchProxy.isSupport(VideoHotAreaMaskView.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), this, VideoHotAreaMaskView.class, "5");
          if (obj1 != patchProxyRe) {
             i = obj1.booleanValue();
          label_007f :
             if (i) {
                Object[] objArray = new Object[i2];
                o.C().w("VideoHotAreaMaskView", "click inside_region.... ", objArray);
                objArray = null;
                obj = PatchProxy.apply(objArray, this, VideoHotAreaMaskView.class, "6");
                if (obj != patchProxyRe) {
                   objArray = obj;
                }else {
                   VideoHotAreaMaskView tf = this.f;
                   if (tf != null && !tf.isEmpty()) {
                      if (this.f.size() == 1) {
                         objArray = this.f.get(i2);
                      }else {
                         d uod = this.f.get(i2);
                         i = this.f.get(i2).a();
                         i3 = 1;
                         while (i3 < this.f.size()) {
                            d uod1 = this.f.get(i3);
                            if (uod1 != null && uod1.a() > i) {
                               uod = uod1;
                            }
                            i3 = i3 + 1;
                         }
                         this.f = objArray;
                         d uod2 = uod;
                      }
                   }
                }
                if (p1 && objArray != null) {
                   objArray.c.onClickEvent((int)p0.getRawX(), (int)p0.getRawY(), objArray.d);
                }
                return true;
             }else {
                return i2;
             }
          }
       }
       this.f = new ArrayList();
       i3 = 0;
       while (i3 < this.c.size()) {
          d uod3 = this.c.get(i3);
          if (uod3 != null) {
             d a = uod3.a;
             if (a != null && a.contains(i, i1)) {
                this.f.add(uod3);
             }
          }
          i3 = i3 + 1;
       }
       i = this.f.isEmpty() ^ true;
       goto label_007f ;
    }
    public int getOffSetY(){
       Object obj = PatchProxy.apply(null, this, VideoHotAreaMaskView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(24.00f);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoHotAreaMaskView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       if (this.c == null || (this.h != null && this.g != null)) {
          Object[] objArray = new Object[0];
          o.C().w("VideoHotAreaMaskView", "start drawing....: ", objArray);
          if (!PatchProxy.applyVoid(null, this, VideoHotAreaMaskView.class, "2")) {
             Paint paint = new Paint();
             this.b = paint;
             paint.setColor(0xffff0000);
             this.b.setStyle(Paint$Style.STROKE);
          }
          int width = this.g.getWidth();
          int height = this.g.getHeight();
          int i = 0;
          while (i < this.h.size()) {
             HotAreaInfo hotAreaInfo = this.h.get(i);
             if (hotAreaInfo == null || (hotAreaInfo.mTopLeft == null || (hotAreaInfo.mTopRight == null || (hotAreaInfo.mBottomLeft != null && hotAreaInfo.mBottomRight != null)))) {
                this.e.reset();
                float f = (float)width;
                float f1 = this.h.get(i).mTopLeft.mX * f;
                f1 = f1 + (float)this.g.getLeft();
                float f2 = (float)height;
                float f3 = this.h.get(i).mTopLeft.mY * f2;
                f3 = f3 + (float)this.g.getTop();
                this.e.moveTo(f1, f3);
                f1 = this.h.get(i).mTopRight.mX * f;
                f1 = f1 + (float)this.g.getLeft();
                f3 = this.h.get(i).mTopRight.mY * f2;
                f3 = f3 + (float)this.g.getTop();
                this.e.lineTo(f1, f3);
                f1 = this.h.get(i).mBottomRight.mX * f;
                f1 = f1 + (float)this.g.getLeft();
                f3 = this.h.get(i).mBottomRight.mY * f2;
                f3 = f3 + (float)this.g.getTop();
                this.e.lineTo(f1, f3);
                f1 = this.h.get(i).mBottomLeft.mX * f;
                f1 = f1 + (float)this.g.getLeft();
                f = this.h.get(i).mBottomLeft.mY * f2;
                f = f + (float)this.g.getTop();
                this.e.lineTo(f1, f);
                d uod = this.c.get(i);
                if (uod != null) {
                   Region region = PatchProxy.apply(null, this, VideoHotAreaMaskView.class, "3");
                   if (region != PatchProxyResult.class) {
                   }else {
                      RectF rectF = new RectF();
                      this.e.computeBounds(rectF, true);
                      Region region1 = new Region();
                      region1.set((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
                      region = new Region();
                      region.setPath(this.e, region1);
                   }
                   uod.a = region;
                }
                if (l.c("KEY_ENABLE_RECREATION_HOT_AREA_CLICK", 0)) {
                   p0.drawPath(this.e, this.b);
                }
             }
          label_019a :
             i = i + 1;
          }
       }
       return;
    }
}
