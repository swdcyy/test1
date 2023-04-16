package com.kwai.performance.stability.hack.JitHacker;
import java.lang.Object;
import android.os.Build$VERSION;
import wg7.e;
import java.lang.String;
import com.kwai.performance.stability.hack.b$c;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class JitHacker	// class@00121b
{
    public static final JitHacker INSTANCE;
    public static final String LOG_TAG;
    public static boolean mHacked;

    static {
       JitHacker.INSTANCE = new JitHacker();
    }
    public void JitHacker(){
       super();
    }
    public static native final boolean protect();
    public static final void protectCodeCache(){
       if (!JitHacker.mHacked) {
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT == 24 || sDK_INT == 25) {
             JitHacker.mHacked = true;
             e b = e.b;
             b.e("plt-hack");
             b.b().b("JitHacker", "protect result: "+JitHacker.protect());
          }
       }
       return;
    }
}
