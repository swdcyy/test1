package com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment$a;
import w69.k0;
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import j8c.a;
import q87.c;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import o79.q;
import com.yxcorp.gifshow.camera.record.album.x;
import android.content.Context;
import sb9.c0;
import com.yxcorp.gifshow.camera.record.album.x$a;
import w69.j0;
import jlb.b;
import android.app.Activity;
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

public class AlbumWrapperFragment$a implements k0	// class@001ca7
{
    public final AlbumWrapperFragment a;

    public void AlbumWrapperFragment$a(AlbumWrapperFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, AlbumWrapperFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.onBackPressed();
    }
    public void b(List p0,boolean p1,String p2,String p3,String p4){
       AlbumWrapperFragment$a uoa = AlbumWrapperFragment$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().w("AlbumWrapperFragment", "onClickNextStep", objArray1);
       AlbumWrapperFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidFourRefs(p0, p2, p3, p4, ta, AlbumWrapperFragment.class, "12")) {
          FragmentActivity activity = ta.getActivity();
          if (activity != null) {
             new x(activity).a(q.f(new ArrayList(p0)), p2, new c0(ta, p2, p3, p4));
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onPreview", objArray);
       return;
    }
    public void d(boolean p0){
       j0.h(this, p0);
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumWrapperFragment$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onAlbumSelect", objArray);
       return;
    }
    public void f(List p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumWrapperFragment$a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onSelectedDataAsResult", objArray);
       return;
    }
    public void g(boolean p0){
       AlbumWrapperFragment$a uoa = AlbumWrapperFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onCheckSelectedFilesExistenceFinished", objArray);
       FragmentActivity activity = this.a.getActivity();
       if (activity == null) {
          return;
       }
       if (!p0) {
          this.a.ch(0);
          t$a uoa1 = new t$a(activity);
          uoa1.y0(R.string.arg_RES_7f10404e);
          uoa1.S0(R.string.arg_RES_7f104050);
          f.e(uoa1).Y(PopupInterface.a);
       }
       return;
    }
    public void h(t p0){
       d.a(this, p0);
    }
    public void i(QMedia p0,String p1){
       j0.f(this, p0, p1);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment$a.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onFirstDataRenderFinish", objArray);
       return;
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
