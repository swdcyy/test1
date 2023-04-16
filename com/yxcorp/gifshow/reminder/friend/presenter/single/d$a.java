package com.yxcorp.gifshow.reminder.friend.presenter.single.d$a;
import fr6.g;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d;
import java.lang.Object;
import wq6.h;
import xr6.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import fr6.f;
import zcc.l;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import j9c.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import eec.a;
import sdc.a;

public final class d$a implements g	// class@001ada
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,h p1,c p2){
       Uri data;
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, d$a.class, "1")) {
          return;
       }
       a.p(p1, "fromOrTo");
       a.p(p2, "exParams");
       f.b(this, p0, p1, p2);
       if (p0) {
          int i = 1;
          FriendTabNotify$Common uCommon = (l.a())? RedDotRepository.c(i): b.c(-7, FriendTabNotify$Common.class);
          if (uCommon == null || uCommon.mUnreadCount <= null) {
             i = 0;
          }
          d p = this.a.p;
          if (p == null) {
             a.S("mFragment");
          }
          FragmentActivity activity = p.getActivity();
          if (activity != null) {
             Intent intent = activity.getIntent();
             if (intent != null) {
                data = intent.getData();
             label_0063 :
                data = a.e(data);
                if (!i && !data) {
                   p = this.a.q;
                   if (p == null) {
                      a.S("mLogHelper");
                   }
                   p.b(4);
                }
             }
          }
          data = null;
          goto label_0063 ;
       }
    label_007a :
       return;
    }
    public void b(boolean p0,h p1,h p2,c p3){
       f.a(this, p0, p1, p2, p3);
    }
}
