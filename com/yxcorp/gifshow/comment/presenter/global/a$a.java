package com.yxcorp.gifshow.comment.presenter.global.a$a;
import com.yxcorp.gifshow.comment.e$f;
import com.yxcorp.gifshow.comment.presenter.global.a;
import java.lang.Object;
import ek9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;

public class a$a implements e$f	// class@0010ea
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.P8(p0);
       return;
    }
    public void b(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       g og = this.a.M.g7();
       if (og instanceof b) {
          og.v1(p0);
       }
       return;
    }
}
