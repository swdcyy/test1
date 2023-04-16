package com.yxcorp.gifshow.util.o0;
import android.app.Activity;
import android.content.Intent;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import android.net.Uri;
import java.lang.String;
import lnc.s8;
import io.reactivex.a;
import brd.a;
import lnc.u8;
import erd.a;
import t45.d;
import brd.z;
import lnc.t8;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Exception;
import k2b.u1;

public class o0	// class@001f93
{

    public static void a(Activity p0,Intent p1){
       if (!p0 instanceof UriRouterActivity && p1 != null) {
          Uri data = p1.getData();
          int i = 1;
          boolean[] uobooleanArr = new boolean[i];
          try{
             String[] stringArray = new String[i];
             a.k(new s8(uobooleanArr, data)).l(new u8(uobooleanArr, stringArray)).w(d.c).s(d.a).u(new t8(uobooleanArr, data, stringArray), Functions.d());
          }catch(java.lang.Exception e3){
             u1.Q("RelationReportHelper", e3.toString());
          }
       }
    }
}
