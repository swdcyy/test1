package com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import java.util.Map;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$a;
import hr3.a;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import qkd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import qrd.p;

public final class LiveGiftComboButtonAnimationUtils$a	// class@00117f
{

    public void LiveGiftComboButtonAnimationUtils$a(){
       super();
    }
    public void LiveGiftComboButtonAnimationUtils$a(u p0){
       super();
    }
    public final String a(String p0){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiftComboButtonAnimationUtils$a uoa = LiveGiftComboButtonAnimationUtils$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "fileName");
       if (this.f()) {
          str = PatchProxy.applyOneRefs(p0, this, uoa, "9");
          if (str != patchProxyRe) {
          }else {
             p0 = LiveGiftComboButtonAnimationUtils.g.get(p0);
             LiveMaterialResourceManager$a uoa1 = (p0 == null || !p0.length())? 1: null;
             str = "";
             if (!uoa1) {
                a uoa2 = LiveMaterialResourceManager.d.a().c(p0);
                if (uoa2 != null) {
                   uoa2 = uoa2.a();
                   if (uoa2 != null) {
                   label_0051 :
                      str = uoa2;
                   }
                }
             }
          }
       }else {
          str = PatchProxy.applyOneRefs(p0, this, uoa, "10");
          if (str != patchProxyRe) {
          }else {
             p0 = LiveResourceFileUtil.k("live_send_gift_combo_button_animation_resource")+File.separator+p0+".webp";
             LiveResourceFileUtil$LiveResourceFileType lIVE_SEND_GI = LiveResourceFileUtil$LiveResourceFileType.LIVE_SEND_GIFT_COMBO_BUTTON_RESOURCE;
             if (!b.S(LiveResourceFileUtil.j(lIVE_SEND_GI, p0))) {
                b.r(LiveLogTag.GIFT.appendTag("LiveGiftComboButtonAnimationUtils"), "getGiftComboButtonResourcePath is "+"not valid "+p0);
                LiveResourceFileUtil.h(lIVE_SEND_GI);
                goto label_0051 ;
             }else {
                goto label_0051 ;
             }
          }
       }
       return str;
    }
    public final File b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftComboButtonAnimationUtils$a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_SLOT_SPECIAL_COMBO_RESOURCE, LiveResourceFileUtil.k("live_gift_slot_special_combo_res")+File.separator+p0);
    }
    public final Map c(){
       return LiveGiftComboButtonAnimationUtils.a;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveGiftComboButtonAnimationUtils$a.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LiveGiftComboButtonAnimationUtils.b.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, LiveGiftComboButtonAnimationUtils$a.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = LiveGiftComboButtonAnimationUtils.f.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, LiveGiftComboButtonAnimationUtils$a.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = LiveGiftComboButtonAnimationUtils.e.getValue();
       }
       return obj.booleanValue();
    }
}
