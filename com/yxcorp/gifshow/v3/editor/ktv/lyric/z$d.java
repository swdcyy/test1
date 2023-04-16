package com.yxcorp.gifshow.v3.editor.ktv.lyric.z$d;
import voc.y;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Integer;
import java.lang.Runnable;
import android.view.View;
import drc.k;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import uaa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.editor.i;
import com.kuaishou.edit.draft.FeatureId;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper;
import orc.f;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import huc.d;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter$Action;
import io.reactivex.subjects.PublishSubject;
import dvc.g;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import ooc.p0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z$d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import brd.y;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class z$d implements y	// class@000fee
{
    public final z b;

    public void z$d(z p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       if (PatchProxy.applyVoid(null, this, z$d.class, "3")) {
          return;
       }
       this.b.U.D0().setValue(Integer.valueOf(0));
       z$d tb = this.b;
       tb.q.removeCallbacks(tb.Z);
       this.b.P.post(new k(this));
       return;
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, z$d.class, "2")) {
          return;
       }
       this.b.P.R();
       this.b.w.E0().g0().j();
       this.b.y.c(false);
       this.b.U.c1(Integer.valueOf(15));
       z$d tb = this.b;
       tb.x.c(d.i(f.a(tb.R.d()), false));
       this.b.U.n1();
       this.b.I.onNext(ReEditCoverPresenter$Action.DISCARD);
       this.b.w.E0().j();
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, z$d.class, "1")) {
          return;
       }
       this.b.R.h();
       this.b.X.a();
       this.b.w.E0().g0().f();
       this.b.y.c(true);
       this.b.U.l1();
       this.b.U.n1();
       z o = this.b.O;
       if (o != null && o.getKaraokeType() != 1) {
          p.r(this.b.y.e(), this.b.O);
          p.q(this.b.y);
       }
       this.b.I.onNext(ReEditCoverPresenter$Action.SAVE);
       String str = this.b.U.V0();
       String str1 = this.b.N.s0();
       if (!PatchProxy.applyVoidTwoRefs(str, str1, null, p0.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LYRIC";
          i3 oi3 = i3.f();
          oi3.d("font_name", str1);
          oi3.d("feature_id", str);
          uElementPack.params = oi3.e();
          u1.u(true, uElementPack, null);
       }
       this.b.w.E0().f();
       return;
    }
    public void z2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z$d.class, "4")) {
          return;
       }
       this.b.P.getViewTreeObserver().addOnGlobalLayoutListener(new z$d$a(this));
       z$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, z.class, "6") && tb.W == null) {
          tb.W = true;
          if (TextUtils.x(tb.U.V0())) {
             boolean b = tb.X.d();
             ArrayList uArrayList = tb.X.b();
             if (!b && uArrayList != null) {
                if (!uArrayList.isEmpty()) {
                   tb.R.b.onNext(tb.X.b());
                }
             }else if(b){
                tb.X.a();
             }
             tb.P8();
          }
       }
       z v = this.b.V;
       if (v != null && !v.isReleased()) {
          this.b.V.setLoop(true);
          if (!this.b.V.isPlaying()) {
             this.b.V.play();
          }
       }
       tb = this.b;
       tb.q.post(tb.Z);
       return;
    }
}
