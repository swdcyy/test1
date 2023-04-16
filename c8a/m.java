package c8a.m;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import bz9.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.Log;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;

public final class m implements g	// class@000580
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void m(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlideAutoPlaySwitchPhotoPresenter.class, "6")) {
       }else if(!tb.x.equals(p0.b)){
          String str = "SlidePlayAutoPlay";
          if (p0.a != null) {
             Log.g(str, "负反馈 打开 自动播放开关");
             PendantPlayerStateVM.getInstance(tb.getActivity()).notifyAutoPlayerState(true);
             tb.F9();
          }else {
             Log.g(str, "负反馈 关闭 自动播放开关");
             PendantPlayerStateVM.getInstance(tb.getActivity()).notifyAutoPlayerState(false);
             tb.G9();
          }
       }
       return;
    }
}
