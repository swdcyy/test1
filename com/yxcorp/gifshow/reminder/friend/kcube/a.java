package com.yxcorp.gifshow.reminder.friend.kcube.a;
import erd.o;
import java.lang.Object;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.reminder.friend.kcube.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class a implements o	// class@001aa3
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = a1.e(28.00f);
          if (i && p0.getHeight()) {
             i = Math.min(i, p0.getHeight());
          }
       }
       return BitmapUtil.k(BitmapUtil.U(p0, i, i, p0.getConfig(), false));
    }
}
