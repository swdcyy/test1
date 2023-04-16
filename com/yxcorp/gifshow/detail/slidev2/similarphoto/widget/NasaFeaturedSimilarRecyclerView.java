package com.yxcorp.gifshow.detail.slidev2.similarphoto.widget.NasaFeaturedSimilarRecyclerView;
import t17.a;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.View;

public class NasaFeaturedSimilarRecyclerView extends CustomRecyclerView implements a	// class@001a01
{

    public void NasaFeaturedSimilarRecyclerView(Context p0){
       super(p0);
    }
    public void NasaFeaturedSimilarRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NasaFeaturedSimilarRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(NasaFeaturedSimilarRecyclerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NasaFeaturedSimilarRecyclerView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.isShown() && super.canScrollHorizontally(p0))? true: false;
       return b;
    }
}
