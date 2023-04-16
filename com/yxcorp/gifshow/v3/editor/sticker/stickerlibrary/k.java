package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.k;
import ok.h;
import java.lang.Object;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Integer;

public final class k implements h	// class@0012a5
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object apply(Object p0){
       ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
       if (p0 != null) {
          Pair second = p0.second;
          tagPackage.identity = second.mStickerId;
          tagPackage.name = second.mStickerName;
          tagPackage.index = (long)(p0.first.intValue() + 1);
       }
       return tagPackage;
    }
}
