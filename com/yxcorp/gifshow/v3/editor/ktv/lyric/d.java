package com.yxcorp.gifshow.v3.editor.ktv.lyric.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment;

public class d extends Accessor	// class@000fd4
{
    public final KtvLyricEditorFragment$a c;
    public final v d;

    public void d(v p0,KtvLyricEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
