package com.yxcorp.gifshow.edit.previewer.loaderv2.v;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import waa.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.v$a;
import uaa.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import wba.b;
import java.util.Collection;

public class v extends a	// class@001b53
{
    public a h;
    public a i;
    public List j;
    public boolean k;

    public void v(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "1")) {
          return;
       }
       this.i = p0.a.W0();
       this.h = p0.a.H0();
       if (p1 != null && p1.length > 0) {
          int i = 0;
          if (p1[i] instanceof v$a) {
             this.j = p1[i].a;
             this.k = p1[i].b;
          }
       }
       if (p1 != null && (p1.length > 1 && p1[1] instanceof a)) {
          this.i = p1[1].g0();
          this.h = p1[1].f0();
       }
    label_0057 :
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       Workspace$Type type = this.a.a1();
       if (type == Workspace$Type.KTV_MV || type == Workspace$Type.KTV_SONG) {
          List list = b.n(this.i, this.k, 0x3f800000);
          this.j.addAll(list);
          if (list.size() > 0) {
             return;
          }
       }
       this.j.addAll(b.n(this.h, this.k, 0x3f800000));
       return;
    }
    public int g(){
       return 1;
    }
}
