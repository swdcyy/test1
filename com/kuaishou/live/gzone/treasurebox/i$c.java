package com.kuaishou.live.gzone.treasurebox.i$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.gzone.treasurebox.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import r53.b;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class i$c extends m	// class@001c6d
{
    public final i c;

    public void i$c(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
          return;
       }
       a f = this.c.B.f;
       if (f != null) {
          f.p().m.onNext(Integer.valueOf(0));
       }
       return;
    }
}
