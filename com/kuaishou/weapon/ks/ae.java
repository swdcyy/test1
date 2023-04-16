package com.kuaishou.weapon.ks.ae;
import com.kuaishou.weapon.ks.d;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class ae	// class@0011c0
{
    public d l;

    public void ae(d p0){
       this.l = p0;
    }
    public String a(String p0,String p1){
       p0 = this.l.b(p0, "", true);
       if (TextUtils.isEmpty(p0)) {
          return p1;
       }
       return p0;
    }
    public boolean b(String p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return false;
       }
       this.l.a(p0, p1, true);
       return true;
    }
}
