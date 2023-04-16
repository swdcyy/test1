package com.yxcorp.gifshow.v3.editor.cover.l;
import uxb.g;
import java.lang.Object;
import r1c.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.cover.j$a;
import vl8.c;
import com.yxcorp.gifshow.v3.editor.cover.j;
import com.yxcorp.gifshow.v3.editor.cover.k$a;
import com.yxcorp.gifshow.v3.editor.cover.k;
import upc.d;
import upc.d$a;

public class l implements g	// class@000e7f
{

    public void l(){
       super();
    }
    public List AV(h p0,c p1,EditorSdk2V2$VideoEditorProject p2,Object p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, l.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       j$a uoa = new j$a(p1);
       Object[] objArray = new Object[]{p3};
       uoa.u(objArray);
       uArrayList.add(new j(uoa));
       k$a uoa1 = new k$a(p1);
       Object[] objArray1 = new Object[]{p3};
       uoa1.u(objArray1);
       uArrayList.add(new k(uoa1));
       return uArrayList;
    }
    public void O1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "4")) {
          d.g.a(p0);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
