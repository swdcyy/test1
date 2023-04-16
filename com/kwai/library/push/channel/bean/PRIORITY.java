package com.kwai.library.push.channel.bean.PRIORITY;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PRIORITY extends Enum	// class@0008a3
{
    public final int mValue;
    public static final PRIORITY[] $VALUES;
    public static final PRIORITY HIGH;
    public static final PRIORITY LOW;
    public static final PRIORITY NORMAL;
    public static final PRIORITY VERY_HIGH;
    public static final PRIORITY VERY_LOW;

    static {
       PRIORITY pRIORITY = new PRIORITY("VERY_LOW", 0, -8);
       PRIORITY.VERY_LOW = pRIORITY;
       PRIORITY pRIORITY1 = new PRIORITY("LOW", 1, -4);
       PRIORITY.LOW = pRIORITY1;
       PRIORITY pRIORITY2 = new PRIORITY("NORMAL", 2, 0);
       PRIORITY.NORMAL = pRIORITY2;
       PRIORITY pRIORITY3 = new PRIORITY("HIGH", 3, 4);
       PRIORITY.HIGH = pRIORITY3;
       PRIORITY pRIORITY4 = new PRIORITY("VERY_HIGH", 4, 8);
       PRIORITY.VERY_HIGH = pRIORITY4;
       PRIORITY[] pRIORITYArra = new PRIORITY[]{pRIORITY,pRIORITY1,pRIORITY2,pRIORITY3,pRIORITY4};
       PRIORITY.$VALUES = pRIORITYArra;
    }
    public void PRIORITY(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static PRIORITY getValue(int p0){
       object oobject;
       PRIORITY[] pRIORITYArra = PRIORITY.values();
       int len = pRIORITYArra.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return PRIORITY.NORMAL;
          }
          oobject = pRIORITYArra[i];
          if (oobject.mValue == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static PRIORITY valueOf(String p0){
       return Enum.valueOf(PRIORITY.class, p0);
    }
    public static PRIORITY[] values(){
       return PRIORITY.$VALUES.clone();
    }
}
