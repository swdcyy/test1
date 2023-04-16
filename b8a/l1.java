package b8a.l1;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;
import lnc.d6;
import com.yxcorp.gifshow.activity.GifshowActivity;
import um6.j;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.f0;
import t45.d;
import brd.z;
import b8a.l1$a;
import b8a.l1$b;
import erd.g;
import crd.b;
import pkd.a;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import um6.b;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import um6.h;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import yxa.b;
import b8a.l1$c;
import b8a.l1$d;
import b8a.l1$e;
import b8a.l1$f;

public final class l1	// class@0003c4
{
    public static final l1 a;

    static {
       l1.a = new l1();
    }
    public void l1(){
       super();
    }
    public static final boolean a(Activity p0,QPhoto p1){
       Music obj = PatchProxy.applyTwoRefs(p0, p1, null, l1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       a.p(p1, "photo");
       obj = d6.c(p1);
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (!p0 instanceof GifshowActivity) {
          return b;
       }
       y6.s(j.class, LoadPolicy.DIALOG).g(p0.E2(ActivityEvent.DESTROY)).G(d.a).R(new l1$a(p0, obj, p1), l1$b.b);
       return true;
    }
    public static final boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       boolean b = (!a.g && b.a(p0.isChorus(), p0.getKaraokeChorusModel()))? true: false;
       return b;
    }
    public static final boolean c(QPhoto p0){
       PhotoMeta obj = PatchProxy.applyOneRefs(p0, null, l1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       boolean b = true;
       if (d6.c(p0) != null && p0.getPhotoMeta() != null) {
          obj = p0.getPhotoMeta();
          if (obj != null && (obj.mHasMusicTag == b && (b.b(r1.r1(p0.mEntity)) && r1.M2(p0.mEntity)))) {
          label_0046 :
             return b;
          }
       }
    label_0045 :
       b = false;
       goto label_0046 ;
    }
    public static final boolean d(Activity p0,QPhoto p1,boolean p2){
       QCurrentUser obj;
       h oh = h.class;
       if (PatchProxy.isSupport(l1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, l1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       a.p(p1, "photo");
       if (!p0 instanceof GifshowActivity) {
          return false;
       }else {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (!obj.isLogined()) {
             d.a(-1712118428).ne(p0, p0.getUrl(), "", 68, "", null, null, null, null).h();
             return false;
          }else if(p2){
             b.r(oh, LoadPolicy.DIALOG).g(p0.E2(ActivityEvent.DESTROY)).G(d.a).R(new l1$c(p0, p1), l1$d.b);
          }else {
             b.r(oh, LoadPolicy.DIALOG).g(p0.E2(ActivityEvent.DESTROY)).R(new l1$e(p0, p1), l1$f.b);
          }
          return true;
       }
    }
}
