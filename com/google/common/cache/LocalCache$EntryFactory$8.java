package com.google.common.cache.LocalCache$EntryFactory$8;
import com.google.common.cache.LocalCache$EntryFactory;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.d;
import java.lang.Object;
import com.google.common.cache.LocalCache$v;
import java.lang.ref.ReferenceQueue;

public final class LocalCache$EntryFactory$8 extends LocalCache$EntryFactory	// class@001746
{

    public void LocalCache$EntryFactory$8(String p0,int p1){
       super(p0, p1, null);
    }
    public d copyEntry(LocalCache$Segment p0,d p1,d p2){
       d uod = super.copyEntry(p0, p1, p2);
       this.copyAccessEntry(p1, uod);
       this.copyWriteEntry(p1, uod);
       return uod;
    }
    public d newEntry(LocalCache$Segment p0,Object p1,int p2,d p3){
       return new LocalCache$v(p0.keyReferenceQueue, p1, p2, p3);
    }
}
