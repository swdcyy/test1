package com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a$a;
import java.lang.Runnable;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager;
import java.util.Map;
import kotlin.jvm.internal.a;
import zsd.u;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager$a$a$a;
import zyc.b;

public final class DesignPreloadManager$a$a implements Runnable	// class@00195c
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final File f;
    public final String g;

    public void DesignPreloadManager$a$a(String p0,String p1,String p2,String p3,File p4,String p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       String str1;
       Map map = DesignPreloadManager.c.b(this.b, this.c);
       String str = map.get(this.d);
       DesignPreloadManager$a$a te = this.e;
       a.o(te, "folderPath");
       te = (u.H1(te, "/", false, 2, null))? this.e: this.e+'/';
       a.o(te, "newPreloadPath");
       map.put(this.d, te);
       Log.g("design_cdn#manager", "Preload new folder: "+this.d+" => "+te);
       b.a(new DesignPreloadManager$a$a$a(this, str));
       return;
    }
}
