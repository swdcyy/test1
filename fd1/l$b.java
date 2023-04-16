package fd1.l$b;
import fd1.d$c;
import fd1.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.utility.TextUtils;
import fd1.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import k2b.u1;
import java.lang.System;
import nc1.k;
import java.lang.Boolean;
import lp3.i;
import lp3.c;
import java.util.Objects;
import fd1.b;
import fd1.a;
import xp5.g;
import brd.t;
import cjd.e;
import erd.o;
import fd1.j;
import fd1.n;
import erd.g;
import crd.b;
import crd.a;
import java.lang.CharSequence;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import vq5.d;
import com.kwai.robust.PatchProxyResult;

public class l$b implements d$c	// class@0022f9
{
    public final String a;
    public final l b;

    public void l$b(l p0,String p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l$b.class, "2")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_QUESTIONNAIRE, "onShow", "questionnaireId", p0, "questionId", p1);
       ClientContent$LiveStreamPackage liveStreamPa = this.b.r.a();
       l$b ta = this.a;
       p0 = TextUtils.k(p0);
       if (!PatchProxy.applyVoidFourRefs(liveStreamPa, ta, p0, p1, null, o.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_COMMENT_NOTICE";
          i3 oi3 = i3.f();
          oi3.d("questionnaire_id", p0);
          oi3.d("questionId", p1);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.moreInfoPackage = o.b(ta);
          u1.v0(9, uElementPack, uContentPack, uContentWrap);
       }
       l$b tb = this.b;
       o.c((System.currentTimeMillis() - tb.u), tb.r.a(), 1, "", TextUtils.k(p1), p1);
       return;
    }
    public void b(String p0,String p1,String p2,boolean p3,String p4){
       l$b b;
       l$b a;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       l$b uob = l$b.class;
       int i = 4;
       int i1 = 3;
       int i2 = 1;
       int i3 = 5;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[i2] = oobject1;
          objArray[2] = oobject2;
          objArray[i1] = Boolean.valueOf(p3);
          objArray[i] = oobject3;
          if (PatchProxy.applyVoid(objArray, obj, uob, "1")) {
             return;
          }
       }
       b.e0(LiveLogTag.LIVE_QUESTIONNAIRE, "onQuestionnaireBubbleClicked", "questionnaireId", p0, "questionId", p1, "selectOption", p2);
       if (p3) {
          obj.b.P8().a(k.class).D6();
          b = obj.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, b, l.class, "7")) {
             b.t.c(a.a().b(b.q.getLiveStreamId(), oobject, oobject1, oobject2).map(new e()).subscribe(new j(b, oobject2, oobject, oobject1), new n(b, oobject2, oobject, oobject1)));
          }
       }else if(!TextUtils.x(p4)){
          obj.b.P8().a(k.class).D6();
          uob = obj.b;
          uob.s.r4(oobject3, uob.getActivity());
       }
       ClientContent$LiveStreamPackage liveStreamPa = obj.b.r.a();
       a = obj.a;
       o oo = o.class;
       Object obj1 = null;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray1 = new Object[]{liveStreamPa,a,oobject2,oobject,oobject1};
          if (PatchProxy.applyVoid(objArray1, obj1, oo, "2")) {
          label_011c :
             l$b b1 = obj.b;
             o.c((System.currentTimeMillis() - b1.u), b1.r.a(), 10, p2, p0, p1);
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = PatchProxy.apply(obj1, obj1, oo, "5");
       if (uElementPack != PatchProxyResult.class) {
       }else {
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_COMMENT_NOTICE";
       }
       uElementPack.params = o.a(oobject2, oobject, oobject1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.moreInfoPackage = o.b(a);
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       goto label_011c ;
    }
    public void onClose(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "3")) {
          return;
       }
       this.b.P8().a(k.class).D6();
       return;
    }
}
