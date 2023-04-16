package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupPreparePageView;
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

public class RedPacketPopupPreparePageView extends RedPacketBasePageView	// class@000f03
{
    public ViewGroup f;
    public ViewGroup g;
    public ViewGroup h;
    public ViewGroup i;
    public ViewGroup j;
    public KwaiImageView k;
    public KwaiImageView l;
    public RedPacketBaseViewModel m;
    public RedPacketBaseViewModel n;
    public RedPacketBaseViewModel o;
    public RedPacketBaseViewModel p;
    public static final Map q;

    static {
       RedPacketPopupPreparePageView.q = new HashMap();
    }
    public void RedPacketPopupPreparePageView(Context p0){
       super(p0);
       this.d();
    }
    public void RedPacketPopupPreparePageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d();
    }
    public void RedPacketPopupPreparePageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d();
    }
    public static Map getAreaItemMap(){
       return RedPacketPopupPreparePageView.q;
    }
    public void c(w p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketPopupPreparePageView.class, "1")) {
          return;
       }
       Map q = RedPacketPopupPreparePageView.q;
       this.m = this.b(p0, p1, "source_area_style", this.g, q);
       RedPacketBaseViewModel redPacketBas = this;
       w ow = p0;
       Map map = p1;
       Map map1 = q;
       this.n = redPacketBas.b(ow, map, "reward_area_style", this.h, map1);
       this.o = redPacketBas.b(ow, map, "action_area_style", this.i, map1);
       this.p = redPacketBas.b(ow, map, "policy_area_style", this.j, map1);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupPreparePageView.class, "2")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0da1, true);
       this.f = this.findViewById(0x7f0a36a4);
       this.g = this.findViewById(0x7f0a3513);
       this.h = this.findViewById(0x7f0a3512);
       this.i = this.findViewById(0x7f0a3510);
       this.j = this.findViewById(0x7f0a3511);
       this.k = this.findViewById(0x7f0a24f5);
       this.l = this.findViewById(0x7f0a24f4);
       return;
    }
    public KwaiImageView getBottomCoverImageView(){
       return this.l;
    }
    public ViewGroup getPreparePageRootView(){
       return this.f;
    }
    public KwaiImageView getTopCoverImageView(){
       return this.k;
    }
}
