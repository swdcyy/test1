package com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoV2Item;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$b;
import androidx.lifecycle.LifecycleOwner;
import or5.d;
import xa3.a;
import pg1.e;
import sc3.a;
import xp5.i;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoV2Item$viewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoV2Item$1;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ha1.b;
import s83.z;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel;
import com.kwai.framework.model.user.User;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lu7.f;
import d61.f0;
import java.lang.CharSequence;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.widget.ImageView;
import d61.i0;
import s83.m;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import s83.n;
import android.view.View$OnClickListener;
import s83.o;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import androidx.lifecycle.Transformations;
import s83.q;
import o83.j;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a;

public final class LiteAnchorInfoV2Item implements LiveLiteAnchorInfoAreaService$b	// class@001e66
{
    public final p a;
    public z b;
    public final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2 c;
    public final LifecycleOwner d;
    public final d e;
    public final a f;
    public final e g;
    public final a h;
    public final i i;

    public void LiteAnchorInfoV2Item(LifecycleOwner p0,d p1,a p2,e p3,a p4,i p5,l p6){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "infoService");
       a.p(p2, "fansGroupService");
       a.p(p3, "followManager");
       a.p(p5, "logPackageProvider");
       a.p(p6, "anchorInfoAreaClickableRectSupplierSetter");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.a = s.c(new LiteAnchorInfoV2Item$viewModel$2(this));
       this.c = LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.AnchorInfo;
       p6.invoke(new LiteAnchorInfoV2Item$1(this));
    }
    public View a(Context p0){
       z oz;
       LiteAnchorInfoV2Item liteAnchorIn = LiteAnchorInfoV2Item.class;
       LiteAnchorInfoV2Item obj = PatchProxy.applyOneRefs(p0, this, liteAnchorIn, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = this.b;
       if (obj == null) {
          View view = b.b(p0, R.layout.arg_RES_7f0d0971);
          a.o(view, "rootView");
          oz = new z(view);
          LiteAnchorInfoViewModel liteAnchorIn1 = this.c();
          if (!PatchProxy.applyVoidTwoRefs(oz, liteAnchorIn1, this, liteAnchorIn, "3")) {
             User user = liteAnchorIn1.e();
             if (!PatchProxy.applyVoidTwoRefs(oz, user, this, liteAnchorIn, "15")) {
                b uob = new b();
                uob.v(a1.a(R.color.arg_RES_7f060846));
                KwaiRadiusStyles fULL = KwaiRadiusStyles.FULL;
                uob.g(fULL);
                oz.h().setBackground(uob.a());
                uob = new b();
                uob.g(fULL);
                uob.v(a1.a(R.color.arg_RES_7f0604d9));
                uob.p(a1.a(R.color.arg_RES_7f0604c6), a1.a(R.color.arg_RES_7f0604d9));
                oz.d().setBackground(uob.a());
                uob = new b();
                uob.g(fULL);
                uob.v(a1.a(R.color.arg_RES_7f0620c7));
                uob.p(a1.a(R.color.arg_RES_7f0620e9), a1.a(R.color.arg_RES_7f0620c7));
                oz.c().setBackground(uob.a());
                oz.a.U(user.mAvatars);
                oz.c.setText(f0.a(f.a(user), 6));
                i0.a(user.mVerifiedDetail, oz.b, true);
             }
             LiteAnchorInfoViewModel h = liteAnchorIn1.h;
             if (!PatchProxy.applyVoidTwoRefs(oz, h, this, liteAnchorIn, "4")) {
                h.observe(this.d, new m(this, oz));
             }
             oz.h().setOnClickListener(new n(liteAnchorIn1));
             liteAnchorIn1.f.observe(this.d, new o(this, oz, liteAnchorIn1));
             LiveData liveData = Transformations.distinctUntilChanged(liteAnchorIn1.d);
             a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
             liveData.observe(this.d, new q(this, liteAnchorIn1, oz));
          }
          this.b = oz;
       }
       return oz.h();
    }
    public int b(){
       return j.a(this);
    }
    public final LiteAnchorInfoViewModel c(){
       Object obj = PatchProxy.apply(null, this, LiteAnchorInfoV2Item.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void d(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteAnchorInfoV2Item.class, "14")) {
          return;
       }
       p0.d().setVisibility(4);
       return;
    }
    public final void e(z p0,boolean p1){
       LiteAnchorInfoV2Item liteAnchorIn = LiteAnchorInfoV2Item.class;
       if (PatchProxy.isSupport(liteAnchorIn) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liteAnchorIn, "5")) {
          return;
       }
       KwaiImageView kwaiImageVie = p0.f();
       int i = 0;
       int i1 = (p1)? 0: 8;
       kwaiImageVie.setVisibility(i1);
       p0 = p0.f;
       if (p1) {
          i = 8;
       }
       p0.setVisibility(i);
       return;
    }
    public LiveLiteAnchorInfoAreaService$a getBizId(){
       return this.c;
    }
    public void onAttach(){
       j.b(this);
    }
    public void onDetach(){
       j.c(this);
    }
}
