package com.google.common.collect.Maps$j;
import com.google.common.collect.Maps$d;
import java.util.Map;
import ok.o;
import java.util.Set;
import com.google.common.collect.o;
import java.lang.Object;

public class Maps$j extends Maps$d	// class@00184a
{
    public final o g;

    public void Maps$j(Map p0,o p1,o p2){
       super(p0, p2);
       this.g = p1;
    }
    public Set a(){
       return o.c(this.e.entrySet(), this.f);
    }
    public Set c(){
       return o.c(this.e.keySet(), this.g);
    }
    public boolean containsKey(Object p0){
       boolean b = (this.e.containsKey(p0) && this.g.apply(p0))? true: false;
       return b;
    }
}
