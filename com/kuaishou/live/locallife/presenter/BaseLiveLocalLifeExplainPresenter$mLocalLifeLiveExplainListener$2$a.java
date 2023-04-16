package com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a;
import ze3.a$a;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import kotlin.jvm.internal.a;
import android.view.View;
import rq5.a;
import pq5.c;

public final class BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a implements a$a	// class@000c47
{
    public final BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2 a;

    public void BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a(BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a.class, "4")) {
          return;
       }
       BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, BaseLiveLocalLifeExplainPresenter.class, "13")) {
          this$0.c9();
       }
       return;
    }
    public void b(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "explainMessage");
       this.a.this$0.Z8(p0);
       return;
    }
    public void c(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "explainMessage");
       this.a.this$0.a9(p0);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a.class, "1")) {
          return;
       }
       BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2 this$0 = this.a.this$0;
       if (this$0.J == null) {
          BaseLiveLocalLifeExplainPresenter i = this$0.I;
          if (i != null) {
             i.eo(this$0.T);
          }
       }
       return;
    }
}
