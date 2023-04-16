package com.yxcorp.gifshow.photo.download.widget.DownloadLongPicRecyclerView;
import com.google.android.material.bottomsheet.DownloadBottomSheetBehavior$b;
import com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor$a;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.photo.download.widget.ClipCornerProcessor;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup;
import l17.a;
import android.graphics.Rect;
import java.lang.Float;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class DownloadLongPicRecyclerView extends RecyclerView implements DownloadBottomSheetBehavior$b, ClipCornerProcessor$a	// class@000f2b
{
    public final ClipCornerProcessor b;
    public a c;

    public void DownloadLongPicRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.b = new ClipCornerProcessor(this);
    }
    public void DownloadLongPicRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = new ClipCornerProcessor(this);
    }
    public void DownloadLongPicRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new ClipCornerProcessor(this);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadLongPicRecyclerView.class, "7")) {
          return;
       }
       a.p(p0, "canvas");
       this.b.a(p0);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadLongPicRecyclerView.class, "6")) {
          return;
       }
       a.p(p0, "canvas");
       this.b.b(p0);
       return;
    }
    public View getView(){
       return this;
    }
    public void j(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadLongPicRecyclerView.class, "8")) {
          return;
       }
       a.p(p0, "canvas");
       super.draw(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadLongPicRecyclerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (!p0.getActionMasked() && (!this.s() && this.getScrollState() == 2))) {
          this.stopScroll();
       }
    label_002b :
       return super.onInterceptTouchEvent(p0);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DownloadLongPicRecyclerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DownloadLongPicRecyclerView.class, "10")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b.d(p0, p1, p2, p3);
       return;
    }
    public boolean s(){
       DownloadLongPicRecyclerView obj = PatchProxy.apply(null, this, DownloadLongPicRecyclerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getChildCount() <= 0) {
          return b;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mHelper");
       }
       if (obj.c() > 0) {
          return true;
       }else {
          Rect rect = new Rect(b, b, b, b);
          this.getDecoratedBoundsWithMargins(this.getChildAt(b), rect);
          if (rect.top < null) {
             b = true;
          }
          return b;
       }
    }
    public final void setClipPaddingPercent(float p0){
       if (PatchProxy.isSupport(DownloadLongPicRecyclerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DownloadLongPicRecyclerView.class, "2")) {
          return;
       }
       this.b.d = p0;
       this.invalidate();
       return;
    }
    public void setLayoutManager(RecyclerView$LayoutManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadLongPicRecyclerView.class, "4")) {
          return;
       }
       super.setLayoutManager(p0);
       a uoa = a.a(this);
       a.o(uoa, "RecyclerViewPositionHelper.createHelper\(this\)");
       this.c = uoa;
       return;
    }
    public final void setTopRadius(float p0){
       if (PatchProxy.isSupport(DownloadLongPicRecyclerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DownloadLongPicRecyclerView.class, "1")) {
          return;
       }
       this.b.e(p0);
       this.invalidate();
       return;
    }
    public void v(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadLongPicRecyclerView.class, "9")) {
          return;
       }
       a.p(p0, "canvas");
       super.dispatchDraw(p0);
       return;
    }
}
