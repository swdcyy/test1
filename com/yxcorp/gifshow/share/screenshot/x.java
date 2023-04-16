package com.yxcorp.gifshow.share.screenshot.x;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import android.graphics.Bitmap;
import uic.g0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.share.screenshot.e0;
import erd.r;
import uic.c0;
import erd.o;
import com.yxcorp.gifshow.share.screenshot.b0;
import com.yxcorp.gifshow.share.screenshot.c0;
import crd.b;

public final class x implements g	// class@001c6c
{
    public final GifshowActivity b;
    public final BaseFeed c;

    public void x(GifshowActivity p0,BaseFeed p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       x tb = this.b;
       x tc = this.c;
       if (PatchProxy.applyVoidThreeRefs(p0, tb, tc, null, g0.class, "4")) {
       }else if(p0 == null){
          i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
       }else {
          String[] stringArray = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE","android.permission.READ_EXTERNAL_STORAGE"};
          z a = d.a;
          p0 = a.k(tb, stringArray).subscribeOn(a).observeOn(d.c).filter(e0.b).map(new c0(tc, p0)).observeOn(a);
          p0.subscribe(b0.b, c0.b);
       }
       return;
    }
}
