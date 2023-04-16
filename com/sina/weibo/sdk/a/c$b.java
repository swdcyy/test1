package com.sina.weibo.sdk.a.c$b;
import java.lang.Enum;
import java.lang.Object;

public final class c$b extends Enum	// class@000b94
{
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int[] X;

    static {
       int[] ointArray = new int[]{1,2,3};
       c$b.X = ointArray;
    }
    public static int[] m(){
       return c$b.X.clone();
    }
}
