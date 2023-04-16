package bia.h;
import vha.c;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import fia.j0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;

public class h extends c	// class@0003c8
{

    public void h(){
       super();
    }
    public f h1(ViewGroup p0,int p1){
       FollowSlidePymiUserItemPresenter obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d0440);
       a.o(view, "KwaiLayoutInflater.infla¡­.feeds_pymi_user_item_v2\)");
       obj = new FollowSlidePymiUserItemPresenter();
       obj.U7(new j0());
       return new f(view, obj);
    }
}
