package com.yxcorp.gifshow.photo.download.presenter.e;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.photo.download.presenter.f;
import java.io.File;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import lnc.a1;
import java.lang.CharSequence;
import gxb.w;
import android.view.View$OnClickListener;
import gxb.u;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import lxb.s;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.photo.download.task.s;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import ixb.y;
import java.lang.Boolean;

public final class e implements Callable	// class@000ee3
{
    public final f b;
    public final File c;

    public void e(f p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       ProgressFragment progressFrag = PatchProxy.apply(null, tb, f.class, "3");
       int i = 0;
       int i1 = 1;
       if (progressFrag != PatchProxyResult.class) {
       }else {
          progressFrag = new ProgressFragment();
          progressFrag.Eh(i, 100);
          progressFrag.setCancelable(i);
          progressFrag.Jh(a1.p(R.string.arg_RES_7f1001c7));
          progressFrag.Kh(i1);
          progressFrag.Ch(R.drawable.arg_RES_7f08234f);
          progressFrag.Bh(new w(tb));
          progressFrag.k0(new u(tb));
          progressFrag.show(tb.d.getSupportFragmentManager(), "runner");
       }
       tb.f = progressFrag;
       f c = tb.c;
       s.h(c, (tb.e.mNotNeedWaterMark ^ i1), s.m(c, tb.b.get(i).b), tc, tb.i, tb.j, tb.h);
       return Boolean.TRUE;
    }
}
