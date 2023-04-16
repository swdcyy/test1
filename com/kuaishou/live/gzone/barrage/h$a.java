package com.kuaishou.live.gzone.barrage.h$a;
import b53.b;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import android.widget.FrameLayout;
import com.kuaishou.live.gzone.barrage.BarrageView;
import lp3.e;
import lp3.c;
import lp3.b;
import z1.a;
import b53.o;
import i81.g;

public class h$a implements b	// class@001c35
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void Cm(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       h s = this.b.s;
       a0 e = s.e;
       h$a uoa = (e != null && (e.mIsFromLiveMate != null && (s.Q() != null && this.b.s.Q().mDisableHorizontalScreenShowComments != null)))? 1: null;
       if (uoa) {
          uoa = this.b;
          Objects.requireNonNull(uoa);
          ArrayList uArrayList = PatchProxy.applyOneRefs(p0, uoa, h.class, "17");
          if (uArrayList != PatchProxyResult.class) {
          }else if(p0 == null){
             p0 = null;
          }else {
             uArrayList = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                QLiveMessage qLiveMessage = iterator.next();
                QLiveMessage mUser = qLiveMessage.mUser;
                if (mUser != null && (mUser.mId).equals(QCurrentUser.me().getId())) {
                   uArrayList.add(qLiveMessage);
                }
             }
          }
          p0 = uArrayList;
       }
       this.b.R8(p0);
       return;
    }
    public void Hn(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       uoa = this.b;
       uoa.r = p0;
       if (p0) {
          uoa.V8();
       }
       return;
    }
    public void O6(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "2")) {
          return;
       }
       if (!this.b.q.getVisibility()) {
          this.b.q.f();
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void ta(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "4")) {
          return;
       }
       h$a tb = this.b;
       if (tb.r == null) {
          tb.W8();
       }
       return;
    }
    public void tl(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "6")) {
          return;
       }
       h$a tb = this.b;
       h q = tb.q;
       q.y = new o(this, p0);
       q.z = tb.v.R6();
       return;
    }
    public void to(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "3")) {
          return;
       }
       this.b.Y8(false);
       return;
    }
}
