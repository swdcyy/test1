package com.kuaishou.live.common.core.component.line.widget.LiveLineBannerView;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.line.widget.LiveLineBannerView$a;
import lnc.a1;
import android.widget.RelativeLayout;
import android.view.ViewOutlineProvider;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.lang.Integer;

public class LiveLineBannerView extends LiveAutoScrollBanner	// class@001494
{

    public void LiveLineBannerView(Context p0){
       super(p0, null);
    }
    public void LiveLineBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLineBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveLineBannerView.class, "3")) {
          return;
       }
       LiveLineBannerView$a uoa = new LiveLineBannerView$a((float)a1.d(0x7f07042b), 0, 0, this.getWidth(), this.getHeight());
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveLineBannerView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.setOffscreenPageLimit(-1);
       RecyclerView$LayoutManager layoutManage = this.h.getLayoutManager();
       Objects.requireNonNull(layoutManage);
       layoutManage.setItemPrefetchEnabled(false);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveLineBannerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveLineBannerView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.d();
       return;
    }
}
