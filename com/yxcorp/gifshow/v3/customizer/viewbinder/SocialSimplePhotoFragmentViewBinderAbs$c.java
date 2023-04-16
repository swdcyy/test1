package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$c;
import nwc.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import kotlin.Triple;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import tkd.b;
import tkd.d;
import v26.a;
import android.content.Intent;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.SimpleEditParam;
import kotlin.jvm.internal.a;
import com.kuaishou.android.post.PostPageArg;
import kotlin.Pair;
import v26.b;

public final class SocialSimplePhotoFragmentViewBinderAbs$c implements a	// class@000d77
{
    public final SocialSimplePhotoFragmentViewBinderAbs b;

    public void SocialSimplePhotoFragmentViewBinderAbs$c(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.b = p0;
       super();
    }
    public final EditorFragmentBackPressedResult onBackPressed(){
       Triple obj = PatchProxy.apply(null, this, SocialSimplePhotoFragmentViewBinderAbs$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "onBackPressed", objArray);
       obj = SocialSimpleEditorActivityViewBinder.K.b(SocialSimplePhotoFragmentViewBinderAbs.t0(this.b));
       if (obj == null) {
          return EditorFragmentBackPressedResult.PASS_EVENT;
       }
       SimpleEditParam dEFAULT = SimpleEditParam.DEFAULT;
       a.o(dEFAULT, "DEFAULT");
       d.a(-1846373150).G8(SocialSimplePhotoFragmentViewBinderAbs.t0(this.b), SocialSimplePhotoFragmentViewBinderAbs.t0(this.b).getIntent().getStringExtra("photo_task_id"), i.g().getSimpleEditParam().get(dEFAULT).mSubBiz, 1, obj.getFirst().getSecond(), null);
       return EditorFragmentBackPressedResult.INTERCEPT_EVENT;
    }
}
