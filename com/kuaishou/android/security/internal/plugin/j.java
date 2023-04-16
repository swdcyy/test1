package com.kuaishou.android.security.internal.plugin.j;
import com.kuaishou.android.security.internal.plugin.f;
import java.lang.String;
import com.kuaishou.android.security.internal.plugin.g;
import dalvik.system.DexClassLoader;
import android.content.pm.PackageInfo;
import com.kuaishou.android.security.internal.init.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.content.res.AssetManager;

public class j implements f	// class@0006fb
{
    public String a;
    public String b;
    public DexClassLoader c;
    public AssetManager d;
    public PackageInfo e;
    public d f;
    public g g;

    public void j(String p0,g p1,String p2,DexClassLoader p3,PackageInfo p4,d p5){
       super();
       this.a = p0;
       this.g = p1;
       this.b = p2;
       this.c = p3;
       this.e = p4;
       this.f = p5;
    }
    public g a(){
       return this.g;
    }
    public String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.applicationInfo.metaData.getString(p0);
    }
    public String b(){
       return this.a;
    }
    public String c(){
       return this.b;
    }
    public AssetManager d(){
       return null;
    }
    public d e(){
       return this.f;
    }
    public PackageInfo f(){
       return this.e;
    }
    public DexClassLoader g(){
       return this.c;
    }
    public String getVersion(){
       return this.e.versionName;
    }
}
