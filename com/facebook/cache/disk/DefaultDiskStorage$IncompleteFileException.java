package com.facebook.cache.disk.DefaultDiskStorage$IncompleteFileException;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;

public class DefaultDiskStorage$IncompleteFileException extends IOException	// class@001040
{
    public final long actual;
    public final long expected;

    public void DefaultDiskStorage$IncompleteFileException(long p0,long p1){
       super("File was not written completely. Expected: "+p0+", found: "+p1);
       this.expected = p0;
       this.actual = p1;
    }
}
