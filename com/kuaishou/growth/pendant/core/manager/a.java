package com.kuaishou.growth.pendant.core.manager.a;
import com.kuaishou.growth.pendant.core.manager.f$b;
import java.lang.Object;
import java.io.File;
import com.kuaishou.growth.pendant.core.manager.f;
import java.lang.String;
import yb7.a;

public final class a implements f$b	// class@000646
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(File p0){
       boolean b = (p0.exists() && !a.c(p0.list()))? true: false;
       return b;
    }
}
