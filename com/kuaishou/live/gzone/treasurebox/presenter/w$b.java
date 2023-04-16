package com.kuaishou.live.gzone.treasurebox.presenter.w$b;
import f67.n0;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f37.o0;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import m53.n;
import com.kwai.live.gzone.pendant.bean.LiveGzoneFeatureEntranceBubble;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import mrd.a;
import o53.b;

public class w$b implements n0	// class@001ca0
{
    public final LiveGzoneTreasureTask a;
    public final String b;
    public final w c;

    public void w$b(w p0,LiveGzoneTreasureTask p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w$b.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"treasureTaskCountDownBubble", o0.g());
       g.a(uEditor);
       w$b ta = this.a;
       LiveGzoneTreasureTask mTaskID = ta.mTaskID;
       LiveGzoneTreasureTask mPrizeId = ta.mPrizeId;
       if (!PatchProxy.applyVoidTwoRefs(mTaskID, mPrizeId, null, n.class, "14")) {
          n.d(1, mTaskID, mPrizeId);
       }
       return;
    }
    public boolean b(LiveGzoneFeatureEntranceBubble p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b).equals(p0.mBubbleId);
    }
    public boolean c(LiveGzoneFeatureEntranceBubble p0){
       p0 = PatchProxy.applyOneRefs(p0, this, w$b.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.c.b9() != null) {
          b uob = this.c.b9().s.i();
          if (uob != null) {
             uob = uob.b;
             if (uob != null && uob.mTaskStatus == 2) {
                return true;
             }
          }
       }
       return false;
    }
    public boolean d(LiveGzoneFeatureEntranceBubble p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(p0);
    }
}
