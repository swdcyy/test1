package com.yxcorp.gifshow.activity.share.presenter.j2$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.j2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import f66.i;
import jq.a;
import q87.c;
import android.widget.Button;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import lnc.a1;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;
import com.kuaishou.weapon.i.WeaponHI;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest;
import xw8.p0;
import java.util.Iterator;
import java.util.Set;
import xw8.p0$c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import xw8.p0$d;
import com.yxcorp.gifshow.custom.b;
import zw8.v4;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import zw8.u4;
import erd.o;
import zw8.r4;
import erd.a;
import zw8.s4;
import zw8.t4;
import erd.g;
import crd.b;
import crd.a;

public class j2$a extends m	// class@0013f4
{
    public final j2 c;

    public void j2$a(j2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       j2 oj2 = j2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, j2$a.class, "1")) {
          return;
       }
       j2$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, oj2, "5")) {
          j2 q = tc.q;
          int i = 0;
          if (q == null) {
             Object[] objArray1 = new Object[i];
             a.b().t("ShareUpdatePhotoPresenter", "showLoading mV2PublishButton is null", objArray1);
          }else {
             int i1 = 0x7f100f16;
             q.setText(i1);
             if (tc.x == null) {
                AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                tc.x = uAttrAnimPro;
                uAttrAnimPro.wh(a1.p(i1));
                tc.x.setCancelable(i);
             }
             tc.x.Cb(tc.w.getSupportFragmentManager(), "ShareUpdatePhotoPresenter");
          }
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, oj2, "4")) {
          oj2 = tc.r;
          if (oj2 != null) {
             WeaponHI.setP(13, oj2.j(), tc.r.length());
          }
          UploadRequest$a uoa = UploadRequest.newBuilder();
          Iterator iterator = tc.u.q.iterator();
          while (iterator.hasNext()) {
             iterator.next().e1(uoa);
          }
          VideoContext videoContext = new VideoContext();
          iterator = tc.u.r.iterator();
          while (iterator.hasNext()) {
             p0$d uod = iterator.next();
             if (uod instanceof b) {
                uod.j7(videoContext);
             }
          }
          tc.y.c(t.fromCallable(new v4(tc)).subscribeOn(d.c).observeOn(d.a).flatMap(new u4(tc, videoContext)).doOnTerminate(new r4(tc)).subscribe(new s4(tc), new t4(tc)));
       }
       return;
    }
}
