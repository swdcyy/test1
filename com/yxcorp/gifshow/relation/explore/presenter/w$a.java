package com.yxcorp.gifshow.relation.explore.presenter.w$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.w;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class w$a extends m	// class@001867
{
    public final w c;

    public void w$a(w p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "1")) {
          return;
       }
       this.c.q.onNext(Integer.valueOf(4));
       return;
    }
}
