package com.kwai.nearby.local.utils.d;
import com.kwai.nearby.local.utils.b;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import em6.a;
import vm5.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ld7.d;
import java.lang.Number;
import yv8.c;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import com.kwai.nearby.local.utils.c;
import yv8.a;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class d	// class@001009
{
    public static final x a;

    static {
       d.a = Suppliers.a(b.b);
    }
    public void d(){
       super();
    }
    public static o a(Fragment p0,a p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new d(p1);
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.f()) {
          return 0x7f0d15f6;
       }
       return 0x7f0d04cd;
    }
    public static boolean c(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = b.a(-129117978).f(p0, c.a).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (iterator.next().mActionType == true) {
             break ;
          }
       }
       return false;
    }
    public static boolean d(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && ("activity_local").equals(p0.getString("key_home_local_page_source")))? true: false;
       return b;
    }
    public static boolean e(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0.getIntent() != null) {
          Uri data = p0.getIntent().getData();
          if (data != null && data.isHierarchical()) {
             return ("1").equals(data.getQueryParameter("eventType"));
          }
       }
       return b;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = d.a.get();
       }
       return obj.booleanValue();
    }
}
