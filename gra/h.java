package gra.h;
import gra.z;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gra.h$a;
import io.reactivex.g;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.CharSequence;
import gra.h$b;
import android.view.View$OnClickListener;
import android.app.Activity;
import wkd.b;
import yma.a;
import yma.b;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import nsd.u;
import mhc.m2;
import uo7.b0;
import uo7.l;
import java.util.Objects;
import com.google.gson.JsonObject;
import mhc.o2;
import uo7.k;
import com.kwai.sharelib.a;
import gra.h$c;
import uo7.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public abstract class h extends KPresenterV2 implements z	// class@002bb3
{
    public c q;

    public void h(){
       super();
    }
    public final t W8(){
       t obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.create(new h$a(this));
       a.o(obj, "Observable\n        .crea¡­  }\n          }\n        }");
       return obj;
    }
    public final c X8(){
       return this.q;
    }
    public void Y8(View p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
          return;
       }
       a.p(p0, "view");
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.btn_bg);
       TextView textView = p0.findViewById(R.id.btn);
       if (kwaiImageVie != null) {
          kwaiImageVie.setImageURI(p2);
       }
       if (textView != null) {
          textView.setText(p1);
       }
       if (textView != null) {
          textView.setOnClickListener(new h$b(this));
       }
       return;
    }
    public final void Z8(String p0,String p1,String p2,Activity p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, h.class, "4")) {
          return;
       }
       a.p(p0, "subBiz");
       a.p(p2, "ext");
       Object obj = b.a(-1257347683);
       a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
       obj.b().l(p0, p1).subscribe();
       if (p1 != null && p3 instanceof GifshowActivity) {
          KsShareBuilder ksShareBuild = new KsShareBuilder(p3, p0, p1, null, null, 24, null);
          KsShareBuilder ksShareBuild1 = obj.g(new m2()).y(p2);
          Objects.requireNonNull(ksShareBuild1);
          p1 = PatchProxy.applyOneRefs(p2, ksShareBuild1, KsShareBuilder.class, "9");
          if (p1 != PatchProxyResult.class) {
             ksShareBuild1 = p1;
          }else {
             a.p(p2, "param");
             JsonObject jsonObject = o2.l(p2);
             if (jsonObject != null) {
                ksShareBuild1.l = jsonObject;
             }
          }
          new a(ksShareBuild1.a(), new h$c(this)).l();
       }
       return;
    }
    public void j6(){
       PatchProxy.applyVoid(null, this, h.class, "5");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.q = this.t8("GROWTH_VFC_DIALOG");
       return;
    }
}
