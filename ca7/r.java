package ca7.r;
import java.util.Random;
import java.lang.System;

public final class r	// class@0003a6
{
    public static final Random a;

    static {
       r.a = new Random(System.currentTimeMillis());
    }
    public static boolean a(float p0){
       boolean b = (p0 - 0x3f800000 >= 0 || r.a.nextFloat() - p0 < 0)? true: false;
       return b;
    }
}
