package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1$onProgress$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.widget.TextView;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;

public final class ShareStyleSelectHelper$autoDownloadVideo$1$onProgress$1 extends Lambda implements a	// class@001b9b
{
    public final Ref$ObjectRef $downloadText;
    public final int $percent;
    public final ShareStyleSelectHelper$autoDownloadVideo$1 this$0;

    public void ShareStyleSelectHelper$autoDownloadVideo$1$onProgress$1(ShareStyleSelectHelper$autoDownloadVideo$1 p0,int p1,Ref$ObjectRef p2){
       this.this$0 = p0;
       this.$percent = p1;
       this.$downloadText = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, ShareStyleSelectHelper$autoDownloadVideo$1$onProgress$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper.e(this.this$0.b).setPercent((float)this.$percent);
       Object[] objArray = new Object[]{this.$downloadText.element};
       String str = String.format("œ¬‘ÿ÷– %1$s%%", Arrays.copyOf(objArray, 1));
       a.o(str, "java.lang.String.format\(format, *args\)");
       ShareStyleSelectHelper.f(this.this$0.b).setText(str);
       return;
    }
}
