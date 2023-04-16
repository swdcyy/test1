package com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;

public abstract class NewEditTextBaseElement extends EditDecorationBaseDrawer	// class@000b8a
{
    public final NewTextBaseElementData textBaseElementData;

    public void NewEditTextBaseElement(NewTextBaseElementData p0){
       a.p(p0, "textBaseElementData");
       super(p0, p0.l(), p0.m0(), p0.j0(), p0.l0());
       this.textBaseElementData = p0;
    }
    public final NewTextBaseElementData getTextBaseElementData(){
       return this.textBaseElementData;
    }
    public final boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, NewEditTextBaseElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.textBaseElementData.F0().length())? true: false;
       return b;
    }
    public boolean isNewTextType(){
       return true;
    }
    public boolean isSubtitle(){
       Object obj = PatchProxy.apply(null, this, NewEditTextBaseElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.textBaseElementData.J0();
    }
    public void updateElement(NewTextBaseElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditTextBaseElement.class, "1")) {
          return;
       }
       a.p(p0, "newElementData");
       return;
    }
}
