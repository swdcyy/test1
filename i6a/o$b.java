package i6a.o$b;
import d6a.a;
import i6a.o;
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
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
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

public final class o$b extends a	// class@0027a1
{
    public ArrayList b;
    public final o c;

    public void o$b(o p0){
       this.c = p0;
       super();
       this.b = new ArrayList();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, o$b.class, "2")) {
          return;
       }
       o z = this.c.z;
       if (z == null) {
          a.S("mSlidePlayViewModel");
       }
       if (z.z() == 1) {
          LinkedList linkedList = new LinkedList();
          int i = 0;
          Iterator iterator = o.S8(this.c).iterator();
          while (iterator.hasNext()) {
             InterestManagementV3Meta$InterestV3Entity interestV3En = iterator.next();
             InterestManagementV3Meta$InterestV3Entity mUpdatedWeig = interestV3En.mUpdatedWeight;
             if (mUpdatedWeig == null) {
                mUpdatedWeig = Integer.valueOf(interestV3En.mWeight);
             }
             int i1 = a.g(this.b.get(i), mUpdatedWeig) ^ 1;
             if (i1) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("option_name", interestV3En.mName);
                jsonObject.a0("adjust_before", this.b.get(i));
                jsonObject.a0("adjust_after", mUpdatedWeig);
                linkedList.add(jsonObject);
             }
             i = i + 1;
          }
          if (linkedList.size() > 0) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f105204));
          }
          o$b tc = this.c;
          BaseFeed baseFeed = o.P8(this.c).getBaseFeed();
          a.o(baseFeed, "mDetailParam.baseFeed");
          k.b.g(baseFeed, o.R8(this.c), Math.min(o.S8(this.c).size(), (tc.A * (tc.D + 1))), linkedList.size(), Integer.valueOf(2), linkedList);
       }
       PatchProxy.onMethodExit(o$b.class, "2");
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, o$b.class, "1")) {
          return;
       }
       k b = k.b;
       QPhoto photo = o.P8(this.c).getPhoto();
       a.o(photo, "mDetailParam.photo");
       BaseFeed entity = photo.getEntity();
       a.o(entity, "mDetailParam.photo.entity");
       b.c(entity, o.R8(this.c), Integer.valueOf(2));
       photo = o.P8(this.c).getPhoto();
       a.o(photo, "mDetailParam.photo");
       entity = photo.getEntity();
       a.o(entity, "mDetailParam.photo.entity");
       o$b tc = this.c;
       b.f(entity, o.R8(this.c), o.S8(this.c).subList(tc.B, tc.C));
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = o.S8(this.c).iterator();
       while (iterator.hasNext()) {
          InterestManagementV3Meta$InterestV3Entity interestV3En = iterator.next();
          InterestManagementV3Meta$InterestV3Entity mUpdatedWeig = interestV3En.mUpdatedWeight;
          if (mUpdatedWeig == null) {
             mUpdatedWeig = Integer.valueOf(interestV3En.mWeight);
          }
          uArrayList.add(mUpdatedWeig);
       }
       this.b = uArrayList;
       this.c.D = 0;
       PatchProxy.onMethodExit(o$b.class, "1");
       return;
    }
}
