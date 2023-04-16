package com.kuaishou.live.core.voiceparty.music.util.c;
import erd.r;
import java.lang.Object;
import java.lang.String;
import java.io.File;

public final class c implements r	// class@0017f6
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean test(Object p0){
       File uFile = new File(p0);
       boolean b = (uFile.exists() && uFile.isDirectory())? true: false;
       return b;
    }
}
