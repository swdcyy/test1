package com.google.common.collect.Maps$e$a;
import com.google.common.collect.Maps$g;
import com.google.common.collect.Maps$e;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import ok.h;
import com.google.common.collect.Maps;

public class Maps$e$a extends Maps$g	// class@001841
{
    public final Maps$e b;

    public void Maps$e$a(Maps$e p0){
       this.b = p0;
       super();
    }
    public Map b(){
       return this.b;
    }
    public Iterator iterator(){
       return Maps.b(this.b.f(), this.b.f);
    }
}
