package com.kuaishou.live.core.show.wish.f;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.wish.f$a;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xm2.c;
import ym2.g;
import zm2.a;
import com.kuaishou.live.core.show.wish.b;
import bn2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import vq5.d;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cn2.i;
import java.util.Map;
import va1.s0;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;
import com.google.gson.JsonIOException;
import com.kwai.robust.PatchProxyResult;
import wm2.i;
import t02.a0;
import ym2.g$b;
import zm2.a$c;
import com.kuaishou.live.core.show.wish.e;
import vq5.b;

public class f extends f implements g	// class@00129c
{
    public d K;
    public LiveAudienceWishRoomKrnDialogPresenter$b L;
    public g$b M;
    public a$c N;
    public a0 O;
    public a P;
    public static String sLivePresenterClassName = "LiveAudienceWishRoomPresenter";

    public void f(){
       super();
       this.P = new f$a(this);
       this.U7(new LiveAudienceWishRoomKrnDialogPresenter());
       this.U7(new c());
       this.U7(new g());
       this.U7(new a());
       this.U7(new b());
       this.U7(new b());
    }
    public void Q(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "3")) {
          return;
       }
       this.K.Z4("wishroom");
       return;
    }
    public void a9(LiveAudienceWishDetail p0,String p1){
       HashMap hashMap;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "5")) {
          return;
       }
       try{
          hashMap = new HashMap();
          str = a.a.q(p0);
       }catch(com.google.gson.JsonIOException e4){
          if (SystemUtil.I()) {
             throw new JsonIOException("LiveAudienceWishDetail JsonIOException");
          }
          b.I(LiveLogTag.LIVE_WISH_ROOM, "LiveAudienceWishDetail JsonIOException", e4);
          str = "";
       }
       if (TextUtils.x(str)) {
          return;
       }
       hashMap.put("firstScreenData", i.c(str));
       this.L.a(s0.a(p1, hashMap), false);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.q8(LiveAudienceWishRoomKrnDialogPresenter$b.class);
       this.K = this.r8("LIVE_ROUTER_SERVICE");
       this.O = this.q8(a0.class);
       this.M = this.q8(g$b.class);
       this.N = this.q8(a$c.class);
       return;
    }
    public void x(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       this.K.t5("wishroom", new e(this));
       return;
    }
}
