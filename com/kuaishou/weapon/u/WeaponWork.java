package com.kuaishou.weapon.u.WeaponWork;
import androidx.work.Worker;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.ListenableWorker$a;
import androidx.work.a;
import androidx.work.ListenableWorker;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import android.content.Intent;
import com.kuaishou.weapon.fingerprinter.WeaponHW;
import com.kuaishou.weapon.ks.x;

public class WeaponWork extends Worker	// class@001243
{
    public Context a;

    public void WeaponWork(Context p0,WorkerParameters p1){
       this.a = p0;
    }
    public ListenableWorker$a doWork(){
       String str = this.getInputData().i("tag");
       if (TextUtils.isEmpty(str)) {
          return ListenableWorker$a.c();
       }
       if (!str.equals("fingerprinter")) {
          if (str.equals("doenvre")) {
             WeaponHW.doEnvReport(this.a, null);
             WeaponHW.doFingerPrinterReport(this.a, null);
          }else if(str.equals("com.kuaishou.weapon.p0.env.action")){
             x.a().h();
          }
       }
       return ListenableWorker$a.c();
    }
}
