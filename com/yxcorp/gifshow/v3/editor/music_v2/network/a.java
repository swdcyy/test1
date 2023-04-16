package com.yxcorp.gifshow.v3.editor.music_v2.network.a;
import com.yxcorp.gifshow.music.utils.a$a;
import ftd.k;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import com.yxcorp.gifshow.music.utils.a;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kqb.b;
import java.lang.NullPointerException;
import kotlin.Result;
import qrd.j0;
import asd.c;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.System;
import nsd.r0;
import lnc.a1;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Arrays;
import android.net.Uri;
import com.kuaishou.android.model.music.MusicType;
import trc.t0;
import faa.a;
import q87.c;
import java.lang.Long;
import java.lang.StringBuilder;

public final class a implements a$a	// class@0010bd
{
    public final k a;
    public final RapRepo$Task b;
    public final a c;
    public final Music d;
    public final List e;

    public void a(k p0,RapRepo$Task p1,a p2,Music p3,List p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "2")) {
          return;
       }
       b.b(this, p0);
       this.c.b(this.d, this);
       a ta = this.a;
       if (p0 == null) {
          NullPointerException nullPointerE = new NullPointerException("error msg is Null");
       }
       ta.resumeWith(Result.constructor-impl(j0.a(p0)));
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
    public void b(File p0){
       QCurrentUser mE;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       b.a(this, p0);
       this.c.b(this.d, this);
       a tb = this.b;
       a td = this.d;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(td, p0, tb, RapRepo$Task.class, "9")) {
          a.p(td, "music");
          String str = null;
          String absolutePath = (p0 != null)? p0.getAbsolutePath(): str;
          td.mId = a.C(absolutePath, String.valueOf(System.currentTimeMillis()));
          absolutePath = a1.p(R.string.arg_RES_7f1040cf);
          a.o(absolutePath, "CommonUtil.string\(\n     ¡­ap_music_name\n          \)");
          Object[] objArray1 = new Object[]{mE.getName()};
          mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          absolutePath = String.format(absolutePath, Arrays.copyOf(objArray1, 1));
          a.o(absolutePath, "java.lang.String.format\(format, *args\)");
          td.mName = absolutePath;
          td.mArtist = "from rap";
          absolutePath = (p0 != null)? p0.getAbsolutePath(): str;
          td.mPath = absolutePath;
          td.mUploadTime = String.valueOf(System.currentTimeMillis());
          if (p0 != null) {
             str = Uri.fromFile(p0).toString();
          }
          td.mUrl = str;
          td.mType = MusicType.LOCAL;
          td.mAiRapStyle = tb.a.f();
       }
       this.a.resumeWith(Result.constructor-impl(this.d));
       Object[] objArray = new Object[0];
       a.D().w("RapRepo", "music download success", objArray);
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       if (PatchProxy.isSupport2(a.class, "3") && PatchProxy.applyVoidTwoRefsWithListener(Long.valueOf(p0), Long.valueOf(p1), this, a.class, "3")) {
          return;
       }
       b.c(this, p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("RapRepo", "music download progress"+((((float)p0 * 0x3f800000) / (float)p1) * 100.00f), objArray);
       PatchProxy.onMethodExit(a.class, "3");
       return;
    }
}
