package gy0.d;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.String;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import java.lang.Object;
import t02.a0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.model.QLiveMessage;
import n81.a;
import java.util.ArrayList;
import java.util.List;
import b53.b;

public final class d implements Runnable	// class@0025a7
{
    public final e b;
    public final String c;
    public final CommentMessage d;

    public void d(e p0,String p1,CommentMessage p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       if (tb.r.X != null) {
          if (!TextUtils.x(tc)) {
             b.c0(LiveLogTag.LIVE_ACTIVITY_COMMENT, "mock comment", "feedBackground segments", tc);
             tb.r.X.Ik(td, tc);
          }else {
             tb.r.X.R0(td);
          }
       }
       if (tb.r.m1 != null) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(td);
          tb.r.m1.Cm(uArrayList);
       }
       return;
    }
}
