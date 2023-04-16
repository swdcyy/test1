package com.google.common.cache.LocalCache$NullEntry;
import com.google.common.cache.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.google.common.cache.LocalCache$s;

public final class LocalCache$NullEntry extends Enum implements d	// class@00174b
{
    public static final LocalCache$NullEntry[] $VALUES;
    public static final LocalCache$NullEntry INSTANCE;

    static {
       LocalCache$NullEntry nullEntry = new LocalCache$NullEntry("INSTANCE", 0);
       LocalCache$NullEntry.INSTANCE = nullEntry;
       LocalCache$NullEntry[] nullEntryArr = new LocalCache$NullEntry[]{nullEntry};
       LocalCache$NullEntry.$VALUES = nullEntryArr;
    }
    public void LocalCache$NullEntry(String p0,int p1){
       super(p0, p1);
    }
    public static LocalCache$NullEntry valueOf(String p0){
       return Enum.valueOf(LocalCache$NullEntry.class, p0);
    }
    public static LocalCache$NullEntry[] values(){
       return LocalCache$NullEntry.$VALUES.clone();
    }
    public long getAccessTime(){
       return 0;
    }
    public int getHash(){
       return 0;
    }
    public Object getKey(){
       return null;
    }
    public d getNext(){
       return null;
    }
    public d getNextInAccessQueue(){
       return this;
    }
    public d getNextInWriteQueue(){
       return this;
    }
    public d getPreviousInAccessQueue(){
       return this;
    }
    public d getPreviousInWriteQueue(){
       return this;
    }
    public LocalCache$s getValueReference(){
       return null;
    }
    public long getWriteTime(){
       return 0;
    }
    public void setAccessTime(long p0){
    }
    public void setNextInAccessQueue(d p0){
    }
    public void setNextInWriteQueue(d p0){
    }
    public void setPreviousInAccessQueue(d p0){
    }
    public void setPreviousInWriteQueue(d p0){
    }
    public void setValueReference(LocalCache$s p0){
    }
    public void setWriteTime(long p0){
    }
}
