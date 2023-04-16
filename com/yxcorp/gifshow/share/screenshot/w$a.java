package com.yxcorp.gifshow.share.screenshot.w$a;
import uo7.d;
import com.yxcorp.gifshow.share.screenshot.w;
import java.lang.Object;
import java.lang.String;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import jp7.a;
import com.yxcorp.image.request.a;
import s0d.e;
import com.yxcorp.image.fresco.wrapper.c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.util.concurrent.ExecutionException;
import java.lang.InterruptedException;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.albumcontrol.a;
import android.content.ContentResolver;
import android.net.Uri;
import v79.a;
import com.yxcorp.gifshow.util.BitmapUtil$BitmapCropMode;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.CharSequence;
import java.lang.Exception;
import androidx.fragment.app.DialogFragment;

public class w$a implements d	// class@001c6a
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public boolean M3(String p0,String p1,String p2,ShareAnyResponse$ShareObject p3){
       return false;
    }
    public Bitmap h3(Bitmap p0,String p1,String p2,String p3,ShareAnyResponse$ShareObject p4){
       KwaiImageView kwaiImageVie;
       KwaiImageView kwaiImageVie1;
       TextView textView;
       TextView textView1;
       Bitmap uBitmap;
       float f;
       float f1;
       int height;
       Bitmap uBitmap1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       w$a uoa = w$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p2 = PatchProxy.apply(objArray, this, uoa, "1");
          if (p2 != patchProxyRe) {
             return p2;
          }
       }
       w$a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = PatchProxy.applyThreeRefs(p0, p1, p4, tb, w.class, "11");
       if (p0 != patchProxyRe) {
       }else {
          ViewGroup viewGroup = null;
          View view = LayoutInflater.from(a.b()).inflate(R.layout.arg_RES_7f0d133f, viewGroup);
          try{
             ShareAnyResponse$ShareObject mQrBytes = p4.mQrBytes;
             if (mQrBytes.length > 0) {
                viewGroup = a.a(mQrBytes[i]);
             }
             if (viewGroup == null) {
                mQrBytes = p4.mQrUrls;
                if (mQrBytes.length > 0) {
                   e uoe = a.u(mQrBytes[i]).q();
                   c uoc = c.w();
                   try{
                      a.d(uoe, uoc);
                      Drawable uDrawable = uoc.q();
                      if (uDrawable != null && uDrawable instanceof BitmapDrawable) {
                         viewGroup = uDrawable.getBitmap();
                      }
                   }catch(java.lang.InterruptedException e12){
                      e12.printStackTrace();
                   }catch(java.util.concurrent.ExecutionException e12){
                      e12.printStackTrace();
                   }
                }
             }
          }catch(java.lang.Exception e12){
             e12.printStackTrace();
             tb.p.dismissAllowingStateLoss();
          }
          view = BitmapUtil.f(view);
       }
       return p0;
    }
}
