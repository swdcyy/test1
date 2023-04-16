package com.kuaishou.weapon.ks.bs$1;
import java.lang.Runnable;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.weapon.ks.bb;
import com.kuaishou.weapon.ks.bq;

public final class bs$1 implements Runnable	// class@0011f0
{
    public final String a;
    public final Context b;

    public void bs$1(String p0,Context p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void run(){
       bq.a(this.a, this.b, bb.c(), bb.d());
    }
}
