package com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView$b;
import ub.a;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class LiveBasePreviewBottomCardTemplateView$b extends a	// class@000d9d
{
    public final LiveBasePreviewBottomCardTemplateView b;

    public void LiveBasePreviewBottomCardTemplateView$b(LiveBasePreviewBottomCardTemplateView p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveBasePreviewBottomCardTemplateView$b.class, "1")) {
       }else if(p1 != null && (p1.getHeight() > 0 && p1.getWidth() > 0)){
          ViewGroup$LayoutParams layoutParams = this.b.i.getLayoutParams();
          layoutParams.width = (int)((float)layoutParams.height * ((float)p1.getWidth() / (float)p1.getHeight()));
          this.b.i.setLayoutParams(layoutParams);
       }
       return;
    }
}
