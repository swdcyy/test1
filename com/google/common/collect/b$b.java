package com.google.common.collect.b$b;
import com.google.common.collect.Multisets$c;
import com.google.common.collect.b;
import com.google.common.collect.k;
import java.util.Iterator;

public class b$b extends Multisets$c	// class@0018ab
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public k b(){
       return this.b;
    }
    public Iterator iterator(){
       return this.b.entryIterator();
    }
    public int size(){
       return this.b.distinctElements();
    }
}
