package a9a.c;
import me5.a$a;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import yqb.b$a;
import yqb.b;
import yqb.k;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kwai.framework.model.feed.BaseFeed;
import ida.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mxb.j0;
import mxb.i0;
import a9a.a;
import erd.g;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import os5.l;
import a9a.b;

public class c implements a$a	// class@000079
{
    public int a;

    public void c(int p0){
       super();
       this.a = p0;
    }
    public void a(Activity p0,QPhoto p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, c.class, "1")) {
          return;
       }
       if (!p0 instanceof GifshowActivity) {
          return;
       }
       if (p1.getLivePlayConfig() == null) {
          ExceptionHandler.handleCaughtException(new IllegalArgumentException("live getLivePlayConfig null"));
          return;
       }else if(p2){
          this.b(p0, p1, p3);
          return;
       }else {
          c ta = this.a;
          b$a uoa = 8;
          int i = (ta == uoa)? 22: 24;
          int i1 = (ta == uoa)? 2: 3;
          uoa = new b$a();
          uoa.e(p1);
          uoa.b(p0);
          uoa.f(p1.getPosition());
          int i2 = (p3)? 286: 226;
          uoa.d(i2);
          d.a(-1638991736).Tq(p1.mEntity);
          d.a(0x2e315ea8).su(uoa.a(), new k(i1, i));
          if (k.B(p1) != null && (p1.mEntity != null && TextUtils.n(p1.getUserId(), p1.getUserId()))) {
             i0.a().e(124, p1.mEntity).d(new a(p1)).a();
          }
       label_00bb :
          return;
       }
    }
    public final void b(Activity p0,QPhoto p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "2")) {
          return;
       }
       d.a(-1638991736).Tq(p1.mEntity);
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p1.mEntity);
       int i = (p2)? 286: 226;
       uoa.g(i);
       uoa.d(p1.getPosition());
       d.a(-1492894991).m1(p0, uoa.a());
       if (k.B(p1) != null && (p1.mEntity != null && TextUtils.n(p1.getUserId(), p1.getUserId()))) {
          i0.a().e(124, p1.mEntity).d(new b(p1)).a();
       }
    label_0085 :
       return;
    }
}
