package com.kuaishou.aegon.i;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;
import com.kuaishou.aegon.NetworkStateHelper;
import android.content.Context;

public final class i implements Runnable	// class@0007ae
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void run(){
       Aegon.c = new NetworkStateHelper(Aegon.b);
    }
}
