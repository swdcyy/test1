package com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$store$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tvc.c;
import java.lang.Object;
import xvc.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$store$2$a;
import nsd.q0;
import tvc.e;
import msd.p;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel$store$2$b;
import java.util.Objects;
import xvc.k;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public final class EditReduxViewModel$store$2 extends Lambda implements a	// class@001535
{
    public final c[] $_middlewareList;
    public final EditReduxViewModel this$0;

    public void EditReduxViewModel$store$2(EditReduxViewModel p0,c[] p1){
       this.this$0 = p0;
       this.$_middlewareList = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       c uoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       EditReduxViewModel$store$2 obj = PatchProxy.apply(objArray, this, EditReduxViewModel$store$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       if (obj.h != null) {
          q0 oq0 = new q0(2);
          oq0.a(this.this$0.q0());
          oq0.b(this.$_middlewareList);
          c[] uocArray = new c[oq0.c()];
          uoc = new c(obj.j, new EditReduxViewModel$store$2$a(this), oq0.d(uocArray));
       }else {
          EditReduxViewModel j = obj.j;
          EditReduxViewModel$store$2$b ostore$2$b = new EditReduxViewModel$store$2$b(this);
          q0 oq01 = new q0(3);
          EditReduxViewModel$store$2 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          k ok = PatchProxy.apply(objArray, tthis$0, EditReduxViewModel.class, "3");
          if (ok != patchProxyRe) {
          }else {
             ok = new k(tthis$0.y0(), tthis$0.k);
          }
          oq01.a(ok);
          oq01.a(this.this$0.q0());
          oq01.b(this.$_middlewareList);
          c[] uocArray1 = new c[oq01.c()];
          uoc = new c(j, ostore$2$b, oq01.d(uocArray1));
       }
       return uoc;
    }
}
