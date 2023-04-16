package com.yxcorp.gifshow.profile.util.l;
import ok.x;
import java.lang.Object;
import z5c.k0;
import java.lang.String;
import xf6.i;
import com.kwai.sdk.switchconfig.a;
import lnc.o5;
import java.lang.Integer;

public final class l implements x	// class@0015dd
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object get(){
       Integer integer;
       String str = "profileRedesignHeadStyle";
       int i = i.g(str);
       if (!i) {
          integer = Integer.valueOf(o5.b(a.t().c(str, ""), 1));
       }else if(i == 2){
          integer = Integer.valueOf(3);
       }else {
          integer = Integer.valueOf(i);
       }
       return integer;
    }
}
