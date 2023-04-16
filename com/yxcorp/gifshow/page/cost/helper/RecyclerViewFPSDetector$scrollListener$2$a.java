package com.yxcorp.gifshow.page.cost.helper.RecyclerViewFPSDetector$scrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.page.cost.helper.RecyclerViewFPSDetector$scrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.page.cost.helper.RecyclerViewFPSDetector;
import java.lang.StringBuilder;
import com.kwai.soc.arch.rubas.base.Rubas;

public final class RecyclerViewFPSDetector$scrollListener$2$a extends RecyclerView$r	// class@000e1c
{
    public final RecyclerViewFPSDetector$scrollListener$2 a;

    public void RecyclerViewFPSDetector$scrollListener$2$a(RecyclerViewFPSDetector$scrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       RecyclerViewFPSDetector$scrollListener$2$a oscrollListe = RecyclerViewFPSDetector$scrollListener$2$a.class;
       if (PatchProxy.isSupport(oscrollListe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oscrollListe, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       RecyclerViewFPSDetector$scrollListener$2 this$0 = this.a.this$0;
       RecyclerViewFPSDetector b = this$0.b;
       if (b == null && p1) {
          this$0.b = true;
          Rubas.f(this.a.this$0.a()+"_scroll_start", null, null, null, 14, null);
       }else if(b != null && !p1){
          this$0.b = false;
          Rubas.f(this.a.this$0.a()+"_scroll_end", null, null, null, 14, null);
       }
       return;
    }
}
