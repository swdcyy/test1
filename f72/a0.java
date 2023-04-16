package f72.a0;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import wkd.b;
import l66.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import f72.z;
import android.view.View$OnLongClickListener;
import android.view.View;
import im8.f;
import java.lang.Integer;
import java.util.Set;
import android.view.animation.TranslateAnimation;
import l2.b;
import android.view.animation.Interpolator;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.animation.Animation;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import cda.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.i;
import java.util.List;
import java.util.Iterator;
import dda.i;
import m66.a;
import e72.p;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import k2b.u1;

public class a0 extends c	// class@0028bf
{
    public int p;
    public View q;
    public QPhoto r;
    public f s;
    public RecyclerFragment t;
    public LiveDoubleListParam u;
    public f v;
    public f w;
    public static String sLivePresenterClassName = "LiveDoubleListFeedReducePresenter";

    public void a0(){
       super();
       this.p = 88;
    }
    public void E8(){
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa0, "3")) {
          return;
       }
       u1.a(this);
       b.a(0x6d2a4fdd).a(this);
       if (QCurrentUser.ME.isLogined() && (r1.b3(this.r.mEntity) || r1.z2(this.r))) {
          if (!PatchProxy.applyVoid(objArray, this, uoa0, "5")) {
             this.q.setOnLongClickListener(objArray);
          }
       }else if(PatchProxy.applyVoid(objArray, this, uoa0, "6")){
          this.q.setOnLongClickListener(new z(this));
       }
       int i = this.s.get().intValue();
       a0 tv = this.v;
       if (tv == null || (tv.get() != null && this.w != null)) {
          Set set = this.v.get();
          if (!set.contains(Integer.valueOf(i))) {
             return;
          }else {
             TranslateAnimation translateAni = new TranslateAnimation(0, 0, (float)this.w.get().intValue(), 0);
             translateAni.setDuration(300);
             translateAni.setInterpolator(new b());
             this.m8().startAnimation(translateAni);
             set.remove(Integer.valueOf(i));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "4")) {
          return;
       }
       u1.b(this);
       b.a(0x6d2a4fdd).c(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1c45);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.x8("ADAPTER_POSITION");
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("LIVE_EXPLORE_PARAM");
       this.v = this.w8("ANIMATE_POSITION");
       this.w = this.w8("TRANSLATE_DISTANCE");
       return;
    }
    public void onEventMainThread(i p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa0, "9")) {
          return;
       }
       if (p0.e != null) {
          p0 = p0.a;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa0, "10") && (!TextUtils.x(p0) || this.t.q() == null)) {
             Iterator iterator = this.t.q().getItems().iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                if (p0.equals(qPhoto.getPhotoId())) {
                   this.t.q().remove(qPhoto);
                   break ;
                }
             }
          }
       }
       return;
    }
    public void onNegative(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "8")) {
          return;
       }
       if (!TextUtils.n(this.r.mEntity.getId(), p0.a.getId())) {
          return;
       }
       a a = p0.a;
       p0 = p0.d;
       a0 tt = this.t;
       if (PatchProxy.applyVoidThreeRefs(a, p0, tt, null, p.class, "2") || (a != null && a instanceof LiveStreamFeed)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "NEGATIVE_DIALOG_ITEM";
          HashMap hashMap = new HashMap();
          if (TextUtils.n(p0, "4")) {
             hashMap.put("negative_type", "reduce_author");
          }else if(TextUtils.n(p0, "6")){
             hashMap.put("negative_type", "reduce_live");
          }
          uElementPack.params = new Gson().q(hashMap);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = p.a(a);
          u1.L("", tt, 1, uElementPack, uContentPack);
       }
    label_0089 :
       return;
    }
}
