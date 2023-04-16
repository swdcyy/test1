package com.google.common.cache.LocalCache$d;
import com.google.common.cache.d;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import com.google.common.cache.LocalCache$s;

public abstract class LocalCache$d implements d	// class@00175b
{

    public void LocalCache$d(){
       super();
    }
    public long getAccessTime(){
       throw new UnsupportedOperationException();
    }
    public int getHash(){
       throw new UnsupportedOperationException();
    }
    public Object getKey(){
       throw new UnsupportedOperationException();
    }
    public d getNext(){
       throw new UnsupportedOperationException();
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
       throw new UnsupportedOperationException();
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
       throw new UnsupportedOperationException();
    }
    public void setWriteTime(long p0){
       throw new UnsupportedOperationException();
    }
}
