package com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;
import ml8.d;
import p16.c;
import android.widget.RelativeLayout;
import android.content.Context;
import tkd.b;
import tkd.d;
import om6.r;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$h;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$a;
import android.view.View$OnTouchListener;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$b;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$c;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$a;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$d;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller$b;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$e;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$f;
import com.yxcorp.gifshow.widget.trimvideo.RangeSeekerV2$b;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$g;
import com.yxcorp.gifshow.widget.trimvideo.GraduationRulerView;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import ekd.m1;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import java.lang.IllegalStateException;
import java.util.Objects;
import android.graphics.Rect;
import java.lang.Float;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$i;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer$j;

public class VideoTrimmer extends RelativeLayout implements d, c	// class@0019ed
{
    public int b;
    public final float c;
    public CustomHorizontalScroller d;
    public RangeSeekerV2 e;
    public GraduationRulerView f;
    public LinearBitmapContainer g;
    public ImageView h;
    public ImageView i;
    public int j;
    public int k;
    public int l;
    public VideoTrimmer$g m;
    public float n;
    public VideoTrimmer$j o;
    public VideoTrimmer$i p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public VideoTrimmer$h v;
    public boolean w;
    public float x;
    public float y;

    public void VideoTrimmer(Context p0){
       super(p0);
       this.b = d.a(-831446984).uK(0);
       this.c = 3.00f;
       this.j = -1;
       this.k = -1;
       this.v = new VideoTrimmer$h(this);
       this.w = false;
       this.x = 3.00f;
       this.y = 0xbf800000;
       a.d(this.getContext(), R.layout.arg_RES_7f0d166a, this, true);
       this.setClipChildren(0);
       this.setClipToPadding(0);
       this.doBindView(this);
       this.setBackgroundColor(0);
       this.h.setImageDrawable(new ColorDrawable(0x66000000));
       this.i.setImageDrawable(new ColorDrawable(0x66000000));
       this.d.setOnTouchListener(new VideoTrimmer$a(this));
       VideoTrimmer$b uob = new VideoTrimmer$b(this);
       this.h.setOnTouchListener(uob);
       this.i.setOnTouchListener(uob);
       this.e.setOnProgressIndicatorPositionChangeListener(new VideoTrimmer$c(this));
       this.d.setOnScrollListener(new VideoTrimmer$d(this));
       this.e.addOnLayoutChangeListener(new VideoTrimmer$e(this));
       this.e.setOnRangeChangeListener(new VideoTrimmer$f(this));
    }
    public void VideoTrimmer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = d.a(-831446984).uK(0);
       this.c = 3.00f;
       this.j = -1;
       this.k = -1;
       this.v = new VideoTrimmer$h(this);
       this.w = false;
       this.x = 3.00f;
       this.y = 0xbf800000;
       a.d(this.getContext(), R.layout.arg_RES_7f0d166a, this, true);
       this.setClipChildren(0);
       this.setClipToPadding(0);
       this.doBindView(this);
       this.setBackgroundColor(0);
       this.h.setImageDrawable(new ColorDrawable(0x66000000));
       this.i.setImageDrawable(new ColorDrawable(0x66000000));
       this.d.setOnTouchListener(new VideoTrimmer$a(this));
       VideoTrimmer$b uob = new VideoTrimmer$b(this);
       this.h.setOnTouchListener(uob);
       this.i.setOnTouchListener(uob);
       this.e.setOnProgressIndicatorPositionChangeListener(new VideoTrimmer$c(this));
       this.d.setOnScrollListener(new VideoTrimmer$d(this));
       this.e.addOnLayoutChangeListener(new VideoTrimmer$e(this));
       this.e.setOnRangeChangeListener(new VideoTrimmer$f(this));
    }
    public void VideoTrimmer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = d.a(-831446984).uK(0);
       this.c = 3.00f;
       this.j = -1;
       this.k = -1;
       this.v = new VideoTrimmer$h(this);
       this.w = false;
       this.x = 3.00f;
       this.y = 0xbf800000;
       a.d(this.getContext(), R.layout.arg_RES_7f0d166a, this, true);
       this.setClipChildren(0);
       this.setClipToPadding(0);
       this.doBindView(this);
       this.setBackgroundColor(0);
       this.h.setImageDrawable(new ColorDrawable(0x66000000));
       this.i.setImageDrawable(new ColorDrawable(0x66000000));
       this.d.setOnTouchListener(new VideoTrimmer$a(this));
       VideoTrimmer$b uob = new VideoTrimmer$b(this);
       this.h.setOnTouchListener(uob);
       this.i.setOnTouchListener(uob);
       this.e.setOnProgressIndicatorPositionChangeListener(new VideoTrimmer$c(this));
       this.d.setOnScrollListener(new VideoTrimmer$d(this));
       this.e.addOnLayoutChangeListener(new VideoTrimmer$e(this));
       this.e.setOnRangeChangeListener(new VideoTrimmer$f(this));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer.class, "17")) {
          return;
       }
       VideoTrimmer tg = this.g;
       if (tg != null) {
          tg.invalidate();
       }
       return;
    }
    public int b(int p0){
       VideoTrimmer obj;
       if (PatchProxy.isSupport(VideoTrimmer.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VideoTrimmer.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.m;
       if (obj == null) {
          return 0;
       }else {
          return (this.f.a((float)(((long)p0 * obj.getFrameInterval()) / 1000)) - this.d.getScrollX());
       }
    }
    public int c(int p0,int p1){
       Object[] obj;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(VideoTrimmer.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VideoTrimmer.class, "5");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (this.m == null) {
          return 0;
       }else if(PatchProxy.isSupport(VideoTrimmer.class)){
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VideoTrimmer.class, "4");
          if (obj != patchProxyRe) {
             f = obj.floatValue();
          }else if(this.m == null){
             f = 0;
          }else {
             float f1 = this.f.b((p0 + p1));
             float f2 = (1000.00f * f1) / (float)(this.m.getFrameInterval() * (long)this.m.a());
             Object[] objArray = new Object[0];
             a.D().s("VideoTrimmer", "scrollX: "+p0+", seekerPosition: "+p1+", graduationRulerNumber: "+f1+", videoPos: "+f2, objArray);
             f = f2;
          }
       }else {
          goto label_004c ;
       }
       p1 = Math.round((((float)this.m.a() * f) - 0x3f800000));
       obj = new Object[0];
       a.D().s("VideoTrimmer", "getVideoFrameIndex: videoPositionPercentage: "+f+", videoFrameIndex: "+p1, obj);
       if (p1 > (this.m.a() - 1)) {
          p1 = this.m.a() - 1;
       }
       return Math.max(0, p1);
    }
    public float d(int p0,int p1){
       if (PatchProxy.isSupport(VideoTrimmer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VideoTrimmer.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (this.f.b((p0 + p1)) * 1000.00f);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTrimmer.class, "1")) {
          return;
       }
       this.f = m1.f(p0, 0x7f0a1108);
       this.g = m1.f(p0, 0x7f0a43f6);
       this.i = m1.f(p0, 0x7f0a3651);
       this.h = m1.f(p0, 0x7f0a171f);
       this.e = m1.f(p0, 0x7f0a33ef);
       this.d = m1.f(p0, 0x7f0a440f);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer.class, "16")) {
          return;
       }
       if (this.getWidth() > 0 && this.m != null) {
          int i = (int)((float)this.getWidth() - ((this.getResources().getDimension(0x7f070456) + this.getResources().getDimension(0x7f070ee8)) * 2.00f));
          long duration = this.m.getDuration();
          this.q = (int)this.getResources().getDimension(0x7f070419);
          int i1 = (this.m.getWidth() * this.q) / this.m.getHeight();
          this.r = i1;
          VideoTrimmer tb = this.b;
          float f = ((float)(tb * i1) * 0x3f800000) / (float)i;
          this.s = f;
          float f1 = (float)duration;
          f = f1 / f;
          this.t = f;
          i1 = (int)(f * (float)i1);
          this.l = i1;
          f = 1000.00f;
          if (i1 > i) {
             this.f.c((f1 / f), i1);
          }else {
             this.f.c(((float)tb / f), i);
          }
          this.g.getLayoutParams().width = this.l;
          this.g.setAdapter(this.v);
          i1 = this.f.a(Math.min(((float)this.b / f), (f1 / f)));
          tb = this.y;
          if (tb - 0xbf800000 && (f * tb) - f1 <= 0) {
             i1 = this.f.a(tb);
          }
          this.e.setMaxEnd(i);
          this.e.setMaxWidth(i1);
          this.e.setMinWidth(this.f.a(Math.min(this.x, (float)(duration / 1000))));
          int i2 = 0;
          Object[] objArray = new Object[i2];
          a.D().s("VideoTrimmer", "initLayout allVideoPreviewFrameWidth: "+this.l+", contentWidth: "+i+", rangeSeekerContentMaxWidth: "+i1, objArray);
          VideoTrimmer tj = this.j;
          int i3 = -1;
          if (tj == i3) {
             this.j = i2;
             this.k = this.c(i2, this.e.getEnd());
          }else {
             this.j = Math.min(tj, (this.m.getCount() - 1));
             this.k = Math.min(this.k, (this.m.getCount() - 1));
          }
          i = Math.max(i2, this.j);
          this.j = i;
          this.k = Math.max(i, this.k);
          i = Math.min((this.m.getCount() - 1), this.k);
          this.k = i;
          VideoTrimmer tj1 = this.j;
          if (i > tj1 && (!PatchProxy.isSupport(VideoTrimmer.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tj1), Integer.valueOf(i), this, VideoTrimmer.class, "14"))) {
             tb = this.m;
             if (tb != null) {
                if (tj1 >= null) {
                   if (i >= 0) {
                      if (tj1 <= i) {
                         if (i <= (tb.a() + i3)) {
                            this.j = tj1;
                            this.k = i;
                            if (this.l > null) {
                               this.e.setStart(this.b(tj1));
                               if (PatchProxy.isSupport(VideoTrimmer.class)) {
                                  Object obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, VideoTrimmer.class, "7");
                                  if (obj != PatchProxyResult.class) {
                                     i = obj.intValue();
                                  label_01c8 :
                                     this.e.setEnd(i);
                                  }
                               }
                               i = this.b((i + 1));
                               goto label_01c8 ;
                            }
                         }else {
                            throw new IllegalStateException("End is out of range. End="+i+" Count="+this.m.getCount());
                         }
                      }else {
                         throw new IllegalStateException("Start is greater than end. Start="+tj1+", End="+i);
                      }
                   }else {
                      throw new IllegalStateException("End cannot be negative. End="+i);
                   }
                }else {
                   throw new IllegalStateException("Start cannot be negative. Start="+tj1);
                }
             }
          }
          if (this.w != null) {
             this.h.setVisibility(i2);
             this.i.setVisibility(i2);
          }else if((long)this.b - ((long)this.m.a() * this.m.getFrameInterval()) >= 0){
             this.h.setVisibility(8);
             this.i.setVisibility(8);
          }else {
             this.h.setVisibility(i2);
             this.i.setVisibility(i2);
          }
       }
       return;
    }
    public void f(){
       float f;
       if (PatchProxy.applyVoid(null, this, VideoTrimmer.class, "8")) {
          return;
       }
       int i = 2;
       int[] ointArray = new int[i];
       VideoTrimmer te = this.e;
       Objects.requireNonNull(te);
       int i1 = 0;
       if (!PatchProxy.applyVoidOneRefs(ointArray, te, RangeSeekerV2.class, "10")) {
          Rect leftHandlerR = te.getLeftHandlerRect();
          ointArray[i1] = leftHandlerR.left;
          ointArray[1] = leftHandlerR.top;
       }
       int i2 = ((- this.d.getScrollX()) + this.e.getPaddingLeft()) + this.e.getHandlerWidth();
       if (i2 < 0) {
          f = (float)(ointArray[i1] + (this.e.getHandlerWidth() / i));
       }else {
          f = (float)((ointArray[i1] - i2) + (this.e.getHandlerWidth() / i));
          i1 = i2;
       }
       this.h.setX((float)i1);
       this.h.setPivotX(0);
       VideoTrimmer th = this.h;
       th.setScaleX((f / (float)th.getWidth()));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer.class, "9")) {
          return;
       }
       int[] ointArray = new int[2];
       VideoTrimmer te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(ointArray, te, RangeSeekerV2.class, "11")) {
          Rect rightHandler = te.getRightHandlerRect();
          ointArray[0] = rightHandler.left;
          ointArray[1] = rightHandler.top;
       }
       this.i.setX((float)ointArray[0]);
       this.i.setPivotX(0);
       VideoTrimmer ti = this.i;
       ti.setScaleX(((float)((((this.g.getWidth() - this.d.getScrollX()) + this.e.getHandlerWidth()) + this.e.getPaddingRight()) - ointArray[0]) / (float)ti.getWidth()));
       return;
    }
    public int getEndIndex(){
       return this.k;
    }
    public int getStartIndex(){
       return this.j;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VideoTrimmer.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VideoTrimmer.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VideoTrimmer.class, "10")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.e();
       return;
    }
    public void setCurrentPlayTime(float p0){
       if (PatchProxy.isSupport(VideoTrimmer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, VideoTrimmer.class, "13")) {
          return;
       }
       this.e.setIndicatorPosition((this.f.a(p0) - this.d.getScrollX()));
       return;
    }
    public void setDimCoverIsAlwaysShown(boolean p0){
       this.w = p0;
    }
    public void setFrameAdapter(VideoTrimmer$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTrimmer.class, "11")) {
          return;
       }
       this.m = p0;
       this.e();
       return;
    }
    public void setMaxDuration(float p0){
       this.y = p0;
    }
    public void setOnProgressIndicatorChangeListener(VideoTrimmer$i p0){
       this.p = p0;
    }
    public void setOnVideoRangeChangeListener(VideoTrimmer$j p0){
       this.o = p0;
    }
    public void setShortestClipTimeSecond(float p0){
       this.x = p0;
    }
    public void setStandardDuration(int p0){
       if (PatchProxy.isSupport(VideoTrimmer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VideoTrimmer.class, "12")) {
          return;
       }
       this.b = p0;
       this.e();
       return;
    }
}
