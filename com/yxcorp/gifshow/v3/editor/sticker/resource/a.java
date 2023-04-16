package com.yxcorp.gifshow.v3.editor.sticker.resource.a;
import java.lang.Runnable;
import qtc.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.util.AdvEditUtil;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import itc.o3;
import ekd.k1;

public final class a implements Runnable	// class@00128c
{
    public final a b;
    public final boolean c;
    public final List d;

    public void a(a p0,boolean p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       if (this.b.f != null) {
          AdvEditUtil.b(Category.STICKER);
       }
       if (this.c != null) {
          a td = this.d;
          if (!PatchProxy.applyVoidOneRefs(td, objArray, h1.class, "6") && !q.f(td)) {
             Iterator iterator = td.iterator();
             while (iterator.hasNext()) {
                StickerDetailInfo stickerDetai = iterator.next();
                if (!h1.i(stickerDetai) || f0.n(stickerDetai)) {
                   continue ;
                }
                k1.o(new o3(stickerDetai));
             }
          }
       }
       return;
    }
}
