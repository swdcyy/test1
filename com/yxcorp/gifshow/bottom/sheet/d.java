package com.yxcorp.gifshow.bottom.sheet.d;
import erd.g;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.bottom.sheet.b;
import java.lang.Runnable;

public final class d implements g	// class@001c65
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = tb.c;
       f.d("Content[%1$s] survive time ends and destroyed.", objArray);
       Object[] objArray1 = null;
       if (PatchProxy.applyVoid(objArray1, tb, f.class, "13")) {
       }else {
          objArray = new Object[i];
          objArray[0] = tb.c;
          f.d("Content[%1$s] is to be destroyed.", objArray);
          if (!TextUtils.x(tb.c)) {
             objArray1 = tb.a.getChildFragmentManager().findFragmentByTag(tb.c);
          }
          if (objArray1 == null) {
             i = new Object[i];
             i[0] = tb.c;
             f.d("Content[%1$s] is failed to destroy as not create or create failed.", i);
             tb.b();
          }else {
             i = tb.a.getChildFragmentManager().beginTransaction().u(objArray1);
             i.x(new b(tb));
             i.m();
          }
       }
       return;
    }
}
