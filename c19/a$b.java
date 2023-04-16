package c19.a$b;
import qvb.q;
import c19.a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import tw.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import yx.j0;
import c19.b;
import java.lang.Runnable;
import t45.c;
import java.lang.StringBuilder;
import java.lang.Long;

public final class a$b implements q	// class@0004bf
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       Iterator iterator;
       Object[] objArray;
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       p.b(this, p0, p1);
       a$b tb = this.b;
       HomeFeedResponse obj = tb.P8();
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(obj, tb, uoa, "3") && obj instanceof HomeFeedResponse) {
          ArrayList uArrayList = new ArrayList();
          obj = obj.mQPhotos;
          String str = 1;
          if (obj != null) {
             iterator = obj.iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                PhotoAdvertisement photoAdverti = k.B(qPhoto);
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                   if (adData != null && (adData.mIsOrderedApp == str && j.D(qPhoto))) {
                      uArrayList.add(qPhoto);
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, tb, uoa, "4")) {
             Activity activity = tb.getActivity();
             if (activity != null) {
                a.o(activity, "activity ?: return");
                if (!uArrayList.isEmpty()) {
                   if (!PermissionUtils.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                      objArray = new Object[0];
                      j0.f("AdBaseOrderedAppPresenter", "has no WRITE_EXTERNAL_STORAGE permission", objArray);
                   }else {
                      c.a(new b(tb, uArrayList, activity));
                   }
                }
             }
          }
          if (uArrayList.size() > str && !PatchProxy.applyVoidOneRefs(uArrayList, tb, uoa, "6")) {
             StringBuilder str1 = "";
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                StringBuilder str2 = "creativeId: ";
                PhotoAdvertisement photoAdverti1 = k.B(iterator.next());
                Long longx = (photoAdverti1 != null)? Long.valueOf(photoAdverti1.mCreativeId): null;
                str1 = str1+str2+longx;
             }
             objArray = new Object[0];
             j0.l("AdBaseOrderedAppPresenter", "has more than one ordered app£º"+str1, objArray);
          }
       }
    label_0100 :
       return;
    }
}
