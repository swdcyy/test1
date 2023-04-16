package com.google.common.cache.LocalCache$x;
import com.google.common.cache.LocalCache$s;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.d;

public class LocalCache$x extends WeakReference implements LocalCache$s	// class@001772
{
    public final d b;

    public void LocalCache$x(ReferenceQueue p0,Object p1,d p2){
       super(p1, p0);
       this.b = p2;
    }
    public boolean E(){
       return true;
    }
    public d a(){
       return this.b;
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
       return new LocalCache$x(p0, p1, p2);
    }
    public boolean isLoading(){
       return false;
    }
}
