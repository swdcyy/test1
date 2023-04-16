package com.google.common.collect.Maps$i;
import com.google.common.collect.Maps$d;
import java.util.Map;
import ok.o;
import java.util.Set;
import com.google.common.collect.o;
import com.google.common.collect.Maps$i$a;
import com.google.common.collect.Maps$i$b;

public class Maps$i extends Maps$d	// class@001849
{
    public final Set g;
    public static final int h;

    public void Maps$i(Map p0,o p1){
       super(p0, p1);
       this.g = o.c(p0.entrySet(), this.f);
    }
    public Set a(){
       return new Maps$i$a(this);
    }
    public Set c(){
       return new Maps$i$b(this);
    }
}
