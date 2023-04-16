package cg8.d;
import cg8.d$a;
import cg8.d$b;
import cg8.d$c;
import w2.c;

public class d	// class@00041a
{
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c[] d;

    static {
       d$a uoa = new d$a(60, 70);
       d.a = uoa;
       d$b uob = new d$b(70, 80);
       d.b = uob;
       d$c uoc = new d$c(80, 90);
       d.c = uoc;
       c[] uocArray = new c[]{uoa,uob,uoc};
       d.d = uocArray;
    }
}
