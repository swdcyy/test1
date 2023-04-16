package com.yxcorp.gifshow.v3.editor.ktv.lyric.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.v;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class g extends Accessor	// class@000fd7
{
    public final KtvLyricEditorFragment$a c;
    public final v d;

    public void g(v p0,KtvLyricEditorFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
