package com.kwai.feature.component.photofeatures.reward.widget.MessageShadowContainerView$b;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import com.kwai.feature.component.photofeatures.reward.widget.MessageShadowContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class MessageShadowContainerView$b implements ShadowRoundedHelper$a	// class@001266
{
    public final MessageShadowContainerView a;

    public void MessageShadowContainerView$b(MessageShadowContainerView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MessageShadowContainerView$b.class, "1")) {
          return;
       }
       this.a.invalidate();
       return;
    }
    public float getHeight(){
       Object obj = PatchProxy.apply(null, this, MessageShadowContainerView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getHeight();
    }
    public float getPaddingBottom(){
       Object obj = PatchProxy.apply(null, this, MessageShadowContainerView$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingBottom();
    }
    public float getPaddingEnd(){
       Object obj = PatchProxy.apply(null, this, MessageShadowContainerView$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingEnd();
    }
    public float getPaddingStart(){
       Object obj = PatchProxy.apply(null, this, MessageShadowContainerView$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingStart();
    }
    public float getPaddingTop(){
       Object obj = PatchProxy.apply(null, this, MessageShadowContainerView$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingTop();
    }
    public float getWidth(){
       Object obj = PatchProxy.apply(null, this, MessageShadowContainerView$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getWidth();
    }
}
