package com.kwai.sharelib.KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import uo7.h0;
import java.util.ArrayList;
import com.kwai.sharelib.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.kwai.sharelib.model.ShareInitResponse;
import ip7.h;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import au6.e;
import java.lang.StringBuilder;
import uo7.k;
import java.lang.Throwable;

public final class KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2 extends Lambda implements a	// class@0016a2
{
    public final ShareInitResponse$SharePanelElement $element$inlined;
    public final i0 $it;
    public final h0 $ksShareUrlHdlMgr$inlined;
    public final ArrayList $operationRow$inlined;
    public final h $primeInfo$inlined;
    public final ShareInitResponse $response$inlined;
    public final ArrayList $ret$inlined;
    public final int $rowIndex$inlined;
    public final Ref$BooleanRef $titleUsed$inlined;
    public final a this$0;

    public void KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2(i0 p0,int p1,ShareInitResponse$SharePanelElement p2,h0 p3,ArrayList p4,a p5,Ref$BooleanRef p6,ShareInitResponse p7,h p8,ArrayList p9){
       this.$it = p0;
       this.$rowIndex$inlined = p1;
       this.$element$inlined = p2;
       this.$ksShareUrlHdlMgr$inlined = p3;
       this.$operationRow$inlined = p4;
       this.this$0 = p5;
       this.$titleUsed$inlined = p6;
       this.$response$inlined = p7;
       this.$primeInfo$inlined = p8;
       this.$ret$inlined = p9;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2.class, "1")) {
          return;
       }
       e.d(e.a, objArray, "showSharePanel item click "+this.$it.a(), 1, objArray);
       KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2 tthis$0 = this.this$0;
       tthis$0.h(tthis$0.g, this.$it.a(), 1, objArray);
       this.this$0.g.B(this.$ksShareUrlHdlMgr$inlined);
       PatchProxy.onMethodExit(KsShareManager$mapShareInitToOperation$$inlined$forEachIndexed$lambda$2.class, "1");
       return;
    }
}
