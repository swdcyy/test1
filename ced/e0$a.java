package ced.e0$a;
import m0d.a;
import ced.e0;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import ded.h;
import med.f;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class e0$a extends a	// class@00054c
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "1")) {
          return;
       }
       if (this.b.getActivity() != null && (!this.b.getActivity().isFinishing() && p0 != null)) {
          if (h.c(this.b.y)) {
             e0$a tb = this.b;
             tb.B.onNext(Integer.valueOf(tb.C.c));
          }
          return;
       }else {
          this.b.R8();
          return;
       }
    }
}
