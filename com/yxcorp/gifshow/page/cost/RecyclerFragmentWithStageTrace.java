package com.yxcorp.gifshow.page.cost.RecyclerFragmentWithStageTrace;
import rvb.j;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rvb.k$a;
import rvb.i;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.util.List;

public abstract class RecyclerFragmentWithStageTrace extends RecyclerFragment implements j	// class@000e19
{

    public void RecyclerFragmentWithStageTrace(){
       super();
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, RecyclerFragmentWithStageTrace.class, "2")) {
          return;
       }
       this.I9(this);
       return;
    }
    public k$a I0(){
       return i.b(this);
    }
    public void I9(RecyclerFragment p0){
       i.h(this, p0);
    }
    public void Uf(RecyclerFragment p0){
       i.e(this, p0);
    }
    public boolean X0(){
       return i.a(this);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecyclerFragmentWithStageTrace.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(RecyclerFragmentWithStageTrace.class, null);
       return objectsByTag;
    }
    public void j5(){
       i.c(this);
    }
    public void m2(Object p0){
       i.i(this, p0);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerFragmentWithStageTrace.class, "1")) {
          return;
       }
       this.Uf(this);
       super.onCreate(p0);
       return;
    }
    public List r1(){
       return i.f(this);
    }
    public void ud(){
       i.g(this);
    }
    public void y7(){
       i.d(this);
    }
}
