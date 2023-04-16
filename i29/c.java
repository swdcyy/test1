package i29.c;
import n3d.a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class c implements a	// class@002624
{
    public final AdLikeElement b;

    public void c(AdLikeElement p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.r0();
       }
       return;
    }
}
