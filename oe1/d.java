package oe1.d;
import z1.a;
import com.kuaishou.live.common.core.component.comments.combo.b;
import java.lang.Object;
import i81.a;
import i81.g;
import java.lang.Class;
import lp3.c;
import lp3.e;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;

public final class d implements a	// class@0034cd
{
    public final b a;

    public void d(b p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       LiveBulletinLayoutManager liveBulletin = this.a.y.a(g.class).i7();
       if (liveBulletin != null) {
          liveBulletin.m(p0);
       }
       return;
    }
}
