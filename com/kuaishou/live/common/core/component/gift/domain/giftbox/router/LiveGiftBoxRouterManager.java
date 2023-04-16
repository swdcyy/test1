package com.kuaishou.live.common.core.component.gift.domain.giftbox.router.LiveGiftBoxRouterManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import vq5.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.router.LiveGiftBoxRouterManager$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import java.util.Collection;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.router.LiveGiftBoxRouterManager$b;
import vq5.b;

public final class LiveGiftBoxRouterManager extends LifecycleManager	// class@001209
{
    public final d c;
    public final LiveGiftBoxManager d;
    public final k e;

    public void LiveGiftBoxRouterManager(LifecycleOwner p0,d p1,LiveGiftBoxManager p2,k p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "routerManager");
       a.p(p2, "giftBoxManager");
       a.p(p3, "anchorInfo");
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.c();
    }
    public final CDNUrl[] b(String p0){
       int i;
       CDNUrl[] obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxRouterManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CDNUrl[] uCDNUrlArray = null;
       if (TextUtils.x(p0)) {
          return uCDNUrlArray;
       }
       try{
          p0 = a.a.i(p0, new LiveGiftBoxRouterManager$a().getType());
          a.o(p0, "Gsons.KWAI_GSON.fromJson\x20\x02ist<CDNUrl?>?>\(\) {}.type\)\x00");
          obj = new CDNUrl[p0.size()];
          int i1 = p0.size();
          for (i = 0; i < i1; i = i + 1) {
             obj[i] = p0.get(i);
          }
          return obj;
       }catch(java.lang.RuntimeException e5){
          b.I(LiveLogTag.LIVE_PROFILE, "parse headUrls json error", e5);
          return i;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxRouterManager.class, "2")) {
          return;
       }
       this.c.t5("giftpanel", new LiveGiftBoxRouterManager$b(this));
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxRouterManager.class, "3")) {
          return;
       }
       this.c.Z4("giftpanel");
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxRouterManager.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.d();
       return;
    }
}
