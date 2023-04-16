package com.kuaishou.pagedy.request.b;
import erd.g;
import com.kuaishou.pagedy.request.d;
import com.kuaishou.pagedy.request.a;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import to4.g;
import java.util.Map;
import ro4.a;
import java.lang.StringBuilder;
import nv.c;
import pv.b;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.pagedy.request.PreReqManager$2$1;
import fv.c;
import com.kuaishou.pagedy.request.PreReqInfo;
import com.kuaishou.pagedy.request.PreReqInfo$ReqStatus;
import com.kuaishou.pagedy.request.a$b;
import java.util.HashMap;
import pv.a;
import java.lang.Throwable;

public class b implements g	// class@000a9a
{
    public final a b;
    public final d c;

    public void b(d p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       boolean b;
       String[] obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b = false;
          b uob = 1;
          if (p0 != null && p0.result == uob) {
             uob = this.c;
             b tb = this.b;
             Objects.requireNonNull(uob);
             obj = PatchProxy.applyOneRefs(tb, uob, d.class, "5");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(tb == null || TextUtils.x(tb.f)){
                b = (tb.f).contains("dynamic/page");
             }
             if (b) {
                g.a("merchant_pgy_page_response");
             }else {
                g.a("merchant_pgy_feed_response");
             }
             a uoa = this.c.b.remove(this.b.f);
             if (uoa != null) {
                this.c.a.remove(this.b.f);
                c.f("pre req success response"+this.b.f);
                c.l(StageName.pgy_page_prefetch_hit, this.b.g, b.a().b(this.b.g, "PageDy"), new PreReqManager$2$1(this));
                uoa.a(p0);
             }else {
                PreReqInfo preReqInfo = this.c.a.get(this.b.f);
                if (preReqInfo != null) {
                   preReqInfo.c = PreReqInfo$ReqStatus.COMPLETE;
                   preReqInfo.b = p0;
                }
                c.f("pre req success cache "+this.b.f);
             }
             p0 = this.b;
             if (p0.c != null) {
                uoa = p0.j;
                if (uoa != null) {
                   uoa.a(p0.f, p0.h);
                }
             }
          }else {
             this.c.a.remove(this.b.f);
             p0 = this.c.b.remove(this.b.f);
             if (p0 != null) {
                String[] stringArray = new String[]{"reqPath"};
                obj = new String[uob];
                obj[b] = this.b.f;
                c.d("pre req error", a.a(stringArray, obj));
                p0.onError(new Throwable("pre req error"));
             }
          }
       }
       return;
    }
}
