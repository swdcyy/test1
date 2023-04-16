package com.kuaishou.weapon.ks.an;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.ks.an$1;
import java.lang.Runnable;
import com.kuaishou.weapon.ks.ap;
import com.kuaishou.weapon.ks.ba;
import java.lang.String;
import com.kuaishou.weapon.ks.bq;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.d;
import java.lang.System;

public class an	// class@0011cb
{
    public Context a;

    public void an(Context p0){
       this.a = p0;
    }
    public static Context a(an p0){
       return p0.a;
    }
    public static void a(an p0,int p1){
       p0.b(p1);
    }
    public void a(int p0){
       r.a().a(new an$1(this, p0));
    }
    public final void b(int p0){
       String str = bq.a(new ap(this.a, p0).a(ba.b), this.a);
       if (!TextUtils.isEmpty(str) && str.equals("{\"result\":1,\"error_msg\":\"\"}")) {
          d.a(this.a).d(System.currentTimeMillis());
       }
       return;
    }
}
