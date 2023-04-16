package com.kwai.middleware.resourcemanager.ResourceSdk;
import com.kwai.middleware.resourcemanager.ResourceSdk$GSON$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import jb7.a;
import kb7.a;
import jb7.b;
import android.content.Context;
import java.lang.String;
import c0d.a;
import ob7.a;
import kotlin.jvm.internal.a;
import za7.a;
import pb7.a;
import java.io.File;
import mb7.a;

public final class ResourceSdk	// class@000f35
{
    public static boolean a;
    public static String b;
    public static boolean c;
    public static a d;
    public static final p e;
    public static final ResourceSdk f;

    static {
       ResourceSdk.f = new ResourceSdk();
       ResourceSdk.e = s.c(ResourceSdk$GSON$2.INSTANCE);
    }
    public void ResourceSdk(){
       super();
    }
    public static b d(ResourceSdk p0,a p1,a p2,int p3,Object p4){
       p2 = (p3 & 0x02)? new a(p1): null;
       return p0.c(p1, p2);
    }
    public final a a(Context p0,String p1,String p2,a p3){
       a.p(p0, "context");
       a.p(p1, "subBiz");
       a.p(p2, "projectName");
       return new a(p0, p1, p2, p3);
    }
    public final b b(a p0){
       return ResourceSdk.d(this, p0, null, 2, null);
    }
    public final b c(a p0,a p1){
       a.p(p0, "bizConfig");
       a.p(p1, "adapter");
       return new b(p0, p1);
    }
    public final a e(){
       a d = ResourceSdk.d;
       if (d == null) {
          a.S("resourceSdkConfig");
       }
       return d;
    }
    public final File f(String p0,a p1){
       a.p(p0, "subBiz");
       a.p(p1, "info");
       return a.c.f(p0, p1);
    }
}
