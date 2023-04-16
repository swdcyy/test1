package com.kwai.framework.cache.initmodule.e;
import java.util.Comparator;
import java.lang.Object;
import x56.b$a;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import java.lang.String;
import java.lang.CharSequence;

public final class e implements Comparator	// class@0014f2
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       b$a mPath = p0.mPath;
       b$a mPath1 = p1.mPath;
       if (p0.equals(p1)) {
          i = 0;
       }else if(mPath.isEmpty() || mPath1.contains(mPath)){
          i = 1;
       }else if(mPath1.isEmpty() || mPath.contains(mPath1)){
          i = -1;
       }else {
          i = mPath.compareTo(mPath1);
       }
       return i;
    }
}
