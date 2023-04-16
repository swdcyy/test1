package com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindBlurAvatar$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import zu2.b;
import java.util.List;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import zu2.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import jd.c;

public final class KwaiImageViewBinderKt$bindBlurAvatar$1 extends Lambda implements l	// class@00188e
{
    public static final KwaiImageViewBinderKt$bindBlurAvatar$1 INSTANCE;

    static {
       KwaiImageViewBinderKt$bindBlurAvatar$1.INSTANCE = new KwaiImageViewBinderKt$bindBlurAvatar$1();
    }
    public void KwaiImageViewBinderKt$bindBlurAvatar$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final List invoke(b p0){
       List list1;
       KwaiImageViewBinderKt kwaiImageVie = KwaiImageViewBinderKt.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ImageRequestBuilder obj = PatchProxy.applyOneRefs(p0, this, KwaiImageViewBinderKt$bindBlurAvatar$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.m(p0);
       CDNUrl[] uCDNUrlArray = p0.b();
       obj = null;
       List list = PatchProxy.applyOneRefs(uCDNUrlArray, obj, kwaiImageVie, "3");
       if (list != patchProxyRe) {
       }else if(uCDNUrlArray != null){
          ImageRequest[] imageRequest = d.b(uCDNUrlArray);
          a.o(imageRequest, "ImageRequestFactory.build\(this\)");
          list1 = ArraysKt___ArraysKt.uy(imageRequest);
       }else {
          list1 = CollectionsKt__CollectionsKt.E();
       }
       list = list1;
       ArrayList uArrayList = PatchProxy.applyOneRefs(list, obj, kwaiImageVie, "2");
       if (uArrayList != patchProxyRe) {
       }else {
          a.p(list, "$this$blur");
          c uoc = new c(0xff000000, 100);
          ArrayList uArrayList1 = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             obj = ImageRequestBuilder.d(iterator.next());
             obj.r(uoc);
             uArrayList1.add(obj.a());
          }
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
}
