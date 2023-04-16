package com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC$a;
import ws1.e;
import com.kuaishou.live.common.core.component.multipk.game.vc.bangs.LiveMultiPkPunishBangsVC;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lt1.e;
import ws1.d;
import com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;

public final class LiveMultiPkPunishBangsVC$a implements e	// class@001605
{
    public final String b;
    public final LiveMultiPkPunishBangsVC c;

    public void LiveMultiPkPunishBangsVC$a(LiveMultiPkPunishBangsVC p0,String p1){
       a.p(p1, "title");
       this.c = p0;
       super();
       this.b = p1;
    }
    public View B1(ViewGroup p0){
       LiveMultiPkPunishBangsVC$a obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkPunishBangsVC$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       if (this.c.Y2() == null) {
          obj = this.c;
          obj.j = obj.W2(p0, this.b);
          LiveMultiPkPunishBangsVC$a tc = this.c;
          tc.V2(tc.X2());
       }
       View view = this.c.Y2();
       a.m(view);
       return view;
    }
    public void D(){
       d.a(this);
    }
    public int getPriority(){
       return 2;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkPunishBangsVC$a.class, "2")) {
          return;
       }
       this.c.Z2();
       return;
    }
    public LiveMultiPKAreaType w1(){
       return LiveMultiPKAreaType.BANGS;
    }
}
