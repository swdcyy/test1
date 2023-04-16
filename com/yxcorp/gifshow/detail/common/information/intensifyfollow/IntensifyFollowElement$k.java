package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$k;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import dr7.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import m9a.t$c;
import ak5.j;
import bk5.c;
import android.graphics.Bitmap;
import qp7.x0;
import qp7.b;
import pp7.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import wb5.i;
import or7.w$a;
import qrd.l1;

public final class IntensifyFollowElement$k implements g	// class@001419
{
    public final IntensifyFollowElement b;

    public void IntensifyFollowElement$k(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElement$k.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          f0 uof0 = f0.class;
          if (!PatchProxy.applyVoid(null, p0, IntensifyFollowElement.class, "35")) {
             ArrayList uArrayList = new ArrayList();
             List list = p0.x0();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(j.o().k(iterator.next().a.a));
                }
             }
             f0 uof01 = p0.E();
             Objects.requireNonNull(uof01);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, uof01, uof0, "10")) {
                uof01.q.f(uArrayList);
             }
             p0 = p0.E();
             ImageRequest[] imageRequest = d.h(QCurrentUser.me(), HeadImageSize.SMALL);
             a.o(imageRequest, "ImageRequestFactory.buil¡­adImageSize.SMALL\n      \)");
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             Drawable uDrawable = i.b(qCurrentUser.getSex());
             a.o(uDrawable, "UserSexUtils.getAvatarDr¡­ll\(QCurrentUser.me\(\).sex\)");
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidTwoRefs(imageRequest, uDrawable, p0, uof0, "12")) {
                a.p(imageRequest, "imageRequests");
                a.p(uDrawable, "placeHolder");
                w$a uoa = new w$a();
                uoa.c(imageRequest);
                uoa.d(uDrawable);
                p0.p.f(uoa);
             }
          }
       }
       return;
    }
}
