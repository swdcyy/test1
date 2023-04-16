package com.kuaishou.live.liteend.baseinfo.e;
import erd.a;
import com.kuaishou.live.liteend.baseinfo.g;
import java.lang.Object;
import java.util.Objects;
import ae3.i;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class e implements a	// class@000bc0
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       i oi = new i(tb);
       f.h("LiteEnd.moveNextFeed", oi);
    }
}
