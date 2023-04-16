package com.yxcorp.plugin.setting.entries.holder.j0$a$a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.j0$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.j0;
import wkd.b;
import nf6.i;
import xgc.b;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class j0$a$a implements View$OnClickListener	// class@000866
{
    public final j0$a b;

    public void j0$a$a(j0$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$a$a.class, "1")) {
          return;
       }
       j0$a r = this.b.r;
       this.b.r.a.startActivity(b.a(0x66dce92a).a(r.a, w0.f(r.b.h)));
       return;
    }
}
