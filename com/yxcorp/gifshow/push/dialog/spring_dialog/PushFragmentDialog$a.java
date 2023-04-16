package com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.android.library.image.interfaces.IConfig;
import w7.c;
import lnc.a1;
import com.facebook.drawee.generic.RoundingParams;
import w7.d;
import xb.t$b;
import uc.d;
import kotlin.jvm.internal.a;
import x7.b;
import x7.c;
import x7.a;
import java.lang.Exception;

public final class PushFragmentDialog$a implements Runnable	// class@001640
{
    public final PushFragmentDialog b;
    public final int c;
    public final int d;
    public final String e;

    public void PushFragmentDialog$a(PushFragmentDialog p0,int p1,int p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PushFragmentDialog$a.class, "1")) {
          return;
       }
       try{
          int i = (PushFragmentDialog.ah(this.b).getMeasuredWidth() * this.c) / this.d;
          ViewGroup$LayoutParams layoutParams = PushFragmentDialog.ah(this.b).getLayoutParams();
          layoutParams.height = (layoutParams != null)? i: new LinearLayout$LayoutParams(-1, i);
          PushFragmentDialog.ah(this.b).setLayoutParams(layoutParams);
          IConfig iConfig = c.b(PushFragmentDialog.ah(this.b));
          iConfig.v(RoundingParams.c((float)a1.e(14.00f)));
          iConfig.j(t$b.e);
          iConfig.k(new d(PushFragmentDialog.ah(this.b).getMeasuredWidth(), i));
          PushFragmentDialog$a te = this.e;
          a.m(te);
          iConfig.load(te).b();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
