package com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenTextItem extends LiveFloatingScreenBaseItemData	// class@000fca
{
    public int maxLengthLimit;
    public String text;
    public int textColor;
    public String textColorStr;
    public int textSize;
    public static final LiveFloatingScreenTextItem$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenTextItem.Companion = new LiveFloatingScreenTextItem$a(null);
    }
    public void LiveFloatingScreenTextItem(){
       super();
       this.text = "";
       this.textColorStr = "";
    }
    public final int getMaxLengthLimit(){
       return this.maxLengthLimit;
    }
    public final String getText(){
       return this.text;
    }
    public final int getTextColor(){
       return this.textColor;
    }
    public final String getTextColorStr(){
       return this.textColorStr;
    }
    public final int getTextSize(){
       return this.textSize;
    }
    public final void setMaxLengthLimit(int p0){
       this.maxLengthLimit = p0;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenTextItem.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.text = p0;
       return;
    }
    public final void setTextColor(int p0){
       this.textColor = p0;
    }
    public final void setTextColorStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenTextItem.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.textColorStr = p0;
       return;
    }
    public final void setTextSize(int p0){
       this.textSize = p0;
    }
}
