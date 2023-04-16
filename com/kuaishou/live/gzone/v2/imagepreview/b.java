package com.kuaishou.live.gzone.v2.imagepreview.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.gzone.v2.imagepreview.e;
import com.kuaishou.live.gzone.v2.imagepreview.GzoneImagePreviewFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@001cc7
{
    public final GzoneImagePreviewFragment$a c;
    public final e d;

    public void b(e p0,GzoneImagePreviewFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
