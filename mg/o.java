package mg.o;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import brd.t;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.Collection;
import trd.y;
import com.kwai.feature.post.api.feature.bridge.JsMagicFaceResultParams;

public final class o implements o	// class@002647
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       if (p0 == null) {
          p0 = t.error(new Throwable("fetchMagicFacePanelBriefInfo result is empty"));
          a.o(p0, "Observable.error\(Throwab¡­efInfo result is empty\"\)\)");
       }else {
          ArrayList uArrayList = new ArrayList();
          String[] stringArray = e0.b(p0.mImages, p0.mImage);
          a.o(stringArray, "CDNUtil.convertToUrls\(ma¡­Images, magicFace.mImage\)");
          y.s0(uArrayList, stringArray);
          p0 = t.just(new JsMagicFaceResultParams(1, p0.mName, uArrayList.get(0)));
          a.o(p0, "Observable.just\(\n      J¡­    urls[0]\n      \)\n    \)");
       }
       return p0;
    }
}
