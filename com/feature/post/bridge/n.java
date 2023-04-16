package com.feature.post.bridge.n;
import erd.g;
import com.kwai.feature.post.api.feature.bridge.JsSelectLocationParams;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import w26.c;
import com.kuaishou.android.model.mix.Location;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mg.h1;
import n3d.a;

public final class n implements g	// class@0014af
{
    public final JsSelectLocationParams b;
    public final Activity c;
    public final g d;

    public void n(JsSelectLocationParams p0,Activity p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       JsSelectLocationParams mLocation = tb.mLocation;
       if (mLocation != null && !mLocation.mId) {
          mLocation = null;
       }
       p0 = p0.UQ(tc);
       p0.putExtra("page_title", tb.mTitle);
       SerializableHook.putExtra(p0, "location", mLocation);
       tc.t1(p0, 4, new h1(td, tb));
       return;
    }
}
