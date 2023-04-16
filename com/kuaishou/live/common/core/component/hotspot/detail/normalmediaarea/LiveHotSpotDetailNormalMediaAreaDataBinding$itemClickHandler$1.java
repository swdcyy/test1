package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding$itemClickHandler$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding;
import java.lang.Object;
import ln1.b;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mn1.d$e$a;
import mn1.d;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.Activity;
import un1.k;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType$a;
import fn1.a;
import fn1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewModel$logClickEvent$1;
import msd.l;

public final class LiveHotSpotDetailNormalMediaAreaDataBinding$itemClickHandler$1 extends Lambda implements p	// class@0013d7
{
    public final LiveHotSpotDetailNormalMediaAreaDataBinding this$0;

    public void LiveHotSpotDetailNormalMediaAreaDataBinding$itemClickHandler$1(LiveHotSpotDetailNormalMediaAreaDataBinding p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(b p0,View p1){
       d$e$a a;
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotDetailNormalMediaAreaDataBinding$itemClickHandler$1.class, "1")) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "view");
       LiveHotSpotDetailNormalMediaAreaDataBinding d = this.this$0.d;
       if (d != null) {
          d$e$a uoe$a = new d$e$a(p0, p1);
          d uod = d.class;
          if (!PatchProxy.applyVoidOneRefs(uoe$a, d, uod, "2")) {
             a.p(uoe$a, "intent");
             a = uoe$a.a;
             BaseFeed baseFeed = a.getBaseFeed();
             if (baseFeed != null) {
                uoe$a = uoe$a.b;
                List obj = PatchProxy.applyTwoRefs(baseFeed, uoe$a, d, uod, "4");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   obj = d.b.getValue();
                   if (obj != null) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = obj.iterator();
                      while (iterator.hasNext()) {
                         BaseFeed baseFeed1 = iterator.next().getBaseFeed();
                         if (baseFeed1 != null) {
                            uArrayList.add(baseFeed1);
                         }
                      }
                      b = d.f.s1(baseFeed, uArrayList, uoe$a, d.e);
                   }else {
                      b = false;
                   }
                }
                if (b && !PatchProxy.applyVoidOneRefs(a, d, uod, "3")) {
                   a.a.b("LIVE_HOTSPOT_DATAIL_RELATED_CONTENT", d.f.E0(), d.f.a(), new LiveHotSpotDetailNormalMediaAreaViewModel$logClickEvent$1(MediaType.Companion.a(a).getLoggerType(), a));
                }
             }
          }
       }
       return;
    }
}
