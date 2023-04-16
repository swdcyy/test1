package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectShowTipAction;
import xvc.b;
import android.graphics.Point;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class EffectShowTipAction extends b	// class@000f3d
{
    public final boolean isDownloaded;
    public final Point point;

    public void EffectShowTipAction(Point p0,boolean p1){
       a.p(p0, "point");
       super();
       this.point = p0;
       this.isDownloaded = p1;
    }
    public final Point getPoint(){
       return this.point;
    }
    public final boolean isDownloaded(){
       return this.isDownloaded;
    }
}
