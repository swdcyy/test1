package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$i;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nn9.a;
import jn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.util.List;

public final class RecommendMusicViewBinderV2$i extends RecyclerView$r	// class@001115
{
    public final RecommendMusicViewBinderV2 a;

    public void RecommendMusicViewBinderV2$i(RecommendMusicViewBinderV2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       RecommendMusicViewBinderV2$i oi = RecommendMusicViewBinderV2$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          layoutManage = null;
       }
       if (layoutManage != null) {
          boolean i = layoutManage.c();
          RecommendMusicViewBinderV2$i ta = this.a;
          Objects.requireNonNull(ta);
          RecommendMusicViewBinderV2 recommendMus = RecommendMusicViewBinderV2.class;
          if (PatchProxy.isSupport(recommendMus)) {
             LoadingStatus obj = PatchProxy.applyOneRefs(Integer.valueOf(i), ta, recommendMus, "3");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else {
             label_004e :
                obj = ta.e.k().a();
                ta = ta.e.m().size();
                i = (obj == LoadingStatus.DATA_LOADING_FINISH || (obj == LoadingStatus.DATA_LOADING_MORE_FINISH && (i + 5) >= (ta - true)))? true: false;
             }
          }else {
             goto label_004e ;
          }
          if (i) {
             this.a.e.x(true);
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(RecommendMusicViewBinderV2$i.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RecommendMusicViewBinderV2$i.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.a.E();
       return;
    }
}
