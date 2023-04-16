package com.yxcorp.gifshow.v3.n;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class n implements g	// class@001576
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("EditorActivity", "updateFilterConfig", p0);
    }
}
