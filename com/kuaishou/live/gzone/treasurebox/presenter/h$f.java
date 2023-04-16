package com.kuaishou.live.gzone.treasurebox.presenter.h$f;
import qvb.q;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import java.lang.Object;
import com.kuaishou.live.gzone.treasurebox.presenter.h$a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import brd.y;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel$BoxListTipsStatus;
import mrd.a;
import qvb.p;
import qvb.n0;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneAudienceTreasureBoxBubble;
import java.util.Collection;
import ekd.q;
import p53.d0;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import pm8.a;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import o53.b;

public class h$f implements q	// class@001c87
{
    public final h b;

    public void h$f(h p0){
       this.b = p0;
       super();
    }
    public void h$f(h p0,h$a p1){
       super(p0);
    }
    public void M1(boolean p0,Throwable p1){
       TreasureBoxCommonModel$BoxListTipsStatus uN_LOGIN;
       h$f uof = h$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uof, "3")) {
          return;
       }
       this.b.a9("¡¾onError¡¿");
       if (p1 instanceof KwaiException && p1.mErrorCode == 109) {
          this.b.c9().d.onNext(new Object());
          uN_LOGIN = TreasureBoxCommonModel$BoxListTipsStatus.UN_LOGIN;
       }else {
          uN_LOGIN = TreasureBoxCommonModel$BoxListTipsStatus.FAILED;
       }
       this.b.c9().q.onNext(uN_LOGIN);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(h$f.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, h$f.class, "1")) {
          return;
       }
       this.b.c9().q.onNext(TreasureBoxCommonModel$BoxListTipsStatus.LOADING);
       this.b.a9("¡¾onStartLoading¡¿");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       b b;
       h$f uof = h$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uof, "2")) {
          return;
       }
       this.b.a9("¡¾onFinishLoading¡¿");
       h$f tb = this.b;
       h t = tb.T;
       if (t != null) {
          LiveTreasureBoxModel liveTreasure = null;
          tb.l9(t.L0(), liveTreasure);
          tb = this.b;
          LiveTreasureBoxListResponse liveTreasure1 = tb.T.L0();
          Objects.requireNonNull(tb);
          LiveGzoneAudienceTreasureBoxBubble obj = PatchProxy.applyOneRefs(liveTreasure1, tb, h.class, "24");
          if (obj != PatchProxyResult.class) {
             liveTreasure = obj;
          }else {
             liveTreasure1 = liveTreasure1.mBubbles;
             if (!q.f(liveTreasure1)) {
                List list = a.h0(new d0(tb).getType());
                Iterator iterator = liveTreasure1.iterator();
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   if (!TextUtils.isEmpty(obj.mBubbleId) && (list == null || !list.contains(obj.mBubbleId))) {
                      liveTreasure = obj;
                      break ;
                   }
                }
             }
          }
          if (liveTreasure != null) {
             this.b.c9().h.onNext(liveTreasure);
          }
          LiveTreasureBoxListResponse mTaskInfo = this.b.T.L0().mTaskInfo;
          if (mTaskInfo != null) {
             this.b.c9().s.onNext(b.b(mTaskInfo));
          }else if(this.b.c9().s.i() != null){
             b = this.b.c9().s.i().b;
             if (b != null) {
                b.mTaskStatus = 0;
             }
             this.b.c9().s.onNext(b.b(b));
          }
       }
       return;
    }
}
