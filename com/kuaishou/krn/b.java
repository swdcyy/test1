package com.kuaishou.krn.b;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.krn.c;
import bk0.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek0.d;
import bk0.a;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public final class b implements Runnable	// class@000801
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       String str2;
       ArrayList uArrayList;
       if (PatchProxy.applyVoid(null, null, i.class, "11")) {
       }else {
          d.e("reportKdsPageAggregation | 5. SDK启动，开关为：true");
          String str = i.E();
          a l = i.l;
          String str1 = "KDS_PAGE_REPORT_AGGREGATION";
          LinkedTreeMap linkedTreeMa = l.b(str1, "KRN_PAGE_LOAD_TIME_AGGREGATION");
          if (linkedTreeMa != null) {
             str2 = "p_date";
             if (linkedTreeMa.get(str2) != null) {
                Object obj = linkedTreeMa.get(str2);
                Objects.requireNonNull(obj);
                str2 = obj.toString();
             label_003e :
                if (linkedTreeMa != null) {
                   String str3 = "info";
                   if (linkedTreeMa.get(str3) != null) {
                      uArrayList = linkedTreeMa.get(str3);
                   label_0054 :
                      if (!TextUtils.equals(str, str2) && (!TextUtils.isEmpty(str2) && !uArrayList.isEmpty())) {
                         i.I(linkedTreeMa);
                         l.a(str1, "KRN_PAGE_LOAD_TIME_AGGREGATION");
                         d.e("reportKdsPageAggregation | 6. SDK启动，日期不同，上报数据；currentDay："+str+"，上报数据为："+linkedTreeMa);
                      }
                   }
                }
                uArrayList = new ArrayList();
                goto label_0054 ;
             }
          }
          str2 = "";
          goto label_003e ;
       }
    label_0088 :
       return;
    }
}
