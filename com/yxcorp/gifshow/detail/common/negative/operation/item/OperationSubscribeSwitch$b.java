package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager;

public final class OperationSubscribeSwitch$b implements g	// class@00148f
{
    public final OperationSubscribeSwitch b;
    public final boolean c;

    public void OperationSubscribeSwitch$b(OperationSubscribeSwitch p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationSubscribeSwitch$b.class, str)) {
       }else {
          boolean b = true;
          if (this.c == null) {
             int i = 0x7f11066a;
             OperationSubscribeSwitch$b tb = this.b;
             Objects.requireNonNull(tb);
             str = PatchProxy.apply(null, tb, OperationSubscribeSwitch.class, str);
             if (str == PatchProxyResult.class) {
                str = tb.E.getValue();
             }
             i.f(i, str, b);
          }
          SubscribeAuthorGuideManager.d(this.b.C, (b ^ this.c));
       }
       return;
    }
}
