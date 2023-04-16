package com.yxcorp.gifshow.v3.editor.text.element.c$a;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.editor.text.element.c;
import java.lang.Object;
import brd.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import uld.g;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import faa.a;
import q87.c;
import axc.i;

public class c$a implements ExpandFoldHelperView$g	// class@0013fa
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public a0 a(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.y.R();
       int i = 0;
       if (this.a.B.C0().c()) {
          objArray = new Object[i];
          a.D().w("TextElementPresenter", "onPreRightBtnClicked has task processing show progress", objArray);
          return this.a.B.C1(true);
       }else {
          objArray = new Object[i];
          a.D().w("TextElementPresenter", "onPreRightBtnClicked show all AnimatedSubAsset in player", objArray);
          return a0.B(new Object());
       }
    }
    public a0 b(){
       return i.a(this);
    }
}
