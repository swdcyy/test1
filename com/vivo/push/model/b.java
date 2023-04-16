package com.vivo.push.model.b;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalAccessError;
import java.lang.StringBuilder;

public final class b	// class@00108d
{
    public String a;
    public long b;
    public int c;
    public String d;
    public boolean e;
    public boolean f;

    public void b(String p0){
       super();
       this.b = -1;
       this.c = -1;
       this.e = false;
       this.f = false;
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
       }
       this.a = p0;
       return;
    }
    public final String a(){
       return this.a;
    }
    public final void a(int p0){
       this.c = p0;
    }
    public final void a(long p0){
       this.b = p0;
    }
    public final void a(String p0){
       this.d = p0;
    }
    public final void a(boolean p0){
       this.e = p0;
    }
    public final long b(){
       return this.b;
    }
    public final void b(boolean p0){
       this.f = p0;
    }
    public final boolean c(){
       return this.e;
    }
    public final boolean d(){
       return this.f;
    }
    public final String toString(){
       return "PushPackageInfo{mPackageName="+this.a+", mPushVersion="+this.b+", mPackageVersion="+this.c+", mInBlackList="+this.e+", mPushEnable="+this.f+"}";
    }
}
