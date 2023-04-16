package com.yxcorp.gifshow.v3.editor.text.subtitle.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class a implements g	// class@001490
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("EditorSubtitleListManager", "mEditorSubtitleSelectionPublisher", p0);
    }
}
