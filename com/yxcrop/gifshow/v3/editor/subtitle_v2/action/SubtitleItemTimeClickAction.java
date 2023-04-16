package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleItemTimeClickAction;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SubtitleItemTimeClickAction extends b	// class@000ae1
{
    public final NewTextBaseElementData textElementData;

    public void SubtitleItemTimeClickAction(NewTextBaseElementData p0){
       a.p(p0, "textElementData");
       super();
       this.textElementData = p0;
    }
    public final NewTextBaseElementData getTextElementData(){
       return this.textElementData;
    }
}
