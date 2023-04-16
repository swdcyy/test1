package com.yxcorp.gifshow.comment.e$d;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.comment.e;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e$g;
import ek9.d1;

public class e$d implements e$c	// class@0010b8
{
    public e$c a;
    public final e b;

    public void e$d(e p0,e$c p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(QComment p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "3")) {
          return;
       }
       e$d ta = this.a;
       if (ta != null) {
          ta.a(p0, p1);
       }
       return;
    }
    public void b(QComment p0,e$g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "2")) {
          return;
       }
       e$d ta = this.a;
       if (ta != null) {
          ta.b(p0, p1);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e$d.class, "1")) {
          return;
       }
       e$d ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
    public void e(e$c p0){
       this.a = null;
    }
}
