package com.yxcorp.gifshow.detail.common.information.quickcomment.b$b;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.detail.common.information.quickcomment.b;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m9a.t$c;

public class b$b implements b$a	// class@001445
{
    public final QComment a;
    public final BaseEditorFragment$g b;
    public final b c;

    public void b$b(b p0,QComment p1,BaseEditorFragment$g p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "2")) {
          return;
       }
       b$b tc = this.c;
       tc.K = false;
       tc.w0();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.c.n0(this.a, null, this.b, -1);
       return;
    }
    public void c(){
    }
}
