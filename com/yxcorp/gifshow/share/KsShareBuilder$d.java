package com.yxcorp.gifshow.share.KsShareBuilder$d;
import uo7.e;
import com.yxcorp.gifshow.share.KsShareBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import qrd.l1;
import android.app.Activity;
import uo7.l;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class KsShareBuilder$d implements e	// class@001b44
{
    public ProgressFragment a;
    public final KsShareBuilder b;

    public void KsShareBuilder$d(KsShareBuilder p0){
       this.b = p0;
       super();
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, KsShareBuilder$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 500;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, KsShareBuilder$d.class, "1")) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.setCancelable(true);
       progressFrag.Ih(R.string.arg_RES_7f10161d);
       this.a = progressFrag;
       Activity uActivity = this.b.b();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       c supportFragm = uActivity.getSupportFragmentManager();
       a.o(supportFragm, "\(mCurrentActivity as Gif¡­y\).supportFragmentManager");
       KsShareBuilder$d ta = this.a;
       if (ta != null) {
          ta.show(supportFragm, "forward");
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KsShareBuilder$d.class, "2")) {
          return;
       }
       KsShareBuilder$d ta = this.a;
       if (ta != null) {
          ta.dismiss();
       }
       this.a = null;
       return;
    }
}
