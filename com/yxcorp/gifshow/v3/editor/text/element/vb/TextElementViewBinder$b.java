package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextElementViewBinder$b implements Observer	// class@0013ff
{
    public final VideoSDKPlayerView b;
    public final TextElementViewBinder c;

    public void TextElementViewBinder$b(VideoSDKPlayerView p0,TextElementViewBinder p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TextElementViewBinder$b.class, "1")) {
       }else {
          a.o(p0, "update");
          if (p0.booleanValue()) {
             float f = this.c.A.J0();
             Iterator iterator = this.b.getVideoProject().animatedSubAssets().iterator();
             while (iterator.hasNext()) {
                b.z(iterator.next(), f, true);
             }
             this.c.L().sendChangeToPlayer();
             Object[] objArray = new Object[0];
             a.D().w("TextElementViewBinder", "mUpdateVideoSubAssetTransformScale assetTransformedScale:"+f, objArray);
          }
          PatchProxy.onMethodExit(TextElementViewBinder$b.class, "1");
       }
       return;
    }
}
