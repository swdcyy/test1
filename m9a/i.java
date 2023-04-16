package m9a.i;
import erd.o;
import com.kuaishou.android.model.mix.PostShowInfo;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d0a.i;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import uw9.c;
import java.util.Map;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.model.CDNUrl;

public final class i implements o	// class@002f80
{
    public final PostShowInfo b;
    public final BaseFeed c;
    public final boolean d;
    public final boolean e;

    public void i(PostShowInfo p0,BaseFeed p1,boolean p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       int i;
       boolean b;
       DetailSpecialCameraHelper uDetailSpeci = DetailSpecialCameraHelper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (oi != patchProxyRe) {
       }else {
          a.p(p0, "it");
          Object[] objArray = null;
          i = 1;
          if (p0.booleanValue()) {
             p0 = DetailSpecialCameraHelper.c;
             PostShowInfo mType = this.b.mType;
             Objects.requireNonNull(p0);
             if (PatchProxy.isSupport(uDetailSpeci)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(mType), p0, uDetailSpeci, "8");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(DetailSpecialCameraHelper.b == null){
                   DetailSpecialCameraHelper.b = Integer.valueOf(c.f());
                }
                Map map = p0.b();
                if (map != null) {
                   PostShowStartUpInfo postShowStar = map.get(Integer.valueOf(mType));
                   if (postShowStar != null) {
                      postShowStar = postShowStar.mRightCornerShowLimit;
                      if (postShowStar != null) {
                         Integer b2 = DetailSpecialCameraHelper.b;
                         a.m(b2);
                         if (postShowStar <= b2.intValue()) {
                         label_0075 :
                            b = false;
                         }
                      }
                      b = true;
                   }else {
                      goto label_0075 ;
                   }
                }else {
                   goto label_0075 ;
                }
             }else {
                goto label_0044 ;
             }
             if (b && !PatchProxy.applyVoid(objArray, p0, uDetailSpeci, "7")) {
                if (DetailSpecialCameraHelper.b == null) {
                   DetailSpecialCameraHelper.b = Integer.valueOf(c.f());
                }
                Integer b1 = DetailSpecialCameraHelper.b;
                a.m(b1);
                b1 = Integer.valueOf((b1.intValue() + i));
                DetailSpecialCameraHelper.b = b1;
                a.m(b1);
                SharedPreferences$Editor uEditor = c.a.edit();
                uEditor.putInt("detail_special_camera_icon_show_time", b1.intValue());
                g.a(uEditor);
             }
             i tb = this.b;
             String id = this.c.getId();
             i td = this.d;
             if (this.e != null && b) {
                p0 = p0.b();
                a.m(p0);
                p0 = p0.get(Integer.valueOf(this.b.mType));
                if (p0 != null) {
                   objArray = p0.mOriginTagPic;
                }
             }
             i oi1 = new i(0, tb, id, td, b, objArray);
             oi = uDetailSpeci;
          }else {
             oi = new i(i, objArray);
          }
       }
       return oi;
    }
}
