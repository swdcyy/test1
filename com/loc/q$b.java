package com.loc.q$b;
import java.lang.Object;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;

public final class q$b	// class@001461
{
    public boolean a;
    public int b;
    public final boolean c;
    public boolean d;

    public void q$b(){
       super();
       this.b = 0;
       this.a = true;
       this.c = true;
       this.d = false;
    }
    public void q$b(byte p0){
       super();
    }
    public final void a(Context p0){
       if (p0 == null) {
          return;
       }
       if (this.b <= null) {
          this.b = p0.getApplicationContext().getApplicationInfo().targetSdkVersion;
       }
       return;
    }
    public final void a(boolean p0){
       this.a = p0;
    }
    public final boolean a(){
       if (this.d == null) {
          int i = 28;
          int i1 = (Build$VERSION.SDK_INT >= i)? 1: 0;
          if (this.a != null) {
             q$b tb = this.b;
             if (tb <= null) {
                tb = 28;
             }
             i = (tb >= i)? 1: 0;
             if (!i) {
                i = 0;
             label_0024 :
                i1 = (i1 && i)? 1: 0;
                if (!i1) {
                   return false;
                }
             }
          }
          i = 1;
          goto label_0024 ;
       }
       return true;
    }
}
