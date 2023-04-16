package mba.m0;
import com.yxcorp.gifshow.edit.draft.model.c$a;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Map;
import maa.a;
import java.util.List;
import lba.a;
import com.kuaishou.edit.draft.OriginalVoice;
import waa.a;
import paa.a;
import kba.a;
import qaa.a;
import saa.a;
import saa.g;
import saa.c;
import naa.a;
import xaa.a;
import oaa.a;
import raa.i;
import raa.g;
import raa.c;
import raa.a;
import raa.e;
import eba.a;
import hba.a;
import cba.a;
import yaa.c;
import iba.a;
import uaa.a;
import com.kuaishou.edit.draft.Karaoke;
import bba.b;
import com.kuaishou.edit.draft.Publish;
import dba.a;
import com.kuaishou.edit.draft.Shoot;
import vaa.a;
import com.kuaishou.edit.draft.Kuaishan;
import fba.a;
import zaa.a;
import taa.a;
import com.kuaishou.edit.draft.Preview;
import saa.e;
import jba.a;
import com.kuaishou.edit.draft.Tts;
import gba.a;
import com.kuaishou.edit.draft.Template;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.util.Objects;
import com.yxcorp.utility.SystemUtil;
import haa.f;
import q87.c;
import android.os.Handler;
import android.os.Message;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import w46.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EnhanceColorFilterResult;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.protobuf.Timestamp;
import java.lang.Iterable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage;
import com.kuaishou.edit.draft.Workspace$Type;

public class m0 extends e implements c$a	// class@002fbb
{
    public a A;
    public a B;
    public b C;
    public a D;
    public a E;
    public a F;
    public a G;
    public a H;
    public a I;
    public e J;
    public a K;
    public a L;
    public Map M;
    public AtomicBoolean N;
    public a f;
    public a g;
    public a h;
    public a i;
    public a j;
    public a k;
    public a l;
    public a m;
    public a n;
    public a o;
    public a p;
    public g q;
    public c r;
    public i s;
    public g t;
    public c u;
    public a v;
    public e w;
    public a x;
    public a y;
    public c z;

