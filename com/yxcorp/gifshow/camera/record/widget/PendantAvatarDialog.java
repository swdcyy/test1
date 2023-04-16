package com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog;
import com.yxcorp.gifshow.bubble.a;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.pendant.PendantAvatarInfo;
import com.yxcorp.gifshow.camera.bubble.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ra9.a;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b;
import lnc.a1;
import xm6.a;
import com.yxcorp.gifshow.camera.record.widget.e;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.widget.f;
import com.yxcorp.gifshow.camera.record.widget.g;
import erd.g;
import crd.b;

public final class PendantAvatarDialog implements a, LifecycleObserver	// class@000fcc
{
    public Activity b;
    public PendantAvatarDialog$b c;
    public PostBubbleManager$c d;
    public final PendantAvatarInfo e;
    public final c f;
    public static final PendantAvatarDialog$a g;

    static {
       PendantAvatarDialog.g = new PendantAvatarDialog$a(null);
    }
    public void PendantAvatarDialog(PendantAvatarInfo p0,c p1){
       a.p(p0, "info");
       a.p(p1, "bubbleManager");
       super();
       this.e = p0;
       this.f = p1;
    }
    public boolean c(){
       return a.e(this);
    }
    public c d(){
       return RecordBubbleItem.PENDANT_AVATAR_DIALOG;
    }
    public void dismiss(){
       a.b(this);
    }
    public t e(){
       return a.a(this);
    }
    public boolean f(){
       return a.d(this);
    }
    public boolean g(String p0){
       return a.c(this, p0);
    }
    public boolean i(FragmentActivity p0,PostBubbleManager$c p1){
       String str = "1";
       PendantAvatarInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, PendantAvatarDialog.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       a.p(p1, "listener");
       obj = this.e.avatarUrl;
       boolean b = false;
       PendantAvatarDialog pendantAvata = (obj == null || !obj.length())? 1: null;
       if (!pendantAvata) {
          obj = this.e.pendantUrl;
          pendantAvata = (obj == null || !obj.length())? 1: 0;
          if (!pendantAvata) {
             this.d = p1;
             this.b = p0;
             PendantAvatarDialog$b uob = new PendantAvatarDialog$b(this.e, this);
             this.c = uob;
             if (!PatchProxy.applyVoid(null, uob, PendantAvatarDialog$b.class, str)) {
                int i = a1.e(88.00f);
                int i1 = (int)a.a.a((float)i);
                PendantAvatarInfo pendantUrl = uob.a.pendantUrl;
                a.o(pendantUrl, "info.pendantUrl");
                PendantAvatarInfo avatarUrl = uob.a.avatarUrl;
                a.o(avatarUrl, "info.avatarUrl");
                t.zip(uob.b(pendantUrl, i1, i1), uob.b(avatarUrl, i, i), new e(i, i1)).subscribeOn(d.c).observeOn(d.a).subscribe(new f(uob), new g(uob));
             }
             return true;
          }
       }
       return b;
    }
}
