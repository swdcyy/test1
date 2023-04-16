package com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a$a;
import android.view.ViewOutlineProvider;
import android.graphics.RectF;
import com.yxcorp.gifshow.model.RectInfo;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SocialSimpleEditorActivityViewBinder$a$a extends ViewOutlineProvider	// class@000d23
{
    public final RectF a;
    public final RectInfo b;

    public void SocialSimpleEditorActivityViewBinder$a$a(RectF p0,RectInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialSimpleEditorActivityViewBinder$a$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "outline");
       p1.setRoundRect(0, 0, (int)this.a.width(), (int)this.a.height(), this.b.getRadiusInner());
       return;
    }
}
