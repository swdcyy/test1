package b34.f$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import b34.f;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import java.util.Objects;
import java.lang.Integer;
import java.util.HashMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.kuaishou.merchant.api.core.model.AnchorNeedCallBackendTool;
import crd.b;
import lnc.b9;
import tkd.b;
import tkd.d;
import fs3.c;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import b34.c;
import b34.d;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f$a implements SlipSwitchButton$a	// class@00030f
{
    public final SlipSwitchButton b;
    public final f c;

    public void f$a(f p0,SlipSwitchButton p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, f$a.class, "1")) {
          return;
       }
       if (!p2) {
          return;
       }
       f$a tc = this.c;
       f$a tb = this.b;
       LiveAnchorToolsInfo$LiveAnchorTool mType = tc.q.mType;
       boolean switch = tb.getSwitch();
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(tb, Integer.valueOf(mType), Boolean.valueOf(switch), tc, f.class, "3")) {
          f r = tc.r;
          if (r != null) {
             LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo = r.get(Integer.valueOf(tc.q.mType));
             if (TextUtils.x(tc.getLiveStreamId())) {
                if (liveAnchorTo != null) {
                   liveAnchorTo.mSwitchOpen = switch;
                }
             }else {
                ArrayList uArrayList = new ArrayList();
                AnchorNeedCallBackendTool uAnchorNeedC = new AnchorNeedCallBackendTool(mType, switch);
                uArrayList.add(uAnchorNeedC);
                b9.a(tc.s);
                b uob = d.a(-907147194).b0(tc.getLiveStreamId(), a.a.q(uArrayList)).subscribe(new c(tc, tb, uAnchorNeedC), new d(tc, tb, uAnchorNeedC));
                tc.s = uob;
                tc.X7(uob);
             }
          }
       }
       return;
    }
}
