package dl9.m0$a;
import com.yxcorp.gifshow.widget.m;
import dl9.m0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.comment.emotion.detail.EmotionDetailActivity;

public class m0$a extends m	// class@001f80
{
    public final m0 c;

    public void m0$a(m0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0$a.class, "1")) {
          return;
       }
       m0 p = this.c.p;
       EmotionDetailActivity.A3(this.c.getActivity(), p.mEmotionInfo, p.getPhotoId(), this.c.p.getId());
       return;
    }
}
