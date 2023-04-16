package com.yxcorp.gifshow.encode.e0;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import lnc.i1;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import brd.g;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.media.util.MediaUtilityNativeWrapper;
import gq.a;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Float;
import pca.u1;
import com.yxcorp.gifshow.encode.s0;
import com.kwai.video.editorsdk2.Mp4Remuxer;
import mca.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import java.util.Objects;
import pca.m1;
import erd.f;

public final class e0 implements g	// class@000d17
{
    public final String b;
    public final String c;

    public void e0(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       String str1;
       boolean b;
       Object[] objArray;
       e0 tb = this.b;
       e0 tc = this.c;
       String str = "EncodingUtils";
       if (TextUtils.x(tb) || !b.R(new File(tb))) {
          str1 = "encodeNormalVideoFile, inputFilePath:"+tb+" is null or is not file";
          i1.a(str, str1);
          p0.onError(new IllegalArgumentException(str1));
       }else if(TextUtils.x(tc)){
          str1 = "encodeNormalVideoFile, outputFilePath:"+tb+" is null";
          i1.a(str, str1);
          p0.onError(new IllegalArgumentException(str1));
       }else {
          File obj = PatchProxy.applyOneRefs(tb, null, c.class, "19");
          b = (obj != PatchProxyResult.class)? obj.booleanValue(): MediaUtilityNativeWrapper.isFmp4File(tb);
          int i = 0;
          if (!b) {
             objArray = new Object[i];
             a.D().w(str, "encodeNormalVideoFile video is not fmp4", objArray);
             obj = new File(tb);
             if (!TextUtils.x(tc)) {
                PostUtils.c(obj, new File(tc));
             }
             p0.onNext(Float.valueOf(0x3f800000));
             p0.onComplete();
          }else {
             objArray = new Object[i];
             a.D().w(str, "encodeFmp4ToMp4", objArray);
             obj = new File(tc);
             String absolutePath = obj.getAbsolutePath();
             u1 ou1 = new u1(p0, obj);
             Mp4Remuxer mp4Remuxer = PatchProxy.applyThreeRefs(tb, absolutePath, ou1, null, s0.class, "8");
             if (mp4Remuxer != PatchProxyResult.class) {
             }else {
                a.u();
                mp4Remuxer = new Mp4Remuxer(a.a().a());
                mp4Remuxer.startRemux(tb, absolutePath, ou1);
             }
             Objects.requireNonNull(mp4Remuxer);
             p0.setCancellable(new m1(mp4Remuxer));
          }
       }
       return;
    }
}
