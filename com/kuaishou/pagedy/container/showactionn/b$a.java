package com.kuaishou.pagedy.container.showactionn.b$a;
import lo4.k;
import com.kuaishou.pagedy.container.showactionn.b;
import java.lang.Object;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.pagedy.container.showactionn.a;
import android.view.View;
import com.kuaishou.pagedy.container.showactionn.a$a;

public class b$a implements k	// class@000a63
{
    public View a;
    public boolean b;
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
       this.a = null;
       this.b = false;
    }
    public void a(ViewGroup p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "1")) {
          return;
       }
       if (this.b == null) {
          if (p0 != null && p1 != null) {
             View view = a.b.a(p1, p0);
             this.a = view;
             if (view != null) {
                p0.addView(view);
                p1.bindData(p1, this.a, 0);
             }
             this.b = true;
          }
       }else {
          b$a ta = this.a;
          if (ta != null) {
             ta.setVisibility(0);
          }
       }
       return;
    }
    public View b(){
       return this.a;
    }
    public void c(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       if (ta != null) {
          ta.setVisibility(8);
       }
       return;
    }
    public void release(){
       this.a = null;
       this.b = false;
    }
}
