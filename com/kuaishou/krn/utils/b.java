package com.kuaishou.krn.utils.b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.kuaishou.krn.utils.c$a;
import lk0.h;
import android.view.ViewGroup;
import a1.b$e;
import a1.b;

public final class b implements Runnable	// class@000923
{
    public final int b;
    public final int c;

    public void b(int p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       Log.h("LayoutCacheManager", "preInflateLayout for "+tb, null);
       for (int i = 0; i < tb; i = i + 1) {
          c$a.a.a(tc, null, new h(tc));
       }
       return;
    }
}
