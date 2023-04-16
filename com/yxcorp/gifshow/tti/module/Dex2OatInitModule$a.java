package com.yxcorp.gifshow.tti.module.Dex2OatInitModule$a;
import com.yxcorp.gifshow.profile.profileinstaller.c$c;
import com.yxcorp.gifshow.tti.module.Dex2OatInitModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import k2b.u1;
import s1c.t;
import s1c.h1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import s1c.p;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import cc6.b;
import java.lang.CharSequence;
import qkd.b;
import java.lang.Exception;

public class Dex2OatInitModule$a implements c$c	// class@001dba
{
    public final Dex2OatInitModule a;

    public void Dex2OatInitModule$a(Dex2OatInitModule p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       String str;
       Dex2OatInitModule$a uoa = Dex2OatInitModule$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                str = (p0 != 4)? "": "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
             }else {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
             }
          }else {
             str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
          }
       }else {
          str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
       }
       u1.R("Art_Profile_Diagnostic", str, 19);
       return;
    }
    public void b(int p0,Object p1){
       Dex2OatInitModule$a obj;
       boolean b;
       Dex2OatInitModule$a uoa = Dex2OatInitModule$a.class;
       t ot = t.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       p1 = "";
       int i = 0;
       StringBuilder str = 1;
       Object[] objArray = null;
       switch (p0){
           case 1:
             p1 = "RESULT_INSTALL_SUCCESS";
             if (!PatchProxy.applyVoid(objArray, objArray, ot, "6")) {
                t.a.c("ArtProfileSuccess", str);
             }
             obj = PatchProxy.apply(objArray, objArray, h1.class, "3");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("doArtProfileWithDex2oat", i);
             if (b) {
                this.a.o0("art profile");
             }
             break;
           case 2:
             p1 = "RESULT_ALREADY_INSTALLED";
             break;
           case 3:
           case 5:
           case 4:
             p1 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
             if (!PatchProxy.applyVoid(objArray, objArray, ot, "3")) {
                t.a.c("ArtProfileForbiddenWithDevice", str);
             }
             break;
           case 6:
           case 8:
           case 7:
             p1 = "RESULT_PARSE_EXCEPTION";
             if (!PatchProxy.applyVoid(objArray, objArray, ot, "5")) {
                t.a.c("ArtProfileForbiddenWithLocal", str);
             }
             break;
           default:
       }
    label_0081 :
       Object[] objArray1 = new Object[i];
       p.c.w("ArtProfile", "onResultReceived: "+p1, objArray1);
       obj = this.a;
       String str1 = "ArtProfile_Perf";
       _monitor_enter(obj);
       if (PatchProxy.applyVoidTwoRefs(str1, p1, obj, Dex2OatInitModule.class, "9")) {
          _monitor_exit(obj);
       }else if(SystemUtil.P()){
          File uFile = b.b();
          try{
             File uFile1 = new File(uFile, str1);
             if (!uFile1.exists()) {
                uFile1.createNewFile();
                b.q0(uFile1, p1);
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
       u1.R("Art_Profile_Result", p1, 19);
       return;
    }
}
