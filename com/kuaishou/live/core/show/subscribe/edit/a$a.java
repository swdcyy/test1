package com.kuaishou.live.core.show.subscribe.edit.a$a;
import ok2.g;
import com.kuaishou.live.core.show.subscribe.edit.a;
import java.lang.Object;
import tk2.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.subscribe.edit.o;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams$DisplayMode;

public class a$a implements g	// class@0010f5
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       a w = this.a.w;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(p0, w, o.class, "27")) {
          w.g.remove(p0);
       }
       return;
    }
    public boolean b(){
       Boolean obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.v.getValue();
       boolean b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public void c(int p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uoa, uoa1, "1")) {
          SubscribeDialogParams subscribeDia = new SubscribeDialogParams();
          if (!p0) {
             p0 = uoa.S8();
          }
          subscribeDia.b = p0;
          if (!p1) {
             p1 = uoa.W8();
          }
          subscribeDia.c = p1;
          subscribeDia.a = SubscribeDialogParams$DisplayMode.DetailList;
          uoa.w.o(subscribeDia);
       }
       return;
    }
    public void d(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.a.w.a(p0);
       return;
    }
}
