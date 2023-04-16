package ay9.q$b;
import tyc.s4$a;
import ay9.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import iy5.d;
import q87.c;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import yy6.a;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class q$b implements s4$a	// class@000307
{
    public final q a;

    public void q$b(q p0){
       this.a = p0;
       super();
    }
    public String a(){
       q obj = PatchProxy.apply(null, this, q$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.v;
       if (obj == null || obj.getCaptionSearchInfo() == null) {
          obj = this.a.v;
          if (obj != null) {
             CaptionSearchInfo captionSearc = obj.getCaptionSearchInfo();
          }
          Object[] objArray = new Object[0];
          d.C().w("CaptionElement", "getDefaultEntrySource: photo is inValid $photoInValid, captionSearchInfo is inValid $captionInValid", objArray);
          return "UNKNOWN";
       }else if(this.a.v.getCaptionSearchInfo().mCaptionSearchType == 2){
          return "search_entrance_cap_keyword";
       }else {
          return "search_entrance_captail_keyword";
       }
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, q$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.w.getContext();
    }
    public long getPlayDuration(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       q obj = PatchProxy.apply(objArray, this, q$b.class, "2");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.a.A;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, q.class, "8");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else if(obj != null){
          Fragment uFragment = obj.t();
          if (uFragment != null && (uFragment instanceof a && uFragment.d1() instanceof PhotoDetailLogger)) {
             l = uFragment.d1().getActualPlayDuration();
          }
       }
       l = -1;
       return l;
    }
}
