package com.yxcorp.gifshow.v3.editor.template.v2.midduleware.ObservableAction;
import xvc.b;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ObservableAction extends b	// class@001385
{
    public final l listener;
    public final b request;

    public void ObservableAction(b p0,l p1){
       a.p(p0, "request");
       a.p(p1, "listener");
       super();
       this.request = p0;
       this.listener = p1;
    }
    public final l getListener(){
       return this.listener;
    }
    public final b getRequest(){
       return this.request;
    }
}
