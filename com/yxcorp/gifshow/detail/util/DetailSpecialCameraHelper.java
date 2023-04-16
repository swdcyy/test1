package com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper$postShowStartUpInfoMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper$a;
import tl8.d;
import ok.h;
import tl8.e;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import com.kuaishou.android.model.mix.PostShowInfo;
import ixc.c;
import java.lang.Boolean;
import c16.c;
import g26.d;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import s3b.a;

public final class DetailSpecialCameraHelper	// class@001a27
{
    public static final p a;
    public static Integer b;
    public static final DetailSpecialCameraHelper c;

    static {
       DetailSpecialCameraHelper.c = new DetailSpecialCameraHelper();
       DetailSpecialCameraHelper.a = s.c(DetailSpecialCameraHelper$postShowStartUpInfoMap$2.INSTANCE);
    }
    public void DetailSpecialCameraHelper(){
       super();
    }
    public final SimpleMagicFace a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailSpecialCameraHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = e.h(p0, PhotoMeta.class, DetailSpecialCameraHelper$a.b);
       int i = (list == null || list.isEmpty())? 1: 0;
       SimpleMagicFace simpleMagicF = (!i)? list.get(0): null;
       return simpleMagicF;
    }
    public final Map b(){
       Object obj = PatchProxy.apply(null, this, DetailSpecialCameraHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DetailSpecialCameraHelper.a.getValue();
    }
    public final boolean c(BaseFeed p0,PostShowInfo p1,c p2){
       boolean b1;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DetailSpecialCameraHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p1 = p1.mType;
       boolean b = true;
       if (p1 != b) {
          if (p1 != 2) {
             switch (p1){
                 case 5:
                 case 6:
                   Map a = MagicEmojiResourceHelper.a;
                   break;
                 case 7:
                   b = d.b();
                   break;
                 case 8:
                 case 10:
                 case 9:
                   b = c.c();
                   break;
                 default:
             }
          }
       }else if(this.a(p0) != null){
          if (p2 != null) {
             a uoa = p2.KA();
             if (uoa != null) {
                b1 = uoa.h(this.a(p0));
             label_004a :
                if (!b1) {
                label_004d :
                   b = false;
                }
             }
          }
          b1 = true;
          goto label_004a ;
       }else {
          goto label_004d ;
       }
       return b;
    }
}
