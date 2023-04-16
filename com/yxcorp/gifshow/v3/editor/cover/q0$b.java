package com.yxcorp.gifshow.v3.editor.cover.q0$b;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$c;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import im8.f;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$d;
import java.lang.Boolean;
import java.util.List;
import ooc.g1;

public class q0$b extends PictureSelectView$c	// class@000ebb
{
    public final q0 a;

    public void q0$b(q0 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       q0$b uob = q0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.W8(p0);
       this.a.R = Integer.valueOf(p0);
       Object[] objArray = new Object[0];
       a.D().s("PhotosCoverEditorPresenter", "mCurrentPosition:"+this.a.R, objArray);
       if (this.a.V.get() != null) {
          this.a.V.get().a(p0);
       }
       return;
    }
    public void b(int p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(q0$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, q0$b.class, "3")) {
          return;
       }
       if (this.a.h1.size() > 0) {
          q0$b ta = this.a;
          g1.v(ta.z, ta.A, String.valueOf(((double)ta.R.intValue() / (double)this.a.h1.size())));
       }
       if (this.a.V.get() != null) {
          this.a.V.get().b(p0, p1, p2);
       }
       if (!p2) {
          g1.t(p0, this.a.z, p1);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, q0$b.class, "2")) {
          return;
       }
       if (this.a.V.get() != null) {
          this.a.V.get().c();
       }
       return;
    }
}
