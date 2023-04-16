package com.kwai.framework.logger.collector.adapter.AppPackageAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;
import java.util.Objects;
import com.google.gson.stream.b;

public class AppPackageAdapter extends TypeAdapter	// class@000b8a
{

    public void AppPackageAdapter(){
       super();
    }
    public Object read(a p0){
       ClientBase$ApplicationPackage uApplication = PatchProxy.applyOneRefs(p0, this, AppPackageAdapter.class, "3");
       if (uApplication != PatchProxyResult.class) {
       }else {
          uApplication = new ClientBase$ApplicationPackage();
          p0.c();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xcb1c722f:
                   if (str.equals("system")) {
                      i = 0;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 1;
                   }
                   break;
                 case 0x290b12e5:
                   if (str.equals("versionCode")) {
                      i = 2;
                   }
                   break;
                 case 0x290fdf83:
                   if (str.equals("versionName")) {
                      i = 3;
                   }
                   break;
                 case 0x362a8ff1:
                   if (str.equals("packageName")) {
                      i = 4;
                   }
                   break;
                 case 0x5c6f15bf:
                   if (str.equals("running")) {
                      i = 5;
                   }
                   break;
                 case 0x7ef5572c:
                   if (str.equals("firstInstallationTimestamp")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uApplication.system = p0.s();
                   break;
                 case 1:
                   uApplication.name = p0.E();
                   break;
                 case 2:
                   uApplication.versionCode = p0.v();
                   break;
                 case 3:
                   uApplication.versionName = p0.E();
                   break;
                 case 4:
                   uApplication.packageName = p0.E();
                   break;
                 case 5:
                   uApplication.running = p0.s();
                   break;
                 case 6:
                   uApplication.firstInstallationTimestamp = p0.x();
                   break;
                 default:
             }
          }
          p0.j();
       }
       return uApplication;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AppPackageAdapter.class, "2")) {
       }else {
          p0.e();
          p0.r("packageName").O(p1.packageName);
          p0.r("name").O(p1.name);
          p0.r("versionName").O(p1.versionName);
          p0.r("versionCode").K((long)p1.versionCode);
          p0.r("system").P(p1.system);
          p0.r("running").P(p1.running);
          p0.r("firstInstallationTimestamp").K(p1.firstInstallationTimestamp);
          p0.j();
       }
       return;
    }
}
