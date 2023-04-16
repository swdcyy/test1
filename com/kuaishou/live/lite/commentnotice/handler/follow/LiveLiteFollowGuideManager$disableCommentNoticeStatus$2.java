package com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$disableCommentNoticeStatus$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import mrd.a;
import kotlin.jvm.internal.a;
import ja3.l;
import ja3.j;
import z1.a;
import ja3.k;
import androidx.lifecycle.LifecycleOwner;
import ip3.a;
import ja3.i;
import ja3.g;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$b;
import ja3.h;
import ja3.m;
import brd.w;
import erd.c;

public final class LiveLiteFollowGuideManager$disableCommentNoticeStatus$2 extends Lambda implements a	// class@000865
{
    public final LiveLiteFollowGuideManager this$0;

    public void LiveLiteFollowGuideManager$disableCommentNoticeStatus$2(LiveLiteFollowGuideManager p0){
       this.this$0 = p0;
       super(0);
    }
    public final t invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteFollowGuideManager$disableCommentNoticeStatus$2 obj = PatchProxy.apply(null, this, LiveLiteFollowGuideManager$disableCommentNoticeStatus$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       LiveLiteFollowGuideManager e = obj.e;
       LiveLiteFollowGuideManager i = obj.i;
       LiveLiteFollowGuideManager j = obj.j;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyThreeRefs(e, i, j, obj, LiveLiteFollowGuideManager.class, "4");
       if (ot != patchProxyRe) {
       }else {
          a uoa = PatchProxy.applyTwoRefs(i, e, obj, LiveLiteFollowGuideManager.class, "7");
          String str = "BehaviorSubject.create<Boolean>\(\)";
          if (uoa != patchProxyRe) {
          }else {
             uoa = a.g();
             a.o(uoa, str);
             l ol = new l(uoa);
             i.a(e, new j(uoa, ol), new k(ol));
          }
          a uoa1 = PatchProxy.applyTwoRefs(j, e, obj, LiveLiteFollowGuideManager.class, "5");
          if (uoa1 != patchProxyRe) {
          }else {
             uoa1 = a.g();
             a.o(uoa1, str);
             i oi = new i(obj, uoa1);
             j.a(e, new g(obj, uoa1, oi), new h(oi));
          }
          ot = t.combineLatest(uoa, uoa1, m.a);
          a.o(ot, "Observable.combineLatest¡­ right -> left || right }");
       }
       return ot;
    }
    public Object invoke(){
       return this.invoke();
    }
}
