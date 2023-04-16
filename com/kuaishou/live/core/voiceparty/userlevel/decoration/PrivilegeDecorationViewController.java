package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import qs2.d;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController$b;
import qs2.b;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController$1;
import androidx.lifecycle.LifecycleOwner;
import u63.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeDecorationViewController$a;
import com.kwai.framework.model.user.QCurrentUser;

public final class PrivilegeDecorationViewController extends ViewController	// class@001a8a
{
    public final b j;
    public final String k;
    public final String l;
    public final d m;
    public final UserMicSeatLevelLogger n;
    public final a o;

    public void PrivilegeDecorationViewController(String p0,String p1,d p2,UserMicSeatLevelLogger p3,a p4){
       a.p(p0, "voicePartyId");
       a.p(p1, "anchorId");
       a.p(p2, "micInteractService");
       a.p(p3, "logger");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       PrivilegeDecorationViewController$b uob = new PrivilegeDecorationViewController$b(this);
       p2.y(uob);
       a.a(this, new PrivilegeDecorationViewController$1(this, uob));
       this.j = new PrivilegeDecorationViewController$a(this);
    }
    public void PrivilegeDecorationViewController(String p0,d p1,UserMicSeatLevelLogger p2,a p3){
       a.p(p0, "voicePartyId");
       a.p(p1, "service");
       a.p(p2, "logger");
       a.p(p3, "launcher");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       super(p0, id, p1, p2, p3);
    }
}
