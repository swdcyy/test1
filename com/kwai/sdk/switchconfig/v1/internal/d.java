package com.kwai.sdk.switchconfig.v1.internal.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigUpdateReceiver;
import com.kwai.sdk.switchconfig.v1.internal.a;
import java.lang.String;
import mo7.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.v1.internal.b;

public final class d implements Runnable	// class@00166f
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       a uoa = a.d();
       if (uoa.c() && uoa.b()) {
          String str = uoa.d.b();
          if (!TextUtils.equals(uoa.b, str)) {
             uoa.b = str;
             Iterator iterator = uoa.f.entrySet().iterator();
             while (iterator.hasNext()) {
                iterator.next().getValue().o(str);
             }
          }
       }
       return;
    }
}
