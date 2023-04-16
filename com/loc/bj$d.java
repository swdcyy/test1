package com.loc.bj$d;
import java.lang.Object;
import java.util.Vector;
import com.loc.bj$e;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class bj$d	// class@001398
{
    public Vector a;
    public bj$e b;

    public void bj$d(){
       super();
       this.a = new Vector();
       this.b = new bj$e(0);
    }
    public void bj$d(byte p0){
       super();
    }
    public final bj$e a(String p0){
       bj$e uoe;
       if (TextUtils.isEmpty(p0)) {
          return this.b;
       }
       int i = 0;
       while (true) {
          if (i < this.a.size()) {
             uoe = this.a.get(i);
             if (uoe != null && (uoe.a()).equals(p0)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             bj$e uoe1 = new bj$e(0);
             uoe1.b(p0);
             this.a.add(uoe1);
             return uoe1;
          }
       }
       return uoe;
    }
}
