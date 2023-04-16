package com.yxcorp.gifshow.v3.editor.prettify.filter.m$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.prettify.filter.m;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import cq.a;
import q87.c;
import unc.h;

public class m$a extends DecorationContainerView$e	// class@00117a
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void q(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(m$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, m$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SinglePicFilterEditorPresenter", "onFlingBlankScreen", objArray);
       this.a.u.onFling(p0, p1, p2, p3);
       return;
    }
}
