package com.google.common.collect.Tables;
import com.google.common.collect.Tables$a;
import java.lang.Object;
import com.google.common.collect.s$a;
import com.google.common.collect.Tables$ImmutableCell;

public final class Tables	// class@001896
{
    public static final h a;

    static {
       Tables.a = new Tables$a();
    }
    public static s$a a(Object p0,Object p1,Object p2){
       return new Tables$ImmutableCell(p0, p1, p2);
    }
}
