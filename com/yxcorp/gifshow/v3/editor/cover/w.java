package com.yxcorp.gifshow.v3.editor.cover.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.h0;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.model.f;

public class w extends Accessor	// class@000ee7
{
    public final PhotosCoverEditorV3Fragment$b c;
    public final h0 d;

    public void w(h0 p0,PhotosCoverEditorV3Fragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
