package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$a;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.share.util.PhotoForward;
import com.yxcorp.gifshow.share.OperationModel;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class PhotoForward$DefaultImpls$a implements Callable	// class@001c83
{
    public final PhotoForward b;
    public final OperationModel c;
    public final BaseFeed d;

    public void PhotoForward$DefaultImpls$a(PhotoForward p0,OperationModel p1,BaseFeed p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       PhotoForward$DefaultImpls$a uDefaultImpl = PatchProxy.apply(null, this, PhotoForward$DefaultImpls$a.class, "1");
       if (uDefaultImpl != PatchProxyResult.class) {
       }else {
          File uFile = new File(b.a(-1504323719).o(), this.d.getId()+"share.jpg");
          BitmapUtil.Q(this.b.y(this.c), uFile.getAbsolutePath(), 100);
          this.c.y(uFile);
          this.c.A(uFile);
          uDefaultImpl = this.c;
       }
       return uDefaultImpl;
    }
}
