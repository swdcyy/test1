package com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption$ShowType;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class KwaiDialogOption	// class@0019a1
{
    public final int a;
    public final KwaiDialogOption$ShowType b;
    public final Object c;
    public static final KwaiDialogOption d;
    public static final KwaiDialogOption e;
    public static final KwaiDialogOption f;

    static {
       KwaiDialogOption.d = new KwaiDialogOption(KwaiDialogOption$ShowType.SHOW_ANYWAY, 0);
       KwaiDialogOption.e = new KwaiDialogOption(KwaiDialogOption$ShowType.SHOW_OR_ENQUEUE, Integer.MAX_VALUE);
       KwaiDialogOption.f = new KwaiDialogOption(KwaiDialogOption$ShowType.SHOW_OR_DISCARD, Integer.MAX_VALUE);
    }
    public void KwaiDialogOption(KwaiDialogOption$ShowType p0,int p1){
       super();
       this.a = p1;
       this.b = p0;
       this.c = null;
    }
    public String toString(){
       return "KwaiDialogOption{mPriority="+this.a+", mShowType="+this.b+", mExtra="+this.c+'}';
    }
}
