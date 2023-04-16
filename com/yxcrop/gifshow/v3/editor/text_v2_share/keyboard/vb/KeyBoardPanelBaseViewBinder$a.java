package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import mod.a;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.a;
import java.lang.Runnable;
import ekd.k1;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.KeyboardPanelFoldButtonClickedAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditStartAction;

public final class KeyBoardPanelBaseViewBinder$a implements Observer	// class@000bbe
{
    public final KeyBoardPanelBaseViewBinder b;

    public void KeyBoardPanelBaseViewBinder$a(KeyBoardPanelBaseViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyBoardPanelBaseViewBinder$a.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("KeyBoardPanelBaseViewBinder", "keyboardOffset="+p0+", isSubtitle="+this.b.Y(), objArray);
          EditDecorationBaseDrawer selectDrawer = this.b.N().getSelectDrawer();
          if (selectDrawer == null) {
             objArray = new Object[i];
             a.D().w("KeyBoardPanelBaseViewBinder", "selectedDrawer==null, isSubtitle="+this.b.Y(), objArray);
             if (p0.intValue() > 0) {
                Object[] objArray1 = new Object[i];
                a.D().w("KeyBoardPanelBaseViewBinder", "keyboardOffsetLiveData, selectedDrawer==null && keyboardOffset="+p0, objArray1);
             }
             p0 = this.b;
             p0.l = i;
             p0.Z();
             this.b.d0();
             if (this.b.I().f()) {
                this.b.P().t0(new TextEditEndAction());
             }
             k1.r(new a(this), 0);
          }else if(selectDrawer.isSubtitle() != this.b.Y()){
             KeyBoardPanelBaseViewBinder$a tb = this.b;
             if (selectDrawer.isSticker() == tb.u) {
                KeyBoardPanelBaseViewBinder l = tb.l;
                if (p0 == null || l != p0.intValue()) {
                   a.o(p0, "keyboardOffset");
                   this.b.l = p0.intValue();
                   if (p0.intValue() > 0) {
                      if (this.b.L().isResumed()) {
                         if (this.b.I().g()) {
                            this.b.P().t0(new KeyboardPanelFoldButtonClickedAction(i));
                         }else {
                            this.b.P().t0(new TextEditStartAction(p0.intValue(), this.b.Q()));
                         }
                      }
                   }else if(!this.b.I().g() && this.b.I().f()){
                      this.b.P().t0(new TextEditEndAction());
                   }
                }
             }
          }
       }
       return;
    }
}
