package com.kwai.kxb.storage.clean.KxbDiskManager$mSharedPreference$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kxb.KxbManager;
import gu6.k;
import ru6.r;
import kotlin.jvm.internal.a;
import ru6.r$a;

public final class KxbDiskManager$mSharedPreference$2 extends Lambda implements a	// class@0007f5
{
    public static final KxbDiskManager$mSharedPreference$2 INSTANCE;

    static {
       KxbDiskManager$mSharedPreference$2.INSTANCE = new KxbDiskManager$mSharedPreference$2();
    }
    public void KxbDiskManager$mSharedPreference$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       r obj = PatchProxy.apply(null, this, KxbDiskManager$mSharedPreference$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KxbManager.g.d().f();
       a.m(obj);
       return r$a.a(obj, "kds_low_disk_clean", 0, 2, null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
