package com.google.common.cache.LocalCache$EntryFactory$1;
import com.google.common.cache.LocalCache$EntryFactory;
import java.lang.String;
import com.google.common.cache.LocalCache$a;
import com.google.common.cache.LocalCache$Segment;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$o;

public final class LocalCache$EntryFactory$1 extends LocalCache$EntryFactory	// class@00173f
{

    public void LocalCache$EntryFactory$1(String p0,int p1){
       super(p0, p1, null);
    }
    public d newEntry(LocalCache$Segment p0,Object p1,int p2,d p3){
       return new LocalCache$o(p1, p2, p3);
    }
}
