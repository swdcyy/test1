package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultLuckyAreaView;
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
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultLuckyAreaView$a;
import androidx.recyclerview.widget.RecyclerView$n;

public class RedPacketPopupResultLuckyAreaView extends FrameLayout	// class@000f07
{
    public View b;
    public RecyclerView c;
    public View d;
    public KwaiImageView e;
    public View f;
    public KwaiImageView g;
    public View h;
    public View i;
    public static final int j;

    static {
       RedPacketPopupResultLuckyAreaView.j = a1.e(14.00f);
    }
    public void RedPacketPopupResultLuckyAreaView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPopupResultLuckyAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPopupResultLuckyAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupResultLuckyAreaView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.c(this.getContext(), R.layout.arg_RES_7f0d0da6, this);
       this.d = this.findViewById(0x7f0a0d27);
       this.e = this.findViewById(0x7f0a0d19);
       this.f = this.findViewById(0x7f0a45a1);
       this.g = this.findViewById(0x7f0a45a2);
       this.h = this.findViewById(0x7f0a353c);
       this.i = this.findViewById(0x7f0a3f2a);
       this.b = this.findViewById(0x7f0a29d1);
       this.c = this.findViewById(0x7f0a29d0);
       this.c.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, false));
       this.c.addItemDecoration(new RedPacketPopupResultLuckyAreaView$a(this));
       return;
    }
    public KwaiImageView getEmptyImageView(){
       return this.e;
    }
    public View getEmptyRootView(){
       return this.d;
    }
    public RecyclerView getLuckyUserRecyclerView(){
       return this.c;
    }
    public View getLuckyUserRootView(){
       return this.b;
    }
    public View getRefreshView(){
       return this.h;
    }
    public View getTipsView(){
       return this.i;
    }
    public KwaiImageView getWifiErrorIconView(){
       return this.g;
    }
    public View getWifiErrorRootView(){
       return this.f;
    }
}
