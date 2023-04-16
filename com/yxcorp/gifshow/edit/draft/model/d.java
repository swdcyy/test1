package com.yxcorp.gifshow.edit.draft.model.d;
import ekd.q$b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.URLUtil;

public final class d implements q$b	// class@001afb
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final boolean a(Object p0){
       boolean b = (!p0.isEmpty() && !URLUtil.isNetworkUrl(p0))? true: false;
       return b;
    }
}
