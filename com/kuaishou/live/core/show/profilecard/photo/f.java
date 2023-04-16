package com.kuaishou.live.core.show.profilecard.photo.f;
import wvb.e$a;
import java.lang.Object;
import java.util.List;
import wvb.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;

public final class f implements e$a	// class@000de1
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public List a(List p0){
       return d.a(this, p0);
    }
    public final Object convert(Object p0){
       return new QPhoto(p0);
    }
}
