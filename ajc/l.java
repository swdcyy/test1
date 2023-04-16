package ajc.l;
import erd.o;
import com.yxcorp.gifshow.share.wechat.WechatPictureForward;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.System;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import n80.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import android.net.Uri;
import com.yxcorp.gifshow.util.j;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.WechatForward;
import brd.t;

public final class l implements o	// class@000140
{
    public final WechatPictureForward b;
    public final KwaiOperator c;

    public void l(WechatPictureForward p0,KwaiOperator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       long l;
       t ot = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "bmp");
          l = System.currentTimeMillis();
          File uFile = b.Y(b.a(-1504323719).o(), "system_share_photo", ".jpg");
          String absolutePath = uFile.getAbsolutePath();
          if (absolutePath == null) {
             absolutePath = "";
          }
          this.b.A0(absolutePath, this.c, p0);
          Object[] objArray = new Object[0];
          b.C().s("SystemPhotoForward", "generateShareImg end"+(System.currentTimeMillis() - l), objArray);
          j.e(this.c.c(), "image/*", uFile);
          p0 = this.b;
          ot = p0.c0(p0.G(this.c.i()), this.c, "image");
       }
       return ot;
    }
}
