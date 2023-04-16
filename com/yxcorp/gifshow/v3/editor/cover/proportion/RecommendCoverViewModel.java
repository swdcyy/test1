package com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel$scoreResult$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel$repoState$2;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecommendCoverViewModel extends ViewModel	// class@000e96
{
    public RecommendCoverRepo a;
    public final p b;
    public final p c;

    public void RecommendCoverViewModel(){
       super();
       this.b = s.c(new RecommendCoverViewModel$scoreResult$2(this));
       this.c = s.c(new RecommendCoverViewModel$repoState$2(this));
    }
    public void RecommendCoverViewModel(RecommendCoverRepo p0){
       a.p(p0, "repo");
       super();
       this.a = p0;
       p0.F(true);
    }
    public final RecommendCoverRepo o0(){
       return this.a;
    }
    public final LiveData p0(){
       Object obj = PatchProxy.apply(null, this, RecommendCoverViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final LiveData q0(){
       Object obj = PatchProxy.apply(null, this, RecommendCoverViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final boolean r0(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
}
