package com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity$e;
import erd.g;
import com.yxcorp.gifshow.v3.editor.relay.PostRelayActivity;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.pb;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import q16.a$a;
import java.lang.Integer;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import r16.a;
import q16.a;
import android.content.Context;
import android.content.Intent;
import r16.d;
import nf6.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.relay.c;
import lnc.p3;
import q87.c;
import lq.i;
import lq.a;
import brd.t;
import lnc.mb;
import erd.o;
import lnc.nb;
import java.lang.Runnable;
import lnc.ob;
import crd.b;
import lq.e;
import android.app.Activity;

public final class PostRelayActivity$e implements g	// class@0011a5
{
    public final PostRelayActivity b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public void PostRelayActivity$e(PostRelayActivity p0,String p1,String p2,String p3,String p4,String p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void accept(Object p0){
       PostRelayActivity$e tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostRelayActivity$e.class, "1")) {
       }else {
          boolean b = false;
          String str = "activity";
          if (p0 == null) {
             PostRelayActivity$e tb = this.b;
             tc = this.c;
             PostRelayActivity$e td = this.d;
             PostRelayActivity$e tf = this.f;
             Objects.requireNonNull(pb.e);
             a.p(tb, str);
             a.p(tc, "picturePath");
             a.p(td, "caption");
             a.p(this.e, "taskId");
             a.p(tf, "extraInfo");
             p0 = new VideoContext();
             p0.b1(b);
             p0.A1(1);
             a$a uoa = new a$a();
             String[] stringArray = new String[]{tc};
             Boolean fALSE = Boolean.FALSE;
             p0 = uoa.T(stringArray).q(Integer.valueOf(2000)).a0("picture").t(fALSE).j(fALSE).h0(p0.m()).z(td);
             p0.J1 = tf;
             p0.Z(Boolean.TRUE);
             p0 = d.a(0x14d6f666).NX(tb, uoa.f());
             p0.putExtra("discard_current_post_session", 1);
             e.b(p0);
             tb.startActivity(p0);
          }else {
             tc = this.b;
             c uoc = new c(this, p0);
             Objects.requireNonNull(pb.e);
             a.p(tc, str);
             a.p(p0, "draft");
             a.p(uoc, "finish");
             Object[] objArray = new Object[b];
             p3.D().w(pb.b, "draftToEdit", objArray);
             i oi = i.V().Z(p0);
             oi.p().init().flatMap(new mb(p0)).subscribe(new nb(oi, uoc, p0, tc), ob.b);
             Intent intent = tc.getIntent();
             a.o(intent, "activity.intent");
             i.m().k().p(intent);
          }
       }
       return;
    }
}
