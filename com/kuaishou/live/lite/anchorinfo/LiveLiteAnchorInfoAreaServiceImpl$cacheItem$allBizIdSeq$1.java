package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1;
import java.util.Iterator;
import nsd.h;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2;

public final class LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1 extends RestrictedSuspendLambda implements p	// class@001e3d
{
    public Object L$0;
    public int label;
    public o p$;

    public void LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1(c p0){
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1(p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveLiteAnchorInfoAreaServiceImpl$cacheItem$allBizIdSeq$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                j0.n(p0);
             label_005e :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          this.L$0 = tlabel;
          this.label = 1;
          if (tlabel.e(h.a(LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.values()), this) == obj) {
             return obj;
          }
       }
       this.L$0 = tlabel;
       this.label = 2;
       if (tlabel.e(h.a(LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.values()), this) == obj) {
          return obj;
       }else {
          goto label_005e ;
       }
    }
}
