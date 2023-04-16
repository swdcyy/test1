package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$listener$1$onError$1;
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
import android.view.View;
import android.app.Activity;
import uo7.k;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;

public final class ShareStyleSelectHelper$listener$1$onError$1 extends Lambda implements a	// class@001ba3
{
    public final ShareStyleSelectHelper$listener$1 this$0;

    public void ShareStyleSelectHelper$listener$1$onError$1(ShareStyleSelectHelper$listener$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareStyleSelectHelper$listener$1$onError$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper$listener$1 a = this.this$0.a;
       a.m = true;
       ShareStyleSelectHelper.e(a).setVisibility(8);
       Drawable drawable = this.this$0.b.k().getResources().getDrawable(R.drawable.arg_RES_7f0824f0);
       if (drawable != null) {
          drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
          ShareStyleSelectHelper.f(this.this$0.a).setCompoundDrawables(drawable, objArray, objArray, objArray);
       }
       ShareStyleSelectHelper.f(this.this$0.a).setText(this.this$0.b.k().getResources().getString(R.string.arg_RES_7f100a83));
       View view = this.this$0.a.q.z();
       a.m(view);
       view = view.findViewById(R.id.share_video_area);
       a.o(view, "dialog.popupView!!.findV¡­t>\(R.id.share_video_area\)");
       view.setEnabled(true);
       return;
    }
}
