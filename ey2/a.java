package ey2.a;
import lf3.g;
import ey2.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCVoicePartyEnterRoomNotice;
import java.util.Objects;
import java.lang.String;
import z12.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qu2.a;
import co2.f2;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.robust.PatchProxyResult;
import ey2.d$a;
import java.lang.CharSequence;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import lnc.a1;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import nf1.c;
import io.reactivex.subjects.PublishSubject;
import lf3.f;

public final class a implements g	// class@002810
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b2;
       a b = this.b;
       LiveAudienceState obj = p0;
       Objects.requireNonNull(b);
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyEnterRoomEffectPresenter", "on receive voice party enter room notice", stringArray);
       if (PatchProxy.applyVoidOneRefs(obj, b, d.class, "4")) {
       }else if(obj.user == null || (obj.author == null || (!(obj.liveStreamId).equals(b.l.getLiveStreamId()) || (!(obj.voicePartyId).equals(b.k.y()) || (!b.l.e() && !(String.valueOf(obj.user.userId)).equals(QCurrentUser.ME.getId())))))){
          d j = b.j;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          d$a uoa = d$a.class;
          d$a uoa1 = PatchProxy.applyOneRefs(obj, null, uoa, "1");
          if (uoa1 != patchProxyRe) {
          }else {
             SCVoicePartyEnterRoomNotice level = obj.level;
             uoa1 = 3;
             if (level <= uoa1) {
                boolean b1 = (obj.source == uoa1)? true: false;
                d$a uoa2 = new d$a(b1, false, obj.user, 0, 0, null);
                uoa1 = patchProxyRe;
             }else if(obj.source == uoa1){
                b2 = true;
             }else {
                b2 = false;
             }
             SCVoicePartyEnterRoomNotice user = obj.user;
             SCVoicePartyEnterRoomNotice subLevel = obj.subLevel;
             obj = obj.userState.userStateSegment;
             Object obj1 = PatchProxy.applyOneRefs(obj, null, uoa, "2");
             CharSequence uCharSequenc = (obj1 != patchProxyRe)? obj1: c.e(obj, a1.d(0x7f070283));
             d$a uoa3 = new d$a(b2, true, user, level, subLevel, uCharSequenc);
             uoa1 = v15;
          }
          j.onNext(uoa1);
       }
    label_00cd :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
