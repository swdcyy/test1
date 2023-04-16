package com.kuaishou.live.core.show.wishlight.render.a$e;
import dn2.a$a;
import com.kuaishou.live.core.show.wishlight.render.a;
import java.lang.Object;
import dn2.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xy2.a;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.wishlight.render.a$a;
import java.util.Objects;
import java.util.Map;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand$MockState;
import com.kuaishou.live.core.show.wishlight.render.LiveWishLightEffectCommand;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import fg6.a;
import com.google.gson.Gson;
import gz2.h;
import java.lang.Long;
import gz2.d;
import java.lang.Runnable;
import pz2.c;
import zf1.d;
import java.lang.Throwable;
import android.util.Log;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public final class a$e implements a$a	// class@0012b6
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void a(g p0,String p1){
       a$e ta;
       LiveWishLightEffectCommand$MockState mockState;
       int i;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$e.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "avatarPath");
       p0 = p0.a;
       if (p0 instanceof a) {
          try{
             a$a l = a.l;
             l.b("[AvatarDownload#onSuccess]taskId:"+p0.N());
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, a.class, "9")) {
                Map map = p0.M();
                if (map.isEmpty() ^ 1) {
                   mockState = map.get("live_wish_light_mock_state");
                   if (!mockState instanceof LiveWishLightEffectCommand$MockState) {
                      mockState = null;
                   }
                }else {
                   str = null;
                }
                LiveWishLightEffectCommand liveWishLigh = new LiveWishLightEffectCommand(p0.N(), p0.L(), p1, mockState);
                i = 1005;
                str = a.a.q(liveWishLigh);
                l.b("[executeCommand]taskId:"+p0.N()+",json:"+str);
                a j = ta.j;
                long l1 = p0.b();
                Objects.requireNonNull(j);
                h oh = h.class;
                if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l1), str, j, oh, "5")) {
                   j.l(new d(j, l1, str));
                }
                j = ta.f;
                if (j != null) {
                   j.f(p0, 1, i, null);
                }
             }
          }catch(java.lang.Exception e0){
             String stackTraceSt = Log.getStackTraceString(e0);
             a.o(stackTraceSt, "Log.getStackTraceString\(e\)");
             a.l.a("[executeCommand]taskId:"+p0.N()+",error:"+stackTraceSt);
             a f = ta.f;
             if (f != null) {
                f.f(p0, false, i, stackTraceSt);
             }
          }
       }else {
          a.l.a("[AvatarDownload#onSuccess]unknown task "+p0);
       }
    }
    public void b(g p0,LiveAvatarFailType p1,String p2,Throwable p3){
       g a;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a$e.class, "2")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "failType");
       a.p(p2, "errorMsg");
       a = p0.a;
       if (a instanceof a) {
          String str = "error:"+p2+",url:"+e0.d(p0.b);
          a.l.b("[AvatarDownload#onFail]"+a.N()+",failType:"+p1+','+str);
          a f = this.a.f;
          if (f != null) {
             f.f(a, false, 1004, str);
          }
       }else {
          a.l.a("[AvatarDownload#onFail]unknown task "+a);
       }
       return;
    }
}
