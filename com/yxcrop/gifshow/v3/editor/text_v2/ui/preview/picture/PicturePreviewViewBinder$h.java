package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$h;
import xnd.b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import und.l;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateTextAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;

public final class PicturePreviewViewBinder$h implements b	// class@000b4d
{
    public final PicturePreviewViewBinder a;

    public void PicturePreviewViewBinder$h(PicturePreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,float p3,float p4,boolean p5,float p6,float p7){
       PicturePreviewViewBinder$h oh = PicturePreviewViewBinder$h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Float.valueOf(p3),Float.valueOf(p4),Boolean.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, oh, "1")) {
             return;
          }
       }
       a.p(p1, "newText");
       a.p(p2, "oldText");
       UpdateTextAction updateTextAc = new UpdateTextAction(p0, p1, p3, p4, this.a.u0().o0().w());
       this.a.u0().t0(v6);
       if (p5) {
          DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0, false, false, p6, p7, this.a.u0().o0().w());
          this.a.u0().t0(this.a.u0());
       }
       return;
    }
}
