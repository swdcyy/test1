package e8a.y;
import n3d.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class y implements a	// class@0020e5
{
    public final NasaProfileSideLikePresenter b;

    public void y(NasaProfileSideLikePresenter p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.X8();
       }
       return;
    }
}
