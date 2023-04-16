package com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import eb7.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2 extends Lambda implements l	// class@001320
{
    public final Ref$ObjectRef $mId;
    public final PicTemplateInfo $picTemplateInfo$inlined;
    public final a $this_downloadPicTemplate$inlined;

    public void PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2(Ref$ObjectRef p0,a p1,PicTemplateInfo p2){
       this.$mId = p0;
       this.$this_downloadPicTemplate$inlined = p1;
       this.$picTemplateInfo$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2.class, "1")) {
          return;
       }
       this.$this_downloadPicTemplate$inlined.b(this.$mId.element);
       PatchProxy.onMethodExit(PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2.class, "1");
       return;
    }
}
