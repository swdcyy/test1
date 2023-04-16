package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c$a;
import ok.h;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import kotlin.jvm.internal.a;
import android.content.Context;
import brd.t;
import com.kwai.feature.api.danmaku.c;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.a;
import erd.g;

public final class AdDanmakuElement$c$a implements h	// class@0016f7
{
    public final AdDanmakuElement$c b;

    public void AdDanmakuElement$c$a(AdDanmakuElement$c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, AdDanmakuElement$c$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b;
          AdDanmakuElement$c c = p0.c;
          AdDanmakuElement$c d = p0.d;
          p0 = p0.b.u;
          if (p0 == null) {
             a.S("mActivity");
          }
          p0 = c.b(true, d, p0).observeOn(d.a).subscribe(new a(this));
       }
       return p0;
    }
}
