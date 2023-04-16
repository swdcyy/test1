package com.xiaomi.push.ho;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ho extends Enum	// class@001117
{
    public final int a;
    public static final ho a;
    public static final ho[] a;
    public static final ho b;
    public static final ho c;
    public static final ho d;

    static {
       ho oho = new ho("INT", 0, 1);
       ho.a = oho;
       ho oho1 = new ho("LONG", 1, 2);
       ho.b = oho1;
       ho oho2 = new ho("STRING", 2, 3);
       ho.c = oho2;
       ho oho3 = new ho("BOOLEAN", 3, 4);
       ho.d = oho3;
       ho[] ohoArray = new ho[]{oho,oho1,oho2,oho3};
       ho.a = ohoArray;
    }
    public void ho(String p0,int p1,int p2){
       this.a = p2;
    }
    public static ho a(int p0){
       if (p0 == 1) {
          return ho.a;
       }
       if (p0 == 2) {
          return ho.b;
       }
       if (p0 == 3) {
          return ho.c;
       }
       if (p0 != 4) {
          return null;
       }
       return ho.d;
    }
    public static ho valueOf(String p0){
       return Enum.valueOf(ho.class, p0);
    }
    public static ho[] values(){
       return ho.a.clone();
    }
}
