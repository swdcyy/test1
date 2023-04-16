package be1.j;
import lp3.a;
import crd.a;
import java.util.HashSet;
import v51.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import xp5.g;
import lp3.c;
import hf3.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCall;
import lf3.g;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserInfo;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatUserLeaveInfo;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import com.kwai.robust.PatchProxyResult;
import be1.i;
import be1.f;
import be1.h;
import be1.g;
import be1.e;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;

public abstract class j extends a	// class@00035e
{
    public final a d;
    public g e;
    public int f;
    public final Set g;
    public g h;
    public g i;
    public g j;
    public g k;
    public g l;

    public void j(int p0){
       super();
       this.d = new a();
       this.g = new HashSet();
       this.f = p0;
    }
    public void Qo(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.e = this.Po().a(g.class);
       this.Po().a(uoa).u().u0(772, SCInteractiveChatCall.class, this.So());
       this.Po().a(uoa).u().u0(774, SCInteractiveChatUserInfo.class, this.Uo());
       this.Po().a(uoa).u().u0(775, SCInteractiveChatUserLeaveInfo.class, this.Vo());
       this.Po().a(uoa).u().u0(776, SCInteractiveChatClosed.class, this.To());
       this.Po().a(uoa).u().u0(812, LiveStreamMessages$SCLiveChatGuestGiftInfo.class, this.Wo());
       return;
    }
    public void Ro(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.Po().a(uoa).u().o(772, this.So());
       this.Po().a(uoa).u().o(774, this.Uo());
       this.Po().a(uoa).u().o(775, this.Vo());
       this.Po().a(uoa).u().o(776, this.To());
       this.Po().a(uoa).u().o(812, this.Wo());
       this.d.dispose();
       return;
    }
    public final g So(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = new i(this);
       }
       return this.h;
    }
    public final g To(){
       Object obj = PatchProxy.apply(null, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k == null) {
          this.k = new f(this);
       }
       return this.k;
    }
    public final g Uo(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = new h(this);
       }
       return this.i;
    }
    public final g Vo(){
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.j == null) {
          this.j = new g(this);
       }
       return this.j;
    }
    public final g Wo(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = new e(this);
       }
       return this.l;
    }
    public abstract void Xo();
    public abstract void Yo(LiveStreamMessages$SCLiveChatGuestGiftInfo p0);
    public abstract void Zo(InteractiveChatUserInfoIdentity[] p0,String p1);
    public abstract void ap(InteractiveChatUserInfoIdentity[] p0);
    public abstract void bp(String p0,long p1,int p2,String p3,String p4);
}
