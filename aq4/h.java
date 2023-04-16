package aq4.h;
import erd.g;
import aq4.j;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Boolean;
import qrc.r$a;
import androidx.fragment.app.FragmentActivity;
import fq4.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.i5;
import k2b.e0;
import qrc.r;
import qrc.e$a;
import op4.a;
import msc.s;
import xvc.f;
import xvc.m;
import tvc.c;
import qrc.s;
import gq4.a$a;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.entrance.e;
import qrc.e;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import qrc.j$a;
import qrc.j;

public final class h implements g	// class@0002c6
{
    public final j b;
    public final GifshowActivity c;

    public void h(j p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       if (tb.I == null) {
          p0 = new r$a().a(tc).d(tb.A.z);
          boolean b = false;
          p0.g(b);
          p0.j(b);
          p0.k(tb.A.b());
          p0.e(tb.A.b());
          p0.i((tb.A.b() ^ 1));
          int i = (tb.A.a())? 0: i5.b(tb.getContext());
          p0.k = i;
          p0.m(tb.A.b());
          p0 = p0.c(tb.v).b();
          e$a uoa = new e$a().c(new a(tb.A.A, s.a));
          uoa.e(tb.J);
          uoa.b(tb.E.b);
          j a = tb.A;
          Objects.requireNonNull(a);
          Object obj = PatchProxy.apply(null, a, a.class, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(a.b() && a.t.l == null){
             b = true;
          }
          uoa.d(b);
          tb.I = new MusicFragmentCreator(tb.A.A, new j$a().c(p0).b(uoa.a()).a());
       }
       return;
    }
}
