package com.yxcorp.gifshow.v3.editor.cover.CoverEditor$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo;
import crd.b;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.cover.proportion.STATE;
import androidx.lifecycle.MutableLiveData;

public class CoverEditor$1 implements LifecycleObserver	// class@000e22
{
    public final CoverEditor b;

    public void CoverEditor$1(CoverEditor p0){
       this.b = p0;
       super();
    }
    public void onStopAction(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CoverEditor$1.class, "1")) {
          return;
       }
       CoverEditor u = this.b.u;
       if (u != null) {
          Objects.requireNonNull(u);
          if (!PatchProxy.applyVoid(objArray, u, RecommendCoverRepo.class, "13")) {
             RecommendCoverRepo g = u.g;
             if (g != null) {
                g.dispose();
             }
             Object[] objArray1 = new Object[0];
             a.D().w("RecommendCoverRepo", "cover task dispose", objArray1);
             u.k.postValue(STATE.FINISHED);
          }
       }
       return;
    }
}
