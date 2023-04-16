package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$createDanmakuLaunchParams$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import android.view.ViewGroup;
import sd5.d;
import sd5.c;
import kotlin.jvm.internal.a;
import uc6.c;
import im8.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class DanmakuElement$createDanmakuLaunchParams$1 extends Lambda implements a	// class@0013d9
{
    public final DanmakuElement this$0;

    public void DanmakuElement$createDanmakuLaunchParams$1(DanmakuElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       View obj = PatchProxy.apply(null, this, DanmakuElement$createDanmakuLaunchParams$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = DanmakuElement.n0(this.this$0).getView();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       d uod = c.a(obj);
       DanmakuElement$createDanmakuLaunchParams$1 tthis$0 = this.this$0;
       DanmakuElement n = tthis$0.N;
       DanmakuElement b = tthis$0.B;
       if (b == null) {
          a.S("mDetailParam");
       }
       Objects.requireNonNull(uod);
       c uoc = PatchProxy.applyTwoRefs(n, b, uod, d.class, "2");
       if (uoc != patchProxyRe) {
       }else {
          uoc = uod.O(n, b);
       }
       view = uoc.m();
       a.o(view, "ContentFrameExitSwipeAni¡­ilParam\).tempUseGetView\(\)");
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
