package com.kwai.live.gzone.commandlottery.h;
import uo7.d;
import java.lang.Object;
import java.lang.String;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.c;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sharelib.model.PainterModel;
import oic.s2;

public class h implements d	// class@000c99
{

    public void h(){
       super();
    }
    public boolean M3(String p0,String p1,String p2,ShareAnyResponse$ShareObject p3){
       return c.a(this, p0, p1, p2, p3);
    }
    public Bitmap h3(Bitmap p0,String p1,String p2,String p3,ShareAnyResponse$ShareObject p4){
       ShareAnyResponse$ShareObject obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.n(p2, "PICTURE")) {
          obj = p4.mPainterModel;
          if (obj != null && (obj.mImageContent != null && !TextUtils.x(obj.mType))) {
             p0 = new s2().h3(p0, p1, p2, p3, p4);
          }
       }
       return p0;
    }
}
