package fva.s$a;
import com.yxcorp.gifshow.widget.m;
import fva.s;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.util.Collection;
import java.util.List;
import fva.r;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import fva.k;
import k2b.e0;

public final class s$a extends m	// class@002a2a
{
    public final s c;

    public void s$a(s p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Activity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       s$a uoa = 1;
       if (s.P8(this.c).mHotWordType == uoa && (!TextUtils.x(s.P8(this.c).mLinkUrl) && this.c.getActivity() != null)) {
          activity = this.c.getActivity();
          a.m(activity);
          c.i(this.c.getActivity(), KwaiYodaWebViewActivity.G3(activity, s.P8(this.c).mLinkUrl).a());
       }else {
          ArrayList uArrayList = new ArrayList();
          HotSpotModel hotSpotModel = this.c.R8();
          a.m(hotSpotModel);
          hotSpotModel = hotSpotModel.mHotSpotItems;
          if (hotSpotModel != null && !hotSpotModel.isEmpty()) {
             uoa = null;
          }
          if (uoa == null) {
             int i = this.c.R8().mHotSpotItems.size();
             for (HotSpotItem mPosition = s.P8(this.c).mPosition; mPosition < i; mPosition++) {
                uArrayList.add(this.c.R8().mHotSpotItems.get(mPosition).mWordId);
             }
          }
          Activity activity1 = this.c.getActivity();
          a.m(activity1);
          a.o(activity1, "activity!!");
          r.a.b(s.P8(this.c), activity1, 1, uArrayList, this.c.S8());
       }
       k.a.c(s.P8(this.c), this.c.S8());
       return;
    }
}
