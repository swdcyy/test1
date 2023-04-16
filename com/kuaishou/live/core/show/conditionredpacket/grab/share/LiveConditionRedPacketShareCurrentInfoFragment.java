package com.kuaishou.live.core.show.conditionredpacket.grab.share.LiveConditionRedPacketShareCurrentInfoFragment;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseCurrentInfoDialogFragment;
import java.lang.String;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f62.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class LiveConditionRedPacketShareCurrentInfoFragment extends LiveConditionRedPacketBaseCurrentInfoDialogFragment	// class@000aa1
{
    public static final int u;

    public void LiveConditionRedPacketShareCurrentInfoFragment(String p0){
       super(p0);
    }
    public PresenterV2 mh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveConditionRedPacketShareCurrentInfoFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new g());
       obj.U7(new a());
       obj.U7(new c());
       PatchProxy.onMethodExit(LiveConditionRedPacketShareCurrentInfoFragment.class, "3");
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveConditionRedPacketShareCurrentInfoFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0ac7, p1, false);
       this.p = m1.f(view, 0x7f0a1b73);
       this.q = m1.f(view, 0x7f0a1b83);
       this.r = m1.f(view, 0x7f0a1b6e);
       this.s = m1.f(view, 0x7f0a1b75);
       return view;
    }
}
