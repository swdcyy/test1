package com.yxcorp.gifshow.widget.record.CoverVideoView$onVideoSizeChangedListener$1;
import msd.s;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.TextureView;

public final class CoverVideoView$onVideoSizeChangedListener$1 extends Lambda implements s	// class@0019b8
{
    public final CoverVideoView this$0;

    public void CoverVideoView$onVideoSizeChangedListener$1(CoverVideoView p0){
       this.this$0 = p0;
       super(5);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4){
       this.invoke(p0, p1.intValue(), p2.intValue(), p3.intValue(), p4.intValue());
       return l1.a;
    }
    public final void invoke(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(CoverVideoView$onVideoSizeChangedListener$1.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CoverVideoView$onVideoSizeChangedListener$1.class, "1")) {
             return;
          }
       }
       a.p(p0, "mp");
       Object[] objArray1 = new Object[0];
       String str = "CoverVideoView";
       a.D().w(str, "onVideoSizeChanged : "+p1+", "+p2, objArray1);
       CoverVideoView$onVideoSizeChangedListener$1 tthis$0 = this.this$0;
       if (tthis$0.f != null) {
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.isSupport(CoverVideoView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), tthis$0, CoverVideoView.class, "7") && tthis$0.i != null)) {
             CoverVideoView b = tthis$0.b;
             if (b == null) {
                a.S("textureView");
             }
             ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
             Object[] objArray2 = new Object[0];
             a.D().w(str, "adjustPlayerLayout : "+p2+' '+p1+" , "+b.getHeight()+' '+b.getWidth(), objArray2);
             float f = ((float)p2 * 0x3f800000) / (float)p1;
             float f1 = ((float)b.getHeight() * 0x3f800000) / (float)b.getWidth();
             if (p1 >= p2 || f - f1 > 0) {
                p1 = b.getWidth();
                layoutParams.width = p1;
                layoutParams.height = (int)(f * (float)p1);
             }else {
                p1 = b.getHeight();
                layoutParams.height = p1;
                layoutParams.width = (int)((float)p1 / f);
             }
             b.requestLayout();
             tthis$0.i = false;
          }
       }
       return;
    }
}
