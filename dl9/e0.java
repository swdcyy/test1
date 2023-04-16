package dl9.e0;
import android.view.View$OnClickListener;
import dl9.m0;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.model.mix.QComment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import ek9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tbruyelle.rxpermissions2.g;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.comment.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import yk9.d;
import k2b.e0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class e0 implements View$OnClickListener	// class@001f59
{
    public final m0 b;

    public void e0(m0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e0 tb = this.b;
       tb.R8();
       m0 v = tb.v;
       QComment mEmotionInfo = tb.p.mEmotionInfo;
       Activity activity = tb.getActivity();
       m0 q = tb.q;
       m0 r = tb.r;
       Objects.requireNonNull(v);
       if (PatchProxy.applyVoidFourRefs(mEmotionInfo, activity, q, r, v, e.class, "2")) {
       }else if(activity == null){
          a uoa = new a(v, mEmotionInfo, q, r, activity);
          a.j(new g(activity), activity, "android.permission.WRITE_EXTERNAL_STORAGE", false).observeOn(d.a).subscribe(v11, Functions.d());
       }
       return;
    }
}
