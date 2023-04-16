package com.kuaishou.live.lite.share.LiveLiteSharePresenter$a;
import dd3.j;
import com.kuaishou.live.lite.share.LiveLiteSharePresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.lite.share.a;
import com.kuaishou.live.lite.share.a$b;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.lite.share.a$a;

public class LiveLiteSharePresenter$a implements j	// class@000b0f
{
    public final LiveLiteSharePresenter a;

    public void LiveLiteSharePresenter$a(LiveLiteSharePresenter p0){
       this.a = p0;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteSharePresenter$a.class, "1")) {
          return;
       }
       LiveLiteSharePresenter a = this.a.A;
       if (a == null) {
          b.P(LiveLiteLogTag.SHARE.appendTag("LiveLiteSharePresenter"), "mShareController is null, abort");
          return;
       }else {
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, a, a.class, "3")) {
             a.j.get(a$b.class).u0(new a$a(p0, p1));
          }
          return;
       }
    }
}
