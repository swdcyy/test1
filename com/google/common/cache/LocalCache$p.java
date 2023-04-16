package com.google.common.cache.LocalCache$p;
import com.google.common.cache.LocalCache$s;
import java.lang.Object;
import com.google.common.cache.d;
import java.lang.ref.ReferenceQueue;

public class LocalCache$p implements LocalCache$s	// class@00176a
{
    public final Object b;

    public void LocalCache$p(Object p0){
       super();
       this.b = p0;
    }
    public boolean E(){
       return true;
    }
    public d a(){
       return null;
    }
    public void b(Object p0){
    }
    public int c(){
       return 1;
    }
    public Object d(){
       return this.get();
    }
    public LocalCache$s e(ReferenceQueue p0,Object p1,d p2){
       return this;
    }
    public Object get(){
       return this.b;
    }
    public boolean isLoading(){
       return false;
    }
}
