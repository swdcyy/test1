package com.kuaishou.live.common.core.component.gift.domain.giftbox.router.LiveGiftBoxRouterManager$b;
import vq5.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.router.LiveGiftBoxRouterManager;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.x0;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.framework.model.user.UserInfo;
import java.net.URLDecoder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import z1.k;
import ni1.a;
import lj1.c;
import java.util.List;
import trd.t;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.SelectMode;
import java.util.Map;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;

public final class LiveGiftBoxRouterManager$b implements b	// class@001208
{
    public final LiveGiftBoxRouterManager a;

    public void LiveGiftBoxRouterManager$b(LiveGiftBoxRouterManager p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       int i1;
       int i2;
       String str3;
       UserInfo userInfo;
       LiveGiftBoxRouterManager d;
       a uoa;
       String str4;
       String str5;
       String str6;
       String str7;
       UserInfo userInfo1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiftBoxRouterManager liveGiftBoxR = LiveGiftBoxRouterManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxRouterManager$b.class, "1")) {
          return;
       }
       b.c0(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxRouterManager] receive router", "uri", p0);
       String str = x0.a(p0, "tab");
       if (str == null) {
          str = "NormalGift";
       }
       String str1 = str;
       str = x0.a(p0, "selectedGiftId");
       int i = (str != null)? Integer.parseInt(str): -1;
       LiveGiftBoxRouterManager$b ta = this.a;
       a.o(p0, "it");
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyOneRefs(p0, ta, liveGiftBoxR, "4");
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else {
          i1 = 2;
          String str2 = x0.a(p0, "sourceType");
          if (str2 != null) {
             try{
                i1 = Integer.parseInt(str2);
             }catch(java.lang.Exception e4){
                b.I(LiveLogTag.GIFT, "parse url params sourceType failed: "+str2, e4);
             }
          }
       }
    }
}
