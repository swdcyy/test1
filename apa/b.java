package apa.b;
import qn.f;
import apa.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.t;
import brd.t;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import apa.c;
import erd.g;
import crd.b;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import apa.d;
import k2b.s1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import wt5.g;
import au5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import au5.c;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.StringBuilder;
import vsd.d;
import nsd.m0;
import q87.c;
import android.content.Intent;
import android.net.Uri;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import gx5.d;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.k2;
import k2b.u1;

public final class b implements f	// class@00029f
{
    public String a;
    public String b;
    public static final b$a c;

    static {
       b.c = new b$a(null);
    }
    public void b(){
       b uob = b.class;
       super();
       this.a = "";
       this.b = "";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "6")) {
       }else {
          RxBus.f.f(t.class).subscribeOn(b.c()).observeOn(a.c()).subscribe(new c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          b.a(0x4b316083).T0(new d(this));
       }
       return;
    }
    public boolean a(){
       boolean b;
       ActivityContext obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       Activity uActivity = obj.e();
       b = false;
       if (uActivity != null) {
          QPhoto qPhoto = b.e().d(uActivity);
          if (qPhoto != null) {
             BaseFeed entity = qPhoto.getEntity();
             if (entity != null) {
                b = c.a(entity);
             }
          }
       }
       return b;
    }
    public boolean b(){
       ActivityContext obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       Activity uActivity = obj.e();
       int i = 0;
       if (uActivity != null) {
          Object[] objArray = new Object[i];
          KwaiPopLog.e.w("KPopIntercept", "activity="+m0.d(uActivity.getClass()).N5(), objArray);
          Intent intent = uActivity.getIntent();
          if (intent != null) {
             Uri data = intent.getData();
             if (data != null) {
                a.o(data, "it.intent?.data ?: return@let false");
                if (data.isHierarchical()) {
                   boolean booleanQuery = data.getBooleanQueryParameter("disableGrowthPop", i);
                   if (booleanQuery) {
                      boolean booleanQuery1 = data.getBooleanQueryParameter("forceDisableGrowthPop", i);
                      if (!booleanQuery1) {
                         booleanQuery1 = a.t().d("disableKPopShowInH5", i);
                         if (!booleanQuery || !booleanQuery1) {
                         label_0087 :
                            return i;
                         }
                      }else if(booleanQuery && booleanQuery1){
                      }
                      i = true;
                      goto label_0087 ;
                   }else {
                      goto label_0087 ;
                   }
                }
             }else {
                goto label_0087 ;
             }
          }else {
             goto label_0087 ;
          }
       }else {
          goto label_0087 ;
       }
    }
    public boolean c(){
       boolean b;
       Object[] objArray = null;
       ActivityContext obj = PatchProxy.apply(objArray, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       Activity uActivity = obj.e();
       if (uActivity instanceof GifshowActivity) {
          objArray = uActivity;
       }
       b = (objArray != null)? d.a(-1188553266).VA(objArray.getUrl(), ""): false;
       return b;
    }
    public String getUserId(){
       String id;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       String str = (!obj.length())? 1: null;
       if (str) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          id = mE.getId();
          a.o(id, "QCurrentUser.ME.id");
       }
       return id;
    }
    public String o(){
       k2 ok2;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       String str = (!obj.length())? 1: null;
       if (str) {
          ok2 = u1.j();
          if (ok2 != null) {
             ok2 = ok2.d;
             if (ok2 != null) {
             label_002a :
                a.o(ok2, "Logger.getCurrentPage\(\)?.mPage2 ?: \"\"");
             }
          }
          String str1 = "";
          goto label_002a ;
       }
       return ok2;
    }
}
