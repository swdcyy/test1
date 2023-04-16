package com.google.common.collect.Maps$t;
import java.util.AbstractMap;
import java.util.Set;
import com.google.common.collect.Maps$m;
import java.util.Map;
import java.util.Collection;
import com.google.common.collect.Maps$s;

public abstract class Maps$t extends AbstractMap	// class@00050a
{
    public Set b;
    public Set c;
    public Collection d;

    public void Maps$t(){
       super();
    }
    public abstract Set a();
    public Set c(){
       return new Maps$m(this);
    }
    public Collection e(){
       return new Maps$s(this);
    }
    public Set entrySet(){
       Maps$t tb = this.b;
       if (tb == null) {
          tb = this.a();
          this.b = tb;
       }
       return tb;
    }
    public Set keySet(){
       Maps$t tc = this.c;
       if (tc == null) {
          tc = this.c();
          this.c = tc;
       }
       return tc;
    }
    public Collection values(){
       Maps$t td = this.d;
       if (td == null) {
          td = this.e();
          this.d = td;
       }
       return td;
    }
}
