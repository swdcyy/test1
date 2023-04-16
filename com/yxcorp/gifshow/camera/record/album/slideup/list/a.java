package com.yxcorp.gifshow.camera.record.album.slideup.list.a;
import g9c.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a$a;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.models.QMedia;
import java.io.File;
import java.lang.Integer;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import lxa.a;
import wb5.e;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a$c;
import com.yxcorp.gifshow.camera.record.album.slideup.list.b;
import ub.b;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import x66.e;
import ekd.w0;
import jd.c;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import t45.d;
import brd.z;
import k79.i;
import java.util.Objects;
import wb9.b;
import k79.i$a;
import erd.o;
import wb9.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public class a extends a	// class@001cd4
{
    public final int g;
    public GifshowActivity h;
    public a$b i;
    public final View$OnClickListener j;

    public void a(GifshowActivity p0){
       super();
       this.g = a1.d(0x7f070092);
       this.j = new a$a(this);
       this.h = p0;
    }
    public final void X0(TextView p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "6")) {
          return;
       }
       if (p1 > 0) {
          Object[] objArray = new Object[]{Long.valueOf((p1 / 0xea60)),Long.valueOf(((p1 / 1000) % 60))};
          p0.setText(String.format("%d:%02d", objArray));
       }else {
          p0.setText("");
       }
       return;
    }
    public final void Y0(KwaiBindableImageView p0,QMedia p1,File p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, a.class, "4")) {
          return;
       }
       if (!p1.mRatio && p3) {
          QMedia mThumbnailFi = p1.mThumbnailFile;
          if (mThumbnailFi != null && mThumbnailFi.exists()) {
             BitmapFactory$Options options = new BitmapFactory$Options();
             options.inJustDecodeBounds = true;
             BitmapFactory.decodeFile(p1.mThumbnailFile.getAbsolutePath(), options);
             p1.mRatio = a.b(options.outWidth, options.outHeight, 0);
          }else if(p2 != null && p2.exists()){
             BitmapFactory$Options options1 = new BitmapFactory$Options();
             options1.inJustDecodeBounds = true;
             BitmapFactory.decodeFile(p2.getAbsolutePath(), options1);
             p1.mRatio = a.b(options1.outWidth, options1.outHeight, 0);
          }
       }
       e.a(p0, p1.mRatio, p3);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       i$a e;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          QMedia qMedia = this.N0(p1);
          if (qMedia != null) {
             a$c b = p0.b;
             a tg = this.g;
             b uob = new b(this, p0);
             int i = 1;
             object oobject = null;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{b,qMedia,Integer.valueOf(tg),Integer.valueOf(tg),Integer.valueOf(0),oobject,uob};
                if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
                label_005f :
                   if (qMedia.type == i) {
                      QMedia mThumbnailFi = qMedia.mThumbnailFile;
                      if (mThumbnailFi != null && mThumbnailFi.exists()) {
                         this.Y0(b, qMedia, oobject, 0);
                         b.w(qMedia.mThumbnailFile, tg, tg, uob);
                      }
                   }
                   if (qMedia.isImage()) {
                      e.a(b, qMedia.mRatio, 0);
                      b.C(Uri.fromFile(new File(qMedia.path)), tg, tg, true, uob);
                   }else {
                      File uFile = new File(qMedia.path);
                      File uFile1 = e.b(uFile, tg, tg);
                      if (uFile1.exists()) {
                         this.Y0(b, qMedia, uFile1, 0);
                         b.w(uFile1, tg, tg, uob);
                      }else {
                         b.F(w0.c(uFile), tg, tg, null, uob);
                      }
                   }
                }
             }else {
                goto label_005f ;
             }
             b = p0.c;
             if (!PatchProxy.applyVoidTwoRefs(b, qMedia, this, uoa, "5")) {
                long l = 0;
                if (qMedia.isVideo()) {
                   QMedia duration = qMedia.duration;
                   if (duration - l > 0) {
                      this.X0(b, duration);
                   }else {
                      this.X0(b, l);
                      b.setTag(R.id.media_item, qMedia);
                      e = i.e;
                      Objects.requireNonNull(e);
                      t.just(qMedia).compose(c.c(this.h.m(), ActivityEvent.DESTROY)).subscribeOn(d.c).map(new b(e)).observeOn(d.a).subscribe(new a(this, b), Functions.d());
                   }
                }else {
                   this.X0(b, l);
                }
             }
             p0.a.setTag(R.id.media_item, qMedia);
             p0.a.setTag(R.id.media_position, Integer.valueOf(p1));
             p0.a.setOnClickListener(this.j);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$c uoc;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoc != PatchProxyResult.class) {
          label_002e :
             return uoc;
          }
       }
       uoc = new a$c(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d00aa, p0, false));
       goto label_002e ;
    }
}
