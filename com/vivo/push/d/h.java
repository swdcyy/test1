package com.vivo.push.d.h;
import com.vivo.push.d.z;
import com.vivo.push.o;
import android.content.Context;
import com.vivo.push.l;
import com.vivo.push.b.t;
import java.util.ArrayList;
import java.util.List;
import com.vivo.push.b.s;
import java.lang.String;
import java.util.Iterator;
import java.lang.Object;
import java.lang.CharSequence;
import com.vivo.push.e;
import com.vivo.push.d.i;
import java.lang.Runnable;
import com.vivo.push.m;
import com.vivo.push.d.j;

public final class h extends z	// class@001067
{

    public void h(o p0){
       super(p0);
    }
    public static Context a(h p0){
       return p0.a;
    }
    public static Context b(h p0){
       return p0.a;
    }
    public final void a(o p0){
       Iterator iterator;
       String str5;
       ArrayList uArrayList = p0.d();
       List list = p0.e();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       ArrayList uArrayList3 = new ArrayList();
       ArrayList uArrayList4 = new ArrayList();
       int i = p0.h();
       String str = p0.g();
       String str1 = "";
       String str2 = "tag/";
       String str3 = "ali/";
       if (uArrayList != null) {
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             String str4 = iterator.next();
             if (str4.startsWith(str3)) {
                uArrayList2.add(str4.replace(str3, str1));
             }else if(str4.startsWith(str2)){
                uArrayList1.add(str4.replace(str2, str1));
             }
          }
       }
       if (list != null) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             str5 = iterator.next();
             if (str5.startsWith(str3)) {
                uArrayList4.add(str5.replace(str3, str1));
             }else if(str5.startsWith(str2)){
                uArrayList3.add(str5.replace(str2, str1));
             }
          }
       }
       if (uArrayList1.size() > 0 || uArrayList3.size() > 0) {
          if (uArrayList1.size() > 0) {
             e.a().b(uArrayList1);
          }
          e uoe = e.a();
          str5 = p0.g();
          int i1 = (uArrayList3.size() > 0)? 0x2710: i;
          uoe.a(str5, i1);
          i oi = new i(this, i, uArrayList1, uArrayList3, str);
          m.b(uoe);
       }
       if (uArrayList2.size() > 0 || uArrayList4.size() > 0) {
          if (uArrayList2.size() > 0) {
             e.a().c(uArrayList2);
          }
          e.a().a(p0.g(), i);
          j oj = new j(this, i, uArrayList2, uArrayList4, str);
          m.b(p0.g());
       }
       return;
    }
}
