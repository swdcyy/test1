package com.kuaishou.live.preview.item.bottomcard.view.LivePreviewBottomCardTripleLineTemplateView;
import com.kuaishou.live.preview.item.bottomcard.view.LiveBasePreviewBottomCardTemplateView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class LivePreviewBottomCardTripleLineTemplateView extends LiveBasePreviewBottomCardTemplateView	// class@000da1
{

    public void LivePreviewBottomCardTripleLineTemplateView(Context p0){
       super(p0, null);
    }
    public void LivePreviewBottomCardTripleLineTemplateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePreviewBottomCardTripleLineTemplateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int getLeftIconCircleSizePx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewBottomCardTripleLineTemplateView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(56.00f);
    }
    public int getLeftIconSquareSizePx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewBottomCardTripleLineTemplateView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(64.00f);
    }
    public int getTemplateCardViewHeightPx(){
       Object obj = PatchProxy.apply(null, this, LivePreviewBottomCardTripleLineTemplateView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(80.00f);
    }
}
