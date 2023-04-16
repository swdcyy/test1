package com.kuaishou.aegon.e;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class e implements Runnable	// class@0007a6
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       Aegon.nativeOnForeground();
    }
}
