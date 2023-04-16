package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackPrize;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import crd.b;
import android.os.CountDownTimer;

public class LiveSurpriseRedPackResultViewBinder	// class@000fb0
{
    public static CountDownTimer a;
    public static b b;

    public void LiveSurpriseRedPackResultViewBinder(){
       super();
    }
    public static LiveRedPackPrize a(List p0){
       LiveRedPackPrize obj = PatchProxy.applyOneRefs(p0, null, LiveSurpriseRedPackResultViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return null;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (obj.mPrizeType == 1) {
             break ;
          }
       }
       return obj;
    }
    public static LiveRedPackPrize b(List p0){
       LiveRedPackPrize obj = PatchProxy.applyOneRefs(p0, null, LiveSurpriseRedPackResultViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return null;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (obj.mDisplayType == 2) {
             break ;
          }
       }
       return obj;
    }
    public static List c(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, LiveSurpriseRedPackResultViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (q.f(p0)) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveRedPackPrize liveRedPackP = iterator.next();
          if (liveRedPackP.mPrizeType != 1) {
             obj.add(liveRedPackP);
          }
       }
       return obj;
    }
    public static List e(List p0,int p1){
       ArrayList obj;
       LiveSurpriseRedPackResultViewBinder liveSurprise = LiveSurpriseRedPackResultViewBinder.class;
       if (PatchProxy.isSupport(liveSurprise)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, liveSurprise, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (q.f(p0)) {
          return obj;
       }else {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             LiveRedPackPrize liveRedPackP = iterator.next();
             if (liveRedPackP != null && liveRedPackP.mPrizeType != p1) {
                obj.add(liveRedPackP);
             }
          }
          return obj;
       }
    }
    public LiveSurpriseRedPackResultViewBinder$Mode d(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSurpriseRedPackResultViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return LiveSurpriseRedPackResultViewBinder$Mode.UNLUCKY;
       }
       p0 = LiveSurpriseRedPackResultViewBinder.c(p0);
       if (LiveSurpriseRedPackResultViewBinder.a(p0) != null) {
          if (!q.f(p0)) {
             return LiveSurpriseRedPackResultViewBinder$Mode.BOTH;
          }
          return LiveSurpriseRedPackResultViewBinder$Mode.COIN_ONLY;
       }else if(!q.f(p0)){
          return LiveSurpriseRedPackResultViewBinder$Mode.GIFT_ONLY;
       }else {
          return LiveSurpriseRedPackResultViewBinder$Mode.UNLUCKY;
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveSurpriseRedPackResultViewBinder.class, "2")) {
          return;
       }
       b b = LiveSurpriseRedPackResultViewBinder.b;
       if (b != null) {
          b.dispose();
          LiveSurpriseRedPackResultViewBinder.b = null;
       }
       CountDownTimer a = LiveSurpriseRedPackResultViewBinder.a;
       if (a != null) {
          a.cancel();
          LiveSurpriseRedPackResultViewBinder.a = null;
       }
       return;
    }
}
