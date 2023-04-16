package com.loc.ah;
import java.lang.Enum;
import java.lang.String;
import android.os.Build;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;

public final class ah extends Enum	// class@001367
{
    public String n;
    public int o;
    public String p;
    public String q;
    public String r;
    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    public static final ah e;
    public static final ah f;
    public static final ah g;
    public static final ah h;
    public static final ah i;
    public static final ah j;
    public static final ah k;
    public static final ah l;
    public static final ah m;
    public static final ah[] s;

    static {
       ah uoah = new ah("MIUI", 0, "xiaomi");
       ah.a = uoah;
       ah uoah1 = new ah("Flyme", 1, "meizu");
       ah.b = uoah1;
       ah uoah2 = new ah("EMUI", 2, "huawei");
       ah.c = uoah2;
       ah uoah3 = new ah("ColorOS", 3, "oppo");
       ah.d = uoah3;
       ah uoah4 = new ah("FuntouchOS", 4, "vivo");
       ah.e = uoah4;
       ah uoah5 = new ah("SmartisanOS", 5, "smartisan");
       ah.f = uoah5;
       ah uoah6 = new ah("AmigoOS", 6, "amigo");
       ah.g = uoah6;
       ah uoah7 = new ah("EUI", 7, "letv");
       ah.h = uoah7;
       ah uoah8 = new ah("Sense", 8, "htc");
       ah.i = uoah8;
       ah uoah9 = new ah("LG", 9, "lge");
       ah.j = uoah9;
       ah uoah10 = new ah("Google", 10, "google");
       ah.k = uoah10;
       ah uoah11 = new ah("NubiaUI", 11, "nubia");
       ah.l = uoah11;
       ah uoah12 = new ah("Other", 12, "");
       ah.m = uoah12;
       ah[] uoahArray = new ah[13];
       uoahArray[0] = uoah;
       uoahArray[1] = uoah1;
       uoahArray[2] = uoah2;
       uoahArray[3] = uoah3;
       uoahArray[4] = uoah4;
       uoahArray[5] = uoah5;
       uoahArray[6] = uoah6;
       uoahArray[7] = uoah7;
       uoahArray[8] = uoah8;
       uoahArray[9] = uoah9;
       uoahArray[10] = uoah10;
       uoahArray[11] = uoah11;
       uoahArray[12] = uoah12;
       ah.s = uoahArray;
    }
    public void ah(String p0,int p1,String p2){
       super(p0, p1);
       this.r = Build.MANUFACTURER;
       this.n = p2;
    }
    public static ah valueOf(String p0){
       return Enum.valueOf(ah.class, p0);
    }
    public static ah[] values(){
       return ah.s.clone();
    }
    public final String a(){
       return this.n;
    }
    public final void a(int p0){
       this.o = p0;
    }
    public final void a(String p0){
       this.p = p0;
    }
    public final String b(){
       return this.p;
    }
    public final void b(String p0){
       this.q = p0;
    }
    public final String toString(){
       return "ROM{name=\'"+this.name()+'''+",versionCode="+this.o+", versionName=\'"+this.q+'''+",ma="+this.n+'''+",manufacturer="+this.r+'''+'}';
    }
}
