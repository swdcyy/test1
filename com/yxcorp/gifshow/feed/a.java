package com.yxcorp.gifshow.feed.a;
import com.kwai.component.feedstaggercard.a$b;
import ea5.d$b;
import java.lang.Object;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.ViewGroup;
import com.kwai.component.feedstaggercard.model.CardStyle;
import y8c.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.feed.h;
import android.content.Context;
import a1.a;
import ea5.d$d;
import ea5.d;
import zea.n;
import a1.a$e;
import zea.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.f;
import da5.e;
import java.lang.Integer;
import com.kuaishou.android.model.feed.PhotoType;
import da5.d;
import yta.h0;
import qua.b;
import ml8.c;
import e9c.g;
import zea.l;
import com.kwai.component.feedstaggercard.widget.HomeFeedCornerCardBackgroundView;
import yta.a0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class a implements a$b, d$b	// class@000fed
{

    public void a(){
       super();
    }
    public f a(PhotoItemViewParam p0,ViewGroup p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = a.i(p1, R.layout.arg_RES_7f0d093e);
       h.a(p2, view, p0);
       return this.c(p0, view, p2);
    }
    public void b(Context p0,CardStyle p1,PhotoItemViewParam p2,a p3,d$d p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       h.b(d.b(p0), p1, p2, p3, new n(this, p4, p2, p1));
       return;
    }
    public final f c(PhotoItemViewParam p0,View p1,CardStyle p2){
       PresenterV2 presenterV2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0.mEnableLowDeviceHolderPresenterAsync != null) {
          obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, m.class, "1");
          if (obj != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             obj = new f();
             new e(p0).a(p0, p1, p2, Integer.valueOf(p0.mPage), PhotoType.LIVESTREAM).c(presenterV2).b(presenterV2).a(obj).f(obj).e(obj);
             PresenterV2[] presenterV2A = new PresenterV2[]{obj};
             h0 oh0 = new h0(p1, presenterV2A);
             obj = new f(b.a(p1, p2, p0), presenterV2);
             presenterV2.U7(oh0);
             obj.c(oh0);
          }
          return obj;
       }else if(p0.mEnableHolderPresenterAsync != null){
          obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, l.class, "1");
          if (obj != patchProxyRe) {
          }else {
             presenterV2 = new PresenterV2();
             obj = new f();
             new e(p0).a(p0, p1, p2, Integer.valueOf(p0.mPage), PhotoType.LIVESTREAM).c(presenterV2).b(obj).a(obj).f(obj).e(obj);
             f uof = new f(HomeFeedCornerCardBackgroundView.a(p1, p2), presenterV2);
             a0 uoa0 = new a0(obj, uof.itemView);
             presenterV2.U7(uoa0);
             uof.c(uoa0);
             obj = uof;
          }
          return obj;
       }else {
          f uof1 = new f();
          new e(p0).a(p0, p1, p2, Integer.valueOf(p0.mPage), PhotoType.LIVESTREAM).c(uof1).b(uof1).a(uof1).f(uof1).e(uof1);
          return new f(HomeFeedCornerCardBackgroundView.a(p1, p2), uof1);
       }
    }
}
