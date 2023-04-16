package com.google.common.cache.RemovalCause;
import java.lang.Enum;
import com.google.common.cache.RemovalCause$1;
import java.lang.String;
import com.google.common.cache.RemovalCause$2;
import com.google.common.cache.RemovalCause$3;
import com.google.common.cache.RemovalCause$4;
import com.google.common.cache.RemovalCause$5;
import java.lang.Class;
import java.lang.Object;

public abstract class RemovalCause extends Enum	// class@001780
{
    public static final RemovalCause[] $VALUES;
    public static final RemovalCause COLLECTED;
    public static final RemovalCause EXPIRED;
    public static final RemovalCause EXPLICIT;
    public static final RemovalCause REPLACED;
    public static final RemovalCause SIZE;

    static {
       RemovalCause$1 u1 = new RemovalCause$1("EXPLICIT", 0);
       RemovalCause.EXPLICIT = u1;
       RemovalCause$2 u2 = new RemovalCause$2("REPLACED", 1);
       RemovalCause.REPLACED = u2;
       RemovalCause$3 u3 = new RemovalCause$3("COLLECTED", 2);
       RemovalCause.COLLECTED = u3;
       RemovalCause$4 u4 = new RemovalCause$4("EXPIRED", 3);
       RemovalCause.EXPIRED = u4;
       RemovalCause$5 u5 = new RemovalCause$5("SIZE", 4);
       RemovalCause.SIZE = u5;
       RemovalCause[] removalCause = new RemovalCause[]{u1,u2,u3,u4,u5};
       RemovalCause.$VALUES = removalCause;
    }
    public void RemovalCause(String p0,int p1){
       super(p0, p1);
    }
    public void RemovalCause(String p0,int p1,RemovalCause$1 p2){
       super(p0, p1);
    }
    public static RemovalCause valueOf(String p0){
       return Enum.valueOf(RemovalCause.class, p0);
    }
    public static RemovalCause[] values(){
       return RemovalCause.$VALUES.clone();
    }
    public abstract boolean wasEvicted();
}
