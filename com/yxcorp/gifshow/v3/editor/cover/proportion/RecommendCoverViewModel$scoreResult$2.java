package com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel$scoreResult$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverRepo;

public final class RecommendCoverViewModel$scoreResult$2 extends Lambda implements a	// class@000e95
{
    public final RecommendCoverViewModel this$0;

    public void RecommendCoverViewModel$scoreResult$2(RecommendCoverViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final MutableLiveData invoke(){
       Object[] objArray = null;
       RecommendCoverRepo obj = PatchProxy.apply(objArray, this, RecommendCoverViewModel$scoreResult$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.o0();
       if (obj != null) {
          objArray = obj.y();
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}