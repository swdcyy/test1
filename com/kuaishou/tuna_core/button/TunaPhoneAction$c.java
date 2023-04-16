package com.kuaishou.tuna_core.button.TunaPhoneAction$c;
import java.lang.Runnable;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import java.lang.String;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import lnc.a1;
import e17.i;
import ma6.a;

public final class TunaPhoneAction$c implements Runnable	// class@0010a3
{
    public final TunaPhoneAction b;
    public final boolean c;
    public final String d;
    public final String e;
    public final PhoneInfoModel f;
    public final int g;
    public final String h;

    public void TunaPhoneAction$c(TunaPhoneAction p0,boolean p1,String p2,String p3,PhoneInfoModel p4,int p5,String p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       String str;
       if (PatchProxy.applyVoid(null, this, TunaPhoneAction$c.class, "1")) {
          return;
       }
       TunaPhoneAction$c uoc = null;
       TunaPhoneAction$c uoc1 = 1;
       if (this.c != null) {
          TunaPhoneAction$c td = this.d;
          if (td != null) {
             td = (td.length() > 0)? 1: null;
             if (td == uoc1) {
                this.b.i(this.e, this.f, this.d, this.g, false, this.c);
                this.b.f(this.d, this.h, "backupPhone");
             label_0074 :
                return;
             }
          }
       }
       this.b.i(this.e, this.f, this.d, this.g, false, false);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104c15));
       TunaPhoneAction d = this.b.d;
       if (d != null) {
          TunaPhoneAction$c td1 = this.d;
          if (td1 != null) {
             if (td1.length() > 0) {
                uoc = 1;
             }
             if (uoc == uoc1) {
                str = "CallFailedAndBackupExpired";
             label_0072 :
                d.mFailureReason = str;
                goto label_0074 ;
             }
          }
          str = "CallFailedAndNoBackup";
          goto label_0072 ;
       }else {
          goto label_0074 ;
       }
    }
}
