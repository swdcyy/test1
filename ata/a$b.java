package ata.a$b;
import erd.a;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import ata.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import java.lang.StringBuilder;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import java.lang.Boolean;
import so5.a;
import q87.c;
import com.kwai.framework.model.kcube.TabViewInfo;

public final class a$b implements a	// class@0002f1
{
    public final TabViewInfo$TabIcon b;
    public final a c;

    public void a$b(TabViewInfo$TabIcon p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, a$b.class, "1")) {
          return;
       }
       this.c.i = objArray;
       Object[] objArray1 = new Object[0];
       b.C().w("TabIconViewHelper", "prepareIconResources finish "+this.c.l.M2()+' '+this.b+' '+this.c.j+' '+a.b(), objArray1);
       if (this.c.j != null && !a.b().booleanValue()) {
          a$b tc = this.c;
          tc.j = false;
          TabViewInfo tabViewInfo = tc.l.F("KEY_TAB_VIEW_INFO");
          a$b tc1 = this.c;
          if (tabViewInfo != null) {
             objArray = tabViewInfo.mTabIcon;
          }
          tc1.b(objArray);
       }
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
