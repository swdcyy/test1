package com.google.common.collect.ImmutableBiMap$a;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableBiMap;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Iterable;
import java.util.Map;
import com.google.common.collect.RegularImmutableBiMap;

public final class ImmutableBiMap$a extends ImmutableMap$b	// class@0017d5
{

    public void ImmutableBiMap$a(){
       super();
    }
    public void ImmutableBiMap$a(int p0){
       super(p0);
    }
    public ImmutableMap a(){
       return this.h();
    }
    public ImmutableMap$b c(Object p0,Object p1){
       this.i(p0, p1);
       return this;
    }
    public ImmutableMap$b d(Map$Entry p0){
       super.d(p0);
       return this;
    }
    public ImmutableMap$b e(Iterable p0){
       this.j(p0);
       return this;
    }
    public ImmutableMap$b f(Map p0){
       super.f(p0);
       return this;
    }
    public ImmutableBiMap h(){
       if (this.c == null) {
          return ImmutableBiMap.of();
       }
       this.g();
       this.d = true;
       return new RegularImmutableBiMap(this.b, this.c);
    }
    public ImmutableBiMap$a i(Object p0,Object p1){
       super.c(p0, p1);
       return this;
    }
    public ImmutableBiMap$a j(Iterable p0){
       super.e(p0);
       return this;
    }
}
