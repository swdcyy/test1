package i6a.f$b;
import d6a.a;
import i6a.f;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta$InterestEntity;
import java.lang.Integer;
import com.google.gson.JsonObject;
import java.lang.Number;
import qrd.l1;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.Math;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;

public final class f$b extends a	// class@002791
{
    public ArrayList b;
    public final f c;

    public void f$b(f p0){
       this.c = p0;
       super();
       this.b = new ArrayList();
    }
    public void F1(){
       int i2;
       if (PatchProxy.applyVoidWithListener(null, this, f$b.class, "2")) {
          return;
       }
       f f = this.c.F;
       if (f == null) {
          a.S("mSlidePlayViewModel");
       }
       int i = 1;
       if (f.z() == i) {
          LinkedList linkedList = new LinkedList();
          Iterator iterator = f.V8(this.c).iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             InterestManagementMeta$InterestEntity interestEnti = iterator.next();
             InterestManagementMeta$InterestEntity mUpdatedWeig = interestEnti.mUpdatedWeight;
             if (mUpdatedWeig == null) {
                mUpdatedWeig = Integer.valueOf(interestEnti.mWeight);
             }
             i2 = a.g(this.b.get(i1), mUpdatedWeig) ^ i;
             if (i2) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("option_name", interestEnti.mName);
                jsonObject.a0("adjust_before", this.b.get(i1));
                jsonObject.a0("adjust_after", mUpdatedWeig);
                linkedList.add(jsonObject);
             }
             i1 = i1 + 1;
          }
          if (linkedList.size() > 0) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f105204));
          }
          int i3 = Math.min(f.V8(this.c).size(), ((this.c.I + i) * 2));
          iterator = f.V8(this.c).iterator();
          i2 = 0;
          while (iterator.hasNext()) {
             InterestManagementMeta$InterestEntity interestEnti1 = iterator.next();
             InterestManagementMeta$InterestEntity mUpdatedWeig1 = interestEnti1.mUpdatedWeight;
             if (mUpdatedWeig1 == null) {
                mUpdatedWeig1 = Integer.valueOf(interestEnti1.mWeight);
             }
             if (mUpdatedWeig1 == null || mUpdatedWeig1.intValue()) {
                i2 = i2 + 1;
             }
          }
          BaseFeed baseFeed = f.R8(this.c).getBaseFeed();
          a.o(baseFeed, "mDetailParam.baseFeed");
          k.b.g(baseFeed, f.S8(this.c), i3, i2, null, linkedList);
       }
       PatchProxy.onMethodExit(f$b.class, "2");
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, f$b.class, "1")) {
          return;
       }
       k b = k.b;
       QPhoto photo = f.R8(this.c).getPhoto();
       a.o(photo, "mDetailParam.photo");
       BaseFeed entity = photo.getEntity();
       a.o(entity, "mDetailParam.photo.entity");
       b.c(entity, f.S8(this.c), objArray);
       QPhoto photo1 = f.R8(this.c).getPhoto();
       a.o(photo1, "mDetailParam.photo");
       BaseFeed entity1 = photo1.getEntity();
       a.o(entity1, "mDetailParam.photo.entity");
       b.e(entity1, f.S8(this.c), f.V8(this.c).subList(0, 2));
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = f.V8(this.c).iterator();
       while (iterator.hasNext()) {
          InterestManagementMeta$InterestEntity interestEnti = iterator.next();
          InterestManagementMeta$InterestEntity mUpdatedWeig = interestEnti.mUpdatedWeight;
          if (mUpdatedWeig == null) {
             mUpdatedWeig = Integer.valueOf(interestEnti.mWeight);
          }
          uArrayList.add(mUpdatedWeig);
       }
       this.b = uArrayList;
       this.c.I = 0;
       PatchProxy.onMethodExit(f$b.class, "1");
       return;
    }
}
