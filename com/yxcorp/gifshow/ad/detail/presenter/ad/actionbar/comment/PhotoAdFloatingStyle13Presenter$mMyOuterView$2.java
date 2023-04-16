package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.PhotoAdFloatingStyle13Presenter$mMyOuterView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.PhotoAdFloatingStyle13Presenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.ViewStub;

public final class PhotoAdFloatingStyle13Presenter$mMyOuterView$2 extends Lambda implements a	// class@00155d
{
    public final PhotoAdFloatingStyle13Presenter this$0;

    public void PhotoAdFloatingStyle13Presenter$mMyOuterView$2(PhotoAdFloatingStyle13Presenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       PhotoAdFloatingStyle13Presenter obj = PatchProxy.apply(null, this, PhotoAdFloatingStyle13Presenter$mMyOuterView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.s;
       if (obj == null) {
          a.S("mMyViewStub");
       }
       return obj.inflate();
    }
    public Object invoke(){
       return this.invoke();
    }
}
