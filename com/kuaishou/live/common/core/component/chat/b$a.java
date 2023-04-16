package com.kuaishou.live.common.core.component.chat.b$a;
import xv4.i;
import com.kuaishou.live.common.core.component.chat.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import rd1.i;
import java.nio.ByteBuffer;
import ae1.a;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import rd1.g0;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Float;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import lp3.e;
import lp3.a;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import lp3.c;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;

public class b$a extends i	// class@001038
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void e(int p0,String p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().J2(p0, p1);
       }
       return;
    }
    public void j(String p0,ByteBuffer p1,int p2,int p3,int p4,int p5){
       boolean b;
       Object obj = this;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "2")) {
             return;
          }
       }
       Iterator iterator = obj.a.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().pe(obj.a.j.d(), p1, p2, p3, 0);
       }
       uoa = obj.a;
       int i = uoa.g + 1;
       uoa.g = i;
       if (i == 2 && uoa.l == 2) {
          Objects.requireNonNull(uoa);
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p2), Integer.valueOf(p3), Integer.valueOf(0), uoa, b.class, "13")) {
             float f = ((float)p2 * 0x3f800000) / (float)p3;
             b.e0(LiveLogTag.CHAT, "onLiveChatVideoFirstFrame", "width", Integer.valueOf(p2), "height", Integer.valueOf(p3), "ratio", Float.valueOf(f));
             a uoa1 = uoa.j.d();
             b = (uoa1.f == 2)? true: false;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Float.valueOf(f), uoa1, uoa, b.class, "27")) {
                uoa.Po().a(LiveAudienceChatService.class).Gj(LiveAudienceChatService$ChatState.CONNECTED);
                Iterator iterator1 = uoa.d.iterator();
                while (iterator1.hasNext()) {
                   i oi = iterator1.next();
                   boolean b1 = (uoa1.f == 2)? true: false;
                   oi.En(b1, f, uoa1);
                   if (uoa.j != null) {
                   }
                }
             }
          }
       }
       return;
    }
}
