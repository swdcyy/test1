package com.google.common.cache.d;
import java.lang.Object;
import com.google.common.cache.LocalCache$s;

public interface abstract d	// class@001787
{

    long getAccessTime();
    int getHash();
    Object getKey();
    d getNext();
    d getNextInAccessQueue();
    d getNextInWriteQueue();
    d getPreviousInAccessQueue();
    d getPreviousInWriteQueue();
    LocalCache$s getValueReference();
    long getWriteTime();
    void setAccessTime(long p0);
    void setNextInAccessQueue(d p0);
    void setNextInWriteQueue(d p0);
    void setPreviousInAccessQueue(d p0);
    void setPreviousInWriteQueue(d p0);
    void setValueReference(LocalCache$s p0);
    void setWriteTime(long p0);
}
