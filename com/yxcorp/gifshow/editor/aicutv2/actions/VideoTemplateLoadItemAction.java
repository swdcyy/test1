package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadItemAction;
import xvc.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class VideoTemplateLoadItemAction extends b	// class@001b83
{
    public final String id;
    public final boolean loadFirstItem;

    public void VideoTemplateLoadItemAction(String p0,boolean p1){
       a.p(p0, "id");
       super();
       this.id = p0;
       this.loadFirstItem = p1;
    }
    public final String getId(){
       return this.id;
    }
    public final boolean getLoadFirstItem(){
       return this.loadFirstItem;
    }
}
