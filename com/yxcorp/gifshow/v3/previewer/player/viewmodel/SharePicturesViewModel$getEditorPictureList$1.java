package com.yxcorp.gifshow.v3.previewer.player.viewmodel.SharePicturesViewModel$getEditorPictureList$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import rwc.i;
import com.kuaishou.edit.draft.AssetSegment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class SharePicturesViewModel$getEditorPictureList$1 extends Lambda implements p	// class@001605
{
    public static final SharePicturesViewModel$getEditorPictureList$1 INSTANCE;

    static {
       SharePicturesViewModel$getEditorPictureList$1.INSTANCE = new SharePicturesViewModel$getEditorPictureList$1();
    }
    public void SharePicturesViewModel$getEditorPictureList$1(){
       super(2);
    }
    public final AssetSegment invoke(i p0,AssetSegment p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, SharePicturesViewModel$getEditorPictureList$1.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       return p0.c();
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
