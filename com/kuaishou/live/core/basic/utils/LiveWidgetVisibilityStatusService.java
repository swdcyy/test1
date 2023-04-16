package com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService;
import java.lang.Object;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$AudienceWidget;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$b;

public class LiveWidgetVisibilityStatusService	// class@0008e2
{
    public List a;
    public boolean[] b;
    public Map c;

    public void LiveWidgetVisibilityStatusService(){
       super();
       List list = Arrays.asList(LiveWidgetVisibilityStatusService$AudienceWidget.values());
       this.a = list;
       boolean[] uobooleanArr = new boolean[list.size()];
       this.b = uobooleanArr;
       this.c = new HashMap();
    }
    public final boolean a(LiveWidgetVisibilityStatusService$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveWidgetVisibilityStatusService.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getIndex() < 0 || p0.getIndex() >= this.b.length) {
          return true;
       }
       return false;
    }
    public synchronized void b(LiveWidgetVisibilityStatusService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWidgetVisibilityStatusService.class, "3")) {
          return;
       }
       if (!this.a.contains(p0) || this.a(p0)) {
          return;
       }
       int index = p0.getIndex();
       LiveWidgetVisibilityStatusService tb = this.b;
       if (!tb[index]) {
          return;
       }
       tb[index] = false;
       List list = this.c.get(p0);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, false);
          }
       }
       return;
    }
    public synchronized void c(LiveWidgetVisibilityStatusService$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWidgetVisibilityStatusService.class, "2")) {
          return;
       }
       if (!this.a.contains(p0) || this.a(p0)) {
          return;
       }
       int index = p0.getIndex();
       LiveWidgetVisibilityStatusService tb = this.b;
       if (tb[index]) {
          return;
       }
       tb[index] = true;
       List list = this.c.get(p0);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0, true);
          }
       }
       return;
    }
}
