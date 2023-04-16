package com.kuaishou.live.basic.bridge.LiveBaseJsBridgeServiceImpl;
import o63.a;
import msd.a;
import o63.r;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import crd.a;
import o41.a;
import q63.a;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.basic.bridge.LiveBaseJsBridgeServiceImpl$liveId$2;
import qrd.p;
import qrd.s;
import o63.k;
import o63.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.k$a;
import java.util.Objects;
import lp3.e;
import java.util.Map;
import msd.p;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;
import o63.d;
import java.lang.StringBuilder;
import java.util.UUID;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import o63.e;
import o63.f;
import o63.g;
import crd.b;
import android.app.Activity;
import o63.b;
import lp3.c;
import lp3.b;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import l41.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel$a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import o63.a$a;
import androidx.fragment.app.Fragment;
import rp5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.basic.bridge.LiveJsChannels;

public abstract class LiveBaseJsBridgeServiceImpl implements a	// class@000ca5
{
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final a f;
    public final a g;
    public final e h;
    public final p i;
    public p j;
    public final a k;
    public final r l;

    public void LiveBaseJsBridgeServiceImpl(a p0,r p1){
       a.p(p0, "serviceManagerProvider");
       a.p(p1, "currentScene");
       super();
       this.k = p0;
       this.l = p1;
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new a();
       this.g = new a();
       this.h = new a(this.ph());
       this.i = s.b(LazyThreadSafetyMode.PUBLICATION, LiveBaseJsBridgeServiceImpl$liveId$2.INSTANCE);
    }
    public j B9(k p0){
       k$a obj = PatchProxy.applyOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "commandId");
       obj = new k$a(p0);
       if (this.c.containsKey(obj)) {
          p0 = this.c.get(obj);
          Objects.requireNonNull(p0, "null cannot be cast to non-null type T");
       }else {
          Object obj1 = p0.getCommandProvider().invoke();
          Object obj2 = obj1;
          obj2.b(p0, this.r());
          this.c.put(obj, obj2);
          Objects.requireNonNull(obj1, "null cannot be cast to non-null type T");
          p0 = obj1;
       }
       return p0;
    }
    public j Ce(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBaseJsBridgeServiceImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "nameSpace");
       a.p(p1, "commandName");
       k ok = this.b.get(new k$a(p0, p1));
       if (ok == null) {
          return null;
       }
       a.o(ok, "commandIds[Key\(nameSpace\x20\x02mandName\)] ?: return null\x00");
       return this.B9(ok);
    }
    public p Dn(){
       return this.j;
    }
    public k E9(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBaseJsBridgeServiceImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "nameSpace");
       a.p(p1, "commandName");
       return this.b.get(new k$a(p0, p1));
    }
    public d Fj(LiveKrnPageKey p0,Map p1,l p2){
       p obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveBaseJsBridgeServiceImpl.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pageKey");
       obj = this.Dn();
       d uod = (obj != null)? obj.invoke(this.Nc(p0, p1), p2): null;
       return uod;
    }
    public abstract void G();
    public String I4(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "pageId-"+UUID.randomUUID();
    }
    public void Ln(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "4")) {
          return;
       }
       a.p(p0, "commandIds");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          k ok = iterator.next();
          this.b.put(new k$a(ok), ok);
       }
       return;
    }
    public e Mf(){
       return this.h;
    }
    public String Nc(LiveKrnPageKey p0,Map p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBaseJsBridgeServiceImpl.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "pageKey";
       a.p(p0, obj);
       LiveBaseJsBridgeServiceImpl tg = this.g;
       Objects.requireNonNull(tg);
       String str = PatchProxy.applyTwoRefs(p0, p1, tg, a.class, "3");
       if (str != patchProxyRe) {
       }else {
          a.p(p0, obj);
          obj = p0.getKey();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
          obj = obj.toLowerCase();
          a.o(obj, "\(this as java.lang.String\).toLowerCase\(\)");
          String str1 = tg.a.get(obj);
          if (str1 != null) {
             a.o(str1, "pagesKeyUrlMap[pageKey.k¡­traInfo,\n      true\n    \)");
             str = tg.a(str1, p1, false);
          }else {
             str = tg.a(p0.getDefaultUrl(), p1, true);
          }
       }
       return str;
    }
    public e Pl(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r();
    }
    public f V9(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveBaseJsBridgeServiceImpl liveBaseJsBr = LiveBaseJsBridgeServiceImpl.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, liveBaseJsBr, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "channelName");
       g og = this.d.get(new k$a("", p0));
       if (og == null) {
          return null;
       }
       a.o(og, "channelIds[Key\(\"\", channelName\)] ?: return null");
       f uof = PatchProxy.applyOneRefs(og, this, liveBaseJsBr, "10");
       if (uof != patchProxyRe) {
       }else {
          a.p(og, "channelId");
          k$a uoa = new k$a(og);
          uof = this.e.get(uoa);
          if (uof == null) {
             uof = og.getChannelProvider().invoke();
             uof.e(og.getChannelName(), this.r());
             this.e.put(uoa, uof);
          }
       }
       return uof;
    }
    public void a5(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "22")) {
          return;
       }
       a.p(p0, "disposable");
       this.f.c(p0);
       return;
    }
    public d af(String p0,l p1){
       p obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBaseJsBridgeServiceImpl.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       obj = this.Dn();
       d uod = (obj != null)? obj.invoke(p0, p1): null;
       return uod;
    }
    public void ag(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "9")) {
          return;
       }
       a.p(p0, "channelId");
       this.d.put(new k$a(p0), p0);
       return;
    }
    public void bn(p p0){
       this.j = p0;
    }
    public Activity c(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(this.r());
    }
    public void create(e p0){
       a b;
       String liveId;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "20")) {
          return;
       }
       a.p(p0, "serviceManager");
       b.a(this, p0);
       b.Z(LiveJsBridgeLogTag.COMMON, "register liveId: "+this.getLiveId());
       b = a.b;
       liveId = this.getLiveId();
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(liveId, this, b, a.class, "2")) {
          a.p(liveId, "liveId");
          a.p(this, "jsBridgeService");
          a.a.put(liveId, new WeakReference(this));
       }
       this.G();
       this.w();
       return;
    }
    public void destroy(){
       a b;
       String liveId;
       LiveBaseJsBridgeServiceImpl liveBaseJsBr = LiveBaseJsBridgeServiceImpl.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveBaseJsBr, "23")) {
          return;
       }
       b.Z(LiveJsBridgeLogTag.COMMON, "unregister liveId: "+this.getLiveId());
       b = a.b;
       liveId = this.getLiveId();
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(liveId, b, a.class, "3")) {
          a.p(liveId, "liveId");
          a.a.remove(liveId);
       }
       this.f.dispose();
       if (!PatchProxy.applyVoid(objArray, this, liveBaseJsBr, "24")) {
          Collection uCollection1 = this.c.values();
          a.o(uCollection1, "commands.values");
          Iterator iterator1 = uCollection1.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().destroy();
          }
          this.c.clear();
       }
       if (!PatchProxy.applyVoid(objArray, this, liveBaseJsBr, "25")) {
          Collection uCollection = this.e.values();
          a.o(uCollection, "channels.values");
          Iterator iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             iterator.next().destroy();
          }
          this.e.clear();
       }
       return;
    }
    public Iterator fc(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.values().iterator();
    }
    public String getLiveId(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public void go(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "3")) {
          return;
       }
       a.p(p0, "commandId");
       this.b.put(new k$a(p0), p0);
       return;
    }
    public f j9(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "subscribeId";
       a.p(p0, obj);
       AbstractLiveJsChannel$a g = AbstractLiveJsChannel.g;
       Objects.requireNonNull(g);
       String str = PatchProxy.applyOneRefs(p0, g, AbstractLiveJsChannel$a.class, "1");
       if (str != patchProxyRe) {
       }else {
          a.p(p0, obj);
          int i = StringsKt__StringsKt.w3(p0, ":", 0, false, 6, null);
          if (i == -1 || i >= (p0.length() - 1)) {
             str = null;
          }else {
             str = p0.substring((i + 1));
             a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
          }
       }
       if (str != null) {
          return this.V9(str);
       }else {
          return null;
       }
    }
    public r ph(){
       return this.l;
    }
    public final e r(){
       Object obj = PatchProxy.apply(null, this, LiveBaseJsBridgeServiceImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.invoke();
    }
    public d se(LiveKrnPageKey p0,Map p1){
       d this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveBaseJsBridgeServiceImpl.class, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "pageKey");
       this = PatchProxy.applyThreeRefs(this, p0, p1, null, a$a.class, "2");
       if (this != patchProxyRe) {
       }else {
          a.p(p0, "pageKey");
          this = this.Fj(p0, p1, null);
       }
       return this;
    }
    public Fragment t(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, LiveBaseJsBridgeServiceImpl.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.r();
       BaseFragment uBaseFragmen = PatchProxy.applyOneRefs(obj, objArray, b.class, "2");
       if (uBaseFragmen != patchProxyRe) {
       }else {
          a.p(obj, "$this$currentFragment");
          uBaseFragmen = obj.a(a.class).t();
       }
       return uBaseFragmen;
    }
    public d v2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       d uod = PatchProxy.applyTwoRefs(this, p0, null, a$a.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "url");
          uod = this.af(p0, null);
       }
       return uod;
    }
    public f v8(g p0){
       k$a obj = PatchProxy.applyOneRefs(p0, this, LiveBaseJsBridgeServiceImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "channelId");
       obj = new k$a(p0);
       f uof = this.e.get(obj);
       if (uof == null) {
          uof = p0.getChannelProvider().invoke();
          uof.e(p0.getChannelName(), this.r());
          this.e.put(obj, uof);
       }
       return uof;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, LiveBaseJsBridgeServiceImpl.class, "21")) {
          return;
       }
       Objects.requireNonNull(LiveJsChannels.Companion);
       Iterator iterator = LiveJsChannels.allChannelIds.iterator();
       while (iterator.hasNext()) {
          this.ag(iterator.next());
       }
       return;
    }
}
