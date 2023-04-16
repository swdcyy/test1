package com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a;
import androidx.viewpager.widget.ViewPager$i;
import hf5.h;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class NasaMilanoDuplicateRealShowPresenter extends PresenterV2	// class@0020d6
{
    public BaseFragment p;
    public h q;
    public SlidePlayViewModel r;
    public t s;
    public final p t;

    public void NasaMilanoDuplicateRealShowPresenter(){
       super();
       this.t = s.c(new NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaMilanoDuplicateRealShowPresenter.class, "7")) {
          return;
       }
       NasaMilanoDuplicateRealShowPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       this.r = SlidePlayViewModel.S0(tp);
       tp = this.q;
       if (tp == null) {
          a.S("mSlidePlayVMMilanoProtocol");
       }
       tp.b(this.P8(), true);
       PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, "7");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaMilanoDuplicateRealShowPresenter.class, "8")) {
          return;
       }
       NasaMilanoDuplicateRealShowPresenter tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayVMMilanoProtocol");
       }
       tq.g(this.P8());
       PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, "8");
       return;
    }
    public final NasaMilanoDuplicateRealShowPresenter$mAttachChangedListener$2$a P8(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaMilanoDuplicateRealShowPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, "6");
       return this.t.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaMilanoDuplicateRealShowPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("MILANO_SLIDE_PLAY_VM_PROTOCOL");
       a.o(obj, "inject\(MilanoAccessIds.M¡­O_SLIDE_PLAY_VM_PROTOCOL\)");
       this.q = obj;
       PatchProxy.onMethodExit(NasaMilanoDuplicateRealShowPresenter.class, "1");
       return;
    }
}
