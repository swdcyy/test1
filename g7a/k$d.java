package g7a.k$d;
import erd.g;
import g7a.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import whc.k0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.MoreBottomSheet;
import com.kwai.robust.PatchProxyResult;
import qa9.q;
import java.lang.Integer;
import java.util.HashMap;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.utility.n;
import org.greenrobot.eventbus.a;
import qz9.k;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import qa9.s;

public final class k$d implements g	// class@0023e3
{
    public final k b;

    public void k$d(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$d.class, "1")) {
       }else {
          int i = 1;
          if (!(a.g(k.W8(this.b).t(), k.P8(this.b)) ^ i)) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             Object[] objArray = null;
             String str = "5";
             if (!PatchProxy.applyVoid(objArray, p0, k.class, str)) {
                Activity activity = p0.getActivity();
                if (!activity instanceof GifshowActivity) {
                   activity = objArray;
                }
                if (activity != null) {
                   k q = p0.q;
                   String str1 = "mPhoto";
                   if (q == null) {
                      a.S(str1);
                   }
                   k r = p0.r;
                   if (r == null) {
                      a.S("mDetailParam");
                   }
                   k0 ok0 = new k0(q, r.getDetailCommonParam().mPreInfo, activity);
                   p0 = p0.q;
                   if (p0 == null) {
                      a.S(str1);
                   }
                   if (PatchProxy.applyThreeRefs(activity, p0, ok0, null, MoreBottomSheet.class, "7") != PatchProxyResult.class) {
                   }else if(PatchProxy.applyVoidOneRefs(ok0, objArray, MoreBottomSheet.class, str)){
                      MoreBottomSheet.n.put(Integer.valueOf(ok0.hashCode()), ok0);
                   }
                   Bundle uBundle = new Bundle();
                   SerializableHook.putSerializable(uBundle, "photo", p0);
                   uBundle.putInt("fragmentId", ok0.hashCode());
                   int i1 = (int)((float)n.j(activity) * 0x3f1e353f);
                   int o = MoreBottomSheet.o;
                   if (i1 > o) {
                      i1 = o;
                   }
                   a.d().k(new k(i));
                   s.c(activity.getSupportFragmentManager(), MoreBottomSheet.class, "MoreBottomSheet", uBundle, BottomSheetParams.ofStateless().setNeedPageLogger(false).setContentHeight(i1));
                }
             }
             this.b.Y8("PERMISSION_SETTING");
          }
       }
       return;
    }
}
