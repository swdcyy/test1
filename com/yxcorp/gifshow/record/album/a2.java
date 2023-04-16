package com.yxcorp.gifshow.record.album.a2;
import io.reactivex.g;
import java.io.File;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import android.os.Parcelable;
import com.kwai.library.widget.popup.common.f;
import java.lang.CharSequence;
import k8c.a2;
import n3d.a;

public final class a2 implements g	// class@00170d
{
    public final File b;
    public final GifshowActivity c;

    public void a2(File p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       a2 tb = this.b;
       a2 tc = this.c;
       Intent intent = PatchProxy.applyTwoRefs(tb, tc, null, LocalAlbumUtils.class, "28");
       if (intent != PatchProxyResult.class) {
       }else {
          intent = new Intent("android.intent.action.SEND");
          intent.setType(TextUtils.u(tb.getAbsolutePath()));
          intent.putExtra("android.intent.extra.STREAM", LocalAlbumUtils.p(tb, tc));
          intent.setFlags(0x10000003);
       }
       Object[] objArray = new Object[0];
       Intent intent1 = Intent.createChooser(intent, f.m(R.string.arg_RES_7f104725, objArray));
       intent1.addFlags(0x10000000);
       tc.t1(intent1, 0, new a2(p0));
       return;
    }
}
