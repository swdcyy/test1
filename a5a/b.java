package a5a.b;
import erd.g;
import a5a.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import fe5.j;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.m3;
import android.app.Activity;
import lnc.b5;
import lnc.l1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;

public final class b implements g	// class@000035
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.booleanValue();
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || (PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uoc, "5") || (!tb.V8() || (tb.r.getPhoto() == null || (tb.r.getPhoto().isVideoAndNotKtv() && (PatchProxy.applyVoid(null, tb, uoc, "6") || (m3.d(tb.getContext(), tb.r.mPhoto) && tb.p != null))))))) {
          int i = 0;
          if (b5.a(tb.getActivity()) || l1.a()) {
             tb.p.setVisibility(8);
             b.topMargin = i;
          }else {
             tb.p.setVisibility(i);
             b.topMargin = - a1.d(0x7f07041d);
          }
          tb.q.requestLayout();
       }
    label_0098 :
       return;
    }
}
