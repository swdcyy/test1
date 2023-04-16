package jq9.a0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.w;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.x;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent;
import jq9.y;
import jq9.z;
import mm8.a;

public final class a0 implements b	// class@002b32
{

    public void a0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new w(this, p1));
       p0.h(CoronaInfo.class, new x(this, p1));
       CoronaTitleContent uCoronaTitle = CoronaTitleContent.class;
       y oy = new y(this, p1);
       try{
          p0.h(uCoronaTitle, oy);
          p0.h(CoronaTitleFeed.class, new z(this, p1));
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
