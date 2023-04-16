package e7a.j;
import ln6.c;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.yxcorp.gifshow.util.rx.RxBus;
import nn6.b;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;

public final class j implements c	// class@00208a
{
    public final b a;

    public void j(b p0){
       this.a = p0;
    }
    public final void a(VoteResultResponse p0,int p1){
       j ta = this.a;
       b x = ta.x;
       if (x != null && ta.D != null) {
          RxBus.f.b(new b(p0, p1, x.getPhotoId(), ta.D.hashCode()));
       }
       return;
    }
}
