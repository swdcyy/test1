package com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.framework.model.user.User;
import java.lang.Number;
import java.lang.Integer;
import ok.k;

public class MarqueeResponse$a	// class@00142b
{
    public String a;
    public QComment mComment;
    public boolean mDisableClick;
    public int mMarqueeType;
    public User mUser;

    public void MarqueeResponse$a(){
       super();
    }
    public boolean equals(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, MarqueeResponse$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 != null && this.getClass() == p0.getClass()) {
          Object obj1 = PatchProxy.applyTwoRefs(this, p0, null, e.class, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(e.g(this) && e.g(p0)){
             b = this.mComment.equals(p0.mComment);
          }else if(e.h(this) && e.h(p0)){
             b = this.mComment.equals(p0.mComment);
          }else if(e.j(this) && e.j(p0)){
             b = this.mUser.equals(p0.mUser);
          }else if(e.k(this) && e.k(p0)){
             b = this.mUser.equals(p0.mUser);
          }else if(e.m(this) && e.m(p0)){
             b = this.mUser.equals(p0.mUser);
          }else if(e.l(this) && e.l(p0)){
             b = this.mUser.equals(p0.mUser);
          }else if(e.i(this) && e.i(p0)){
             b = (this.a).equals(p0.a);
          }
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, MarqueeResponse$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mMarqueeType),this.mComment,this.mUser};
       return k.b(obj);
    }
}
