package com.yxcorp.gifshow.v3.editor.cover.a2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ppc.a2;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.cover.q0$f;

public class a2 extends Accessor	// class@000e3c
{
    public final VideoCoverEditorPresenter c;
    public final a2 d;

    public void a2(a2 p0,VideoCoverEditorPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.B;
    }
    public void set(Object p0){
       this.c.B = p0;
    }
}
