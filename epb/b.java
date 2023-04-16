package epb.b;
import com.kwai.feature.component.searchhistory.a$b;
import epb.a;
import com.kwai.feature.component.searchhistory.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.music.cloudmusic.search.history.MusicSearchHistoryData;
import java.util.Objects;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import ekd.m1;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;

public final class b extends a$b	// class@0027a4
{
    public final a q;

    public void b(a p0){
       this.q = p0;
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.q.Q0() != null && (this.q.Q0().size() == 1 && this.q.Q0().get(0) instanceof MusicSearchHistoryData)) {
          Object obj = this.q.Q0().get(0);
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.music.cloudmusic.search.history.MusicSearchHistoryData");
          if (obj.isEntrance()) {
             n.Y(this.m8(), 8, 0);
          label_0058 :
             return;
          }
       }
       n.Y(this.m8(), 0, 0);
       goto label_0058 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.doBindView(p0);
       TextView textView = m1.f(p0, R.id.clear_text);
       if (textView != null) {
          textView.setTextColor(a1.a(R.color.arg_RES_7f0607d6));
          textView.setText(a1.p(R.string.arg_RES_7f1005b4));
       }
       return;
    }
}
