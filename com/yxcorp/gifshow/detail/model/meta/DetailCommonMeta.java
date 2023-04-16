package com.yxcorp.gifshow.detail.model.meta.DetailCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.CommonMeta;
import fa6.e;
import fa6.b;

public class DetailCommonMeta implements Serializable	// class@001593
{
    public OnlineStateTag mOnlineStateTag;
    public SharePhotoRecommendModel mSharePhotoRecommend;
    public static final long serialVersionUID = 0x858ffe85d4b802cd;

    public void DetailCommonMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, DetailCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(DetailCommonMeta.class, "", "sharePhotoRecommendModel");
       uoe.a(null);
       c.a.e(CommonMeta.class, uoe);
       return;
    }
}
