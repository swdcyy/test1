package com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$f;
import java.lang.Object;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$c;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$t;
import android.view.View;
import i1b.d;
import java.lang.Exception;
import q87.c;

public class VirtualLayoutManager$f	// class@001a7f
{
    public ExposeLinearLayoutManagerEx$c a;

    public void VirtualLayoutManager$f(){
       super();
    }
    public void VirtualLayoutManager$f(ExposeLinearLayoutManagerEx$c p0){
       super();
       this.a = p0;
    }
    public int a(){
       return this.a.e;
    }
    public int b(){
       return this.a.f;
    }
    public int c(){
       return this.a.j;
    }
    public int d(){
       return this.a.h;
    }
    public int e(){
       return this.a.d;
    }
    public boolean f(RecyclerView$y p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VirtualLayoutManager$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a(p0);
    }
    public boolean g(){
       boolean b = (this.a.m != null)? true: false;
       return b;
    }
    public View h(RecyclerView$t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VirtualLayoutManager$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.a.b(p0);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          d.C().t("VirtualLayoutManager", e4.getMessage(), objArray);
          return null;
       }
    }
}
