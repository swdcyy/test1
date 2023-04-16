package com.kuaishou.weapon.ks.bu;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.weapon.ks.bu$1;
import java.io.FileFilter;
import java.util.Collection;
import android.content.Context;
import com.kuaishou.weapon.ks.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class bu	// class@0011f5
{

    public void bu(){
       super();
    }
    public static List a(File p0,String p1,int p2){
       ArrayList uArrayList = new ArrayList();
       File[] uFileArray = p0.listFiles(new bu$1(p1));
       if (uFileArray != null) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.isFile()) {
                uArrayList.add(oobject);
                break ;
             }
             int i1 = p2 + 1;
             uArrayList.addAll(bu.a(oobject, p1, p2));
             i = i + 1;
             p2 = i1;
          }
       }
       return uArrayList;
    }
    public static boolean a(Context p0,String p1){
       String str = d.a(p0).b("plc001_k_v_w", "", true);
       if (!TextUtils.isEmpty(str) && new File(str+"/lib"+p1).exists()) {
          return true;
       }
       if (bu.a(p0.getFilesDir(), p1, 0).size() > 0) {
          return true;
       }
       return 0;
    }
}
