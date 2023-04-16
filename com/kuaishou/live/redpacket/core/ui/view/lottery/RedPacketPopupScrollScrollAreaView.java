package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupScrollScrollAreaView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupScrollScrollAreaView$a;
import androidx.recyclerview.widget.RecyclerView$n;
import android.animation.ValueAnimator;

public class RedPacketPopupScrollScrollAreaView extends FrameLayout	// class@000f0d
{
    public RecyclerView b;
    public View c;
    public ValueAnimator d;
    public static final int e;

    static {
       RedPacketPopupScrollScrollAreaView.e = a1.e(14.00f);
    }
    public void RedPacketPopupScrollScrollAreaView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPopupScrollScrollAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPopupScrollScrollAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupScrollScrollAreaView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.c(this.getContext(), R.layout.arg_RES_7f0d0dac, this);
       this.c = this.findViewById(0x7f0a2921);
       this.b = this.findViewById(0x7f0a3695);
       this.b.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, false));
       this.b.addItemDecoration(new RedPacketPopupScrollScrollAreaView$a(this));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupScrollScrollAreaView.class, "4")) {
          return;
       }
       this.c();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupScrollScrollAreaView.class, "5")) {
          return;
       }
       RedPacketPopupScrollScrollAreaView td = this.d;
       if (td != null) {
          td.cancel();
          this.d.removeAllUpdateListeners();
       }
       return;
    }
    public View getLoadingView(){
       return this.c;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupScrollScrollAreaView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       return;
    }
}
