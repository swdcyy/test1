package aa5.c;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kp.r1;
import aa5.b;
import aa5.a;
import java.lang.Integer;
import java.lang.Boolean;

public class c	// class@000043
{

    public void c(){
       super();
    }
    public static String a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (r1.S2(p0)) {
          return "Live";
       }
       return "Photo";
    }
    public static a b(BaseFeed p0,int p1,String p2,String p3,b p4){
       a obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.mExpTag = r1.M0(p0);
       obj.mFeedId = r1.t1(p0);
       obj.mFeedType = p4.a(p0);
       obj.mIndex = p1;
       obj.mLlsid = p2;
       obj.mDegradeType = p3;
       return obj;
    }
    public static a c(BaseFeed p0,int p1,String p2,String p3,b p4,boolean p5){
       a obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.mExpTag = r1.M0(p0);
       obj.mFeedId = r1.t1(p0);
       obj.mFeedType = p4.a(p0);
       obj.mIndex = p1;
       obj.mLlsid = p2;
       obj.mDegradeType = p3;
       obj.mRealShow = p5;
       return obj;
    }
}
