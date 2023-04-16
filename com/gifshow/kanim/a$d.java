package com.gifshow.kanim.a$d;
import bh.n;
import com.gifshow.kanim.a;
import java.lang.Object;
import bh.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import android.view.View;
import gh.d;
import android.animation.AnimatorSet;
import bh.h;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.gifshow.kanim.a$g;
import java.util.Set;
import bh.l;

public class a$d implements n	// class@0015b0
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          a$d ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "6")) {
             ta.g = p0;
             p0.a(ta.i, ta.b, ta.d, false);
             if (!ta.i.isEmpty()) {
                ta.j = ta.i.get(false).a();
             }
             a j = ta.j;
             if (j != null) {
                j.addListener(new h(ta));
             }
             Iterator iterator = new ArrayList(ta.p).iterator();
             while (iterator.hasNext()) {
                a$g og = iterator.next();
                if (og != null) {
                   og.a(p0);
                }
                iterator.remove();
             }
             ta.p.clear();
             Iterator iterator1 = ta.r.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().a(p0);
             }
          }
       }
       return;
    }
}
