package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.f;
import i82.b;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.e;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Number;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rq5.a;
import i82.l;
import lnc.c3$a;
import lnc.c3;
import ks5.m;
import i82.m;

public class f implements b	// class@000b35
{
    public final Object a;
    public final e b;

    public void f(e p0,Object p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public User I(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.L.I();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.L.a();
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.L.s();
    }
    public GifshowActivity c(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getActivity();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       f ta = this.a;
       if (ta instanceof a) {
          c3.c(this.b.M, new l(ta));
       }else if(ta instanceof m){
          c3.c(this.b.N, new m(ta));
       }
       return;
    }
    public String getExpTag(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.L.i();
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.L.getLiveStreamId();
    }
}
