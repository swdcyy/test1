package com.kuaishou.live.core.show.subscribe.pendant.f$a;
import com.kuaishou.live.core.show.subscribe.pendant.LiveSubscribePendantView$b;
import com.kuaishou.live.core.show.subscribe.pendant.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.subscribe.pendant.f$c;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribePendantInfo$LiveSubscribePendantDetail;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.subscribe.pendant.f$b;

public class f$a implements LiveSubscribePendantView$b	// class@001151
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "5")) {
          return;
       }
       Iterator iterator = this.a.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(boolean p0,Object p1){
       f$a uoa = f$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "2")) {
          b.c0(LiveLogTag.LIVE_SUBSCRIBE, "onClickSubscribeButton", "payload", p1);
          f e = this.a.e;
          if (e != null && (!p0 || p1.mDisableCancel == null)) {
             e.b(p0, p1);
          }
       }
       return;
    }
    public void c(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "4")) {
       }else {
          b.c0(LiveLogTag.LIVE_SUBSCRIBE, "onFinishShowNextView", "payload", p0);
          f e = this.a.e;
          if (e != null) {
             e.c(p0);
          }
       }
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          b.c0(LiveLogTag.LIVE_SUBSCRIBE, "onClickCloseButton", "payload", p0);
          f e = this.a.e;
          if (e != null) {
             e.d(p0);
          }
       }
       return;
    }
    public void e(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
       }else {
          b.c0(LiveLogTag.LIVE_SUBSCRIBE, "onClickSubscribeView", "payload", p0);
          f e = this.a.e;
          if (e != null) {
             e.a(p0);
          }
       }
       return;
    }
}
