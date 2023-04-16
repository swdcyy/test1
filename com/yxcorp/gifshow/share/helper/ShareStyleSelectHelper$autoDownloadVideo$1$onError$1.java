package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1$onError$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.view.View;
import uo7.k;
import cic.c;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;

public final class ShareStyleSelectHelper$autoDownloadVideo$1$onError$1 extends Lambda implements a	// class@001b9a
{
    public final ShareStyleSelectHelper$autoDownloadVideo$1 this$0;

    public void ShareStyleSelectHelper$autoDownloadVideo$1$onError$1(ShareStyleSelectHelper$autoDownloadVideo$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareStyleSelectHelper$autoDownloadVideo$1$onError$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper$autoDownloadVideo$1 b = this.this$0.b;
       b.m = true;
       ShareStyleSelectHelper.e(b).setVisibility(8);
       Drawable drawable = this.this$0.b.b().k().getResources().getDrawable(R.drawable.arg_RES_7f0824f0);
       if (drawable != null) {
          drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
          ShareStyleSelectHelper.f(this.this$0.b).setCompoundDrawables(drawable, objArray, objArray, objArray);
       }
       ShareStyleSelectHelper.f(this.this$0.b).setText(this.this$0.b.b().k().getResources().getString(R.string.arg_RES_7f100a83));
       View view = this.this$0.b.q.z();
       a.m(view);
       view = view.findViewById(R.id.share_video_area);
       a.o(view, "dialog.popupView!!.findV¡­t>\(R.id.share_video_area\)");
       view.setEnabled(true);
       return;
    }
}
