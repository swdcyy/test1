package com.kuaishou.live.redpacket.core.ui.view.pendant.RedPacketNewStylePendantView;
import eo3.o;
import nm3.a;
import com.kuaishou.live.redpacket.core.ui.view.RedPacketBasePageView;
import java.util.HashMap;
import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;
import eo3.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import android.widget.FrameLayout;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import eo3.p;
import android.view.View$OnClickListener;

public abstract class RedPacketNewStylePendantView extends RedPacketBasePageView implements o, a	// class@000f33
{
    public ViewGroup f;
    public ViewGroup g;
    public KwaiImageView h;
    public RedPacketBaseViewModel i;
    public RedPacketBaseViewModel j;
    public static final Map k;

    static {
       RedPacketNewStylePendantView.k = new HashMap();
    }
    public void RedPacketNewStylePendantView(Context p0){
       super(p0);
       this.d();
    }
    public void RedPacketNewStylePendantView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d();
    }
    public void RedPacketNewStylePendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d();
    }
    public static Map getAreaItemMap(){
       return RedPacketNewStylePendantView.k;
    }
    public void c(w p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketNewStylePendantView.class, "2")) {
          return;
       }
       Map k = RedPacketNewStylePendantView.k;
       this.i = this.b(p0, p1, "center_area_style", this.f, k);
       this.j = this.b(p0, p1, "bottom_area_style", this.g, k);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, RedPacketNewStylePendantView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0d96, true);
       this.f = this.findViewById(0x7f0a24f8);
       this.g = this.findViewById(0x7f0a24f7);
       KwaiImageView kwaiImageVie = this.findViewById(R.id.live_red_packet_cover);
       this.h = kwaiImageVie;
       kwaiImageVie.setImageResource(R.drawable.arg_RES_7f08130d);
       return;
    }
    public void setPendantViewClickAction(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketNewStylePendantView.class, "3")) {
          return;
       }
       this.setOnClickListener(p0);
       return;
    }
}
