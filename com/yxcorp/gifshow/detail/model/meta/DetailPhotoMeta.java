package com.yxcorp.gifshow.detail.model.meta.DetailPhotoMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class DetailPhotoMeta implements Serializable	// class@001596
{
    public QuickShareInfo mQuickShareInfo;
    public static final long serialVersionUID = 0x1ede19aa76180202;

    public void DetailPhotoMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, DetailPhotoMeta.class, "1")) {
          return;
       }
       e uoe = new e(DetailPhotoMeta.class, "", "detailPhotoMeta");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}
