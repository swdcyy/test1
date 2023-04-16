package com.yxcorp.gifshow.v3.editor.cover.proportion.a$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.cover.proportion.STATE;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import androidx.lifecycle.LiveData;

public final class a$d implements Observer	// class@000eb6
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else if(p0 != STATE.RUNNING){
          p0 = this.b;
          p0.E(p0.r);
          p0 = this.b.D().p0();
          if (p0 != null) {
             p0.removeObserver(this);
          }
       }
       return;
    }
}
