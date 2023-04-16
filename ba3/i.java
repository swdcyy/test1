package ba3.i;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xp5.i;
import td3.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import androidx.lifecycle.MutableLiveData;
import ba3.i$d;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import ba3.i$a;
import androidx.lifecycle.Observer;
import ba3.i$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ba3.i$b$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import ba3.i$b$b;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import of1.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import ba3.i$c;
import s93.r;

public final class i extends a	// class@00034b
{
    public final String a;
    public final LiveData b;
    public final LiveEvent c;
    public final LiveEvent d;
    public final LiveData e;
    public final i f;
    public final o g;

    public void i(LifecycleOwner p0,LiveData p1,i p2,o p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "commentMessageLiveData");
       a.p(p2, "logPackageProvider");
       a.p(p3, "userStatusManager");
       super();
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.a = "SimpleCommentMessageViewModel";
       c uoc = new c();
       this.p0(uoc);
       this.c = uoc;
       uoc = new c();
       this.p0(uoc);
       this.d = uoc;
       this.b = new MutableLiveData(new i$d("", "", "", null));
       p1.observe(p0, new i$a(this));
    }
    public final LiveData u0(){
       return this.b;
    }
    public void v0(i$b p0){
       LiveLiteUserStatusResponse value;
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "1")) {
          return;
       }
       a.p(p0, "intent");
       String str = "null cannot be cast to non-null type com.kuaishou.live.lite.comment.model.SimpleCommentMessage";
       if (p0 instanceof i$b$a) {
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.a+" handleIntent ClickNameIntent");
          value = this.e.getValue();
          Objects.requireNonNull(value, str);
          this.s0(this.c).q(value);
       }else if(p0 instanceof i$b$b){
          b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.a+" handleIntent LongClickMessageIntent");
          p0 = this.e.getValue();
          Objects.requireNonNull(p0, str);
          if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "2")) {
             value = this.g.D1();
             i = 1;
             int i1 = (value != null)? value.mIsAnonymousLive ^ i: true;
             if (b.a()) {
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                if (!TextUtils.equals(qCurrentUser.getId(), p0.getUserInfo().mId)) {
                label_00a3 :
                   this.s0(this.d).q(new i$c(p0, i1, i));
                }
             }
             i = false;
             goto label_00a3 ;
          }
          p0 = this.e.getValue();
          Objects.requireNonNull(p0, str);
          UserInfo mId = p0.getUserInfo().mId;
          a.o(mId, "simpleCommentMessage.userInfo.mId");
          r.a.c(this.f, mId, "NORMAL", p0.getContent());
       }
       return;
    }
}
