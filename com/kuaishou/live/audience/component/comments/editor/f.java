package com.kuaishou.live.audience.component.comments.editor.f;
import io.reactivex.g;
import zx0.u;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.comments.editor.f$a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.audience.component.comments.editor.f$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.lang.NullPointerException;

public final class f implements g	// class@000aae
{
    public final u b;
    public final boolean c;

    public void f(u p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "observableEmitter");
       u e = this.b.E;
       if (e != null) {
          e.k0(new f$a(this, p0));
       }
       this.b.b9();
       e = this.b.E;
       if (e != null) {
          e.ai(new f$b(this, p0));
       }
       try{
          f tb = this.b;
          e = tb.E;
          if (e != null) {
             Activity activity = tb.getActivity();
             if (activity != null) {
                e.show(activity.getSupportFragmentManager(), "editor");
             }else {
                throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             }
          }
          this.b.c9(false);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
