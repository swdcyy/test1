package com.yxcorp.gifshow.v3.editor.ktv.lyric.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.model.a;

public class u extends Accessor	// class@000fe5
{
    public final KtvLyricEditorFragment$a c;
    public final v d;

    public void u(v p0,KtvLyricEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.o;
    }
    public void set(Object p0){
       this.c.o = p0;
    }
}