package com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import voc.y;
import androidx.lifecycle.ViewModel;
import uwc.b;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import di0.b;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel$mFineTuningItemUiDataList$1;
import msd.p;
import di0.b$a;
import java.util.ArrayList;
import androidx.lifecycle.MutableLiveData;
import voc.x;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import ica.a;

public final class FineTuningViewModel extends ViewModel implements y	// class@001bac
{
    public final b b;
    public ArrayList c;
    public int d;
    public LiveData e;
    public LiveData f;
    public final b g;
    public final FineTuningRepo h;

    public void FineTuningViewModel(b p0,FineTuningRepo p1){
       a.p(p0, "editPicturesViewModel");
       a.p(p1, "fineTuningRepo");
       super();
       this.g = p0;
       this.h = p1;
       this.b = b.a.a(p1.b, new FineTuningViewModel$mFineTuningItemUiDataList$1(this));
       this.c = new ArrayList();
       this.d = -1;
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public final LiveData o0(){
       return this.e;
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public final void p0(int p0){
       FineTuningViewModel uFineTuningV = FineTuningViewModel.class;
       if (PatchProxy.isSupport(uFineTuningV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFineTuningV, "4")) {
          return;
       }
       uFineTuningV = this.e;
       Objects.requireNonNull(uFineTuningV, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.yxcorp.gifshow.editor.fine.tuning.data.FineTuningItemUiData?>");
       uFineTuningV.setValue(null);
       this.d = p0;
       this.g.n(p0);
       this.h.d(this.d, 2);
       Object[] objArray = new Object[0];
       a.D().w("FineTuningViewModel", "onPositionChanged mPosition:"+this.d, objArray);
       return;
    }
    public final void q0(boolean p0){
       FineTuningViewModel uFineTuningV = FineTuningViewModel.class;
       if (PatchProxy.isSupport(uFineTuningV) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFineTuningV, "7")) {
          return;
       }
       this.g.X0(p0, this.d, 2);
       if (p0) {
          a.a.a("RESET_ADJUST", this.d, this.h.b());
       }
       Object[] objArray = new Object[0];
       a.D().w("FineTuningViewModel", "showOrigin withoutFineTuning:"+p0, objArray);
       return;
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, FineTuningViewModel.class, "9")) {
          return;
       }
       x.a(this);
       this.h.c(false);
       this.g.X0(false, -10086, 2);
       a.a.a("ADJUST_DATAIL_CANCEL", this.d, this.h.b());
       Object[] objArray = new Object[false];
       a.D().w("FineTuningViewModel", "discardEditChanges", objArray);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, FineTuningViewModel.class, "8")) {
          return;
       }
       x.j(this);
       this.h.c(true);
       a.a.a("ADJUST_DATAIL_ENSURE", this.d, this.h.b());
       Object[] objArray = new Object[0];
       a.D().w("FineTuningViewModel", "saveEditorChanges", objArray);
       return;
    }
    public void z2(){
       x.c(this);
    }
}
