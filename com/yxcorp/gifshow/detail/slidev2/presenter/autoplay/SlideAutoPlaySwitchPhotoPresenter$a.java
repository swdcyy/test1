package com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter$a;
import jm5.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import jm5.b;
import com.kwai.feature.api.danmaku.params.DanmakuSendType;
import nm5.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import kotlin.Triple;

public class SlideAutoPlaySwitchPhotoPresenter$a implements c	// class@0018ec
{
    public final SlideAutoPlaySwitchPhotoPresenter a;

    public void SlideAutoPlaySwitchPhotoPresenter$a(SlideAutoPlaySwitchPhotoPresenter p0){
       this.a = p0;
       super();
    }
    public void G(boolean p0,boolean p1){
       b.j(this, p0, p1);
    }
    public void H(boolean p0,DanmakuSendType p1,p p2){
       b.b(this, p0, p1, p2);
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter$a.class, "2")) {
          return;
       }
       SlideAutoPlaySwitchPhotoPresenter$a ta = this.a;
       if (ta.L != null) {
          ta.T.clear(15);
          this.a.F9();
       }
       return;
    }
    public void L(BaseEditorFragment$g p0){
       b.d(this, p0);
    }
    public void S(float p0,float p1){
       b.a(this, p0, p1);
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter$a.class, "1")) {
          return;
       }
       SlideAutoPlaySwitchPhotoPresenter$a ta = this.a;
       if (ta.L != null) {
          ta.T.set(15);
          this.a.G9();
       }
       return;
    }
    public void e0(){
       b.i(this);
    }
    public void f0(){
       b.l(this);
    }
    public void j0(){
       b.c(this);
    }
    public void p(){
       b.k(this);
    }
    public void v0(boolean p0){
       b.h(this, p0);
    }
    public void w0(Triple p0){
       b.f(this, p0);
    }
}
