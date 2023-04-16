package com.yxcorp.gifshow.v3.editor.sticker.f1$a;
import x59.e$d;
import com.yxcorp.gifshow.v3.editor.sticker.f1;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;

public class f1$a implements e$d	// class@00124b
{
    public final f1 a;

    public void f1$a(f1 p0){
       this.a = p0;
       super();
    }
    public StickerDetailInfo a(){
       Object obj = PatchProxy.apply(null, this, f1$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.r.i();
    }
    public void b(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$a.class, "1")) {
          return;
       }
       this.a.r.onNext(p0);
       return;
    }
}
