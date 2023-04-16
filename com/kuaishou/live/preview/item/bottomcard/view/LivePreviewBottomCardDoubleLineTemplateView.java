package com.kuaishou.live.preview.item.bottomcard.view.LivePreviewBottomCardDoubleLineTemplateView;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.CharSequence;

public class LivePreviewBottomCardDoubleLineTemplateView extends LiveBasePreviewBottomCardTemplateView	// class@000d9f
{

    public void LivePreviewBottomCardDoubleLineTemplateView(Context p0){
       super(p0, null);
    }
    public void LivePreviewBottomCardDoubleLineTemplateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePreviewBottomCardDoubleLineTemplateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       View[] viewArray = new View[]{this.f};
       n.Z(8, viewArray);
    }
    public int getLeftIconCircleSizePx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewBottomCardDoubleLineTemplateView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(40.00f);
    }
    public int getLeftIconSquareSizePx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewBottomCardDoubleLineTemplateView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(48.00f);
    }
    public int getTemplateCardViewHeightPx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewBottomCardDoubleLineTemplateView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(64.00f);
    }
    public void settSubDescriptionContent(CharSequence p0){
    }
}
