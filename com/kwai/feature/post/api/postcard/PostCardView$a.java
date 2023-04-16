package com.kwai.feature.post.api.postcard.PostCardView$a;
import k46.b$a;
import com.kwai.feature.post.api.postcard.PostCardView;
import java.lang.Object;
import k46.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import lnc.p3;
import q87.c;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import om6.d;
import brd.a0;
import k46.h;
import k46.i;
import erd.g;
import crd.b;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import k46.f;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class PostCardView$a implements b$a	// class@00141f
{
    public final PostCardView a;

    public void PostCardView$a(PostCardView p0){
       this.a = p0;
       super();
    }
    public void a(g p0){
       GifshowActivity activity;
       int i1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, PostCardView$a.class, str)) {
          return;
       }
       a.p(p0, "item");
       String str1 = "PostCardView";
       int i = 0;
       if (p0.d() == 4) {
          PostCardView$a ta = this.a;
          activity = ta.getActivity();
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(activity, ta, PostCardView.class, "7")) {
             Object[] objArray = new Object[i];
             p3.D().w(str1, "goToDraftBox", objArray);
             y6.s(d.class, LoadPolicy.DIALOG).R(new h(activity), i.b);
          }
          i1 = 3;
       }else {
          g h = p0.h;
          if (h != null) {
             PostCardView$a ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(h, ta1, PostCardView.class, "8")) {
                Object[] objArray1 = new Object[i];
                p3.D().w(str1, "jumpWithScheme", objArray1);
                Intent intent = new Intent();
                intent.setData(w0.f(h));
                ta1.i.startActivity(intent);
             }
          }
          i1 = p0.c();
       }
       activity = this.a.getActivity();
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(activity, Integer.valueOf(i1), null, uof, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MATERIAL_CARD";
          uElementPack.params = f.a(i1).e();
          u1.L("", activity, 1, uElementPack, null);
       }
       return;
    }
}
