package com.oplus.ocs.base.utils.b;
import android.os.Looper;

public final class b	// class@000b21
{

    public static boolean a(){
       if (Looper.getMainLooper() == Looper.myLooper()) {
          return true;
       }
       return false;
    }
}
