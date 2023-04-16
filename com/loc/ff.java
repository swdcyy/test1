package com.loc.ff;
import com.loc.bh;
import android.content.Context;
import com.loc.w;
import java.util.Map;
import java.lang.String;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class ff extends bh	// class@00142a
{
    public Map h;
    public String i;
    public String j;
    public byte[] k;
    public byte[] l;
    public boolean m;
    public String n;
    public Map o;
    public boolean p;
    public String q;

    public void ff(Context p0,w p1){
       super(p0, p1);
       this.h = null;
       this.q = "";
       this.i = "";
       this.j = "";
       this.k = null;
       this.l = null;
       this.m = false;
       this.n = null;
       this.o = null;
       this.p = false;
    }
    public final Map a(){
       return this.h;
    }
    public final void a(Map p0){
       this.o = p0;
    }
    public final byte[] a_(){
       return this.k;
    }
    public final String b(){
       return this.i;
    }
    public final void b(String p0){
       this.n = p0;
    }
    public final void b(Map p0){
       this.h = p0;
    }
    public final void b(boolean p0){
       this.m = p0;
    }
    public final void b(byte[] p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       if (p0 != null) {
          uByteArrayOu.write(bh.a(p0));
          uByteArrayOu.write(p0);
       }
       p0 = uByteArrayOu.toByteArray();
       try{
          this.l = p0;
          uByteArrayOu.close();
          return;
       }catch(java.io.IOException e3){
          e3.printStackTrace();
          return;
       }
    }
    public final byte[] b_(){
       return this.l;
    }
    public final String c(){
       return this.j;
    }
    public final void c(String p0){
       this.i = p0;
    }
    public final void c(boolean p0){
       this.p = p0;
    }
    public final void c(byte[] p0){
       this.k = p0;
    }
    public final Map d(){
       return this.o;
    }
    public final void d(String p0){
       this.j = p0;
    }
    public final void e(String p0){
       if (!TextUtils.isEmpty(p0)) {
          this.q = p0;
          return;
       }else {
          this.q = "";
          return;
       }
    }
    public final String g(){
       return this.q;
    }
    public final String h(){
       return "loc";
    }
    public final boolean i(){
       return this.m;
    }
    public final String j(){
       return this.n;
    }
    public final boolean k(){
       return this.p;
    }
}
