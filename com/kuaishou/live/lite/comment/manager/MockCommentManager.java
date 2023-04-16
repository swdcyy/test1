package com.kuaishou.live.lite.comment.manager.MockCommentManager;
import w93.a;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import com.kuaishou.live.lite.comment.authorreply.LiveLiteDisplayAuthorStateManager;
import com.kwai.framework.model.user.User;
import brd.t;
import n91.f;
import x83.a;
import hx1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import w93.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import x93.h;
import java.util.Map;
import u93.e;
import x93.g;
import u93.d;
import x93.a;
import u93.a;
import u93.b;
import com.kuaishou.live.lite.comment.manager.MockCommentManager$mockComment$1;
import msd.l;

public final class MockCommentManager	// class@000804
{
    public final b a;
    public final a b;
    public final LiveLiteDisplayUserStateManager c;
    public final LiveLiteDisplayAuthorStateManager d;
    public final User e;
    public final t f;
    public final t g;
    public final f h;
    public final a i;
    public final a j;

    public void MockCommentManager(a p0,LiveLiteDisplayUserStateManager p1,LiveLiteDisplayAuthorStateManager p2,User p3,t p4,t p5,f p6,a p7,a p8){
       int i = this;
       h obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       Object obj7 = p7;
       Object obj8 = p8;
       a.p(obj, "commentDataManager");
       a.p(obj1, "displayUserStateManager");
       a.p(obj2, "displayAuthorStateManager");
       a.p(obj3, "anchorUser");
       a.p(obj4, "enableMyCommentSuffixProvider");
       a.p(obj5, "authorReplyConfigProvider");
       a.p(obj6, "serverTimeProvider");
       a.p(obj7, "anonymityManager");
       a.p(obj8, "roleInfoManager");
       super();
       i.b = obj;
       i.c = obj1;
       i.d = obj2;
       i.e = obj3;
       i.f = obj4;
       i.g = obj5;
       i.h = obj6;
       i.i = obj7;
       i.j = obj8;
       b uob = new b();
       i.a = uob;
       if (PatchProxy.applyVoid(null, this, MockCommentManager.class, "3")) {
       }else {
          obj = new h(p1, p4, p6, p7, p8);
          uob.d().put(e.class, v14);
          uob.d().put(d.class, new g(obj6, obj7, obj8));
          uob.d().put(a.class, new a(obj2, obj3, obj5, obj6));
       }
       return;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockCommentManager.class, "1")) {
          return;
       }
       a.p(p0, "commentData");
       this.a.c(p0, new MockCommentManager$mockComment$1(this));
       return;
    }
}
