package com.yxcorp.gifshow.v3.previewer.e0;
import erd.g;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xwc.c;

public class e0 implements g	// class@001596
{
    public final PhotosEditPreviewV3Fragment b;

    public void e0(PhotosEditPreviewV3Fragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
       }else {
          this.b.C1.c();
       }
       return;
    }
}
