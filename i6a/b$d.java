package i6a.b$d;
import android.view.View$OnClickListener;
import i6a.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta$InterestLabel;
import qrd.l1;
import wkd.b;
import psb.c;
import com.google.gson.Gson;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import k2b.e0;
import android.widget.FrameLayout;
import java.lang.Iterable;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class b$d implements View$OnClickListener	// class@00278b
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       k b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$d.class, "1")) {
          return;
       }
       b$d tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       String str = "8";
       if (!PatchProxy.applyVoidWithListener(null, tb, uob, str)) {
          ArrayList uArrayList = new ArrayList();
          b v = tb.v;
          if (v == null) {
             a.S("mLabelList");
          }
          Iterator iterator1 = v.iterator();
          while (iterator1.hasNext()) {
             InterestLabelsMeta$InterestLabel interestLabe = iterator1.next();
             if (interestLabe.mIsSelected != null) {
                InterestLabelsMeta$InterestLabel interestLabe1 = new InterestLabelsMeta$InterestLabel();
                interestLabe1.mId = interestLabe.mId;
                interestLabe1.mWeight = interestLabe.mNextWeight;
                uArrayList.add(interestLabe1);
             }
          }
          tb.X7(b.a(0x1e7ef171).m(new Gson().q(uArrayList)).retry(1).map(new e()).subscribe(Functions.d(), Functions.d()));
          PatchProxy.onMethodExit(uob, str);
       }
       b z = this.b.z;
       if (z == null) {
          a.S("mSlidePlayViewModel");
       }
       z.L(true);
       b = k.b;
       QPhoto photo = b.P8(this.b).getPhoto();
       a.o(photo, "mDetailParam.photo");
       BaseFeed entity = photo.getEntity();
       a.o(entity, "mDetailParam.photo.entity");
       b.b(entity, b.R8(this.b), "PICK", Integer.valueOf(b.a()));
       int childCount = b.V8(this.b).getChildCount();
       Iterator iterator = b.S8(this.b).iterator();
       int i = 0;
       while (iterator.hasNext()) {
          if (iterator.next().mIsSelected != null) {
             i = i + 1;
          }
       }
       k b1 = k.b;
       QPhoto photo1 = b.P8(this.b).getPhoto();
       a.o(photo1, "mDetailParam.photo");
       BaseFeed entity1 = photo1.getEntity();
       a.o(entity1, "mDetailParam.photo.entity");
       b1.g(entity1, b.R8(this.b), childCount, i, Integer.valueOf(b1.a()), null);
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f105204));
       PatchProxy.onMethodExit(b$d.class, "1");
       return;
    }
}
