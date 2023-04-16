package com.google.common.cache.LocalCache$EntryFactory;
import java.lang.Enum;
import com.google.common.cache.LocalCache$EntryFactory$1;
import java.lang.String;
import com.google.common.cache.LocalCache$EntryFactory$2;
import com.google.common.cache.LocalCache$EntryFactory$3;
import com.google.common.cache.LocalCache$EntryFactory$4;
import com.google.common.cache.LocalCache$EntryFactory$5;
import com.google.common.cache.LocalCache$EntryFactory$6;
import com.google.common.cache.LocalCache$EntryFactory$7;
import com.google.common.cache.LocalCache$EntryFactory$8;
import com.google.common.cache.LocalCache$a;
import com.google.common.cache.LocalCache$Strength;
import java.lang.Class;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache$Segment;

public abstract class LocalCache$EntryFactory extends Enum	// class@001747
{
    public static final LocalCache$EntryFactory[] $VALUES;
    public static final LocalCache$EntryFactory STRONG;
    public static final LocalCache$EntryFactory STRONG_ACCESS;
    public static final LocalCache$EntryFactory STRONG_ACCESS_WRITE;
    public static final LocalCache$EntryFactory STRONG_WRITE;
    public static final LocalCache$EntryFactory WEAK;
    public static final LocalCache$EntryFactory WEAK_ACCESS;
    public static final LocalCache$EntryFactory WEAK_ACCESS_WRITE;
    public static final LocalCache$EntryFactory WEAK_WRITE;
    public static final LocalCache$EntryFactory[] factories;

    static {
       LocalCache$EntryFactory$1 uEntryFactor = new LocalCache$EntryFactory$1("STRONG", 0);
       LocalCache$EntryFactory.STRONG = uEntryFactor;
       LocalCache$EntryFactory$2 uEntryFactor1 = new LocalCache$EntryFactory$2("STRONG_ACCESS", 1);
       LocalCache$EntryFactory.STRONG_ACCESS = uEntryFactor1;
       LocalCache$EntryFactory$3 uEntryFactor2 = new LocalCache$EntryFactory$3("STRONG_WRITE", 2);
       LocalCache$EntryFactory.STRONG_WRITE = uEntryFactor2;
       LocalCache$EntryFactory$4 uEntryFactor3 = new LocalCache$EntryFactory$4("STRONG_ACCESS_WRITE", 3);
       LocalCache$EntryFactory.STRONG_ACCESS_WRITE = uEntryFactor3;
       LocalCache$EntryFactory$5 uEntryFactor4 = new LocalCache$EntryFactory$5("WEAK", 4);
       LocalCache$EntryFactory.WEAK = uEntryFactor4;
       LocalCache$EntryFactory$6 uEntryFactor5 = new LocalCache$EntryFactory$6("WEAK_ACCESS", 5);
       LocalCache$EntryFactory.WEAK_ACCESS = uEntryFactor5;
       LocalCache$EntryFactory$7 uEntryFactor6 = new LocalCache$EntryFactory$7("WEAK_WRITE", 6);
       LocalCache$EntryFactory.WEAK_WRITE = uEntryFactor6;
       LocalCache$EntryFactory$8 uEntryFactor7 = new LocalCache$EntryFactory$8("WEAK_ACCESS_WRITE", 7);
       LocalCache$EntryFactory.WEAK_ACCESS_WRITE = uEntryFactor7;
       LocalCache$EntryFactory[] uEntryFactor8 = new LocalCache$EntryFactory[]{uEntryFactor,uEntryFactor1,uEntryFactor2,uEntryFactor3,uEntryFactor4,uEntryFactor5,uEntryFactor6,uEntryFactor7};
       LocalCache$EntryFactory.$VALUES = uEntryFactor8;
       uEntryFactor8 = new LocalCache$EntryFactory[]{uEntryFactor,uEntryFactor1,uEntryFactor2,uEntryFactor3,uEntryFactor4,uEntryFactor5,uEntryFactor6,uEntryFactor7};
       LocalCache$EntryFactory.factories = uEntryFactor8;
    }
    public void LocalCache$EntryFactory(String p0,int p1){
       super(p0, p1);
    }
    public void LocalCache$EntryFactory(String p0,int p1,LocalCache$a p2){
       super(p0, p1);
    }
    public static LocalCache$EntryFactory getFactory(LocalCache$Strength p0,boolean p1,boolean p2){
       int i = 0;
       int i1 = (p0 == LocalCache$Strength.WEAK)? 4: 0;
       i1 = i1 | p1;
       if (p2) {
          i = 2;
       }
       return LocalCache$EntryFactory.factories[(i1 | i)];
    }
    public static LocalCache$EntryFactory valueOf(String p0){
       return Enum.valueOf(LocalCache$EntryFactory.class, p0);
    }
    public static LocalCache$EntryFactory[] values(){
       return LocalCache$EntryFactory.$VALUES.clone();
    }
    public void copyAccessEntry(d p0,d p1){
       p1.setAccessTime(p0.getAccessTime());
       LocalCache.a(p0.getPreviousInAccessQueue(), p1);
       LocalCache.a(p1, p0.getNextInAccessQueue());
       LocalCache.q(p0);
    }
    public d copyEntry(LocalCache$Segment p0,d p1,d p2){
       return this.newEntry(p0, p1.getKey(), p1.getHash(), p2);
    }
    public void copyWriteEntry(d p0,d p1){
       p1.setWriteTime(p0.getWriteTime());
       LocalCache.c(p0.getPreviousInWriteQueue(), p1);
       LocalCache.c(p1, p0.getNextInWriteQueue());
       LocalCache.t(p0);
    }
    public abstract d newEntry(LocalCache$Segment p0,Object p1,int p2,d p3);
}
