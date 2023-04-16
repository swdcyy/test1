package com.yxcorp.gifshow.v3.editor.cover.n;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import java.util.List;
import android.view.ViewPropertyAnimator;
import ppc.o;
import java.lang.Runnable;
import ooc.g1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class n implements View$OnClickListener	// class@000e85
{
    public final s b;

    public void n(s p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       s o = tb.O;
       if (o != null) {
          o.onNext(Boolean.TRUE);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, s.class, "14")) {
          CoverTextLibraryFragment uCoverTextLi = new CoverTextLibraryFragment(tb, tb.H);
          tb.R = uCoverTextLi;
          uCoverTextLi.Rh(tb.U);
          tb.L.animate().translationY(0).setDuration(300).withEndAction(new o(tb)).start();
       }
       if (!PatchProxy.applyVoid(objArray, objArray, g1.class, "50")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MORE_SELECT_COVER";
          uElementPack.type = 1;
          u1.u(6, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
}
