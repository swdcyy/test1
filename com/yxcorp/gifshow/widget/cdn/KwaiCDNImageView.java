package com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$b;
import nsd.u;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$a;
import java.lang.Runnable;
import zyc.b;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import ub.a;
import android.widget.ImageView;
import zyc.f;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView$c;
import java.io.File;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.download.DownloadManager;

public class KwaiCDNImageView extends KwaiBindableImageView	// class@001965
{
    public static final KwaiCDNImageView$b v;

    static {
       KwaiCDNImageView.v = new KwaiCDNImageView$b(null);
       b.a(KwaiCDNImageView$a.b);
    }
    public void KwaiCDNImageView(Context p0){
       super(p0, null, 2, null);
    }
    public void KwaiCDNImageView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.G1);
       a.o(typedArray, "context.obtainStyledAttr¡­yleable.KwaiCDNImageView\)");
       int resourceId = typedArray.getResourceId(0, 0);
       if (resourceId) {
          KwaiCDNImageView.q0(this, resourceId, typedArray.getInt(1, 0), null, 4, null);
       }
       return;
    }
    public void KwaiCDNImageView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public static void q0(KwaiCDNImageView p0,int p1,int p2,a p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.p0(p1, p2, p3);
       return;
    }
    public final void n0(int p0){
       KwaiCDNImageView.q0(this, p0, 0, null, 6, null);
    }
    public final void o0(int p0,int p1){
       KwaiCDNImageView.q0(this, p0, p1, null, 4, null);
    }
    public final void p0(int p0,int p1,a p2){
       Context context;
       String str2;
       KwaiCDNImageView$c uoc;
       String str = this.getContext().getString(p0);
       a.o(str, "context.getString\(tokenId\)");
       String str1 = "context";
       if (b.e()) {
          context = this.getContext();
          a.o(context, str1);
          str2 = f.d(context, "icon", str, p1);
          int i = (str2 == null || !str2.length())? 1: 0;
          if (!i) {
             uoc = new KwaiCDNImageView$c(this, str, str2, p1, p2);
             this.E(Uri.fromFile(new File(str2)), str2, 0, 0, v9);
             DownloadManager.C("design_kid_icon", "");
             return;
          }
       }
       context = this.getContext();
       a.o(context, str1);
       str2 = f.h(context, "icon", str, p1);
       if (str2 != null) {
          uoc = new KwaiCDNImageView$c(this, str, str2, p1, p2);
          this.E(Uri.parse(str2), str2, 0, 0, v9);
       }
       return;
    }
}
