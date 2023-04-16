package com.kuaishou.weapon.u.WeaponAlarmUtil$1$1;
import java.lang.Runnable;
import com.kuaishou.weapon.u.WeaponAlarmUtil$1;
import java.lang.Object;
import android.content.Context;
import k3.m;
import java.lang.String;
import k3.i;
import androidx.work.a$a;
import androidx.work.a;
import androidx.work.b$a;
import com.kuaishou.weapon.u.WeaponWork;
import java.lang.Class;
import androidx.work.e$a;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import androidx.work.e;

public class WeaponAlarmUtil$1$1 implements Runnable	// class@00123e
{
    public final WeaponAlarmUtil$1 a;

    public void WeaponAlarmUtil$1$1(WeaponAlarmUtil$1 p0){
       this.a = p0;
       super();
    }
    public void run(){
       m.l(this.a.a).d(this.a.b);
       a$a uoa = new a$a();
       uoa.e("tag", this.a.b);
       m.l(this.a.a).h(new b$a(WeaponWork.class).a(this.a.b).f(this.a.c.longValue(), TimeUnit.MILLISECONDS).g(uoa.a()).b());
    }
}
