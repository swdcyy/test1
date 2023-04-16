package com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import msd.p;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindAvatar$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindAvatar$2;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$bindAvatar$3;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$a;
import androidx.lifecycle.Observer;

public final class KwaiImageViewBinderKt	// class@001890
{

    public static void a(KwaiBindableImageView p0,LifecycleOwner p1,LiveData p2,p p3,int p4,Object p5){
       KwaiImageViewBinderKt$bindAvatar$1 iNSTANCE = (p4 & 0x04)? KwaiImageViewBinderKt$bindAvatar$1.INSTANCE: 0;
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, iNSTANCE, null, KwaiImageViewBinderKt.class, "5")) {
          a.p(p0, "$this$bindAvatar");
          a.p(p1, "lifecycleOwner");
          a.p(p2, "liveData");
          KwaiImageViewBinderKt.b(p0, p1, p2, KwaiImageViewBinderKt$bindAvatar$2.INSTANCE, KwaiImageViewBinderKt$bindAvatar$3.INSTANCE, iNSTANCE);
       }
       return;
    }
    public static final void b(KwaiBindableImageView p0,LifecycleOwner p1,LiveData p2,l p3,l p4,p p5){
       KwaiImageViewBinderKt kwaiImageVie = KwaiImageViewBinderKt.class;
       if (PatchProxy.isSupport(kwaiImageVie)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, kwaiImageVie, "4")) {
             return;
          }
       }
       a.p(p0, "$this$bindRequests");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "liveData");
       a.p(p3, "map");
       a.p(p4, "placeholderMap");
       p2.observe(p1, new KwaiImageViewBinderKt$a(p0, p4, p3, p5));
       return;
    }
}
