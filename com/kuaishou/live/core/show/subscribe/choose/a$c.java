package com.kuaishou.live.core.show.subscribe.choose.a$c;
import a9c.e;
import com.kuaishou.live.core.show.subscribe.choose.a$a;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a$c extends e	// class@0010cd
{

    public void a$c(){
       super();
    }
    public void a$c(a$a p0){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b = (p0 != null && (p1 != null && p0.mIsSelected == p1.mIsSelected))? true: false;
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && (p1 != null && TextUtils.n(p0.mPhotoId, p1.mPhotoId))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
