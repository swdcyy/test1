package a7a.l$j;
import erd.g;
import a7a.l;
import java.lang.Object;
import tp7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import kotlin.jvm.internal.a;
import tp7.a;
import com.yxcorp.gifshow.entity.QPhoto;
import nsd.u;
import io.reactivex.subjects.PublishSubject;

public final class l$j implements g	// class@000066
{
    public final l b;

    public void l$j(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l$j.class, "1")) {
       }else if(p0.c != null){
          this.b.X8().T(p0.a());
       }else if(!p0.b()){
          this.b.X8().S(p0.a());
       }else {
          l a1 = this.b.a1;
          if (a1 == null) {
             a.S("mAtlasAutoPlayEvent");
          }
          a uoa = new a(p0.a(), this.b.getPhoto().getAtlasListSize(), false, 0, 12, null);
          a1.onNext(v3);
       }
       PatchProxy.onMethodExit(l$j.class, "1");
       return;
    }
}
