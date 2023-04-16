package com.yxcorp.gifshow.homepage.functions.a;
import erd.g;
import com.kwai.feature.api.feed.misc.bridge.JsCalendarParams;
import android.app.Activity;
import java.lang.String;
import f55.g;
import java.util.Map;
import java.lang.Object;
import java.lang.Boolean;
import tra.b;
import q87.c;
import lsa.d;
import com.kwai.feature.api.feed.misc.bridge.JsCalendarParams$CalendarEvent;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import lsa.j;
import crd.b;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.os.Bundle;

public final class a implements g	// class@0016d4
{
    public final JsCalendarParams b;
    public final Activity c;
    public final g d;
    public final Map e;

    public void a(JsCalendarParams p0,Activity p1,String p2,g p3,Map p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p3;
       this.e = p4;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       int i = 0;
       if (p0.booleanValue()) {
          Object[] objArray = new Object[i];
          b.C().w("CalendarUtils", "add granted permission", objArray);
          t.fromCallable(new d(tc, tb.mEvent, "content://com.android.calendar/events")).subscribeOn(d.c).observeOn(d.a).subscribe(new j(td));
       }else {
          Object[] objArray1 = new Object[i];
          b.C().w("CalendarUtils", "add no permission", objArray1);
          p0 = new ArrayList();
          Iterator iterator = te.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!uEntry.getValue().booleanValue() && !PermissionUtils.l(tc, uEntry.getKey())) {
                p0.add(uEntry.getKey());
             }
          }
          if (p0.size() > 0) {
             PermissionUtils.o(tc, tc.getString(R.string.arg_RES_7f10047a));
          }
          td.a(412, "", null);
       }
       return;
    }
}
