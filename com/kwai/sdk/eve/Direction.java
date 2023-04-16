package com.kwai.sdk.eve.Direction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Direction extends Enum	// class@001433
{
    public static final Direction[] $VALUES;
    public static final Direction NEWEST;
    public static final Direction OLDEST;

    static {
       Direction uDirection;
       Direction[] uDirectionAr = new Direction[]{uDirection,uDirection};
       uDirection = new Direction("NEWEST", 0);
       Direction.NEWEST = uDirection;
       uDirection = new Direction("OLDEST", 1);
       Direction.OLDEST = uDirection;
       Direction.$VALUES = uDirectionAr;
    }
    public void Direction(String p0,int p1){
       super(p0, p1);
    }
    public static Direction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Direction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Direction.class, p0);
    }
    public static Direction[] values(){
       Object obj = PatchProxy.apply(null, null, Direction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Direction.$VALUES.clone();
    }
}
