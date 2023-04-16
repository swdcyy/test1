package com.vivo.push.d.d;
import com.vivo.push.d.z;
import com.vivo.push.o;
import android.content.Context;
import com.vivo.push.l;
import com.vivo.push.b.i;
import java.lang.String;
import com.vivo.push.e;
import com.vivo.push.b.s;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.d.e;
import java.lang.Runnable;
import com.vivo.push.m;

public final class d extends z	// class@001063
{

    public void d(o p0){
       super(p0);
    }
    public static Context a(d p0){
       return p0.a;
    }
    public static Context b(d p0){
       return p0.a;
    }
    public final void a(o p0){
       String str = p0.e();
       Object[] objArray = new Object[]{str};
       e.a().a(p0.g(), p0.h(), objArray);
       if (TextUtils.isEmpty(p0.g()) && !TextUtils.isEmpty(str)) {
          e.a().a(str);
       }
       m.b(new e(this, str, p0));
       return;
    }
}
