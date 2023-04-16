package lx9.a;
import cl9.v1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx9.c;
import mzc.a;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import java.util.List;

public class a extends v1	// class@002eb1
{
    public boolean v;

    public void a(){
       super();
    }
    public void a(boolean p0){
       super();
       this.v = p0;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       if (c.a()) {
          this.s.add(new a(this.r, this.t, "BOTTOM_COMMENT_BOX"));
       }
       return;
    }
}
