package com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements$b;
import w4.c;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements;
import java.util.Map;
import java.lang.Object;
import w4.i;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.download.DownloadManager;
import kotlin.jvm.internal.a;
import java.util.Objects;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.graphics.BitmapFactory$Options;
import android.util.Base64;
import android.graphics.BitmapFactory;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.io.File;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import com.yxcorp.utility.TextUtils;

public final class Inflater$InitElements$b implements c	// class@001351
{
    public final Inflater$InitElements a;
    public final Map b;

    public void Inflater$InitElements$b(Inflater$InitElements p0,Map p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Bitmap a(i p0){
       File uFile;
       Inflater$InitElements initElements = Inflater$InitElements.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Inflater$InitElements$b obj = PatchProxy.applyOneRefs(p0, this, Inflater$InitElements$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       DownloadManager.C("live_voice_party_background", "");
       obj = this.a;
       a.o(p0, "asset");
       Objects.requireNonNull(obj);
       Bitmap uBitmap = PatchProxy.applyOneRefs(p0, obj, initElements, "6");
       if (uBitmap != patchProxyRe) {
       }else {
          String str1 = p0.c();
          a.o(str1, "filename");
          if (u.q2(str1, "data:", false, 2, null) && StringsKt__StringsKt.i3(str1, "base64,", 0, false, 6, null) > 0) {
             BitmapFactory$Options options = new BitmapFactory$Options();
             options.inScaled = true;
             options.inDensity = 160;
             char c = ',';
             int i = 0;
             boolean b = false;
             try{
                String str2 = str1;
                str1 = str1.substring((StringsKt__StringsKt.h3(str2, c, i, b, 6, null) + true));
                a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                byte[] uobyteArray = Base64.decode(str1, false);
                a.o(uobyteArray, "Base64.decode\(filename.s¡­ame.indexOf\(\',\'\) + 1\), 0\)");
                uBitmap = BitmapFactory.decodeByteArray(uobyteArray, false, uobyteArray.length, options);
                if (uBitmap != null && (uBitmap.getWidth() != p0.e() || uBitmap.getHeight() != p0.d())) {
                   uBitmap = Bitmap.createScaledBitmap(uBitmap, p0.e(), p0.d(), true);
                }
             }catch(java.lang.IllegalArgumentException e2){
                b.k0(LiveLogTag.LIVE_VOICE_PARTY, "decodeLottieBuiltInBitmap failed ["+p0.c()+']', e2);
             }
          label_00c1 :
             uBitmap = null;
          }else {
             goto label_00c1 ;
          }
       }
       if (uBitmap != null) {
          return uBitmap;
       }else {
          obj = this.b;
          if (obj != null) {
             uFile = obj.get(p0.c());
             if (uFile != null) {
             label_0101 :
                Inflater$InitElements$b ta = this.a;
                Objects.requireNonNull(ta);
                Bitmap uBitmap1 = PatchProxy.applyTwoRefs(uFile, p0, ta, initElements, "7");
                if (uBitmap1 != patchProxyRe) {
                }else {
                   uBitmap1 = BitmapFactory.decodeFile(uFile.getAbsolutePath());
                   if (uBitmap1 != null && (uBitmap1.getWidth() != p0.e() || uBitmap1.getHeight() != p0.d())) {
                      uBitmap1 = Bitmap.createScaledBitmap(uBitmap1, p0.e(), p0.d(), true);
                   }
                }
                return uBitmap1;
             }
          }
          Inflater d = this.a.b.d;
          String str = (TextUtils.x(p0.b()))? p0.c(): new File(p0.b(), p0.c()).getPath();
          uFile = new File(d, str);
          goto label_0101 ;
       }
    }
}
