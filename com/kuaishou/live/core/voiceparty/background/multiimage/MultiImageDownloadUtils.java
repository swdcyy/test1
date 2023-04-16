package com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageDownloadUtils;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.tools.g$d;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageDownloadUtils$download$1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageDownloadUtils$a;
import com.kuaishou.live.common.core.basic.tools.g$a;
import com.kuaishou.live.common.core.basic.tools.g$c;
import com.kuaishou.live.common.core.basic.tools.g;
import dsd.e;
import qrd.l1;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class MultiImageDownloadUtils	// class@001361
{
    public static final MultiImageDownloadUtils a;

    static {
       MultiImageDownloadUtils.a = new MultiImageDownloadUtils();
    }
    public void MultiImageDownloadUtils(){
       super();
    }
    public final Object a(g$d p0,c p1){
       Object obj2;
       Ref$ObjectRef objectRef;
       MultiImageDownloadUtils$download$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, MultiImageDownloadUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof MultiImageDownloadUtils$download$1) {
          obj = p1;
          MultiImageDownloadUtils$download$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
             try{
             label_0025 :
                MultiImageDownloadUtils$download$1 result = obj.result;
                Object obj1 = b.h();
                MultiImageDownloadUtils$download$1 label1 = obj.label;
                int i1 = 1;
                if (label1 != null) {
                   if (label1 == i1) {
                      try{
                         j0.n(result);
                      }catch(java.util.concurrent.CancellationException e6){
                         obj2 = e6;
                         objectRef = obj.L$2;
                         p0 = obj.L$1;
                      }
                      b.j0(LiveLogTag.LIVE_VOICE_PARTY, "bg download failed "+p0);
                      Ref$ObjectRef element = objectRef.element;
                      if (element != null) {
                         element.a();
                      }
                      throw obj2;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(result);
                   objectRef = new Ref$ObjectRef();
                   h obj3 = null;
                   objectRef.element = obj3;
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = objectRef;
                   obj.label = i1;
                   obj3 = new h(IntrinsicsKt__IntrinsicsJvmKt.d(obj));
                   objectRef.element = g.a(p0, new MultiImageDownloadUtils$a(obj3));
                   Object obj4 = obj3.b();
                   if (obj4 == b.h()) {
                      e.c(obj);
                   }
                   if (obj4 == obj1) {
                      return obj1;
                   }
                }
                return l1.a;
             }catch(java.util.concurrent.CancellationException e0){
                goto label_008a ;
             }
          }
       }
       obj = new MultiImageDownloadUtils$download$1(this, p1);
       goto label_0025 ;
    }
}
