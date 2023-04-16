package com.loc.cf;
import com.loc.cg;
import android.content.Context;
import java.lang.String;
import java.lang.System;
import com.loc.al;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;

public final class cf extends cg	// class@0013b7
{
    public int a;
    public long b;
    public String d;
    public Context e;

    public void cf(Context p0,int p1,String p2,cg p3){
       super(p3);
       this.a = p1;
       this.d = p2;
       this.e = p0;
    }
    public final void a(boolean p0){
       super.a(p0);
       if (p0) {
          long l = System.currentTimeMillis();
          this.b = l;
          al.a(this.e, this.d, String.valueOf(l));
       }
       return;
    }
    public final boolean a(){
       long l = 0;
       if (!this.b - l) {
          String str = al.a(this.e, this.d);
          if (!TextUtils.isEmpty(str)) {
             l = Long.parseLong(str);
          }
          this.b = l;
       }
       if ((System.currentTimeMillis() - this.b) - (long)this.a < 0) {
          return false;
       }else {
          return true;
       }
    }
}
