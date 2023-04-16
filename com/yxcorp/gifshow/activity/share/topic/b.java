package com.yxcorp.gifshow.activity.share.topic.b;
import io.reactivex.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import brd.v;
import pb9.g;
import pb9.r;
import brd.g;
import pb9.p;
import com.yxcorp.gifshow.activity.share.topic.a;
import pb9.q;

public final class b implements g	// class@001479
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       g og = r.b(this.b);
       if (og == null) {
          p0.onNext("");
          p0.onComplete();
       }else {
          p.e().j(og, new a(p0));
       }
       return;
    }
}
