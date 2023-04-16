package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$d;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Bitmap;
import java.net.URL;
import java.io.InputStream;
import android.graphics.BitmapFactory;

public final class ForwardPicSectionFragment$d implements ForwardPicSectionFragment$c	// class@001cf0
{
    public Bitmap a;
    public final String b;

    public void ForwardPicSectionFragment$d(String p0){
       a.p(p0, "url");
       super();
       this.b = p0;
    }
    public boolean a(KwaiImageView p0){
       boolean b;
       ForwardPicSectionFragment$d obj = PatchProxy.applyOneRefs(p0, this, ForwardPicSectionFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "imageView");
       obj = this.a;
       if (obj != null) {
          p0.setImageBitmap(obj);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public Bitmap getBitmap(){
       Object[] objArray = null;
       ForwardPicSectionFragment$d obj = PatchProxy.apply(objArray, this, ForwardPicSectionFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          Bitmap uBitmap = BitmapFactory.decodeStream(new URL(this.b).openStream());
          if (uBitmap != null) {
             this.a = uBitmap;
          }else {
          label_002a :
             return objArray;
          }
       }
       objArray = obj;
       goto label_002a ;
    }
}
