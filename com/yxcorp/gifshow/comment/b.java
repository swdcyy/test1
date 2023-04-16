package com.yxcorp.gifshow.comment.b;
import sfc.a;
import com.yxcorp.gifshow.comment.e;
import android.content.Context;
import com.yxcorp.gifshow.comment.e$e;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.comment.e$b;

public class b extends a	// class@00109a
{
    public final e$e c;
    public final QComment d;
    public final QPhoto e;
    public final e f;

    public void b(e p0,Context p1,e$e p2,QComment p3,QPhoto p4){
       this.f = p0;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.b(p0);
       b tc = this.c;
       if (tc != null) {
          tc.a(this.d, p0);
       }
       Iterator iterator = this.f.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().t1(this.e, this.d, p0);
       }
       return;
    }
}
