package com.yxcorp.gifshow.hot.spot.adapter.BaseViewHolder;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.written.view.IWrittenLayout;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.hot.spot.adapter.BaseViewHolder$mainPresenter$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class BaseViewHolder extends RecyclerView$ViewHolder	// class@00181c
{
    public final p a;
    public final IWrittenLayout b;
    public final Object[] c;

    public void BaseViewHolder(IWrittenLayout p0,List p1,Object[] p2){
       a.p(p0, "binding");
       a.p(p1, "presenters");
       super(p0.l1());
       this.b = p0;
       this.c = p2;
       this.a = s.c(BaseViewHolder$mainPresenter$2.INSTANCE);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          this.a().U7(iterator.next());
       }
       this.a().f(this.b.l1());
       return;
    }
    public final PresenterV2 a(){
       Object obj = PatchProxy.applyWithListener(null, this, BaseViewHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(BaseViewHolder.class, "1");
       return this.a.getValue();
    }
}
