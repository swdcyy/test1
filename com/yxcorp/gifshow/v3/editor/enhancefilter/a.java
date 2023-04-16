package com.yxcorp.gifshow.v3.editor.enhancefilter.a;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import aw9.c0;
import uxb.u;
import uxb.l;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import sqc.a;
import android.content.Context;
import java.lang.Runnable;
import sqc.f;
import faa.a;
import q87.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel;
import androidx.lifecycle.ViewModel;
import sqc.t;
import sqc.c;
import androidx.fragment.app.FragmentActivity;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.Gson;
import sqc.t$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;

public class a extends BaseEditor	// class@000f83
{

    public void a(){
       super();
    }
    public void C(o p0){
    }
    public void D(boolean p0){
    }
    public boolean E(EditorDelegate p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (PostExperimentUtils.W0()) {
          this.d.O().play();
       }
       l.n().Fn(p0.q());
       if (!f.a(this.d.getContext(), new a(this, p0, p1))) {
          Object[] objArray = new Object[0];
          a.D().w("EnhanceFilterEditor", "onItemSelected enhance filter resource error", objArray);
          return true;
       }else {
          this.Q(p0, p1);
          return true;
       }
    }
    public boolean F(EditorDelegate p0,View p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (ViewModelProviders.of(this.d.q()).get(EnhanceFilterViewModel.class).p0()) {
          p1.setSelected(true);
          t.a(true);
       }else {
          p1.setSelected(false);
          t.a(false);
       }
       return true;
    }
    public void G(){
    }
    public void H(){
    }
    public void P(boolean p0){
       EnhanceFilterViewModel uEnhanceFilt = EnhanceFilterViewModel.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.w(this.d.getContext(), true)) {
          EnhanceFilterViewModel uEnhanceFilt1 = ViewModelProviders.of(this.d.q()).get(uEnhanceFilt);
          int i = uEnhanceFilt1.p0() ^ 0x01;
          if (!PatchProxy.isSupport(uEnhanceFilt) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), uEnhanceFilt1, uEnhanceFilt, "6")) {
             uEnhanceFilt1.l.s();
             c.p(uEnhanceFilt1.l, i, false, false, 6, null);
             uEnhanceFilt1.l.e(true);
          }
       }
       return;
    }
    public final void Q(EditorDelegate p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       BaseFragment uBaseFragmen = this.d.q();
       boolean b = true;
       if (this.w(this.d.getContext(), b) && (uBaseFragmen != null && (uBaseFragmen.getActivity() != null && !uBaseFragmen.isDetached()))) {
          this.L(p0);
          this.P(false);
          p1.setSelected((p1.isSelected() ^ b));
          Activity uActivity = this.d.getContext();
          boolean b1 = p1.isSelected();
          t ot = t.class;
          if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidTwoRefs(uActivity, Boolean.valueOf(b1), null, ot, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_INTELLIGENT_OPTIMIZE";
             Gson gson = new Gson();
             if (!b1) {
                b = 2;
             }
             uElementPack.params = gson.q(new t$a(b));
             u1.M("700564", uActivity, 1, uElementPack, null, null);
          }
       }
    label_0083 :
       return;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 2, this.i);
    }
    public int q(){
       return 0;
    }
}
