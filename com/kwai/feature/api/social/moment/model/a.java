package com.kwai.feature.api.social.moment.model.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.api.social.moment.model.b;
import com.kwai.feature.api.social.moment.model.MomentFeed;
import java.lang.Object;
import com.kwai.feature.api.social.moment.model.MomentFeed$a;

public class a extends Accessor	// class@001195
{
    public final MomentFeed c;
    public final b d;

    public void a(b p0,MomentFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mRealType;
    }
    public void set(Object p0){
       this.c.mRealType = p0;
    }
}
