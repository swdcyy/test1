package com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;

public class SubtitleTextPresenter$a extends DecorationContainerView$e	// class@00148b
{
    public final SubtitleTextPresenter a;

    public void SubtitleTextPresenter$a(SubtitleTextPresenter p0){
       this.a = p0;
       super();
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextPresenter$a.class, "3")) {
       }else {
          super.b(p0);
          this.a.Y8(p0.getEditTextBaseElementData());
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextPresenter$a.class, "2")) {
       }else {
          super.x(p0);
          this.a.Y8(p0.getEditTextBaseElementData());
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextPresenter$a.class, "1")) {
       }else {
          this.p(p0);
          this.a.Y8(p0.getEditTextBaseElementData());
       }
       return;
    }
}
