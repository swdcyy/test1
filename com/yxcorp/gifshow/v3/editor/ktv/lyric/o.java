package com.yxcorp.gifshow.v3.editor.ktv.lyric.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class o extends Accessor	// class@000fdf
{
    public final KtvLyricEditorFragment$a c;
    public final v d;

    public void o(v p0,KtvLyricEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.l);
    }
    public void set(Object p0){
       this.c.l = p0.intValue();
    }
}
