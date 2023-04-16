package com.kuaishou.live.common.core.component.gift.LiveGiftBoxAlbumNoScrollRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import a2.i0;
import java.lang.ref.WeakReference;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveGiftBoxAlbumNoScrollRecyclerView extends RecyclerView	// class@00112d
{
    public WeakReference b;

    public void LiveGiftBoxAlbumNoScrollRecyclerView(Context p0){
       super(p0, null);
    }
    public void LiveGiftBoxAlbumNoScrollRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftBoxAlbumNoScrollRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return false;
    }
    public ViewTreeObserver getViewTreeObserver(){
       LiveGiftBoxAlbumNoScrollRecyclerView obj = PatchProxy.apply(null, this, LiveGiftBoxAlbumNoScrollRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i0.X(this)) {
          return super.getViewTreeObserver();
       }
       obj = this.b;
       if (obj == null) {
          return super.getViewTreeObserver();
       }
       ViewTreeObserver viewTreeObse = obj.get();
       if (viewTreeObse != null) {
          return viewTreeObse;
       }
       b.Z(LiveLogTag.GIFT, "LiveGiftImageView get ViewTreeObserver from weakRef failed");
       return super.getViewTreeObserver();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxAlbumNoScrollRecyclerView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.b = new WeakReference(this.getViewTreeObserver());
       return;
    }
}
