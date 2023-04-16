package com.facebook.react.turbomodule.core.TurboModuleManager$c;
import java.lang.Object;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public class TurboModuleManager$c	// class@00130a
{
    public TurboModule a;
    public boolean b;
    public boolean c;
    public int d;
    public static int e;

    public void TurboModuleManager$c(){
       super();
       this.a = null;
       this.b = false;
       this.c = false;
       this.d = TurboModuleManager$c.e;
       TurboModuleManager$c.e = TurboModuleManager$c.e + 1;
    }
    public TurboModule a(){
       return this.a;
    }
    public int b(){
       return this.d;
    }
    public boolean c(){
       return this.b;
    }
}
