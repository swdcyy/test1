package com.kuaishou.live.preview.item.view.LivePreviewRedPacketCountDownView;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import android.content.Context;
import com.yxcorp.utility.f;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import crd.b;
import lnc.b9;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePreviewRedPacketCountDownView extends KwaiBaseTextView	// class@000e58
{
    public final f n;
    public b o;
    public LivePreviewRedPacketCountDownView$a p;
    public static final int q;

    public void LivePreviewRedPacketCountDownView(Context p0){
       super(p0);
       this.n = f.d();
    }
    public void LivePreviewRedPacketCountDownView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.n = f.d();
    }
    public void LivePreviewRedPacketCountDownView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = f.d();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRedPacketCountDownView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.t();
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, LivePreviewRedPacketCountDownView.class, "4")) {
          return;
       }
       b9.a(this.o);
       this.p = null;
       return;
    }
    public final String u(long p0){
       String obj;
       if (PatchProxy.isSupport(LivePreviewRedPacketCountDownView.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, LivePreviewRedPacketCountDownView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = p0 / 0xea60;
       p0 = (p0 - (0xea60 * l)) / 1000;
       obj = "0";
       String str = (l - 10 < 0)? obj+l: String.valueOf(l);
       String str1 = (p0 - 10 < 0)? obj+p0: String.valueOf(p0);
       return str+":"+str1;
    }
}
