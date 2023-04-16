package com.kwai.performance.stability.oom.monitor.OOMPreferenceManager$mPreferences$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import com.kwai.performance.stability.oom.monitor.OOMPreferenceManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import msd.l;

public final class OOMPreferenceManager$mPreferences$2 extends Lambda implements a	// class@001254
{
    public static final OOMPreferenceManager$mPreferences$2 INSTANCE;

    static {
       OOMPreferenceManager$mPreferences$2.INSTANCE = new OOMPreferenceManager$mPreferences$2();
    }
    public void OOMPreferenceManager$mPreferences$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       l b = OOMPreferenceManager.b;
       if (b == null) {
          a.S("mSharedPreferencesInvoker");
       }
       return b.invoke("apm_hprof_analysis");
    }
    public Object invoke(){
       return this.invoke();
    }
}
