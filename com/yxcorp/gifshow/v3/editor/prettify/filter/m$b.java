package com.yxcorp.gifshow.v3.editor.prettify.filter.m$b;
import unc.h;
import com.yxcorp.gifshow.v3.editor.prettify.filter.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cq.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.prettify.v4.magic.filter.FilterFragment;

public class m$b extends h	// class@00117b
{
    public final m d;

    public void m$b(m p0){
       this.d = p0;
       super();
    }
    public boolean b(){
       m obj = PatchProxy.apply(null, this, m$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("SinglePicFilterEditorPresenter", "onSwipeNext", objArray);
       this.d.p.f();
       if (!this.d.p.f().h()) {
          return i;
       }
       obj = this.d.q;
       if (obj instanceof FilterFragment) {
          obj.ch(true);
       }
       return true;
    }
    public boolean c(){
       m obj = PatchProxy.apply(null, this, m$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("SinglePicFilterEditorPresenter", "onSwipePrevious", objArray);
       if (!this.d.p.f().h()) {
          return 0;
       }
       obj = this.d.q;
       if (obj instanceof FilterFragment) {
          obj.ch(0);
       }
       return true;
    }
}
