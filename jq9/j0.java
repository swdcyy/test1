package jq9.j0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.b0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.tube.TubeInfo;
import jq9.c0;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.d0;
import com.kuaishou.android.model.mix.CoverMeta;
import jq9.e0;
import com.kuaishou.android.model.mix.ExtMeta;
import jq9.f0;
import com.kuaishou.android.model.mix.PhotoMeta;
import jq9.g0;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.kwai.framework.model.user.User;
import jq9.h0;
import jq9.i0;
import mm8.a;

public final class j0 implements b	// class@002b49
{

    public void j0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new b0(this, p1));
       p0.h(TubeInfo.class, new c0(this, p1));
       p0.h(CoronaInfo.class, new d0(this, p1));
       p0.h(CoverMeta.class, new e0(this, p1));
       p0.h(ExtMeta.class, new f0(this, p1));
       p0.h(PhotoMeta.class, new g0(this, p1));
       if (p1.mPhotoMeta != null) {
          Accessors.d().b(p1.mPhotoMeta).a(p0, p1.mPhotoMeta);
       }
       User user = User.class;
       h0 oh0 = new h0(this, p1);
       try{
          p0.h(user, oh0);
          p0.h(CoronaTubeFeed.class, new i0(this, p1));
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
