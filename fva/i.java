package fva.i;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e6a.c;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import qvb.a;
import java.util.Collection;
import ekd.q;

public class i extends e	// class@002a0b
{

    public void i(int p0){
       super(p0);
    }
    public int P8(){
       int i;
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       i = (HotSpotExperimentUtils.b())? this.q.ia().b1(): 0;
       return i;
    }
    public void onEventMainThread(c p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       if (!HotSpotExperimentUtils.b()) {
          return;
       }
       CommonMeta mHotSpotDoub = (p0.c.getCommonMeta() != null)? p0.c.getCommonMeta().mHotSpotDoubleCoverPhotoId: null;
       if (TextUtils.x(mHotSpotDoub)) {
          return;
       }else {
          List items = this.p.getItems();
          if (q.f(items)) {
             return;
          }else {
             i = items.size();
             if (i > 0) {
                int i1 = 0;
                while (i1 < i) {
                   QPhoto qPhoto = items.get(i1);
                   if (qPhoto.getCommonMeta() != null && TextUtils.n(qPhoto.getPhotoId(), mHotSpotDoub)) {
                      this.R8(p0, qPhoto);
                      break ;
                   }
                   i1 = i1 + 1;
                }
             }
             return;
          }
       }
    }
}
