package ca7.n;
import java.util.Random;
import java.lang.System;
import java.lang.Object;
import java.lang.String;

public class n	// class@000522
{
    public int a;
    public int b;
    public long c;
    public static final Random d;

    static {
       n.d = new Random(System.currentTimeMillis());
    }
    public void n(int p0,int p1){
       super();
       this.a = p1;
       this.b = p0;
       this.c = (long)p0 | ((long)p1 << 32);
    }
    public String toString(){
       return String.valueOf(this.c);
    }
}
