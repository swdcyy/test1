package com.yxcorp.gifshow.v3.bubble.d$b$a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.v3.bubble.d$b;
import java.lang.Object;
import com.yxcorp.gifshow.bubble.a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.bubble.d;
import im8.f;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import ra9.c;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import ra9.i;

public class d$b$a implements PostBubbleManager$c	// class@000d30
{
    public final d$b a;

    public void d$b$a(d$b p0){
       this.a = p0;
       super();
    }
    public void a(a p0,c p1,int p2){
       if (PatchProxy.isSupport(d$b$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, d$b$a.class, "2")) {
          return;
       }
       d w = this.a.a.w;
       if (w != null && w.get() != null) {
          this.a.a.w.get().J(null);
       }
       return;
    }
    public void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b$a.class, "1")) {
          return;
       }
       try{
          EditorItemFunc editorItemFu = p0.d().getEditorItemFunc();
          d w = this.a.a.w;
          if (w != null && w.get() != null) {
             this.a.a.w.get().J(editorItemFu);
          }
          this.a.a.V8(editorItemFu);
       }catch(java.lang.ClassCastException e3){
          PostUtils.D("BubbleTipPresenter", "registerBubbleDispatchListener onShow", e3);
       }
       return;
    }
    public void c(boolean p0){
       i.b(this, p0);
    }
}
