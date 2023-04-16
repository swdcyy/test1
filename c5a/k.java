package c5a.k;
import java.lang.Runnable;
import c5a.l;
import java.lang.Object;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.e;

public final class k implements Runnable	// class@000553
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       l q = tb.q;
       QPhoto qPhoto = q.n(q.q(q.j()));
       if (PatchProxy.applyVoidOneRefs(qPhoto, tb, l.class, "5")) {
       }else if(qPhoto != null && (qPhoto.getEntity() == null || tb.s == qPhoto.getEntity())){
          tb.s = qPhoto.getEntity();
          RxBus.f.b(new e(qPhoto.getEntity()));
       }
       return;
    }
}
