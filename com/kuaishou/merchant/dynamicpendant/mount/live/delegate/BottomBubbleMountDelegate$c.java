package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$c;
import f14.g$b;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate;
import java.lang.String;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import kotlin.jvm.internal.Ref$ObjectRef;
import bq5.h;
import f14.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f08.f;
import f08.f$a;
import java.util.Map;
import bq5.f;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import ot3.u0;
import f08.b;
import f08.b$a;

public final class BottomBubbleMountDelegate$c implements g$b	// class@0016a1
{
    public final BottomBubbleMountDelegate a;
    public final String b;
    public final String c;
    public final PendantMountInfo d;
    public final Ref$ObjectRef e;
    public final h f;
    public final g g;

    public void BottomBubbleMountDelegate$c(BottomBubbleMountDelegate p0,String p1,String p2,PendantMountInfo p3,Ref$ObjectRef p4,h p5,g p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public final void onDismiss(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomBubbleMountDelegate$c.class, "1")) {
          return;
       }
       f$a a = f.a;
       f$a.t(a, this.b, this.c, "Bubble onDismiss", null, false, false, 56, null);
       if (this.d.getDelayUpdateBubbleAreaSizeMills() != -1) {
          Ref$ObjectRef element = this.e.element;
          if (element != null) {
             BottomBubbleMountDelegate$c tf = this.f;
             if (tf != null) {
                a.m(element);
                b = tf.pa(element);
                f$a.t(a, this.b, this.c, "isBubbleInQueue:"+b, null, false, false, 56, null);
                if (!b) {
                   this.a.f(this.d, this.c);
                }
             }else if(!this.d.isNeedResume()){
                this.a.f(this.d, this.c);
             }else {
                long l = ((u0.b() - this.g.k()) - this.g.e) - (long)1000;
                b$a.e(b.a, this.d.getMaterialId()+" bubble dismiss leftTime:"+l, objArray, 2, objArray);
                if (l - null <= 0) {
                   this.a.f(this.d, this.c);
                }
             }
          }else {
             goto label_0068 ;
          }
       }else {
          goto label_0068 ;
       }
       return;
    }
}
