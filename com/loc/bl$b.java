package com.loc.bl$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bl$b extends Enum	// class@00139e
{
    public int h;
    public static final bl$b a;
    public static final bl$b b;
    public static final bl$b c;
    public static final bl$b d;
    public static final bl$b e;
    public static final bl$b f;
    public static final bl$b g;
    public static final bl$b[] i;

    static {
       bl$b uob = new bl$b("FIRST_NONDEGRADE", 0, 0);
       bl$b.a = uob;
       bl$b uob1 = new bl$b("NEVER_GRADE", 1, 1);
       bl$b.b = uob1;
       bl$b uob2 = new bl$b("DEGRADE_BYERROR", 2, 2);
       bl$b.c = uob2;
       bl$b uob3 = new bl$b("DEGRADE_ONLY", 3, 3);
       bl$b.d = uob3;
       bl$b uob4 = new bl$b("FIX_NONDEGRADE", 4, 4);
       bl$b.e = uob4;
       bl$b uob5 = new bl$b("FIX_DEGRADE_BYERROR", 5, 5);
       bl$b.f = uob5;
       bl$b uob6 = new bl$b("FIX_DEGRADE_ONLY", 6, 6);
       bl$b.g = uob6;
       bl$b[] uobArray = new bl$b[]{uob,uob1,uob2,uob3,uob4,uob5,uob6};
       bl$b.i = uobArray;
    }
    public void bl$b(String p0,int p1,int p2){
       this.h = p2;
    }
    public static bl$b valueOf(String p0){
       return Enum.valueOf(bl$b.class, p0);
    }
    public static bl$b[] values(){
       return bl$b.i.clone();
    }
    public final int a(){
       return this.h;
    }
    public final boolean b(){
       bl$b th = this.h;
       if (th != bl$b.a.h && (th == bl$b.b.h || th == bl$b.e.h)) {
          return true;
       }
       return false;
    }
    public final boolean c(){
       bl$b th = this.h;
       if (th != bl$b.c.h && (th != bl$b.d.h && (th == bl$b.f.h || th == bl$b.g.h))) {
          return true;
       }
       return false;
    }
    public final boolean d(){
       bl$b th = this.h;
       if (th == bl$b.c.h || th == bl$b.f.h) {
          return true;
       }
       return false;
    }
    public final boolean e(){
       if (this.h == bl$b.b.h) {
          return true;
       }
       return false;
    }
}
