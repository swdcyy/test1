package com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcorp.gifshow.activity.share.player.a$a;
import androidx.lifecycle.ViewModel;
import swc.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import di0.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel$mEditorPictureList$1;
import msd.p;
import di0.b$a;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel$mCurrentWorkspaceType$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yw8.b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.kotlin.livedata.ListHolder;
import nsd.u;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicInteger;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.lifecycle.LiveData;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.lang.Number;
import java.lang.Boolean;

public class PicturesViewModel extends ViewModel implements a$a	// class@001604
{
    public final MutableLiveData b;
    public Workspace$Type c;
    public final b d;
    public final p e;
    public final MutableLiveData f;
    public final f g;

    public void PicturesViewModel(f p0){
       a.p(p0, "picturesRepo");
       super();
       this.g = p0;
       this.b = new MutableLiveData();
       this.c = Workspace$Type.UNKNOWN;
       this.d = b.a.a(p0.j(), new PicturesViewModel$mEditorPictureList$1(this));
       this.e = s.c(new PicturesViewModel$mCurrentWorkspaceType$2(this));
       this.f = new MutableLiveData();
    }
    public final void A0(Workspace$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public void V(){
       b.a(this);
    }
    public void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewModel.class, "11")) {
          return;
       }
       a.p(p0, "picturesInfoList");
       return;
    }
    public b l0(){
       Object obj = PatchProxy.apply(null, this, PicturesViewModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(null, 1, null);
    }
    public void n(int p0){
       PicturesViewModel picturesView = PicturesViewModel.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, picturesView, "4")) {
          return;
       }
       this.b.setValue(new AtomicInteger(p0));
       Object[] objArray = new Object[0];
       a.D().w("PicturesViewModel", "changeCurrentPosition currentPosition:"+p0, objArray);
       return;
    }
    public final void o0(int p0){
       PicturesViewModel picturesView = PicturesViewModel.class;
       if (PatchProxy.isSupport(picturesView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, picturesView, "5")) {
          return;
       }
       AtomicInteger value = this.b.getValue();
       if (value != null) {
          value.set(p0);
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturesViewModel", "changeCurrentPosition currentPosition:"+p0, objArray);
       return;
    }
    public EditorSdk2V2$AnimatedSubAsset[] p0(EditorSdk2V2$AnimatedSubAsset[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicturesViewModel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "originSubAsset");
       return p0;
    }
    public final int q0(){
       AtomicInteger obj = PatchProxy.apply(null, this, PicturesViewModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.getValue();
       int i = (obj != null)? obj.get(): 0;
       return i;
    }
    public final List r0(){
       Object obj = PatchProxy.apply(null, this, PicturesViewModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.f();
    }
    public final MutableLiveData s0(){
       return this.b;
    }
    public final MutableLiveData t0(){
       Object obj = PatchProxy.apply(null, this, PicturesViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final MutableLiveData u0(){
       return this.f;
    }
    public final b v0(){
       return this.d;
    }
    public final List w0(){
       Object obj = PatchProxy.apply(null, this, PicturesViewModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.k();
    }
    public final f x0(){
       return this.g;
    }
    public final boolean y0(){
       Object obj = PatchProxy.apply(null, this, PicturesViewModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.g.i().getValue() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public void z0(){
    }
}
