package com.xiaomi.push.hn;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class hn extends Enum	// class@001116
{
    public final int a;
    public static final hn a;
    public static final hn[] a;
    public static final hn b;

    static {
       hn ohn = new hn("MISC_CONFIG", 0, 1);
       hn.a = ohn;
       hn ohn1 = new hn("PLUGIN_CONFIG", 1, 2);
       hn.b = ohn1;
       hn[] ohnArray = new hn[]{ohn,ohn1};
       hn.a = ohnArray;
    }
    public void hn(String p0,int p1,int p2){
       this.a = p2;
    }
    public static hn a(int p0){
       if (p0 == 1) {
          return hn.a;
       }
       if (p0 != 2) {
          return null;
       }
       return hn.b;
    }
    public static hn valueOf(String p0){
       return Enum.valueOf(hn.class, p0);
    }
    public static hn[] values(){
       return hn.a.clone();
    }
    public int a(){
       return this.a;
    }
}
