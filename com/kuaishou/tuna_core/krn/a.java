package com.kuaishou.tuna_core.krn.a;
import javax.inject.Provider;
import java.lang.Object;
import com.kuaishou.tuna_core.krn.native_view.TunaRichTextViewManager;

public final class a implements Provider	// class@0010d5
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return new TunaRichTextViewManager();
    }
}
