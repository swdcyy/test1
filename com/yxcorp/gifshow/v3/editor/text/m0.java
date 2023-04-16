package com.yxcorp.gifshow.v3.editor.text.m0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class m0 implements g	// class@001461
{
    public static final m0 b;

    static {
       m0.b = new m0();
    }
    public void m0(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("NormalTextPresenter", "mClickAddTextButtonPublisher", p0);
    }
}
