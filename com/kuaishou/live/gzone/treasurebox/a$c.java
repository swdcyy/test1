package com.kuaishou.live.gzone.treasurebox.a$c;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import s53.d;
import s53.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;
import r53.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j77.d;
import android.content.SharedPreferences$Editor;
import oe6.g;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import com.kuaishou.live.gzone.treasurebox.a$c$a;
import erd.g;
import crd.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import m53.n;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import android.widget.TextView;

public class a$c extends c	// class@001c56
{
    public d p;
    public LiveTreasureBoxModel q;
    public f r;
    public TextView s;
    public int t;
    public b u;
    public a v;
    public LiveTreasureBoxModel$BoxStatus w;
    public static String sLivePresenterClassName = "KShellTreasureBoxAdapter$LiveBoxItemPresenter";

    public void a$c(){
       super();
    }
    public void E8(){
       a$c uoc = a$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       a$c tq = this.q;
       tq.mBoxIndexInAdapter = this.t;
       this.r.p(tq, this.p);
       this.p.c(this.q);
       LiveTreasureBoxModel obj = PatchProxy.apply(objArray, this, uoc, "7");
       String str = "isFirstShowSignInBox";
       int i = 1;
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a.getBoolean(str, i);
       boolean b1 = false;
       if (b && this.q.isSignInBox()) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             a w = this.v.w;
             if (w != null) {
                w.b(this.r, this.n8(R.string.arg_RES_7f102472));
             }
          }
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(str, b1);
          g.a(uEditor);
       }
       this.u = this.q.observable().subscribe(new a$c$a(this));
       LiveTreasureBoxModel$BoxStatus boxStatus = this.q.getBoxStatus();
       tq = this.q;
       LiveTreasureBoxModel mType = tq.mType;
       a$c tt = this.t;
       obj = tq.mSignInBoxLevel;
       ClientContent$LiveStreamPackage liveStreamPa = this.v.a.a();
       if (PatchProxy.isSupport(n.class)) {
          Object[] objArray1 = new Object[]{boxStatus,Integer.valueOf(mType),Integer.valueOf(tt),Integer.valueOf(obj),liveStreamPa};
          if (PatchProxy.applyVoid(objArray1, objArray, n.class, "34")) {
          label_0103 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_CHEST_GET";
       i3 oi3 = i3.f();
       oi3.d("chest_status", n.j(boxStatus));
       oi3.c("type", Integer.valueOf(mType));
       oi3.c("index", Integer.valueOf(tt));
       oi3.c("sign_chest_level", Integer.valueOf(obj));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       u1.u0(3, uElementPack, uContentPack);
       goto label_0103 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "4")) {
          return;
       }
       this.r.release();
       a$c tu = this.u;
       if (tu != null) {
          tu.dispose();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1ad0);
       this.s = m1.f(p0, 0x7f0a1acf);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       this.p = this.r8("listener");
       this.q = this.q8(LiveTreasureBoxModel.class);
       this.v = this.r8("treasureBoxServiceManager");
       this.t = this.r8("POSITION").intValue();
       return;
    }
}
