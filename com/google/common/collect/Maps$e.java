package com.google.common.collect.Maps$e;
import com.google.common.collect.Maps$t;
import java.util.Set;
import ok.h;
import java.lang.Object;
import ok.n;
import com.google.common.collect.Maps$e$a;
import qk.f0;
import java.util.Collection;
import com.google.common.collect.e;

public class Maps$e extends Maps$t	// class@001842
{
    public final Set e;
    public final h f;

    public void Maps$e(Set p0,h p1){
       super();
       n.j(p0);
       this.e = p0;
       n.j(p1);
       this.f = p1;
    }
    public Set a(){
       return new Maps$e$a(this);
    }
    public Set c(){
       return new f0(this.f());
    }
    public void clear(){
       this.f().clear();
    }
    public boolean containsKey(Object p0){
       return this.f().contains(p0);
    }
    public Collection e(){
       return e.f(this.e, this.f);
    }
    public Set f(){
       return this.e;
    }
    public Object get(Object p0){
       if (e.e(this.f(), p0)) {
          return this.f.apply(p0);
       }
       return null;
    }
    public Object remove(Object p0){
       if (this.f().remove(p0)) {
          return this.f.apply(p0);
       }
       return null;
    }
    public int size(){
       return this.f().size();
    }
}
