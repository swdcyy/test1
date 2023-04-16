package com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo$mResourceManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jb7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.a;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerExtParams;
import kb7.a;

public final class EditStickerRepo$mResourceManager$2 extends Lambda implements a	// class@00128a
{
    public static final EditStickerRepo$mResourceManager$2 INSTANCE;

    static {
       EditStickerRepo$mResourceManager$2.INSTANCE = new EditStickerRepo$mResourceManager$2();
    }
    public void EditStickerRepo$mResourceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, EditStickerRepo$mResourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, new a("EDIT_STICKER", 1, EditStickerExtParams.class), null, 2, null);
    }
}
