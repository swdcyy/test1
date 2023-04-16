package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onProgress$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.widget.TextView;
import nsd.r0;
import android.app.Activity;
import uo7.k;
import android.content.res.Resources;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.CharSequence;

public final class ShareStyleSelectHelper$listener$1$onProgress$1 extends Lambda implements a	// class@001ba4
{
    public final int $percent;
    public final ShareStyleSelectHelper$listener$1 this$0;

    public void ShareStyleSelectHelper$listener$1$onProgress$1(ShareStyleSelectHelper$listener$1 p0,int p1){
       this.this$0 = p0;
       this.$percent = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, ShareStyleSelectHelper$listener$1$onProgress$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper.e(this.this$0.a).setPercent((float)this.$percent);
       String str = this.this$0.b.k().getResources().getString(R.string.arg_RES_7f10503a);
       a.o(str, "conf.mCurrentActivity.re¡­      .video_downloading\)");
       Object[] objArray = new Object[]{Integer.valueOf(this.$percent)};
       str = String.format(str, Arrays.copyOf(objArray, 1));
       a.o(str, "java.lang.String.format\(format, *args\)");
       ShareStyleSelectHelper.f(this.this$0.a).setText(str);
       return;
    }
}
