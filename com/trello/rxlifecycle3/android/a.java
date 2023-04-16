package com.trello.rxlifecycle3.android.a;
import com.trello.rxlifecycle3.android.a$a;
import com.trello.rxlifecycle3.android.a$b;
import brd.t;
import gr8.b;
import erd.o;
import gr8.c;

public class a	// class@000fe3
{
    public static final o a;
    public static final o b;

    static {
       a.a = new a$a();
       a.b = new a$b();
    }
    public static b a(t p0){
       return c.b(p0, a.a);
    }
    public static b b(t p0){
       return c.b(p0, a.b);
    }
}
