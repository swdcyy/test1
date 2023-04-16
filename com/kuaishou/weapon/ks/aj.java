package com.kuaishou.weapon.ks.aj;
import java.lang.Object;
import java.lang.String;
import android.os.Build;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bh;

public class aj	// class@0011c6
{

    public void aj(){
       super();
    }
    public static String a(){
       String cPU_ABI2 = Build.CPU_ABI2;
       StringBuilder str = Build.CPU_ABI;
       if (!TextUtils.isEmpty(cPU_ABI2)) {
          str = str+";"+cPU_ABI2;
       }
       String str1 = bh.a("ro.product.cpu.abilist");
       if (!TextUtils.isEmpty(str1)) {
          str = str+";"+str1;
       }
       return str;
    }
}
