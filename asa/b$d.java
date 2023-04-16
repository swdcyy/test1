package asa.b$d;
import lr6.e;
import asa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wra.b;
import lr6.a;
import tra.b;
import java.lang.StringBuilder;
import q87.c;

public final class b$d implements e	// class@0002e2
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "1")) {
          return;
       }
       b.S8(this.a).g = b.R8(this.a).k();
       Object[] objArray = new Object[0];
       b.C().s("KCubeBlockActionBarPresenter", "appBar scrollTo: "+b.R8(this.a).k(), objArray);
       return;
    }
}
