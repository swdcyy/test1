package com.google.archivepatcher.applier.e;
import java.lang.String;
import com.google.archivepatcher.applier.PatchFormatException;
import java.lang.StringBuilder;

public class e	// class@0016fc
{

    public static final long a(long p0,String p1){
       if (p0 - null >= 0) {
          return p0;
       }
       throw new PatchFormatException("Bad value for "+p1+": "+p0);
    }
    public static final long b(long p0,long p1,long p2,String p3){
       if (p0 - p1 >= 0 && p0 - p2 <= 0) {
          return p0;
       }
       throw new PatchFormatException("Bad value for "+p3+": "+p0+" \(valid range: ["+p1+","+p2+"]");
    }
}
