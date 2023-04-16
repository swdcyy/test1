package com.kuaishou.live.gzone.v2.profile.e$a;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import y41.i$a;
import t02.a0;
import p91.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import java.lang.StringBuilder;
import y41.i;

public class e$a implements DialogInterface$OnClickListener	// class@001cde
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, e$a.class, "1")) {
          return;
       }
       if (p1 == 0x7f104f05) {
          e$a tb = this.b;
          e p = tb.p;
          e b = tb.B;
          String str = (b == null)? null: b.Z2.getLiveStreamId();
          i$a uoa = new i$a(p, str);
          uoa.o(this.b.q);
          uoa.d("liveProfile");
          uoa.m(this.b.p.getUrl()+"#unfollow");
          uoa.r(false);
          uoa.a().e();
       }
       return;
    }
}
