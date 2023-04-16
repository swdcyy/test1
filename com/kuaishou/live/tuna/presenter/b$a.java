package com.kuaishou.live.tuna.presenter.b$a;
import pp3.b$a;
import com.kuaishou.live.tuna.presenter.b;
import java.lang.Object;
import pp3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState$Button;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.k;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.presenter.a;
import msd.a;
import c15.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import aq3.g;
import va1.b0;
import ym5.a;
import android.view.Window;
import android.view.View;
import java.lang.Runnable;
import pp3.b;
import tj3.k;
import tj3.e;

public class b$a implements b$a	// class@000fd7
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void D(){
       a.b(this);
    }
    public void onClick(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       if (!PatchProxy.applyVoid(objArray, ta, uob, "11")) {
          b q = ta.Q;
          if (q != null) {
             LiveBsStateMessages$SCLiveCurrentBsState activeButton = q.activeButton;
             if (activeButton != null) {
                Boolean uBoolean = 2;
                if (activeButton.buttonType == uBoolean) {
                   uBoolean = 1;
                }
                i = uBoolean;
             label_0030 :
                k.M(ta.O, "needAltData", Boolean.TRUE);
                d.a(0x691527a8).ck(ta.O, 1, i, 2, 1);
                if (ta.Q == null) {
                   b.g(KsgLogTunaLiveTag.BOTTOM_ICON.appendTag("handleBottomBarClicked"), a.b);
                }else if(PatchProxy.applyVoid(objArray, ta, uob, "12")){
                   Activity activity = ta.getActivity();
                   if (a1.i(activity)) {
                      g og = new g(ta, activity);
                      if (b0.a() && !d.a(0x4c5dd1b8).f2()) {
                         activity.setRequestedOrientation(1);
                         activity.getWindow().getDecorView().postDelayed(og, 17);
                      }else {
                         og.run();
                      }
                   }
                }
             }
          }
          i = 0;
          goto label_0030 ;
       }
    label_009f :
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(objArray, ta, b.class, "6") || (ta.V == null && (ta.a9().isVisible() && ta.X != null))) {
          ta.N.x().X(ta.X);
          ta.V = true;
       }
    label_003d :
       return;
    }
}
