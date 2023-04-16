package com.vivo.push.a;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import android.content.Intent;
import com.vivo.push.util.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ComponentName;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.ArrayList;

public final class a	// class@00102f
{
    public Bundle a;
    public String b;
    public String c;

    public void a(String p0,String p1,Bundle p2){
       super();
       this.b = p0;
       this.c = p1;
       this.a = p2;
    }
    public static a a(Intent p0){
       String str;
       a uoa = null;
       if (p0 == null) {
          p.a("BundleWapper", "create error : intent is null");
          return uoa;
       }else {
          Bundle extras = p0.getExtras();
          if (extras != null) {
             str = extras.getString("client_pkgname");
             if (!TextUtils.isEmpty(str)) {
             label_001f :
                if (TextUtils.isEmpty(str)) {
                   p.b("BundleWapper", "create warning: pkgName is null");
                }
                String package = p0.getPackage();
                if (TextUtils.isEmpty(package)) {
                   if (p0.getComponent() != null) {
                      uoa = p0.getComponent().getPackageName();
                   }
                   if (TextUtils.isEmpty(uoa)) {
                      p.b("BundleWapper", "create warning: targetPkgName is null");
                   }
                   package = uoa;
                }
                return new a(str, package, extras);
             }
          }
          str = uoa;
          goto label_001f ;
       }
    }
    public final String a(){
       return this.b;
    }
    public final String a(String p0){
       a ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.getString(p0);
    }
    public final void a(String p0,int p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       this.a.putInt(p0, p1);
       return;
    }
    public final void a(String p0,long p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       this.a.putLong(p0, p1);
       return;
    }
    public final void a(String p0,Serializable p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       SerializableHook.putSerializable(this.a, p0, p1);
       return;
    }
    public final void a(String p0,String p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       this.a.putString(p0, p1);
       return;
    }
    public final void a(String p0,ArrayList p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       this.a.putStringArrayList(p0, p1);
       return;
    }
    public final void a(String p0,boolean p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       this.a.putBoolean(p0, p1);
       return;
    }
    public final void a(String p0,byte[] p1){
       if (this.a == null) {
          this.a = new Bundle();
       }
       this.a.putByteArray(p0, p1);
       return;
    }
    public final int b(String p0,int p1){
       a ta = this.a;
       if (ta == null) {
          return p1;
       }
       return ta.getInt(p0, p1);
    }
    public final long b(String p0,long p1){
       a ta = this.a;
       if (ta == null) {
          return p1;
       }
       return ta.getLong(p0, p1);
    }
    public final Bundle b(){
       return this.a;
    }
    public final byte[] b(String p0){
       a ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.getByteArray(p0);
    }
    public final ArrayList c(String p0){
       a ta = this.a;
       if (ta == null) {
          return null;
       }
       return ta.getStringArrayList(p0);
    }
    public final Serializable d(String p0){
       a ta = this.a;
       if (ta == null) {
          return null;
       }
       return SerializableHook.getSerializable(ta, p0);
    }
    public final boolean e(String p0){
       a ta = this.a;
       if (ta == null) {
          return false;
       }
       return ta.getBoolean(p0, false);
    }
}
