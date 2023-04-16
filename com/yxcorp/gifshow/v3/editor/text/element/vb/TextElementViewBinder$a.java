package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import wba.b;
import prc.b;
import prc.a;
import java.util.Comparator;
import java.util.Collections;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextElementViewBinder$a implements Observer	// class@0013fe
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$a(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TextElementViewBinder$a.class, "1")) {
       }else {
          ImmutableArray immutableArr = this.b.L().getVideoProject().animatedSubAssets();
          a.o(immutableArr, "mPlayerView.videoProject.animatedSubAssets\(\)");
          ArrayList uArrayList = new ArrayList(CollectionsKt___CollectionsKt.G5(immutableArr));
          Iterator iterator = uArrayList.iterator();
          a.o(iterator, "currentAnimatedSubAssetList.iterator\(\)");
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             a.o(obj, "mIterator.next\(\)");
             if (this.b.A.O0()) {
                if (b.s(obj.opaque())) {
                   iterator.remove();
                }
             }else if(b.v(obj.opaque())){
                iterator.remove();
             }
          }
          uArrayList.addAll(p0);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, null, b.class, "5")) {
             Collections.sort(uArrayList, a.b);
          }
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[uArrayList.size()];
          this.b.L().getVideoProject().setAnimatedSubAssets(uAnimatedSub);
          float f = this.b.A.J0();
          Iterator iterator1 = uArrayList.iterator();
          b = false;
          int i = 0;
          while (iterator1.hasNext()) {
             EditorSdk2V2$AnimatedSubAsset uAnimatedSub1 = iterator1.next();
             this.b.L().getVideoProject().animatedSubAssetsSetItem(i, uAnimatedSub1);
             b.z(uAnimatedSub1, f, b);
             i = i + 1;
          }
          f = this.b;
          if (f.H == null) {
             f.L().sendChangeToPlayer();
          }
          Object[] objArray = new Object[b];
          a.D().w("TextElementViewBinder", "mAllTextAnimatedSubAsset index:"+i, objArray);
          PatchProxy.onMethodExit(TextElementViewBinder$a.class, "1");
       }
       return;
    }
}
