package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderOpenAlbumAction;
import xvc.b;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ReorderOpenAlbumAction extends b	// class@000e01
{
    public final l openAlbumResult;
    public final float time;

    public void ReorderOpenAlbumAction(float p0,l p1){
       a.p(p1, "openAlbumResult");
       super();
       this.time = p0;
       this.openAlbumResult = p1;
    }
    public final l getOpenAlbumResult(){
       return this.openAlbumResult;
    }
    public final float getTime(){
       return this.time;
    }
}
