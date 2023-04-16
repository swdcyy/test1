package com.vivo.push.d.ad;
import com.vivo.push.d.z;
import com.vivo.push.o;
import android.content.Context;
import com.vivo.push.l;
import com.vivo.push.b.i;
import com.vivo.push.e;
import java.lang.String;
import com.vivo.push.b.s;
import java.lang.Object;
import com.vivo.push.d.ae;
import java.lang.Runnable;
import com.vivo.push.m;

public final class ad extends z	// class@00105b
{

    public void ad(o p0){
       super(p0);
    }
    public static Context a(ad p0){
       return p0.a;
    }
    public final void a(o p0){
       Object[] objArray = new Object[0];
       e.a().a(p0.g(), p0.h(), objArray);
       m.b(new ae(this, p0));
    }
}
