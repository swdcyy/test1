package com.tbruyelle.rxpermissions2.a;
import erd.b;
import zq8.a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class a implements b	// class@000e04
{
    public final a b;

    public void a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0,Object p1){
       if (!p0.length()) {
          p0.append(p1);
       }else {
          p0.append(", ")+p1;
       }
       return;
    }
}
