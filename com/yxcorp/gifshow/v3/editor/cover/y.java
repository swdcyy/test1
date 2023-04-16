package com.yxcorp.gifshow.v3.editor.cover.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.cover.h0;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class y extends Accessor	// class@000eef
{
    public final PhotosCoverEditorV3Fragment$b c;
    public final h0 d;

    public void y(h0 p0,PhotosCoverEditorV3Fragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
