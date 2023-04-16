package com.yxcorp.gifshow.relation.explore.presenter.gallery.p$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class p$b extends m	// class@00184e
{
    public final p c;

    public void p$b(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       this.c.r.onNext(Integer.valueOf(2));
       return;
    }
}
