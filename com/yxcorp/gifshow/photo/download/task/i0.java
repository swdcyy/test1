package com.yxcorp.gifshow.photo.download.task.i0;
import io.reactivex.g;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kxb.e;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import android.app.Activity;
import u07.t$a;
import java.lang.CharSequence;
import ixb.u1;
import u07.u;
import ixb.k1;
import u07.f;
import ixb.n2;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class i0 implements g	// class@000f00
{
    public final n0 b;

    public void i0(n0 p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n0.class, "17")) {
       }else {
          i3 oi3 = i3.f();
          oi3.d("notice", "download_in_4g");
          e.h(tb.b.mEntity, "PHOTO_DOWNLOAD_SHARE_DIALOG_UPLOAD", oi3.e(), 4);
          Object[] objArray = new Object[]{new DecimalFormat("0.0").format((tb.f.mVideoSize / 0x100000))+"MB"};
          t$a uoa = new t$a(tb.c);
          uoa.z0(String.format(tb.c.getString(R.string.arg_RES_7f10505f), objArray));
          uoa.Q0(R.string.cancel);
          uoa.S0(R.string.arg_RES_7f100ecb);
          uoa.u0(new u1(tb, p0));
          uoa.t0(new k1(tb));
          f.e(uoa);
          uoa.Y(new n2(tb, p0));
       }
       return;
    }
}
