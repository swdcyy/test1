package com.tachikoma.component.listview.layoutmanager.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import com.tachikoma.component.listview.layoutmanager.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class a	// class@000d13
{
    public int a;
    public boolean b;
    public int c;

    public void a(){
       super();
       this.c = -1;
    }
    public void a(int p0){
       this.c = p0;
    }
    public void b(){
       this.b = true;
    }
    public void c(int p0){
       this.a = p0;
    }
    public a$a d(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          p1 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       a$a uoa = new a$a(p0.getContext());
       uoa.q = this.a;
       uoa.r = this.b;
       uoa.s = this.c;
       this.a = 0;
       this.b = false;
       this.c = -1;
       uoa.p(p2);
       return uoa;
    }
}
