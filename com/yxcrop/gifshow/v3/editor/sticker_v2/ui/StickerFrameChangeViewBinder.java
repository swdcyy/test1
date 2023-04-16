package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder;
import ei0.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder$pictureViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import smd.d;
import rmd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.Workspace$Type;
import uwc.b;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.util.Pair;

public final class StickerFrameChangeViewBinder extends a	// class@000a98
{
    public final p c;
    public final h d;
    public final EditDecorationContainerViewV2 e;
    public final d f;
    public final Observer g;
    public final View h;
    public final Fragment i;
    public final EditorDelegate j;

    public void StickerFrameChangeViewBinder(View p0,Fragment p1,EditorDelegate p2){
       a.p(p0, "rootView");
       a.p(p1, "previewFragment");
       a.p(p2, "delegate");
       super(p0);
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.c = s.c(new StickerFrameChangeViewBinder$pictureViewModel$2(this));
       this.d = f.l(p1);
       p0 = p0.findViewById(R.id.new_text_decoration_editor_view);
       a.o(p0, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.e = p0;
       this.f = g.a(p1);
       this.g = new StickerFrameChangeViewBinder$a(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, StickerFrameChangeViewBinder.class, "2")) {
          return;
       }
       this.d.z0().observe(this.i, this.g);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, StickerFrameChangeViewBinder.class, "6")) {
          return;
       }
       this.d.z0().removeObserver(this.g);
       return;
    }
    public final int D(List p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, StickerFrameChangeViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!f.E(this.j.getType())) {
          return 0;
       }
       int i = -1;
       obj = this.E().H0().iterator();
       int i1 = 0;
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          int i2 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          int i3 = 1;
          if (p0 != null && (p0.size() == i3 && (a.g(obj1.first, p0.get(0)) || (p0 != null && (p0.size() == 2 && (a.g(obj1.first, p0.get(0)) && a.g(obj1.second, p0.get(i3)))))))) {
             i = i1;
          }
       label_0086 :
          i1 = i2;
       }
       return i;
    }
    public final b E(){
       Object obj = PatchProxy.apply(null, this, StickerFrameChangeViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
