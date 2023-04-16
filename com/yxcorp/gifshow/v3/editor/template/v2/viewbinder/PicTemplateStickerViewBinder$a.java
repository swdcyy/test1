package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$a;
import qsc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$a$a;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import uwc.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import qsc.d;

public final class PicTemplateStickerViewBinder$a implements e	// class@001399
{
    public final PicTemplateStickerViewBinder a;

    public void PicTemplateStickerViewBinder$a(PicTemplateStickerViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       PicTemplateStickerViewBinder$a uoa = PicTemplateStickerViewBinder$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       f$a uoa1 = new f$a();
       uoa1.b(false);
       uoa1.a(false);
       this.a.g.X(uoa1, PicTemplateStickerViewBinder$a$a.a);
       PicTemplateStickerViewBinder$a ta = this.a;
       ta.K(ta.H().q0());
       return;
    }
    public void b(int p0){
       PicTemplateStickerViewBinder$a uoa = PicTemplateStickerViewBinder$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.g.R();
       uoa = this.a;
       uoa.K(uoa.H().q0());
       Object[] objArray = new Object[0];
       a.D().s("PicTemplateStickerViewBinder", "picTemplateItemSwitch: "+p0, objArray);
       return;
    }
    public void c(){
       d.d(this);
    }
    public void d(){
       d.a(this);
    }
    public void e(){
       d.f(this);
    }
    public void f(){
       d.b(this);
    }
}
