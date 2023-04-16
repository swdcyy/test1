package com.yxcorp.gifshow.util.MemoryStorageUtil;
import android.util.SparseArray;
import com.yxcorp.gifshow.util.MemoryStorageUtil$Key;
import java.lang.Object;
import java.lang.Enum;

public final class MemoryStorageUtil	// class@001efb
{
    public static final SparseArray a;

    static {
       MemoryStorageUtil.a = new SparseArray();
    }
    public static Object a(MemoryStorageUtil$Key p0,Object p1){
       SparseArray a = MemoryStorageUtil.a;
       _monitor_enter(a);
       _monitor_exit(a);
       return a.get(p0.ordinal(), p1);
    }
    public static void b(MemoryStorageUtil$Key p0){
       SparseArray a = MemoryStorageUtil.a;
       _monitor_enter(a);
       a.remove(p0.ordinal());
       _monitor_exit(a);
    }
    public static void c(MemoryStorageUtil$Key p0,Object p1){
       SparseArray a = MemoryStorageUtil.a;
       _monitor_enter(a);
       if (p1 == null) {
          a.remove(p0.ordinal());
       }else {
          a.put(p0.ordinal(), p1);
       }
       _monitor_exit(a);
       return;
    }
}
