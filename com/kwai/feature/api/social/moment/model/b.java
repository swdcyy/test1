package com.kwai.feature.api.social.moment.model.b;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.feature.api.social.moment.model.MomentFeed;
import com.kwai.feature.api.social.moment.model.MomentComment;
import pw5.c;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CommonMeta;
import pw5.d;
import com.kwai.feature.api.social.moment.model.MomentModel;
import pw5.e;
import com.kwai.feature.api.social.moment.model.MomentFeed$a;
import com.kwai.feature.api.social.moment.model.a;
import com.kwai.framework.model.user.User;
import pw5.f;
import pw5.g;
import mm8.a;

public final class b implements b	// class@001196
{

    public void b(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(MomentComment.class, new c(this, p1));
       p0.h(CommonMeta.class, new d(this, p1));
       p0.h(MomentModel.class, new e(this, p1));
       p0.h(MomentFeed$a.class, new a(this, p1));
       User user = User.class;
       f uof = new f(this, p1);
       try{
          p0.h(user, uof);
          p0.h(MomentFeed.class, new g(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
