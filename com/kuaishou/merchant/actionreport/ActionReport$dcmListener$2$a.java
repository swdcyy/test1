package com.kuaishou.merchant.actionreport.ActionReport$dcmListener$2$a;
import ma4.d;
import com.kuaishou.merchant.actionreport.ActionReport$dcmListener$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.actionreport.ActionReport;
import com.kuaishou.merchant.actionreport.ActionReport$ActionType;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.List;
import ot3.u0;

public final class ActionReport$dcmListener$2$a implements d	// class@0014d0
{
    public final ActionReport$dcmListener$2 a;

    public void ActionReport$dcmListener$2$a(ActionReport$dcmListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActionReport$dcmListener$2$a.class, "1")) {
          return;
       }
       ActionReport$dcmListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this$0, ActionReport.class, "9")) {
          this$0.a(p0, p1, ActionReport$ActionType.SHOW);
       }
       ActionReport.j(this.a.this$0, "DCM component opened callback:"+p0, null, false, 6, null);
       this.a.this$0.e().add(u0.a(u0.b())+"_opened_"+p0);
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActionReport$dcmListener$2$a.class, "2")) {
          return;
       }
       ActionReport$dcmListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this$0, ActionReport.class, "10")) {
          this$0.a(p0, p1, ActionReport$ActionType.CLOSE);
       }
       ActionReport.j(this.a.this$0, "DCM component closed callback:"+p0, null, false, 6, null);
       this.a.this$0.e().add(u0.a(u0.b())+"_closed_"+p0);
       return;
    }
}
