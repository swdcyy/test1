package com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic;
import com.kuaishou.live.core.voiceparty.theater.chat.shared.TheaterChatViewGroupLogic;
import android.app.Activity;
import eq3.d;
import android.view.ViewGroup;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import com.kuaishou.live.core.voiceparty.g0;
import gw2.a;
import gq5.f;
import j47.a;
import wu2.a;
import i81.f;
import ru2.c;
import ru2.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import fw2.a;
import fw2.d;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$clearScreenToolkit$1;
import msd.a;
import ss2.e;
import ss2.e$a;
import ss2.e$b;
import ss2.h;
import mrd.a;
import brd.t;
import ss2.c;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$micSeatDataManager$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$micSeatDataManager$2;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$micSeatDataManager$3;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$micSeatDataManager$4;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.theater.chat.TheaterAudienceChatViewLogic$a;
import erd.g;
import crd.b;
import crd.a;
import krd.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kwai.robust.PatchProxyResult;
import cv2.b;
import jv2.e;
import jv2.g;
import com.kuaishou.live.core.voiceparty.playway.video.pendant.VoicePartyPlayType;
import jv2.f;
import ru2.d;
import java.util.Set;
import nsd.u;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import msd.t;

public final class TheaterAudienceChatViewLogic extends TheaterChatViewGroupLogic	// class@001964
{
    public final f A;
    public final a n;
    public final d o;
    public final e p;
    public final ViewGroup q;
    public final ViewGroup r;
    public final ViewGroup s;
    public final AudienceTheaterManager t;
    public final a u;
    public final f v;
    public final a w;
    public final a x;
    public final f y;
    public final c z;

    public void TheaterAudienceChatViewLogic(Activity p0,d p1,ViewGroup p2,ViewGroup p3,ViewGroup p4,AudienceTheaterManager p5,g0 p6,a p7,f p8,a p9,a p10,f p11,c p12,f p13){
       TheaterAudienceChatViewLogic theaterAudie = this;
       Object obj = p0;
       Object obj1 = p2;
       Object obj2 = p3;
       Object obj3 = p4;
       Object obj4 = p5;
       Object obj5 = p12;
       Object obj6 = p13;
       a.p(obj, "activity");
       Object obj7 = p1;
       a.p(obj7, "theaterRootViewControllerManager");
       a.p(obj1, "halfScreenContainer");
       a.p(obj2, "fullscreenPortraitContainer");
       a.p(obj3, "fullscreenLandscapeContainer");
       a.p(obj4, "theaterManager");
       a.p(obj5, "micSeatDependency");
       a.p(obj6, "micSeatPendantDependency");
       super(obj7, p2, p3, p4, p5, p6, p11);
       theaterAudie.q = obj1;
       theaterAudie.r = obj2;
       theaterAudie.s = obj3;
       theaterAudie.t = obj4;
       theaterAudie.u = p7;
       theaterAudie.v = p8;
       theaterAudie.w = p9;
       theaterAudie.x = p10;
       theaterAudie.y = p11;
       theaterAudie.z = obj5;
       theaterAudie.A = obj6;
       theaterAudie.n = new a();
       theaterAudie.o = new d(new TheaterAudienceChatViewLogic$clearScreenToolkit$1(theaterAudie, obj));
       theaterAudie.p = e.d.a().b(c.b(p12.d().a())).c(new TheaterAudienceChatViewLogic$micSeatDataManager$1(theaterAudie)).c(new TheaterAudienceChatViewLogic$micSeatDataManager$2(theaterAudie)).c(new TheaterAudienceChatViewLogic$micSeatDataManager$3(theaterAudie)).c(TheaterAudienceChatViewLogic$micSeatDataManager$4.INSTANCE).a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TheaterAudienceChatViewLogic.class, "1")) {
          return;
       }
       super.a();
       TheaterAudienceChatViewLogic tx = this.x;
       if (tx != null) {
          tx.b(this.q);
          tx.b(this.r);
          tx.b(this.s);
       }
       tx = this.u;
       if (tx != null) {
          t ot = tx.b();
          if (ot != null) {
             ot = ot.observeOn(d.a);
             if (ot != null) {
                b uob = ot.subscribe(new TheaterAudienceChatViewLogic$a(this));
                if (uob != null) {
                   a.b(this.e(), uob);
                }
             }
          }
       }
       return;
    }
    public ViewController b(TheaterDisplayMode p0){
       TheaterAudienceChatViewLogic a;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, TheaterAudienceChatViewLogic.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "displayMode");
       TheaterAudienceChatViewLogic p = obj.p;
       a = obj.A;
       g og = new g(VoicePartyPlayType.Theater, false);
       boolean b = (obj1 == TheaterDisplayMode.HALF_SCREEN && obj.z.a().a())? true: false;
       f uof = new f(b, false, null, null, null, 30, null);
       return new b(p, new e(a, og, v7, MicSeatStyle.Media), obj1);
    }
}
