package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameProgressErrorAction;
import xvc.b;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KeyFrameProgressErrorAction extends b	// class@001012
{
    public final Throwable error;

    public void KeyFrameProgressErrorAction(Throwable p0){
       a.p(p0, "error");
       super();
       this.error = p0;
    }
    public final Throwable getError(){
       return this.error;
    }
}
