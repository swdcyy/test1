package com.kwai.plugin.dva.install.remote.PluginInstallService$a;
import gj7.a$a;
import com.kwai.plugin.dva.install.remote.PluginInstallService;
import java.lang.String;
import gj7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import jj7.e;

public class PluginInstallService$a extends a$a	// class@001366
{
    public final PluginInstallService b;

    public void PluginInstallService$a(PluginInstallService p0){
       this.b = p0;
       super();
    }
    public void H1(String p0,int p1,b p2){
       if (PatchProxy.isSupport(PluginInstallService$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PluginInstallService$a.class, "3")) {
          return;
       }
       PluginInstallService$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(PluginInstallService.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, tb, PluginInstallService.class, "4")) {
          tb.b.e(p0, p1, p2);
       }
       return;
    }
    public void N0(String p0,int p1,String p2,String p3,b p4){
       String str = "2";
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport(PluginInstallService$a.class)) {
          Object[] objArray = new Object[i5];
          objArray[i4] = p0;
          objArray[i3] = Integer.valueOf(p1);
          objArray[i2] = p2;
          objArray[i1] = p3;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, PluginInstallService$a.class, str)) {
             return;
          }
       }
       PluginInstallService$a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(PluginInstallService.class)) {
          Object[] objArray1 = new Object[i5];
          objArray1[i4] = p0;
          objArray1[i3] = Integer.valueOf(p1);
          objArray1[i2] = p2;
          objArray1[i1] = p3;
          objArray1[i] = p4;
          if (PatchProxy.applyVoid(objArray1, tb, PluginInstallService.class, str)) {
          label_0059 :
             return;
          }
       }
       tb.b.d(p0, p1, p2, p3, p4);
       goto label_0059 ;
    }
    public void z1(String p0,int p1,String p2,String p3,b p4){
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport(PluginInstallService$a.class)) {
          Object[] objArray = new Object[i5];
          objArray[i4] = p0;
          objArray[i3] = Integer.valueOf(p1);
          objArray[i2] = p2;
          objArray[i1] = p3;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, PluginInstallService$a.class, "1")) {
             return;
          }
       }
       PluginInstallService$a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(PluginInstallService.class)) {
          Object[] objArray1 = new Object[i5];
          objArray1[i4] = p0;
          objArray1[i3] = Integer.valueOf(p1);
          objArray1[i2] = p2;
          objArray1[i1] = p3;
          objArray1[i] = p4;
          if (PatchProxy.applyVoid(objArray1, tb, PluginInstallService.class, "3")) {
          label_005b :
             return;
          }
       }
       tb.b.c(p0, p1, p2, p3, p4);
       goto label_005b ;
    }
}
