package com.google.common.cache.LocalCache$EntryFactory$6;
import com.google.common.cache.LocalCache$EntryFactory;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.d;
import java.lang.Object;
import com.google.common.cache.LocalCache$u;
import java.lang.ref.ReferenceQueue;

public final class LocalCache$EntryFactory$6 extends LocalCache$EntryFactory	// class@001744
{

    public void LocalCache$EntryFactory$6(String p0,int p1){
       super(p0, p1, null);
    }
    public d copyEntry(LocalCache$Segment p0,d p1,d p2){
       d uod = super.copyEntry(p0, p1, p2);
       this.copyAccessEntry(p1, uod);
       return uod;
    }
    public d newEntry(LocalCache$Segment p0,Object p1,int p2,d p3){
       return new LocalCache$u(p0.keyReferenceQueue, p1, p2, p3);
    }
}
