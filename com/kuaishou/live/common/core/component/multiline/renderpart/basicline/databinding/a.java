package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import oq1.e;
import oq1.b;
import xp5.i;
import sq1.a;
import hr1.a;
import ir1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$b;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$c;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$d;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$e;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$f;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.d;
import msd.p;
import com.kuaishou.live.viewcontroller.ViewController;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.live.core.show.multiline.LiveMultiLineCellLayoutDescription;
import pq1.b;
import java.lang.Boolean;

public abstract class a	// class@001555
{
    public final HashMap a;
    public final HashMap b;
    public final LiveInteractWidgetContainer c;
    public final e d;
    public final b e;
    public final i f;
    public final a g;
    public final a h;
    public final c i;

    public void a(e p0,b p1,i p2,a p3,a p4,c p5){
       a.p(p1, "lineLogParamsProvider");
       a.p(p2, "liveLogPackageProvider");
       a.p(p3, "roomDelegate");
       a.p(p4, "containerVcDelegate");
       a.p(p5, "viewModel");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.a = new HashMap();
       this.b = new HashMap();
       View view = p4.a().findViewById(R.id.live_audience_multi_line_flex_layout);
       a.o(view, "containerVcDelegate.getR¡­e_multi_line_flex_layout\)");
       this.c = view;
       LiveData liveData = Transformations.distinctUntilChanged(p5.u0());
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       liveData.observe(p4.j(), new a$a(this));
       p5.w0().observe(p4.j(), new a$b(this));
       p5.v0().observe(p4.j(), new a$c(this));
       p5.f.observe(p4.j(), new a$d(this));
       p5.h.observe(p4.j(), new a$e(this));
       p5.g.observe(p4.j(), new a$f(this));
    }
    public abstract ViewController a(a p0,String p1,d p2,p p3);
    public final int b(Map p0){
       Map$Entry obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return 1;
          }
          obj = iterator.next();
          float f = obj.getValue().getRatioEndX() - obj.getValue().getRatioStartX();
          if (f - 0x3f000000 < 0) {
             break ;
          }
       }
       return 2;
    }
    public final HashMap c(){
       return this.b;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().o();
       }
       this.b.clear();
       return;
    }
    public abstract void e(String p0);
    public abstract void f(a p0);
    public boolean g(ViewController p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "subVc");
       a.p(p1, "cellInfo");
       return true;
    }
}