    public void m0(File p0,Workspace p1,c p2){
       String mvparamFile;
       super(p0, p1, p2);
       this.M = new HashMap();
       this.N = new AtomicBoolean(true);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m0.class, "6")) {
       }else {
          this.d = new ArrayList();
          this.M.clear();
          a uoa = new a(this.i(), this.h().getAssetsList(), this.c);
          this.l = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getOriginalVoice(), this.c);
          this.m = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getLyricAssetsList(), this.c);
          this.n = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getDeletedRangesList(), this.c);
          this.o = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getUndoActionsList(), this.c);
          this.p = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getCoversList(), this.c);
          this.f = uoa;
          boolean b = false;
          this.m(uoa, true, b);
          uoa = new a(this.i(), this.h().getColorFiltersList(), this.c);
          this.g = uoa;
          this.m(uoa, true, true);
          g og = new g(this.i(), this.h().getEnhanceFiltersList(), this.c);
          this.q = og;
          this.m(og, true, true);
          c uoc = new c(this.i(), this.h().getEnhanceColorFiltersList(), this.c);
          this.r = uoc;
          this.m(uoc, true, true);
          uoa = new a(this.i(), this.h().getBeautiesList(), this.c);
          this.h = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getMakeupsList(), this.c);
          this.i = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getSlimmingsList(), this.c);
          this.j = uoa;
          this.m(uoa, true, true);
          i oi = new i(this.i(), this.h().getVisualEffectsList(), this.c);
          this.s = oi;
          this.m(oi, true, true);
          og = new g(this.i(), this.h().getTimeEffectsList(), this.c);
          this.t = og;
          this.m(og, true, true);
          uoc = new c(this.i(), this.h().getFaceMagicEffectsList(), this.c);
          this.u = uoc;
          this.m(uoc, true, true);
          uoa = new a(this.i(), this.h().getAeEffectsList(), this.c);
          this.v = uoa;
          this.m(uoa, true, true);
          e uoe = new e(this.i(), this.h().getHighlightTimeEffectsList(), this.c);
          this.w = uoe;
          this.m(uoe, true, true);
          uoa = new a(this.i(), this.h().getStickersList(), this.c);
          this.x = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getTextsList(), this.c);
          this.k = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getScrawlsList(), this.c);
          this.y = uoa;
          this.m(uoa, true, true);
          uoc = new c(this.i(), this.h().getMusicsList(), this.c);
          this.z = uoc;
          this.m(uoc, true, true);
          uoa = new a(this.i(), this.h().getThemesList(), this.c);
          this.A = uoa;
          this.m(uoa, true, true);
          File uFile = this.i();
          Karaoke karaoke = (this.h().hasKaraoke())? this.h().getKaraoke(): objArray;
          uoa = new a(uFile, karaoke, this.c);
          this.B = uoa;
          this.m(uoa, true, true);
          uFile = this.i();
          Publish publish = (this.h().hasPublish())? this.h().getPublish(): objArray;
          b uob = new b(uFile, publish, this.c);
          this.C = uob;
          this.m(uob, true, b);
          uFile = this.i();
          Shoot shoot = (this.h().hasShoot())? this.h().getShoot(): objArray;
          uoa = new a(uFile, shoot, this.c);
          this.D = uoa;
          this.m(uoa, b, true);
          uFile = this.i();
          Kuaishan kuaishan = (this.h().hasKuaishan())? this.h().getKuaishan(): objArray;
          uoa = new a(uFile, kuaishan, this.c);
          this.G = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getAiCutThemesList(), this.c);
          this.H = uoa;
          this.m(uoa, true, true);
          uFile = this.i();
          Object[] objArray1 = ((this.h().getLegacyMvparamFile()).isEmpty())? objArray: this.h().getLegacyMvparamFile();
          uoa = new a(uFile, objArray1, this.c);
          this.E = uoa;
          this.m(uoa, b, b);
          uFile = this.i();
          objArray1 = ((this.h().getMvparamFile()).isEmpty())? objArray: this.h().getMvparamFile();
          uoa = new a(uFile, objArray1, this.c);
          this.F = uoa;
          this.m(uoa, b, b);
          uFile = this.i();
          if (this.h().hasPreview()) {
             objArray = this.h().getPreview();
          }
          uoa = new a(uFile, objArray, this.c);
          this.I = uoa;
          this.m(uoa, true, true);
          uoe = new e(this.i(), this.h().getEnhanceColorFilterResultList(), this.c);
          this.J = uoe;
          this.m(uoe, b, b);
          uoa = new a(this.i(), this.h().getTts(), this.c);
          this.K = uoa;
          this.m(uoa, true, true);
          uoa = new a(this.i(), this.h().getAtlasTemplate(), this.c);
          this.L = uoa;
          this.m(uoa, true, true);
       }
       return;
    }
    public void a(c p0,boolean p1){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om0, "11")) {
          return;
       }
       if (p1 || (this.d.contains(p0) && !PatchProxy.applyVoid(null, this, om0, "5"))) {
          DraftFileManager uDraftFileMa = DraftFileManager.E();
          Objects.requireNonNull(uDraftFileMa);
          if (!PatchProxy.applyVoidOneRefs(this, uDraftFileMa, DraftFileManager.class, "60")) {
             if (!SystemUtil.O()) {
                Object[] objArray = new Object[0];
                f.D().w("DraftFileManager", "scheduleAutoSave called on non UI thread, ignore.", objArray);
             }else {
                int i = 2018;
                uDraftFileMa.j.removeMessages(i, this);
                Message message = new Message();
                message.what = i;
                message.obj = this;
                uDraftFileMa.j.sendMessage(message);
             }
          }
       }
       if (this.h().getSource() == Workspace$Source.REEDIT) {
          return;
       }else if(!this.N.get()){
          Boolean uBoolean = this.M.get(p0);
          if (uBoolean != null && uBoolean.booleanValue()) {
             f.D().e("WorkspaceDraftItem", "modify content after nextStep", new DraftEditException(p0.getClass()));
          }
       }
       return;
    }
    public void b(c p0){
    }
    public void c(c p0){
    }
    public GeneratedMessageLite d(){
       Workspace workspace = PatchProxy.apply(null, this, m0.class, "10");
       if (workspace != PatchProxyResult.class) {
       }else {
          Workspace$b uob = Workspace.newBuilder();
          uob.h(DraftUtils.i());
          uob.v("2.9.602");
          uob.f("Android");
          workspace = uob.build();
       }
       return workspace;
    }
    public List j(GeneratedMessageLite p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, m0.class, "9");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          for (int i = 0; i < p0.getEnhanceColorFilterResultCount(); i = i + 1) {
             uArrayList.addAll(p0.getEnhanceColorFilterResult(i).getAnalysisResultsResourcesList());
          }
       }
       return uArrayList;
    }
    public void l(){
       Workspace$b uob1;
       Workspace$b uob2;
       StringMessage stringMessag;
       if (PatchProxy.applyVoid(null, this, m0.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().w("WorkspaceDraftItem", "prepareCommit", objArray);
       Iterator iterator = this.M.entrySet().iterator();
       f uof = null;
       f uof1 = null;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey().F()) {
             if (uEntry.getKey().G()) {
                Object[] objArray1 = new Object[i];
                f.D().w("WorkspaceDraftItem", "Workspace last modified time updated by "+uEntry.getKey().getClass().getCanonicalName(), objArray1);
                this.f().h(DraftUtils.m0(this.f().instance.getAttributes()));
                uof = 1;
             }
             if (uEntry.getValue().booleanValue()) {
                Object[] objArray2 = new Object[i];
                f.D().w("WorkspaceDraftItem", "output_content_modified by "+uEntry.getKey().getClass().getCanonicalName(), objArray2);
                Workspace$b uob = this.f();
                uob.copyOnWrite();
                uob.instance.setOutputContentModifiedAt(DraftUtils.j0());
                uof1 = 1;
             }
             if (uof != null && uof1 != null) {
                break ;
             }
          }
       }
       if (this.l.F()) {
          try{
             uob1 = this.f();
             uob1.b();
             uob1.a(this.l.o());
          }catch(java.lang.Exception e0){
             f.D().z("WorkspaceDraftItem", "prepareCommit", e0);
             ExceptionHandler.handleCaughtException(e0);
             uob1 = this.f();
             uob1.b();
             uob1.a(this.l.o());
          }
          this.l.a0();
       }
       if (this.m.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearOriginalVoice();
          OriginalVoice originalVoic = this.m.t();
          if (originalVoic != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setOriginalVoice(originalVoic);
          }
          this.m.a0();
       }
       if (this.n.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearLyricAssets();
          uob1.copyOnWrite();
          uob1.instance.addAllLyricAssets(this.n.o());
          this.n.a0();
       }
       if (this.o.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearDeletedRanges();
          uob1.copyOnWrite();
          uob1.instance.addAllDeletedRanges(this.o.o());
          this.o.a0();
       }
       if (this.p.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearUndoActions();
          uob1.copyOnWrite();
          uob1.instance.addAllUndoActions(this.p.o());
          this.p.a0();
       }
       if (this.f.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearCovers();
          uob1.copyOnWrite();
          uob1.instance.addAllCovers(this.f.o());
          this.f.a0();
       }
       if (this.g.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearColorFilters();
          uob1.copyOnWrite();
          uob1.instance.addAllColorFilters(this.g.o());
          this.g.a0();
       }
       if (this.q.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearEnhanceFilters();
          uob1.copyOnWrite();
          uob1.instance.addAllEnhanceFilters(this.q.o());
          this.q.a0();
       }
       if (this.r.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearEnhanceColorFilters();
          uob1.copyOnWrite();
          uob1.instance.addAllEnhanceColorFilters(this.r.o());
          this.r.a0();
       }
       if (this.h.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearBeauties();
          uob1.copyOnWrite();
          uob1.instance.addAllBeauties(this.h.o());
          this.h.a0();
       }
       if (this.i.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearMakeups();
          uob1.copyOnWrite();
          uob1.instance.addAllMakeups(this.i.o());
          this.i.a0();
       }
       if (this.j.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearSlimmings();
          uob1.copyOnWrite();
          uob1.instance.addAllSlimmings(this.j.o());
          this.j.a0();
       }
       if (this.s.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearVisualEffects();
          uob1.copyOnWrite();
          uob1.instance.addAllVisualEffects(this.s.o());
          this.s.a0();
       }
       if (this.t.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearTimeEffects();
          uob1.copyOnWrite();
          uob1.instance.addAllTimeEffects(this.t.o());
          this.t.a0();
       }
       if (this.u.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearFaceMagicEffects();
          uob1.copyOnWrite();
          uob1.instance.addAllFaceMagicEffects(this.u.o());
          this.u.a0();
       }
       if (this.v.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearAeEffects();
          uob1.copyOnWrite();
          uob1.instance.addAllAeEffects(this.v.o());
          this.v.a0();
       }
       if (this.w.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearHighlightTimeEffects();
          uob1.copyOnWrite();
          uob1.instance.addAllHighlightTimeEffects(this.w.o());
          this.w.a0();
       }
       if (this.x.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearStickers();
          uob1.copyOnWrite();
          uob1.instance.addAllStickers(this.x.o());
          this.x.a0();
       }
       if (this.k.F()) {
          uob1 = this.f();
          uob1.e();
          uob1.copyOnWrite();
          uob1.instance.addAllTexts(this.k.o());
          this.k.a0();
       }
       if (this.y.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearScrawls();
          uob1.copyOnWrite();
          uob1.instance.addAllScrawls(this.y.o());
          this.y.a0();
       }
       if (this.z.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearMusics();
          uob1.copyOnWrite();
          uob1.instance.addAllMusics(this.z.o());
          this.z.a0();
       }
       if (this.I.F()) {
          this.f().d();
          Preview preview = this.I.t();
          if (preview != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setPreview(preview);
          }
          this.I.a0();
       }
       if (this.A.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearThemes();
          uob1.copyOnWrite();
          uob1.instance.addAllThemes(this.A.o());
          this.A.a0();
       }
       if (this.B.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearKaraoke();
          Karaoke karaoke = this.B.t();
          if (karaoke != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setKaraoke(karaoke);
          }
          this.B.a0();
       }
       if (this.C.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearPublish();
          Publish publish = this.C.t();
          if (publish != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setPublish(publish);
          }
          this.C.a0();
       }
       if (this.D.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearShoot();
          Shoot shoot = this.D.t();
          if (shoot != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setShoot(shoot);
          }
          this.D.a0();
       }
       if (this.G.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearKuaishan();
          Kuaishan kuaishan = this.G.t();
          if (kuaishan != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setKuaishan(kuaishan);
          }
          this.G.a0();
       }
       if (this.H.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearAiCutThemes();
          uob1.copyOnWrite();
          uob1.instance.addAllAiCutThemes(this.H.o());
          this.H.a0();
       }
       if (this.E.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearLegacyMvparamFile();
          stringMessag = this.E.t();
          if (stringMessag != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setLegacyMvparamFile(stringMessag.getValue());
          }
          this.E.a0();
       }
       if (this.F.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearMvparamFile();
          stringMessag = this.F.t();
          if (stringMessag != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setMvparamFile(stringMessag.getValue());
          }
          this.F.a0();
       }
       if (this.J.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearEnhanceColorFilterResult();
          uob1.copyOnWrite();
          uob1.instance.addAllEnhanceColorFilterResult(this.J.z());
          this.J.a0();
       }
       if (this.K.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearTts();
          Tts tts = this.K.t();
          if (tts != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setTts(tts);
          }
          this.K.a0();
       }
       if (this.L.F()) {
          uob1 = this.f();
          uob1.copyOnWrite();
          uob1.instance.clearAtlasTemplate();
          Template template = this.L.t();
          if (template != null) {
             uob2 = this.f();
             uob2.copyOnWrite();
             uob2.instance.setAtlasTemplate(template);
          }
          this.L.a0();
       }
       return;
    }
    public final void m(c p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(m0.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, m0.class, "7")) {
          return;
       }
       this.d.add(p0);
       p0.b0(this);
       if (p1) {
          this.M.put(p0, Boolean.valueOf(p2));
       }
       return;
    }
    public List n(){
       ArrayList obj = PatchProxy.apply(null, this, m0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Objects.requireNonNull(this.n);
       obj.add("lyric");
       Objects.requireNonNull(this.B);
       Objects.requireNonNull(this.n);
       obj.add("karaoke/lyric");
       Objects.requireNonNull(this.m);
       obj.add("voice");
       Objects.requireNonNull(this.G);
       obj.add("kuaishan");
       if (Workspace$Type.KTV_SONG != this.h().getType()) {
          Objects.requireNonNull(this.l);
          obj.add("asset");
       }
       return obj;
    }
    public List o(){
       Object obj = PatchProxy.apply(null, this, m0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.M.keySet());
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.N.get();
    }
    public void q(boolean p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om0, "1")) {
          return;
       }
       this.N.set(p0);
       return;
    }
}
