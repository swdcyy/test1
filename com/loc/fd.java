package com.loc.fd;
import com.loc.r;
import java.util.Map;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class fd extends r	// class@001428
{
    public Map a;
    public Map b;
    public String c;
    public byte[] h;
    public String i;

    public void fd(){
       super();
       this.a = null;
       this.b = null;
       this.c = "";
       this.h = null;
       this.i = null;
    }
    public final Map a(){
       return this.a;
    }
    public final void a(Map p0){
       this.a = p0;
    }
    public final void a(byte[] p0){
       this.h = p0;
    }
    public final String b(){
       return this.c;
    }
    public final void b(String p0){
       this.c = p0;
    }
    public final void b(Map p0){
       this.b = p0;
    }
    public final String c(){
       if (!TextUtils.isEmpty(this.i)) {
          return this.i;
       }
       return super.c();
    }
    public final void c(String p0){
       this.i = p0;
    }
    public final Map d(){
       return this.b;
    }
    public final byte[] e(){
       return this.h;
    }
}
