package fj2.q;
import com.kuaishou.screencast.c$a;
import fj2.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.e;
import java.util.List;
import fj2.t;
import java.lang.StringBuilder;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import fj2.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import java.lang.Integer;
import lnc.a1;
import fj2.v;
import wkd.b;
import com.kuaishou.screencast.c;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import pp.d;
import java.lang.System;
import hj2.e;
import pm8.a;
import com.kuaishou.android.live.log.b;
import e17.i;

public class q implements c$a	// class@00297e
{
    public final o a;

    public void q(o p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceScreencastPresenter", "onSearchDeviceTimeout\(\) called", stringArray);
       if (this.a.Z8()) {
          this.a.x.m0(2, null);
       }
       return;
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveAudienceScreencastPresenter", "onDevicesAvailable\(\) called with: devicesInfo = ["+p0.size()+"]", stringArray);
       if (this.a.Z8()) {
          this.a.x.m0(1, p0);
          boolean b = y.d(this.a.getActivity());
          o r = this.a.r;
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), r, null, uoc, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_SCREENCAST_SELECT_PANEL";
             u1.B0(new ShowMetaData().setType(9).setElementPackage(uElementPack).setContentPackage(c.b(b, r)));
          }
       }
       return;
    }
    public void d(int p0){
       q ta;
       o e;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "3")) {
          return;
       }
       if (!a1.i(this.a.getActivity())) {
          return;
       }
       this.a.W8().l(R.string.arg_RES_7f102c0a);
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveAudienceScreencastPresenter", "onPlayInfo\(\) called with: info = ["+p0+"]", stringArray);
       int i1 = -1851168653;
       ScreencastDeviceInfo screencastDe = b.a(i1).a();
       String str = "";
       String str1 = (screencastDe == null)? str: screencastDe.mDeviceUid;
       if (screencastDe != null) {
          str = screencastDe.mDeviceName;
       }
       LiveLogTag liveLogTag = null;
       String str2 = "deviceName";
       String str3 = 0x7f1004df;
       switch (p0){
           case 0:
             ta = this.a;
             ta.r.H2.i(LiveLogTag.SCREEN_CAST, "presenter onPlayInfo\(\) BIND_SUCCESS", "isScreencastPopupViewShowing", Boolean.valueOf(ta.Z8()));
             if (this.a.Z8()) {
                b.a(i1).f();
             }
             break;
           case 1:
             this.a.r.H2.h(LiveLogTag.SCREEN_CAST, "presenter onPlayInfo\(\) BIND_ERROR");
             break;
           case 2:
           case 6:
             this.a.r.H2.i(LiveLogTag.SCREEN_CAST, "presenter onPlayInfo\(\) DISCONNECT OR PLAY_ERROR", "code", Integer.valueOf(p0));
             if (this.a.Y8()) {
                i.a(R.style.arg_RES_7f110668, 0x7f102c10);
                if (this.a.a9()) {
                   this.a.y.l0(p0, liveLogTag);
                }
                c.d(i, str1, y.d(this.a.getActivity()), this.a.r);
             }
             break;
           case 3:
             this.a.W8().l(str3);
             a.f1(str);
             b.c0(LiveLogTag.LIVE_AUDIENCE_SCREENCAST, "PLAY_LOADING - setLastUsedScreencastDeviceName", str2, str);
             break;
           case 4:
             this.a.r.H2.h(LiveLogTag.SCREEN_CAST, "presenter onPlayInfo\(\) PLAY_START");
             p0.w = System.currentTimeMillis();
             if (this.a.a9()) {
                this.a.y.l0(4, b.a(i1).a());
             }
             this.a.W8().l(str3);
             c.d(true, str1, y.d(this.a.getActivity()), this.a.r);
             a.f1(str);
             b.c0(LiveLogTag.LIVE_AUDIENCE_SCREENCAST, "PLAY_START - setLastUsedScreencastDeviceName", str2, str);
             break;
           case 5:
             this.a.r.H2.h(LiveLogTag.SCREEN_CAST, "presenter onPlayInfo\(\) PLAY_STOP");
             this.a.V8();
             ta = this.a;
             ta.w = 0;
             e = ta.E;
             if (e != null) {
                ta.h9(e);
                ta.E = liveLogTag;
             }
             break;
           default:
       }
    label_017d :
       return;
    }
}
