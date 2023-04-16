package com.yxcorp.gifshow.protector.a;
import com.kwai.framework.exceptionhandler.a$a;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Throwable;
import c6c.b;
import android.app.Application;
import o56.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import d6c.b;
import c6c.f;
import android.content.Intent;
import o56.c;
import e6c.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import e6c.b;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.Integer;
import java.lang.NumberFormatException;
import java.io.IOException;
import c6c.a$b;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import qkd.b;

public final class a implements a$a	// class@0012dc
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Thread p0,Throwable p1){
       b a;
       int i;
       File c;
       b uob = b.a();
       Application uApplication = a.b();
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (PatchProxy.applyVoidOneRefs(uApplication, uob, uob1, "9")) {
       }else if(SystemUtil.L(uApplication) && !SystemUtil.I()){
          a = uob.a;
          if (a != null && a.a()) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, uob, uob1, "4")) {
                uob = uob.b;
                Objects.requireNonNull(uob);
                if (!PatchProxy.applyVoid(objArray, uob, f.class, "15") && uob.c != null) {
                   uob.c = false;
                   Intent intent = new Intent();
                   intent.setAction("protector.intent.action.FINISH_DIALOG");
                   a.a().a().sendBroadcast(intent);
                }
             }
             c uoc = c.class;
             if (!PatchProxy.applyVoid(objArray, objArray, uoc, "1")) {
                File obj = PatchProxy.apply(objArray, objArray, uoc, "2");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else {
                   obj = b.c;
                   if (!obj.exists() || !obj.canRead()) {
                      Object[] objArray1 = new Object[false];
                      a$b.a.t("ProtectorCounter", "failed to read crash count from "+obj, objArray1);
                   }else {
                      try{
                         BufferedReader uBufferedRea = new BufferedReader(new FileReader(obj));
                         String str = uBufferedRea.readLine();
                         uBufferedRea.close();
                         if (str != null && !str.isEmpty()) {
                            try{
                               i = Integer.parseInt(str);
                            }catch(java.lang.NumberFormatException e0){
                               e0.printStackTrace();
                            }
                         label_00b1 :
                            i = 0;
                         }else {
                            goto label_00b1 ;
                         }
                      }catch(java.io.IOException e0){
                         e0.printStackTrace();
                      }
                   }
                }
                i = i + 1;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), objArray, uoc, "3")) {
                   if (i < 0) {
                      i = 0;
                   }
                   c = b.c;
                   if (c.exists()) {
                      b.r0(c, Integer.toString(i), "US-ASCII", false);
                   }
                }
             }
          }
       }
    label_010b :
       return;
    }
}
