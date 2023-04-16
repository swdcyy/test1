package com.loc.ft;
import com.loc.ft$1;
import com.loc.ft$2;
import java.lang.ThreadLocal;

public class ft	// class@00143c
{
    public static final ThreadLocal a;
    public static final ThreadLocal b;
    public static final ThreadLocal c;

    static {
       ft.b = new ft$1();
       ft.a = new ft$2();
       ft.c = new ThreadLocal();
    }
}
