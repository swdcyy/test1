package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$d$a;
import com.yxcorp.utility.i$d;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.String;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import android.graphics.BitmapFactory$Options;
import ekd.h0;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$c;
import com.yxcorp.gifshow.util.AdvEditUtil;
import brd.g;
import java.lang.Throwable;

public final class CompressAndEncodePluginImpl$d$a implements i$d	// class@000d3c
{
    public final CompressAndEncodePluginImpl$d a;
    public final Ref$ObjectRef b;
    public final Ref$BooleanRef c;
    public final String d;
    public final v e;

    public void CompressAndEncodePluginImpl$d$a(CompressAndEncodePluginImpl$d p0,Ref$ObjectRef p1,Ref$BooleanRef p2,String p3,v p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(){
    }
    public void b(String p0,int p1){
       if (PatchProxy.isSupport(CompressAndEncodePluginImpl$d$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CompressAndEncodePluginImpl$d$a.class, "1")) {
          return;
       }
       a.p(p0, "outputPath");
       return;
    }
    public void c(String p0,int p1){
       CompressAndEncodePluginImpl$d$a uod$a = CompressAndEncodePluginImpl$d$a.class;
       if (PatchProxy.isSupport(uod$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod$a, "2")) {
          return;
       }
       a.p(p0, "outputPath");
       BitmapFactory$Options options = h0.a(p0);
       JsSelectMixMediasStartResult$Data uData = new JsSelectMixMediasStartResult$Data();
       uData.mThumbWidth = options.outWidth;
       uData.mThumbHeight = options.outHeight;
       uData.mFilePath = p0;
       uData.mFileType = TextUtils.s(p0);
       uData.mThumbnailBase64 = b.w(new File(p0));
       Ref$ObjectRef element = this.b.element;
       if (element != null) {
          uData.mWidth = element.b;
          uData.mHeight = element.c;
          uData.mDuration = AdvEditUtil.i(this.a.d);
       }else {
          BitmapFactory$Options options1 = h0.a(this.a.d);
          uData.mWidth = options1.outWidth;
          uData.mHeight = options1.outHeight;
       }
       if (this.c.element != null) {
          new File(this.d).delete();
       }
       this.e.onNext(uData);
       this.e.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompressAndEncodePluginImpl$d$a.class, "3")) {
          return;
       }
       a.p(p0, "e");
       this.e.tryOnError(p0);
       return;
    }
}
