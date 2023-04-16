package com.yxcorp.gifshow.v3.editor.ktv.lyric.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class p extends Accessor	// class@000fe0
{
    public final KtvLyricEditorFragment$a c;
    public final v d;

    public void p(v p0,KtvLyricEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
