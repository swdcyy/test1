package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$a;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import com.yxcorp.gifshow.entity.QPhoto;
import uo7.k;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import ixb.z;
import com.kwai.sharelib.exception.ForwardCancelException;
import java.lang.Exception;
import nsd.u;
import java.lang.Throwable;
import yic.g;

public final class ShareStyleSelectHelper$a implements PopupInterface$d	// class@001b99
{
    public final ShareStyleSelectHelper a;
    public final QPhoto b;
    public final k c;

    public void ShareStyleSelectHelper$a(ShareStyleSelectHelper p0,QPhoto p1,k p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(c p0,int p1){
       ShareStyleSelectHelper$a uoa = ShareStyleSelectHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       ShareStyleSelectHelper$a ta = this.a;
       if (ta.p == null) {
          ta.n = true;
          ShareStyleSelectHelper o = ta.o;
          if (o != null) {
             o.cancel();
          }
          ForwardCancelException uForwardCanc = new ForwardCancelException(null, null, null, 7, null);
          g.e(this.b, this.c, 2, v7);
          this.a.g("CANCEL_SHARE_WECHAT_TIMELINE");
       }
       return;
    }
}
