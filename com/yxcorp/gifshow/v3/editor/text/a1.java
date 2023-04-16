package com.yxcorp.gifshow.v3.editor.text.a1;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class a1 implements g	// class@0013a5
{
    public static final a1 b;

    static {
       a1.b = new a1();
    }
    public void a1(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("TextCommonPresenter", "mRangeChangedPublisher", p0);
    }
}
