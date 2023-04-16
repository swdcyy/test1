package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$a;
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
import java.io.ByteArrayInputStream;
import android.util.Base64;
import java.io.InputStream;
import android.graphics.BitmapFactory;

public final class ForwardPicSectionFragment$a implements ForwardPicSectionFragment$c	// class@001ced
{
    public Bitmap a;
    public final String b;

    public void ForwardPicSectionFragment$a(String p0){
       a.p(p0, "base64");
       super();
       this.b = p0;
    }
    public boolean a(KwaiImageView p0){
       boolean b;
       ForwardPicSectionFragment$a obj = PatchProxy.applyOneRefs(p0, this, ForwardPicSectionFragment$a.class, "2");
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
       ForwardPicSectionFragment$a obj = PatchProxy.apply(objArray, this, ForwardPicSectionFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          Bitmap uBitmap = BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode(this.b, 0)));
          if (uBitmap != null) {
             this.a = uBitmap;
          }else {
          label_002b :
             return objArray;
          }
       }
       objArray = obj;
       goto label_002b ;
    }
}
