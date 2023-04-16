package nfd.c1;
import java.lang.Object;
import android.app.Activity;
import lyb.h;
import com.kwai.framework.model.user.User;
import java.lang.String;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import jga.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.helper.FollowSource;
import jga.c;
import wca.b;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import jga.f$a;

public class c1	// class@001d95
{

    public void c1(){
       super();
    }
    public static f a(Activity p0,h p1,User p2,String p3,int p4,FeedLogCtx p5){
       c1 uoc1 = c1.class;
       if (PatchProxy.isSupport(uoc1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, null, uoc1, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c1.b(p0, p1, p2, p3, p4, null, p5);
    }
    public static f b(Activity p0,h p1,User p2,String p3,int p4,String p5,FeedLogCtx p6){
       Object[] objArray;
       c obj1;
       c1 uoc1 = c1.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoc1)) {
          objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,p6};
          obj1 = PatchProxy.apply(objArray, obj, uoc1, "6");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (!p0 instanceof GifshowActivity) {
          return obj;
       }else if(!TextUtils.x(p3)){
          GifshowActivity sourceString = FollowSource.SEARCH.getSourceString(p2);
       }
       obj1 = b.f(145, p2.getId());
       if (p6 == null) {
          p6 = p1.getReportFeedLogCtx();
       }
       obj1.f = p6;
       if (p6 == null) {
          obj1.f = p2.getSearchFeedLogCtx();
       }
       if (p4 != -1) {
          obj1.e(b.a(p4));
       }
       objArray = new Object[0];
       a.C().s("SearchFollowUtils", "build user follow param, user : "+p2.getId()+", stid: "+obj1.f, objArray);
       String str = (p1.isPymk())? "500": p0.Q2();
       f$a uoa = new f$a(p2, str);
       uoa.c(p3);
       uoa.q(1);
       f$a uoa1 = uoa.h(p2.mFollowActionReasonTextId);
       uoa1.d(p5);
       uoa1.o(p0.getUrl());
       uoa1.i(obj1);
       return uoa1.b();
    }
}
