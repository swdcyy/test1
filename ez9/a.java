package ez9.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.reduce.d;
import java.lang.String;
import v6a.m0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import az6.a;
import uh5.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import xx9.a;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class a	// class@00225f
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static void b(a p0,QPhoto p1,PhotoDetailParam p2,SlidePlayViewModel p3,d p4,String p5,int p6,Object p7){
       p0.a(p1, p2, p3, p4, null);
    }
    public static void d(a p0,m0 p1,QPhoto p2,BaseFragment p3,String p4,Integer p5,int p6,Object p7){
       p0.c(p1, p2, p3, null, null);
    }
    public final void a(QPhoto p0,PhotoDetailParam p1,SlidePlayViewModel p2,d p3,String p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       a uoa = a.class;
       int i = 5;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[i2] = oobject;
          objArray[i1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = p4;
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.p(p0, "photo");
       a.p(p1, "detailParam");
       a.p(p2, "slidePlayViewModel");
       a.p(p3, "photoFeedbackHelper");
       if (p1.getEntranceFeed() != null) {
          BaseFeed entranceFeed = p1.getEntranceFeed();
          a.m(entranceFeed);
          a.o(entranceFeed, "detailParam.entranceFeed!!");
          if (a.g(p0.getPhotoId(), entranceFeed.getId()) && !p2.q(p2.j())) {
             a mSource = oobject1.mSource;
             int b = (mSource != 9 && (mSource == 8 || mSource == 16))? true: false;
             if (b && !e.f()) {
                p3.d(oobject1.mSource, null, "PLAYER_PANEL_SHARE", 3, p4);
             }else {
             label_008d :
                Object obj = PatchProxy.applyOneRefs(p1, this, uoa, "2");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(p1.getBizType() == i){
                   i1 = null;
                }
                b = i1;
                if (b) {
                   p3.d(oobject1.mSource, null, "PLAYER_PANEL_SHARE", 2, p4);
                }else {
                   a mSource1 = oobject1.mSource;
                   Object obj1 = null;
                   Objects.requireNonNull(p3);
                   if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(mSource1), obj1, "PLAYER_PANEL_SHARE", p4, p3, d.class, "2")) {
                      p3.a(mSource1, null, "PLAYER_PANEL_SHARE", 0, false, null, p4);
                      p3.g();
                   }
                }
             }
          }else {
             goto label_008d ;
          }
       }else {
          goto label_008d ;
       }
       return;
    }
    public final void c(m0 p0,QPhoto p1,BaseFragment p2,String p3,Integer p4){
       if (PatchProxy.isSupport2(a.class, "3")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
             return;
          }
       }
       a.p(p0, "callerContext");
       a.p(p1, "photo");
       a.p(p2, "fragment");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 18;
       uElementPack.action2 = "NO_INTEREST_BTN_IN_LONG_PRESS_MASK";
       i3 oi3 = i3.f();
       oi3.d("source", "PLAYER_PANEL_SHARE");
       oi3.c("is_simplify_screen", Integer.valueOf(p0.r.c()));
       a.o(oi3, "JsonStringBuilder.newIns¡­\(\)\n      \) 1 else 0\n    \)");
       if (p3 != null) {
          oi3.d("btn_text", p3);
       }
       if (p4 != null) {
          oi3.c("btn_type", Integer.valueOf(p4.intValue()));
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p1.mEntity);
       u1.M("", p2, 1, uElementPack, uContentPack, null);
       PatchProxy.onMethodExit(a.class, "3");
       return;
    }
}
