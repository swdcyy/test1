package com.kuaishou.bowl.core.component.KRNComponent$1;
import hu4.f;
import com.kuaishou.bowl.core.component.KRNComponent;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.event.utils.StageName;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import fv.c;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.KRNComponent$1$1;
import java.util.Map;
import hu4.e;

public class KRNComponent$1 implements f	// class@00118f
{
    public final KRNComponent a;

    public void KRNComponent$1(KRNComponent p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KRNComponent$1.class, "2")) {
          return;
       }
       KRNComponent$1 ta = this.a;
       c.j(StageName.pgy_component_render_fail, ta.componentData, ta.getPageName(), this.a.rubasToken);
       return;
    }
    public void b(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KRNComponent$1.class, "1")) {
          return;
       }
       KRNComponent$1 ta = this.a;
       c.k(StageName.pgy_component_render_success, ta.componentData, ta.getPageName(), this.a.rubasToken, new KRNComponent$1$1(this));
       return;
    }
    public void c(){
       e.a(this);
    }
}
