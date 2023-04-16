package com.kwai.live.gzone.emotion.k;
import y8c.g;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.util.ArrayList;
import g9c.a;
import y8c.f$b;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.Integer;
import java.lang.Number;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.live.gzone.emotion.l;
import ml8.c;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public class k extends g	// class@000ce7
{
    public String w;
    public k$a x;
    public k$b y;

    public void k(String p0){
       super();
       this.w = p0;
    }
    public void W0(List p0){
       ArrayList uArrayList1;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       if (!q.f(p0)) {
          int i = -9999;
          if (p0.get(0).mType != i && this.w != null) {
             EmotionInfo uEmotionInfo = new EmotionInfo();
             uEmotionInfo.mType = i;
             uEmotionInfo.mEmotionName = this.w;
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(uEmotionInfo);
             uArrayList.addAll(p0);
             uArrayList1 = uArrayList;
          }
       }
       super.W0(uArrayList1);
       return;
    }
    public long d0(int p0){
       return (long)p0;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.g.put("emotion_item_click_listener", this.x);
       p0.g.put("locked_emotion_item_click_listener", this.y);
       return p0;
    }
    public int f0(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.N0(p0).mType == -9999) {
          return 2;
       }else {
          return 1;
       }
    }
    public f h1(ViewGroup p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 2) {
          return new f(n.H(p0, 0x7f0d03e4), new l());
       }else {
          return new f(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d0bb6, p0, false), new l());
       }
    }
}
