package com.kuaishou.live.gzone.v2.imagepreview.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.gzone.v2.imagepreview.e;
import com.kuaishou.live.gzone.v2.imagepreview.GzoneImagePreviewFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class a extends Accessor	// class@001cc6
{
    public final GzoneImagePreviewFragment$a c;
    public final e d;

    public void a(e p0,GzoneImagePreviewFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
