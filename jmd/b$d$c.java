package jmd.b$d$c;
import n3d.a;
import jmd.b$d;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import faa.a;
import q87.c;
import mn6.a;

public final class b$d$c implements a	// class@00170d
{
    public final b$d b;

    public void b$d$c(b$d p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(b$d$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b$d$c.class, "1")) {
          return;
       }
       if (p0 == 1 && p1 == -1) {
          Object[] objArray = new Object[0];
          a.D().w("ThreeOptionsVote", "onVoteResultPanelClicked: back]", objArray);
          this.b.c.f();
       }
       return;
    }
}
