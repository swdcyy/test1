package com.kwai.sdk.switchconfig.v2.internal.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.sdk.switchconfig.v2.internal.SwitchConfigUpdateReceiver;
import com.kwai.sdk.switchconfig.v2.internal.a;
import java.lang.String;
import po7.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import po7.g;

public final class c implements Runnable	// class@001682
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
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
                iterator.next().getValue().i(str);
             }
          }
       }
       return;
    }
}
