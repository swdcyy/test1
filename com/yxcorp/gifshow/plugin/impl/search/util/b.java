package com.yxcorp.gifshow.plugin.impl.search.util.b;
import java.lang.Runnable;
import java.lang.Object;
import wkd.b;
import nyb.h;
import java.lang.String;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import uy5.b;

public final class b implements Runnable	// class@000fda
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       c.d = b.a(0x560d43).c("search_feature");
       String[] stringArray = new String[]{"search_feature"};
       String str = (b.a(0x560d43).i(20, stringArray))? "pre download search_feature succeed": "pre download search_feature failed";
       b.g(str);
       return;
    }
}
