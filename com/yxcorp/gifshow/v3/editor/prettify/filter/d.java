package com.yxcorp.gifshow.v3.editor.prettify.filter.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class d implements g	// class@00116c
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("FilterEditorPresenterV2", "mFilterUpdatePublisher", p0);
    }
}