package com.yxcorp.gifshow.comment.presenter.global.a$c;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.comment.presenter.global.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import el9.q;
import com.yxcorp.gifshow.entity.QPhoto;
import msd.l;
import ek9.a;

public class a$c implements b$a	// class@0010ed
{
    public final BaseEditorFragment$g a;
    public final QComment b;
    public final boolean c;
    public final a d;

    public void a$c(a p0,BaseEditorFragment$g p1,QComment p2,boolean p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "2")) {
          return;
       }
       this.d.a9(this.b, this.c);
       this.d.U.remove(this.b);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       a$c td = this.d;
       td.P8(a.d(td.r, new q(this.a, this.b)));
       this.d.U.remove(this.b);
       return;
    }
    public void c(){
    }
}
