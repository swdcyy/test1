package com.kuaishou.live.core.show.vote.f;
import hoc.c;
import com.kuaishou.live.core.show.vote.f$b;
import java.lang.String;
import com.kuaishou.live.core.show.vote.f$a;
import com.kuaishou.live.core.show.vote.f$e;
import com.kuaishou.live.core.show.vote.f$d;
import com.kuaishou.live.core.show.vote.f$c;
import hoc.b;

public class f extends c	// class@001236
{
    public b d;
    public b e;
    public b f;
    public b g;
    public f$b h;

    public void f(f$b p0){
       super("VoteStateMachine");
       this.d = new f$a(this);
       this.e = new f$e(this);
       this.f = new f$d(this);
       this.g = new f$c(this);
       this.h = p0;
       this.a(this.d);
       this.a(this.e);
       this.a(this.f);
       this.a(this.g);
       this.n(this.d);
       this.o();
    }
}
