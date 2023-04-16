package com.kuaishou.live.core.basic.activity.j0;
import pp.c;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader;

public final class j0 implements c	// class@00183f
{
    public static final j0 b;

    static {
       j0.b = new j0();
    }
    public void j0(){
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return "LivePlayerLoader";
    }
}
