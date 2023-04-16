package com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableCollection$a;
import java.lang.Object;
import com.google.common.collect.ImmutableCollection$b;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

public final class ImmutableList$a extends ImmutableCollection$a	// class@0017de
{

    public void ImmutableList$a(){
       super(4);
    }
    public void ImmutableList$a(int p0){
       super(p0);
    }
    public ImmutableCollection$b a(Object p0){
       this.h(p0);
       return this;
    }
    public ImmutableCollection d(){
       return this.i();
    }
    public ImmutableCollection$a f(Object p0){
       this.h(p0);
       return this;
    }
    public ImmutableList$a h(Object p0){
       super.f(p0);
       return this;
    }
    public ImmutableList i(){
       this.c = true;
       return ImmutableList.asImmutableList(this.a, this.b);
    }
}
