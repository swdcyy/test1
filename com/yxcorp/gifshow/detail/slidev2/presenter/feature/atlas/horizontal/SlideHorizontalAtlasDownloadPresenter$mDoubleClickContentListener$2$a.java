package com.yxcorp.gifshow.detail.slidev2.presenter.feature.atlas.horizontal.SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2$a;
import vd5.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.atlas.horizontal.SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.atlas.horizontal.SlideHorizontalAtlasDownloadPresenter;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import e8a.t;
import vd5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2$a implements c	// class@001938
{
    public final SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2 a;

    public void SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2$a(SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2 p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0){
       return false;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2 this$0 = this.a.this$0;
       SlideHorizontalAtlasDownloadPresenter s = this$0.s;
       if (s == null) {
          a.S("mPhotosPagerView");
       }
       this$0.P8(s.getCurrentPosition());
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       return b.b(this, p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "ev");
       return false;
    }
}
