package com.kwai.live.gzone.accompanyplay.audience.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.live.gzone.accompanyplay.audience.f;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyJoinFragment$a;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;

public class b extends Accessor	// class@000b70
{
    public final LiveGzoneAccompanyJoinFragment$a c;
    public final f d;

    public void b(f p0,LiveGzoneAccompanyJoinFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
