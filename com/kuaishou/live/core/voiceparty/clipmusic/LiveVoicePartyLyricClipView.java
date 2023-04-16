package com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import java.util.ArrayList;
import android.os.Handler;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$c;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$d;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Line;
import com.kuaishou.android.model.music.Music;
import android.widget.ScrollView;
import android.util.Pair;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartySelectableLyricView;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;
import android.view.View;
import ekd.m1;
import java.util.Objects;
import java.lang.Float;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.kwai.library.widget.scrollview.ScrollViewEx$c;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$a;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar$a;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$b;
import java.lang.Runnable;

public class LiveVoicePartyLyricClipView extends RelativeLayout implements d	// class@001380
{
    public LiveVoicePartySelectableLyricView b;
    public LiveClipLyricsBar c;
    public LiveClipLyricsBar d;
    public Lyrics e;
    public Music f;
    public List g;
    public Handler h;
    public float i;
    public float j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public ScrollViewEx$c q;
    public Runnable r;

    public void LiveVoicePartyLyricClipView(Context p0){
       super(p0);
       this.g = new ArrayList();
       this.h = new Handler();
       this.l = a1.e(60.00f);
       this.m = a1.e(5.00f);
       this.q = new LiveVoicePartyLyricClipView$c(this);
       this.r = new LiveVoicePartyLyricClipView$d(this);
    }
    public void LiveVoicePartyLyricClipView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new ArrayList();
       this.h = new Handler();
       this.l = a1.e(60.00f);
       this.m = a1.e(5.00f);
       this.q = new LiveVoicePartyLyricClipView$c(this);
       this.r = new LiveVoicePartyLyricClipView$d(this);
    }
    public void LiveVoicePartyLyricClipView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = new ArrayList();
       this.h = new Handler();
       this.l = a1.e(60.00f);
       this.m = a1.e(5.00f);
       this.q = new LiveVoicePartyLyricClipView$c(this);
       this.r = new LiveVoicePartyLyricClipView$d(this);
    }
    public final int a(int p0){
       Lyrics$Line obj;
       if (PatchProxy.isSupport(LiveVoicePartyLyricClipView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveVoicePartyLyricClipView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= 0 && p0 < this.g.size()) {
          obj = this.g.get(p0);
          Lyrics$Line mDuration = obj.mDuration;
          if (mDuration > null) {
             return (obj.mStart + mDuration);
          }
       }
       if (p0 >= 0) {
          int i = p0 + 1;
          if (i < this.g.size()) {
             return (this.g.get(i).mStart - 10);
          }
       }
       LiveVoicePartyLyricClipView tp = this.p;
       if (tp > null) {
          return tp;
       }else {
          Music mDuration1 = this.f.mDuration;
          if (mDuration1 > null) {
             return mDuration1;
          }else {
             return (this.g.get(p0).mStart + 5000);
          }
       }
    }
    public final int b(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyLyricClipView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveVoicePartyLyricClipView.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= 0 && p0 < this.g.size()) {
          return this.g.get(p0).mStart;
       }else {
          return -1;
       }
    }
    public void c(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyLyricClipView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyLyricClipView.class, "8")) {
          return;
       }
       this.b.smoothScrollBy(0, p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyLyricClipView.class, "3")) {
          return;
       }
       Pair selectRange = this.b.getSelectRange();
       int i = a1.d(R.dimen.arg_RES_7f070803);
       this.i = (float)(this.b.t(selectRange.first.intValue()) - i);
       this.j = (float)(this.b.p(selectRange.second.intValue()) + i);
       LiveVoicePartyLyricClipView tc = this.c;
       tc.e(((this.i - (float)(tc.getHeight() / 2)) - (float)this.k));
       tc = this.d;
       tc.e(((this.j - (float)(tc.getHeight() / 2)) - (float)this.k));
       this.e();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyLyricClipView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a29db);
       this.c = m1.f(p0, 0x7f0a3b29);
       this.d = m1.f(p0, 0x7f0a0d43);
       return;
    }
    public void e(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyLyricClipView.class, "7")) {
          return;
       }
       LiveVoicePartyLyricClipView tb = this.b;
       LiveVoicePartyLyricClipView ti = this.i;
       LiveVoicePartyLyricClipView tj = this.j;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(LiveVoicePartySelectableLyricView.class) || (!PatchProxy.applyVoidTwoRefs(Float.valueOf(ti), Float.valueOf(tj), tb, LiveVoicePartySelectableLyricView.class, "1") && ti - tj <= 0)) {
          tb.L.clear();
          int i = a1.d(R.dimen.arg_RES_7f070803);
          for (int i1 = 0; i1 < tb.v.size(); i1 = i1 + 1) {
             float f = (float)i;
             float f1 = ti - f;
             if ((float)tb.w.get(i1).intValue() - f1 >= 0) {
                f = f + tj;
                if ((float)tb.x.get(i1).intValue() - f <= 0) {
                   b = true;
                label_0074 :
                   tb.L.add(Boolean.valueOf(b));
                   tb.u(i1).setSelected(b);
                }
             }
             b = false;
             goto label_0074 ;
          }
       }
       return;
    }
    public Pair getClipResult(){
       Pair obj = PatchProxy.apply(null, this, LiveVoicePartyLyricClipView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.b.getSelectRange();
          int i = obj.first.intValue();
          int i1 = this.b(i);
          int i2 = this.a(obj.second.intValue()) - i1;
          if (i < 0) {
             return null;
          }
          if (i2 < 0) {
             return null;
          }
          return new Pair(Integer.valueOf(i1), Integer.valueOf(i2));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public int getSelectedLineCount(){
       Pair obj = PatchProxy.apply(null, this, LiveVoicePartyLyricClipView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          obj = this.b.getSelectRange();
          return ((obj.second.intValue() - obj.first.intValue()) + 1);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyLyricClipView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.h.removeCallbacksAndMessages(null);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyLyricClipView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.b.setScrollViewListener(this.q);
       this.c.setClipView(this);
       this.d.setClipView(this);
       LiveVoicePartyLyricClipView tc = this.c;
       tc.setOnDragHandleListener(new LiveVoicePartyLyricClipView$a(this, this, tc));
       tc = this.d;
       tc.setOnDragHandleListener(new LiveVoicePartyLyricClipView$b(this, this, tc));
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveVoicePartyLyricClipView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyLyricClipView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       int height = this.getHeight();
       p1 = this.c.getHeight();
       LiveVoicePartyLyricClipView tm = this.m;
       this.c.d(tm, (((height - tm) - this.l) + p1));
       tm = this.m;
       this.d.d(((this.l + tm) - p1), (height - tm));
       this.h.post(this.r);
       return;
    }
}
