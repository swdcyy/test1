package com.google.common.cache.LocalCache$w;
import com.google.common.cache.d;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache;
import java.lang.UnsupportedOperationException;

public class LocalCache$w extends WeakReference implements d	// class@001771
{
    public final int b;
    public final d c;
    public LocalCache$s d;

    public void LocalCache$w(ReferenceQueue p0,Object p1,int p2,d p3){
       super(p1, p0);
       this.d = LocalCache.B();
       this.b = p2;
       this.c = p3;
    }
    public long getAccessTime(){
       throw new UnsupportedOperationException();
    }
    public int getHash(){
       return this.b;
    }
    public Object getKey(){
       return this.get();
    }
    public d getNext(){
       return this.c;
    }
    public d getNextInAccessQueue(){
       throw new UnsupportedOperationException();
    }
    public d getNextInWriteQueue(){
       throw new UnsupportedOperationException();
    }
    public d getPreviousInAccessQueue(){
       throw new UnsupportedOperationException();
    }
    public d getPreviousInWriteQueue(){
       throw new UnsupportedOperationException();
    }
    public LocalCache$s getValueReference(){
       return this.d;
    }
    public long getWriteTime(){
       throw new UnsupportedOperationException();
    }
    public void setAccessTime(long p0){
       throw new UnsupportedOperationException();
    }
    public void setNextInAccessQueue(d p0){
       throw new UnsupportedOperationException();
    }
    public void setNextInWriteQueue(d p0){
       throw new UnsupportedOperationException();
    }
    public void setPreviousInAccessQueue(d p0){
       throw new UnsupportedOperationException();
    }
    public void setPreviousInWriteQueue(d p0){
       throw new UnsupportedOperationException();
    }
    public void setValueReference(LocalCache$s p0){
       this.d = p0;
    }
    public void setWriteTime(long p0){
       throw new UnsupportedOperationException();
    }
}
