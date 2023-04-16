package com.yxcrop.gifshow.v3.editor.text_v2_share.action.WaitDrawerBitmapAction;
import xvc.b;
import brd.v;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class WaitDrawerBitmapAction extends b	// class@000b82
{
    public final v emitter;
    public final boolean showAnimatedSubAsset;

    public void WaitDrawerBitmapAction(v p0,boolean p1){
       a.p(p0, "emitter");
       super();
       this.emitter = p0;
       this.showAnimatedSubAsset = p1;
    }
    public final v getEmitter(){
       return this.emitter;
    }
    public final boolean getShowAnimatedSubAsset(){
       return this.showAnimatedSubAsset;
    }
}
