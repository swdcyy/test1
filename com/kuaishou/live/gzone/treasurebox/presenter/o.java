package com.kuaishou.live.gzone.treasurebox.presenter.o;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.p;
import java.lang.Object;
import o53.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import p53.d1;
import j77.c;
import j77.b;
import com.kwai.sdk.switchconfig.a;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import ekd.k1;
import p53.z0;
import java.lang.Runnable;
import java.lang.StringBuilder;
import lnc.a1;
import t57.a;
import f37.o0;
import pm8.a;
import km8.b;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.System;
import p53.a1;
import f67.n0;
import r53.b;
import pp.a;
import q87.c;

public final class o implements g	// class@001c8f
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       SharedPreferences a;
       o tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.b;
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, op, "12")) {
       }else {
          tb.E = p0;
          if (p0 == null || !p0.canShowTask()) {
             tb.W8();
          }else {
             LiveGzoneTreasureTask mTaskStatus = p0.mTaskStatus;
             if (mTaskStatus == 2) {
                if (!PatchProxy.applyVoid(null, tb, op, "16")) {
                   p0 = tb.v;
                   if (p0 != null && tb.D == null) {
                      d1 uod1 = new d1(tb, "treasure_task_count_down");
                      tb.D = uod1;
                      p0.a(uod1);
                   }
                }
             }else if(mTaskStatus != 1 || PatchProxy.applyVoidOneRefs(p0, tb, op, "9")){
                long l = 0;
                long l1 = a.t().b(LiveGzoneKeys.KEY_SWITCH_TREASURE_BOX_TASK_TIP.key(), l);
                if (l1 - l > 0) {
                   k1.n(tb);
                   k1.s(new z0(tb, p0), tb, (l1 * 1000));
                }else {
                   String str = a1.p(0x7f102485)+p0.mTaskPrizeTitle;
                   LiveGzoneTreasureTask mTaskID = p0.mTaskID;
                   p0 = p0.mPrizeId;
                   if (PatchProxy.applyVoidThreeRefs(str, mTaskID, p0, tb, p.class, "10") || (tb.u != null && tb.C != null)) {
                      op = tb.x;
                      if (op == null || !op.b()) {
                         a = a.a;
                         String str1 = "user";
                         String str2 = "treasureTaskDrawBubbleMaxCountDay";
                         if (!TextUtils.equals(o0.g(), a.getString(b.d(str1)+str2, ""))) {
                            SharedPreferences$Editor uEditor = a.edit();
                            uEditor.putString(b.d(str1)+str2, o0.g());
                            g.a(uEditor);
                            a.a2(0);
                         }
                         int intx = a.getInt(b.d(str1)+"treasureTaskDrawBubbleShowTimes", 0);
                         if (intx < 3) {
                            String str3 = String.valueOf(System.currentTimeMillis());
                            a1 uoa1 = new a1(tb, mTaskID, p0, intx, str3);
                            tb.u.a(str, str3, 0, v12);
                         }
                      }
                   }
                }
             }
             tb.W8();
             Object[] objArray = new Object[0];
             a.C().s("LiveGzoneTreasureBoxTaskPresenter", "onTaskUpdate", objArray);
          }
       }
       return;
    }
}
