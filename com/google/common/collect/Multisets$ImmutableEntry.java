package com.google.common.collect.Multisets$ImmutableEntry;
import java.io.Serializable;
import com.google.common.collect.Multisets$a;
import java.lang.Object;
import java.lang.String;
import qk.g;

public class Multisets$ImmutableEntry extends Multisets$a implements Serializable	// class@00185d
{
    public final int count;
    public final Object element;
    public static final long serialVersionUID;

    public void Multisets$ImmutableEntry(Object p0,int p1){
       super();
       this.element = p0;
       this.count = p1;
       g.b(p1, "count");
    }
    public final int getCount(){
       return this.count;
    }
    public final Object getElement(){
       return this.element;
    }
    public Multisets$ImmutableEntry nextInBucket(){
       return null;
    }
}
