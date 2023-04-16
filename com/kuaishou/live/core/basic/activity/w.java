package com.kuaishou.live.core.basic.activity.w;
import wj3.c;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import u02.b;
import m02.t;
import erd.g;
import java.util.Collections;

public final class w implements c	// class@001856
{
    public final LivePlayFragment a;

    public void w(LivePlayFragment p0){
       this.a = p0;
    }
    public final List build(){
       w ta = this.a;
       Objects.requireNonNull(ta);
       return Collections.singletonList(new b(new t(ta)));
    }
}
