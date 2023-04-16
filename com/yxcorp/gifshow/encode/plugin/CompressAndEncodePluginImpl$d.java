package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$d;
import io.reactivex.g;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.String;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import android.app.Activity;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Integer;
import java.lang.Math;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$c;
import java.io.File;
import java.util.Random;
import com.yxcorp.utility.i;
import wkd.b;
import j80.c;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$d$a;
import com.yxcorp.utility.i$d;
import java.lang.Throwable;

public final class CompressAndEncodePluginImpl$d implements g	// class@000d3d
{
    public final CompressAndEncodePluginImpl b;
    public final Ref$ObjectRef c;
    public final String d;
    public final JsSelectMixMediasParams$ImageCompressConfig e;
    public final Activity f;

    public void CompressAndEncodePluginImpl$d(CompressAndEncodePluginImpl p0,Ref$ObjectRef p1,String p2,JsSelectMixMediasParams$ImageCompressConfig p3,Activity p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void subscribe(v p0){
       String absolutePath;
       CompressAndEncodePluginImpl$d e1;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, CompressAndEncodePluginImpl$d.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       if (p0.isDisposed()) {
          return;
       }
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = false;
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       Ref$ObjectRef element = obj.c.element;
       if (element != null && !element.intValue()) {
          e1 = obj.d;
       }else {
          uBooleanRef.element = true;
          CompressAndEncodePluginImpl$d e = obj.e;
          CompressAndEncodePluginImpl$c uoc = obj.b.n70(obj.d, Math.max(e.mMaxWidth, e.mMaxHeight));
          objectRef.element = uoc;
          absolutePath = uoc.a.getAbsolutePath();
          a.o(absolutePath, "videoCoverInfo.file.absolutePath");
       }
       CompressAndEncodePluginImpl$d uod = absolutePath;
       e1 = obj.e;
       CompressAndEncodePluginImpl$d$a uod$a = new CompressAndEncodePluginImpl$d$a(this, objectRef, uBooleanRef, uod, p0);
       i.a().c(obj.f, b.a(-1504323719).o(), uod, e1.mMaxWidth, e1.mMaxHeight, e1.mMaxFileSize, new Random().nextInt(), v16);
       return;
    }
}
