package com.google.common.base.Optional$a;
import java.lang.Iterable;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.base.Optional$a$a;

public final class Optional$a implements Iterable	// class@00171d
{
    public final Iterable b;

    public void Optional$a(Iterable p0){
       this.b = p0;
       super();
    }
    public Iterator iterator(){
       return new Optional$a$a(this);
    }
}
