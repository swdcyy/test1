package com.yxcorp.gifshow.v3.editor.cover.proportion.a$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a;
import java.lang.Object;
import tpc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import androidx.lifecycle.LiveData;

public final class a$b implements Observer	// class@000eb4
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else if(p0 != null){
          this.b.F(p0);
          p0 = this.b.D().q0();
          if (p0 != null) {
             p0.removeObserver(this);
          }
       }
       return;
    }
}
