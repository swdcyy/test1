package com.yxcorp.plugin.setting.entries.holder.k$a$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.entries.holder.k$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.entries.holder.k;
import wkd.b;
import nf6.i;
import xgc.b;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class k$a$b implements View$OnClickListener	// class@00086c
{
    public final k$a b;

    public void k$a$b(k$a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a$b.class, "1")) {
          return;
       }
       k$a s = this.b.s;
       this.b.s.a.startActivity(b.a(0x66dce92a).a(s.a, w0.f(s.b.h)));
       return;
    }
}
