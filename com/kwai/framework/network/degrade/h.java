package com.kwai.framework.network.degrade.h;
import java.lang.String;
import java.util.regex.Pattern;
import com.kwai.framework.network.degrade.h$b;
import com.kwai.framework.network.degrade.h$a;
import java.lang.Object;
import java.util.HashMap;

public class h	// class@0017c3
{
    public Map a;
    public static final Pattern b;
    public static final e$b c;

    static {
       h.b = Pattern.compile("\(?:\\{\(\\w+\)\\}\)");
       h.c = new h$b(null);
    }
    public void h(){
       super();
       this.a = new HashMap();
    }
}
