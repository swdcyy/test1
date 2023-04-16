package fia.t;
import ytd.b;
import com.yxcorp.gifshow.follow.common.pymi.PymiUserRecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;

public final class t implements b	// class@002936
{
    public final PymiUserRecyclerView b;

    public void t(PymiUserRecyclerView p0){
       this.b = p0;
       super();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.x(-1) ^ 0x01);
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.x(1) ^ 1);
    }
    public View getView(){
       return this.b;
    }
}
