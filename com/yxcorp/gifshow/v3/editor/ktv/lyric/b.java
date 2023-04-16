package com.yxcorp.gifshow.v3.editor.ktv.lyric.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;

public class b extends Accessor	// class@000fd2
{
    public final KtvLyricEditorFragment$a c;
    public final v d;

    public void b(v p0,KtvLyricEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g;
    }
    public void set(Object p0){
       this.c.g = p0;
    }
}
