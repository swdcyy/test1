package com.google.common.cache.LocalCache$EntryFactory$5;
import com.google.common.cache.LocalCache$EntryFactory;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.cache.LocalCache$Segment;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$w;
import java.lang.ref.ReferenceQueue;

public final class LocalCache$EntryFactory$5 extends LocalCache$EntryFactory	// class@001743
{

    public void LocalCache$EntryFactory$5(String p0,int p1){
       super(p0, p1, null);
    }
    public d newEntry(LocalCache$Segment p0,Object p1,int p2,d p3){
       return new LocalCache$w(p0.keyReferenceQueue, p1, p2, p3);
    }
}
