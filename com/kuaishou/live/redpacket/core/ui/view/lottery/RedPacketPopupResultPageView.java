package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupResultPageView;
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

public class RedPacketPopupResultPageView extends RedPacketBasePageView	// class@000f08
{
    public ViewGroup f;
    public ViewGroup g;
    public ViewGroup h;
    public ViewGroup i;
    public KwaiImageView j;
    public KwaiImageView k;
    public RedPacketBaseViewModel l;
    public RedPacketBaseViewModel m;
    public RedPacketBaseViewModel n;
    public static final Map o;

    static {
       RedPacketPopupResultPageView.o = new HashMap();
    }
    public void RedPacketPopupResultPageView(Context p0){
       super(p0);
       this.d();
    }
    public void RedPacketPopupResultPageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d();
    }
    public void RedPacketPopupResultPageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d();
    }
    public static Map getAreaItemMap(){
       return RedPacketPopupResultPageView.o;
    }
    public void c(w p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketPopupResultPageView.class, "1")) {
          return;
       }
       Map o = RedPacketPopupResultPageView.o;
       this.l = this.b(p0, p1, "source_area_style", this.g, o);
       RedPacketBaseViewModel redPacketBas = this;
       w ow = p0;
       Map map = p1;
       Map map1 = o;
       this.m = redPacketBas.b(ow, map, "status_area_style_key", this.h, map1);
       this.n = redPacketBas.b(ow, map, "lucky_area_style_key", this.i, map1);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupResultPageView.class, "2")) {
          return;
       }
       this.setClipChildren(false);
       this.f = a.k(this, 0x7f0d0da7, true);
       this.f = this.findViewById(0x7f0a36a4);
       this.g = this.findViewById(0x7f0a3a90);
       this.h = this.findViewById(0x7f0a3b41);
       this.i = this.findViewById(0x7f0a374a);
       this.j = this.findViewById(0x7f0a35d0);
       this.k = this.findViewById(0x7f0a35d4);
       return;
    }
    public KwaiImageView getResultBgView(){
       return this.j;
    }
    public KwaiImageView getResultForegroundView(){
       return this.k;
    }
    public ViewGroup getScrollAreaContainer(){
       return this.i;
    }
    public ViewGroup getSourceAreaContainer(){
       return this.g;
    }
    public ViewGroup getStatusAreaContainer(){
       return this.h;
    }
}
