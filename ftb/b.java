package ftb.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.String;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import btb.i;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import androidx.fragment.app.FragmentActivity;
import foc.y;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import tkd.b;
import tkd.d;
import wm5.a;
import vm5.o;

public class b	// class@0029ec
{

    public void b(){
       super();
    }
    public static void a(GifshowActivity p0,QPhoto p1,int p2,List p3,List p4,String p5,View p6){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       b uob = b.class;
       int i = 4;
       Object obj = null;
       int i1 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),oobject2,oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, obj, uob, "1")) {
             return;
          }
       }
       PhotoDetailParam photoDetailP = new PhotoDetailParam(p1);
       photoDetailP.getSlidePlayConfig().setEnablePullRefresh(i1);
       photoDetailP.getSlidePlayConfig().setEnableSlidePositionChangeEvent(1);
       photoDetailP.setBizType(i);
       photoDetailP.setSlidePlayId(b.g(j.e(new i(p2, oobject2, oobject3), f.b(obj), SlideMediaType.ALL)).id());
       photoDetailP.setSource(17);
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       uoa.Z("NOTICE_BOX");
       uoa.C(i1);
       uoa.l(1);
       uoa.q(i1);
       uoa.x(Boolean.FALSE);
       uoa.H(oobject4);
       uoa.e(1);
       uoa.g(1);
       uoa.h(1);
       uoa.i(1);
       NasaSlideParam nasaSlidePar = uoa.a();
       photoDetailP.getDetailCommonParam().setUnserializableBundleId(y.b(p0, oobject5));
       a uoa1 = d.a(0x66aa3a58);
       int i2 = (oobject5 != null)? p6.getWidth(): 0;
       if (oobject5 != null) {
          i1 = p6.getHeight();
       }
       uoa1.z20(p0, 1025, photoDetailP, p6, i2, i1, nasaSlidePar, false, null);
       return;
    }
}
