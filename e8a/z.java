package e8a.z;
import n3d.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class z implements a	// class@0020e7
{
    public final NasaProfileSideLikePresenter b;

    public void z(NasaProfileSideLikePresenter p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.W8();
       }
       return;
    }
}
