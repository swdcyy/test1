package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitleTextAdapter$refreshContent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;

public final class SubtitleTextAdapter$refreshContent$1 extends Lambda implements l	// class@000af6
{
    public final double $duration;

    public void SubtitleTextAdapter$refreshContent$1(double p0){
       this.$duration = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(NewTextBaseElementData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SubtitleTextAdapter$refreshContent$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.m0() - this.$duration > 0)? true: false;
       return b;
    }
}
