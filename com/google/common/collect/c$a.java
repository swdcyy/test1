package com.google.common.collect.c$a;
import com.google.common.collect.Maps$f;
import com.google.common.collect.c;
import java.util.Iterator;
import java.util.NavigableMap;

public final class c$a extends Maps$f	// class@0018ad
{
    public final c e;

    public void c$a(c p0){
       this.e = p0;
       super();
    }
    public Iterator q(){
       return this.e.c();
    }
    public NavigableMap t(){
       return this.e;
    }
}
