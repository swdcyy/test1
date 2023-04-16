package com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import toc.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class BaseEditorPreviewContainerLayout extends RelativeLayout	// class@000d50
{
    public FlexScreenStatusData b;
    public HashMap c;

    public void BaseEditorPreviewContainerLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void BaseEditorPreviewContainerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void BaseEditorPreviewContainerLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void BaseEditorPreviewContainerLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void e(BaseEditorPreviewContainerLayout p0,boolean p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.d(p1, p2);
       return;
    }
    public abstract void a(RectF p0,boolean p1,AnimatorListenerAdapter p2,boolean p3,long p4);
    public abstract void b(FlexScreenStatusData p0,Size p1);
    public abstract void c(e p0,Size p1);
    public abstract void d(boolean p0,boolean p1);
    public abstract RectF getCustomTransformRect();
    public abstract RectF getLimitRect();
    public FlexScreenStatusData getMFlexScreenStatusData(){
       BaseEditorPreviewContainerLayout obj = PatchProxy.apply(null, this, BaseEditorPreviewContainerLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mFlexScreenStatusData");
       }
       return obj;
    }
    public abstract RectF getOriginLayoutRect();
    public void setMFlexScreenStatusData(FlexScreenStatusData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorPreviewContainerLayout.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public abstract void setOriginLayoutRect(RectF p0);
}
