package com.kwai.framework.debuglog.d;
import u87.c;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.debuglog.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import java.lang.StringBuilder;
import android.os.Environment;
import android.app.Application;
import o56.a;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import qkd.b;

public final class d implements c	// class@000b26
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final boolean a(String p0){
       StringBuilder str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       File[] obj = null;
       object obj1 = PatchProxy.applyOneRefs(p0, obj, og, "4");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(TextUtils.x(p0)){
          if (!g.c) {
             g.c = b;
             File[] obj2 = PatchProxy.apply(obj, obj, og, "3");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }else {
                try{
                   String str = Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android/data/"+a.b().getPackageName();
                   obj2 = new File[]{new File(str+"/cache/.files/.frame_upload_image_info"),new File(str+"/files/.frame_upload_image_info"),new File(str+"/files/.encode_output_temporary_path"),new File(str+"/files/.encoding_output_path"),new File(str+"/cache/.video_cache"),new File(str+"/files/.post"),new File(str1+"/files/workspace")};
                   str1 = str;
                   obj = obj2;
                }catch(java.lang.Exception e0){
                   Log.f(e0);
                }
             }
          }
          File[] d = g.d;
          if (d != null && d.length) {
             File uFile = new File(p0);
             File[] d1 = g.d;
             int len = d1.length;
             int i = 0;
             while (i < len) {
                obj1 = d1[i];
                try{
                   if (b.v(uFile.getAbsolutePath(), obj1.getAbsolutePath()) || (!b.s(obj1.getAbsolutePath(), uFile.getAbsolutePath()) && !b.s(uFile.getAbsolutePath(), obj1.getAbsolutePath()))) {
                   }
                }catch(java.io.IOException e3){
                   e3.toString();
                }catch(java.lang.IllegalArgumentException e3){
                   e3.toString();
                }
                i = i + 1;
             }
          }
       }
    label_014f :
       b = false;
       return b;
    }
}
