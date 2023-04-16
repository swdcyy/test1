package com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$a;
import ok2.h;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kuaishou.live.core.show.subscribe.pendant.f$c;
import java.util.Objects;
import com.kuaishou.live.core.show.subscribe.pendant.f;
import java.util.List;
import android.graphics.RectF;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView;

public class LiveAudienceSubscribePendantPresenter$a implements h	// class@001145
{
    public final LiveAudienceSubscribePendantPresenter a;

    public void LiveAudienceSubscribePendantPresenter$a(LiveAudienceSubscribePendantPresenter p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$a.class, "5")) {
          return;
       }
       this.a.N.add(p0);
       this.a.c9();
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$a.class, "4")) {
          return;
       }
       this.a.N.remove(p0);
       this.a.c9();
       return;
    }
    public void c(f$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$a.class, "2")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter p = this.a.P;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(p0, p, f.class, "5")) {
          p.i.add(p0);
       }
       return;
    }
    public void d(f$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSubscribePendantPresenter$a.class, "3")) {
          return;
       }
       LiveAudienceSubscribePendantPresenter p = this.a.P;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(p0, p, f.class, "6")) {
          p.i.remove(p0);
       }
       return;
    }
    public RectF e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveAudienceSubscribePendantPresenter obj = PatchProxy.apply(objArray, this, LiveAudienceSubscribePendantPresenter$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.P;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, f.class, "8");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          f g = obj.g;
          if (g != null) {
             objArray = g.getPendantViewRectInWindow();
          }
       }
       return objArray;
    }
}
