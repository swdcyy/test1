package com.yxcorp.gifshow.album.dialog.AlbumInspirationGuideDialog$showDialog$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import y69.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y69.p;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.lang.Object;
import java.io.File;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import u07.t$a;
import android.app.Activity;
import u07.b;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import i2b.a;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import y69.b;
import u07.u;
import y69.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import y69.d;
import y69.e;
import y69.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class AlbumInspirationGuideDialog$showDialog$1 extends Lambda implements l	// class@0019d2
{
    public final GifshowActivity $activity;
    public final a $bubbleInfo;
    public final p $callback;
    public final PostBubbleManager$c $listener;
    public final a this$0;

    public void AlbumInspirationGuideDialog$showDialog$1(a p0,GifshowActivity p1,p p2,a p3,PostBubbleManager$c p4){
       this.this$0 = p0;
       this.$activity = p1;
       this.$callback = p2;
       this.$bubbleInfo = p3;
       this.$listener = p4;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(File p0){
       Object obj = this;
       String obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, AlbumInspirationGuideDialog$showDialog$1.class, "1")) {
          return;
       }
       a.p(obj1, "destFile");
       AlbumInspirationGuideDialog$showDialog$1 this$0 = obj.this$0;
       AlbumInspirationGuideDialog$showDialog$1 $activity = obj.$activity;
       obj1 = p0.getAbsolutePath();
       a.o(obj1, "destFile.absolutePath");
       AlbumInspirationGuideDialog$showDialog$1 $callback = obj.$callback;
       AlbumInspirationGuideDialog$showDialog$1 $bubbleInfo = obj.$bubbleInfo;
       AlbumInspirationGuideDialog$showDialog$1 $listener = obj.$listener;
       Objects.requireNonNull(this$0);
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport2(a.class, "9")) {
          Object[] objArray = new Object[]{$activity,obj1,$callback,$bubbleInfo,$listener};
          if (PatchProxy.applyVoid(objArray, this$0, a.class, "9")) {
          label_0139 :
             return;
          }
       }
       t$a uoa = b.a(new t$a($activity));
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       View view = PatchProxy.applyTwoRefs($activity, obj1, this$0, a.class, "12");
       if (view != patchProxyRe) {
       }else {
          view = a.a($activity, R.layout.arg_RES_7f0d00a9);
          a.o(view, "KwaiLayoutInflater.infla¡­inspiration_guide_dialog\)");
          View view1 = view.findViewById(R.id.album_inspiration_guide_anim_view);
          a.o(view1, "dialogView.findViewById\(¡­piration_guide_anim_view\)");
          b0 uob0 = BitmapUtil.E(obj1);
          if (new File(obj1).exists() && (uob0.a == null || uob0.b == null)) {
             obj1 = PatchProxy.apply(null, this$0, a.class, "8");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = this$0.a("placeholder");
             }
             Object[] objArray1 = new Object[i1];
             a.D().w("AlbumInspirationGuideDialog", "initGuideView: anim file can not access, use placeholder url:"+obj1, objArray1);
             if (obj1 != null) {
                view1.A(Uri.parse(obj1), a1.d(R.dimen.arg_RES_7f070090), a1.d(R.dimen.arg_RES_7f07008f));
             }
          }else {
             view1.x(new File(obj1), a1.d(R.dimen.arg_RES_7f070090), a1.d(R.dimen.arg_RES_7f07008f));
          }
       }
       uoa.H0(view);
       uoa.V0(true);
       uoa.s0(new b(this$0, $activity, $callback));
       uoa.J(new c(this$0, $activity, $callback));
       uoa.W0(R.string.arg_RES_7f100176);
       uoa.y0(R.string.arg_RES_7f103e5a);
       uoa.Q0(R.string.arg_RES_7f100174);
       uoa.t0(new d(this$0, $activity, $callback));
       uoa.S0(R.string.arg_RES_7f100175);
       uoa.u0(new e(this$0, $activity, $callback));
       uoa.Y(new f($listener, $bubbleInfo));
       PatchProxy.onMethodExit(a.class, "9");
       goto label_0139 ;
    }
}
