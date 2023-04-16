package com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import pf.g;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ze.x;
import ze.n0;
import android.view.View;
import java.lang.IllegalStateException;

public class FrescoBasedReactTextInlineImageViewManager extends ViewManager	// class@001422
{
    public final Object mCallerContext;
    public final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    public final g mReactImageConfig;

    public void FrescoBasedReactTextInlineImageViewManager(){
       super(null);
    }
    public void FrescoBasedReactTextInlineImageViewManager(AbstractDraweeControllerBuilder p0){
       super();
       this.mDraweeControllerBuilder = p0;
       this.mCallerContext = null;
       this.mReactImageConfig = ReactImageManager.getGlobalReactImageConfig();
    }
    public FrescoBasedReactTextInlineImageShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, FrescoBasedReactTextInlineImageViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FrescoBasedReactTextInlineImageViewManager tmDraweeCont = this.mDraweeControllerBuilder;
       if (tmDraweeCont == null) {
          tmDraweeCont = Fresco.newDraweeControllerBuilder();
       }
       return new FrescoBasedReactTextInlineImageShadowNode(tmDraweeCont, this.mReactImageConfig);
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       p0 = PatchProxy.applyOneRefs(p0, this, FrescoBasedReactTextInlineImageViewManager.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new IllegalStateException("RCTTextInlineImage doesn\'t map into a native view");
    }
    public String getName(){
       return "RCTTextInlineImage";
    }
    public Class getShadowNodeClass(){
       return FrescoBasedReactTextInlineImageShadowNode.class;
    }
    public void updateExtraData(View p0,Object p1){
    }
}
