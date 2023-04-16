package com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity$b;
import w69.k0;
import com.yxcorp.gifshow.v3.editor.template.PicTemplateEditorAlbumActivity;
import java.lang.Object;
import w69.j0;
import java.util.List;
import java.lang.String;
import jlb.b;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gp.a;
import q87.c;
import java.lang.Boolean;
import u07.t$a;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import brd.t;
import dc7.e;
import dc7.d;
import com.yxcorp.gifshow.models.QMedia;
import trd.t;

public final class PicTemplateEditorAlbumActivity$b implements k0	// class@0012f6
{
    public final PicTemplateEditorAlbumActivity a;

    public void PicTemplateEditorAlbumActivity$b(PicTemplateEditorAlbumActivity p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return j0.c(this);
    }
    public void b(List p0,boolean p1,String p2,String p3,String p4){
       j0.d(this, p0, p1, p2, p3, p4);
    }
    public void c(){
       j0.g(this);
    }
    public void d(boolean p0){
       j0.h(this, p0);
    }
    public void e(b p0){
       j0.a(this, p0);
    }
    public void f(List p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateEditorAlbumActivity$b.class, "2")) {
          return;
       }
       a.p(p0, "selectedList");
       Object[] objArray = new Object[0];
       a.C().s("PicTemplateEditorAlbumActivity", "onSelectedDataAsResult", objArray);
       this.a.I3(p0);
       return;
    }
    public void g(boolean p0){
       PicTemplateEditorAlbumActivity$b uob = PicTemplateEditorAlbumActivity$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (!p0) {
          t$a uoa = new t$a(this.a);
          uoa.W0(R.string.arg_RES_7f10404e);
          uoa.S0(R.string.arg_RES_7f104050);
          f.e(uoa).Y(PopupInterface.a);
       }
       return;
    }
    public void h(t p0){
       d.a(this, p0);
    }
    public void i(QMedia p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateEditorAlbumActivity$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("PicTemplateEditorAlbumActivity", "onPickResult", objArray);
       PicTemplateEditorAlbumActivity$b ta = this.a;
       if (p0 != null) {
          ta.I3(t.k(p0));
       }
       return;
    }
    public void j(){
       j0.e(this);
    }
    public void k(){
       d.b(this);
    }
    public void l(boolean p0,boolean p1){
       j0.i(this, p0, p1);
    }
    public void m(boolean p0){
       j0.k(this, p0);
    }
}
