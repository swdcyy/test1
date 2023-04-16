package com.yxcorp.gifshow.profile.profileinstaller.c;
import com.yxcorp.gifshow.profile.profileinstaller.c$a;
import com.yxcorp.gifshow.profile.profileinstaller.c$b;
import java.lang.Object;
import android.content.pm.PackageInfo;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;

public class c	// class@0015a4
{
    public static final c$c a;
    public static final c$c b;

    static {
       c.a = new c$a();
       c.b = new c$b();
    }
    public void c(){
       super();
    }
    public static void a(PackageInfo p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "4")) {
          return;
       }
       String str = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
       try{
          File uFile = new File(p1, str);
          DataOutputStream uDataOutputS = new DataOutputStream(new FileOutputStream(uFile));
          uDataOutputS.writeLong(p0.lastUpdateTime);
          uDataOutputS.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
}
